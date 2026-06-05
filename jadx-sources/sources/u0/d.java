package u0;

import g3.e0;
import g3.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static d f16484h;

    /* renamed from: a, reason: collision with root package name */
    public final s3.m f16485a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f16486b;

    /* renamed from: c, reason: collision with root package name */
    public final s3.d f16487c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.i f16488d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f16489e;

    /* renamed from: f, reason: collision with root package name */
    public float f16490f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f16491g = Float.NaN;

    public d(s3.m mVar, n0 n0Var, s3.d dVar, k3.i iVar) {
        this.f16485a = mVar;
        this.f16486b = n0Var;
        this.f16487c = dVar;
        this.f16488d = iVar;
        this.f16489e = e0.h(n0Var, mVar);
    }

    public final long a(int i10, long j) {
        int i11;
        float f10 = this.f16491g;
        float f11 = this.f16490f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = e.f16492a;
            long jB = s3.b.b(0, 0, 0, 0, 15);
            n0 n0Var = this.f16489e;
            s3.d dVar = this.f16487c;
            float fJ = e0.a(str, n0Var, jB, dVar, this.f16488d, 1, 96).j();
            float fJ2 = e0.a(e.f16493b, this.f16489e, s3.b.b(0, 0, 0, 0, 15), dVar, this.f16488d, 2, 96).j() - fJ;
            this.f16491g = fJ;
            this.f16490f = fJ2;
            f11 = fJ2;
            f10 = fJ;
        }
        if (i10 != 1) {
            int iRound = Math.round((f11 * (i10 - 1)) + f10);
            i11 = iRound >= 0 ? iRound : 0;
            int iG = s3.a.g(j);
            if (i11 > iG) {
                i11 = iG;
            }
        } else {
            i11 = s3.a.i(j);
        }
        return s3.b.a(s3.a.j(j), s3.a.h(j), i11, s3.a.g(j));
    }
}
