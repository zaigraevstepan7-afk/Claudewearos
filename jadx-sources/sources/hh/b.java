package hh;

import java.io.OutputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f7998a;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f7998a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f7998a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f7998a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
