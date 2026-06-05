package u0;

import g3.e0;
import g3.n0;
import g3.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f16510a;

    /* renamed from: b, reason: collision with root package name */
    public n0 f16511b;

    /* renamed from: c, reason: collision with root package name */
    public k3.i f16512c;

    /* renamed from: d, reason: collision with root package name */
    public int f16513d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16514e;

    /* renamed from: f, reason: collision with root package name */
    public int f16515f;

    /* renamed from: g, reason: collision with root package name */
    public int f16516g;

    /* renamed from: i, reason: collision with root package name */
    public s3.c f16518i;
    public fk.g j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16519k;

    /* renamed from: l, reason: collision with root package name */
    public long f16520l;

    /* renamed from: m, reason: collision with root package name */
    public d f16521m;

    /* renamed from: n, reason: collision with root package name */
    public s f16522n;

    /* renamed from: o, reason: collision with root package name */
    public s3.m f16523o;

    /* renamed from: s, reason: collision with root package name */
    public long f16527s;

    /* renamed from: h, reason: collision with root package name */
    public long f16517h = a.f16474a;

    /* renamed from: p, reason: collision with root package name */
    public long f16524p = s3.b.h(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f16525q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f16526r = -1;

    public g(String str, n0 n0Var, k3.i iVar, int i10, boolean z2, int i11, int i12) {
        this.f16510a = str;
        this.f16511b = n0Var;
        this.f16512c = iVar;
        this.f16513d = i10;
        this.f16514e = z2;
        this.f16515f = i11;
        this.f16516g = i12;
        long j = 0;
        this.f16520l = (j & 4294967295L) | (j << 32);
    }

    public static long g(g gVar, long j, s3.m mVar) {
        n0 n0Var = gVar.f16511b;
        d dVar = gVar.f16521m;
        s3.c cVar = gVar.f16518i;
        fj.l.c(cVar);
        d dVarK = c.k(dVar, mVar, n0Var, cVar, gVar.f16512c);
        gVar.f16521m = dVarK;
        return dVarK.a(gVar.f16516g, j);
    }

    public final int a(int i10, s3.m mVar) {
        int i11 = this.f16525q;
        int i12 = this.f16526r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = s3.b.a(0, i10, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (this.f16516g > 1) {
            jA = g(this, jA, mVar);
        }
        s sVarE = e(mVar);
        long jF = b.f(jA, this.f16514e, this.f16513d, sVarE.c());
        boolean z2 = this.f16514e;
        int i13 = this.f16513d;
        int i14 = this.f16515f;
        int iM = k0.s.m(new fk.g((o3.c) sVarE, ((z2 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jF).j());
        int i15 = s3.a.i(jA);
        if (iM < i15) {
            iM = i15;
        }
        this.f16525q = i10;
        this.f16526r = iM;
        return iM;
    }

    public final boolean b(long j, s3.m mVar) {
        s sVar;
        this.f16527s = (this.f16527s << 2) | 3;
        boolean z2 = true;
        long jG = this.f16516g > 1 ? g(this, j, mVar) : j;
        fk.g gVar = this.j;
        boolean z10 = false;
        if (gVar != null && (sVar = this.f16522n) != null && !sVar.a() && mVar == this.f16523o && (s3.a.b(jG, this.f16524p) || (s3.a.h(jG) == s3.a.h(this.f16524p) && s3.a.j(jG) == s3.a.j(this.f16524p) && s3.a.g(jG) >= gVar.j() && !((h3.j) gVar.f6828d).f7605d))) {
            if (!s3.a.b(jG, this.f16524p)) {
                fk.g gVar2 = this.j;
                fj.l.c(gVar2);
                this.f16520l = s3.b.d(jG, (k0.s.m(Math.min(((o3.c) gVar2.f6827c).B.c(), gVar2.l())) << 32) | (k0.s.m(gVar2.j()) & 4294967295L));
                if (this.f16513d == 3 || (((int) (r12 >> 32)) >= gVar2.l() && ((int) (4294967295L & r12)) >= gVar2.j())) {
                    z2 = false;
                }
                this.f16519k = z2;
                this.f16524p = jG;
            }
            return false;
        }
        s sVarE = e(mVar);
        long jF = b.f(jG, this.f16514e, this.f16513d, sVarE.c());
        boolean z11 = this.f16514e;
        int i10 = this.f16513d;
        int i11 = this.f16515f;
        fk.g gVar3 = new fk.g((o3.c) sVarE, ((z11 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10, jF);
        this.f16524p = jG;
        this.f16520l = s3.b.d(jG, (k0.s.m(gVar3.j()) & 4294967295L) | (k0.s.m(gVar3.l()) << 32));
        if (this.f16513d != 3 && (((int) (r1 >> 32)) < gVar3.l() || ((int) (r1 & 4294967295L)) < gVar3.j())) {
            z10 = true;
        }
        this.f16519k = z10;
        this.j = gVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.f16522n = null;
        this.f16523o = null;
        this.f16525q = -1;
        this.f16526r = -1;
        this.f16524p = s3.b.h(0, 0, 0, 0);
        long j = 0;
        this.f16520l = (j & 4294967295L) | (j << 32);
        this.f16519k = false;
    }

    public final void d(s3.c cVar) {
        long jA;
        s3.c cVar2 = this.f16518i;
        if (cVar != null) {
            int i10 = a.f16475b;
            jA = a.a(cVar.e(), cVar.r0());
        } else {
            jA = a.f16474a;
        }
        if (cVar2 == null) {
            this.f16518i = cVar;
            this.f16517h = jA;
        } else if (cVar == null || this.f16517h != jA) {
            this.f16518i = cVar;
            this.f16517h = jA;
            this.f16527s = (this.f16527s << 2) | 1;
            c();
        }
    }

    public final s e(s3.m mVar) {
        s cVar = this.f16522n;
        if (cVar == null || mVar != this.f16523o || cVar.a()) {
            this.f16523o = mVar;
            String str = this.f16510a;
            n0 n0VarH = e0.h(this.f16511b, mVar);
            s3.c cVar2 = this.f16518i;
            fj.l.c(cVar2);
            k3.i iVar = this.f16512c;
            qi.s sVar = qi.s.f13520a;
            cVar = new o3.c(str, n0VarH, sVar, sVar, iVar, cVar2);
        }
        this.f16522n = cVar;
        return cVar;
    }

    public final void f(String str, n0 n0Var, k3.i iVar, int i10, boolean z2, int i11, int i12) {
        this.f16510a = str;
        this.f16511b = n0Var;
        this.f16512c = iVar;
        this.f16513d = i10;
        this.f16514e = z2;
        this.f16515f = i11;
        this.f16516g = i12;
        this.f16527s = (this.f16527s << 2) | 2;
        c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f16517h));
        sb2.append(", history=");
        sb2.append(this.f16527s);
        sb2.append(", constraints=$)");
        return sb2.toString();
    }
}
