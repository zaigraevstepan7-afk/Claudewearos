package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final int f924e;

    /* renamed from: f, reason: collision with root package name */
    public final int f925f;

    public f(byte[] bArr, int i10, int i11) {
        super(bArr);
        g.e(i10, i10 + i11, bArr.length);
        this.f924e = i10;
        this.f925f = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte b(int i10) {
        int i11 = this.f925f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f930b[this.f924e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(m6.a.d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(gk.b.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int size() {
        return this.f925f;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final void w(int i10, byte[] bArr) {
        System.arraycopy(this.f930b, this.f924e, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int x() {
        return this.f924e;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte y(int i10) {
        return this.f930b[this.f924e + i10];
    }
}
