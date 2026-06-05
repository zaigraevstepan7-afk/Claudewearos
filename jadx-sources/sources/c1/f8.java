package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f8 implements w3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2113a;

    public f8(int i10) {
        this.f2113a = i10;
    }

    @Override // w3.c0
    public final long d(s3.k kVar, long j, s3.m mVar, long j4) {
        int i10 = (int) (j4 >> 32);
        int iC = ((kVar.c() - i10) / 2) + kVar.f14747a;
        if (iC < 0) {
            iC = kVar.f14747a;
        } else if (iC + i10 > ((int) (j >> 32))) {
            iC = kVar.f14749c - i10;
        }
        int i11 = kVar.f14748b - ((int) (j4 & 4294967295L));
        int i12 = this.f2113a;
        int i13 = i11 - i12;
        if (i13 < 0) {
            i13 = kVar.f14750d + i12;
        }
        return (i13 & 4294967295L) | (iC << 32);
    }
}
