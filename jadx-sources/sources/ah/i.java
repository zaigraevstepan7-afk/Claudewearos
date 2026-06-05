package ah;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f484a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f485b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f486c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f487d = false;

    /* renamed from: e, reason: collision with root package name */
    public final e f488e;

    /* renamed from: f, reason: collision with root package name */
    public WritableByteChannel f489f;

    /* renamed from: g, reason: collision with root package name */
    public final Thread f490g;

    public i(e eVar, int i10) {
        Thread threadNewThread = e.f465n.newThread(new d(this, 1));
        this.f490g = threadNewThread;
        e.f466o.getClass();
        threadNewThread.setName("TubeSockWriter-" + i10);
        this.f488e = eVar;
        this.f484a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b10, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + (length < 126 ? 6 : length <= 65535 ? 8 : 14));
        byteBufferAllocate.put((byte) (b10 | Byte.MIN_VALUE));
        if (length < 126) {
            byteBufferAllocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            byteBufferAllocate.put((byte) 254);
            byteBufferAllocate.putShort((short) length);
        } else {
            byteBufferAllocate.put((byte) 255);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.f485b.nextBytes(bArr2);
        byteBufferAllocate.put(bArr2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byteBufferAllocate.put((byte) (bArr[i10] ^ bArr2[i10 % 4]));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final synchronized void b(byte b10, byte[] bArr) {
        try {
            ByteBuffer byteBufferA = a(b10, bArr);
            if (this.f486c && (this.f487d || b10 != 8)) {
                throw new f("Shouldn't be sending");
            }
            if (b10 == 8) {
                this.f487d = true;
            }
            this.f484a.add(byteBufferA);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
