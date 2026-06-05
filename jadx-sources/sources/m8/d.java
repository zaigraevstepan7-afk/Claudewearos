package m8;

import java.nio.ByteBuffer;
import kk.c0;
import kk.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f11424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11425b;

    public d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f11424a = byteBufferSlice;
        this.f11425b = byteBufferSlice.capacity();
    }

    @Override // kk.c0
    public final long A(long j, kk.f fVar) {
        ByteBuffer byteBuffer = this.f11424a;
        int iPosition = byteBuffer.position();
        int i10 = this.f11425b;
        if (iPosition == i10) {
            return -1L;
        }
        int iPosition2 = (int) (byteBuffer.position() + j);
        if (iPosition2 <= i10) {
            i10 = iPosition2;
        }
        byteBuffer.limit(i10);
        return fVar.write(byteBuffer);
    }

    @Override // kk.c0
    public final e0 a() {
        return e0.f9690d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
