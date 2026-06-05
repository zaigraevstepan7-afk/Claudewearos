package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends h {

    /* renamed from: e, reason: collision with root package name */
    public final int f4165e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4166f;

    public g(byte[] bArr, int i10, int i11) {
        super(bArr);
        i.e(i10, i10 + i11, bArr.length);
        this.f4165e = i10;
        this.f4166f = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h, com.google.crypto.tink.shaded.protobuf.i
    public final byte b(int i10) {
        int i11 = this.f4166f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f4169d[this.f4165e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(m6.a.d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(gk.b.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h, com.google.crypto.tink.shaded.protobuf.i
    public final int size() {
        return this.f4166f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h, com.google.crypto.tink.shaded.protobuf.i
    public final void w(int i10, byte[] bArr) {
        System.arraycopy(this.f4169d, this.f4165e, bArr, 0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h
    public final int y() {
        return this.f4165e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h
    public final byte z(int i10) {
        return this.f4169d[this.f4165e + i10];
    }
}
