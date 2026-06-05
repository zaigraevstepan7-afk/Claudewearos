package u0;

import ak.v;
import g3.e0;
import g3.j0;
import g3.k0;
import g3.n0;
import java.util.List;
import k0.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public g3.f f16494a;

    /* renamed from: b, reason: collision with root package name */
    public k3.i f16495b;

    /* renamed from: c, reason: collision with root package name */
    public int f16496c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16497d;

    /* renamed from: e, reason: collision with root package name */
    public int f16498e;

    /* renamed from: f, reason: collision with root package name */
    public int f16499f;

    /* renamed from: g, reason: collision with root package name */
    public List f16500g;

    /* renamed from: h, reason: collision with root package name */
    public d f16501h;
    public s3.c j;

    /* renamed from: k, reason: collision with root package name */
    public n0 f16503k;

    /* renamed from: l, reason: collision with root package name */
    public v f16504l;

    /* renamed from: m, reason: collision with root package name */
    public s3.m f16505m;

    /* renamed from: n, reason: collision with root package name */
    public k0 f16506n;

    /* renamed from: q, reason: collision with root package name */
    public long f16509q;

    /* renamed from: i, reason: collision with root package name */
    public long f16502i = a.f16474a;

    /* renamed from: o, reason: collision with root package name */
    public int f16507o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f16508p = -1;

    public f(g3.f fVar, n0 n0Var, k3.i iVar, int i10, boolean z2, int i11, int i12, List list) {
        this.f16494a = fVar;
        this.f16495b = iVar;
        this.f16496c = i10;
        this.f16497d = z2;
        this.f16498e = i11;
        this.f16499f = i12;
        this.f16500g = list;
        this.f16503k = n0Var;
    }

    public final int a(int i10, s3.m mVar) {
        int i11 = this.f16507o;
        int i12 = this.f16508p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = s3.b.a(0, i10, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (this.f16499f > 1) {
            d dVar = this.f16501h;
            n0 n0Var = this.f16503k;
            s3.c cVar = this.j;
            fj.l.c(cVar);
            d dVarK = c.k(dVar, mVar, n0Var, cVar, this.f16495b);
            this.f16501h = dVarK;
            jA = dVarK.a(this.f16499f, jA);
        }
        int iM = s.m(b(jA, mVar).f7158e);
        int i13 = s3.a.i(jA);
        if (iM < i13) {
            iM = i13;
        }
        this.f16507o = i10;
        this.f16508p = iM;
        return iM;
    }

    public final g3.o b(long j, s3.m mVar) {
        v vVarE = e(mVar);
        long jF = b.f(j, this.f16497d, this.f16496c, vVarE.c());
        boolean z2 = this.f16497d;
        int i10 = this.f16496c;
        int i11 = this.f16498e;
        return new g3.o(vVarE, jF, ((z2 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10);
    }

    public final boolean c(long j, s3.m mVar) {
        this.f16509q = (this.f16509q << 2) | 3;
        if (this.f16499f > 1) {
            d dVar = this.f16501h;
            n0 n0Var = this.f16503k;
            s3.c cVar = this.j;
            fj.l.c(cVar);
            d dVarK = c.k(dVar, mVar, n0Var, cVar, this.f16495b);
            this.f16501h = dVarK;
            j = dVarK.a(this.f16499f, j);
        }
        k0 k0Var = this.f16506n;
        if (k0Var != null) {
            g3.o oVar = k0Var.f7129b;
            j0 j0Var = k0Var.f7128a;
            if (!oVar.f7154a.a()) {
                s3.m mVar2 = j0Var.f7124h;
                long j4 = j0Var.j;
                if (mVar == mVar2 && (s3.a.b(j, j4) || (s3.a.h(j) == s3.a.h(j4) && s3.a.j(j) == s3.a.j(j4) && s3.a.g(j) >= oVar.f7158e && !oVar.f7156c))) {
                    k0 k0Var2 = this.f16506n;
                    fj.l.c(k0Var2);
                    if (s3.a.b(j, k0Var2.f7128a.j)) {
                        return false;
                    }
                    k0 k0Var3 = this.f16506n;
                    fj.l.c(k0Var3);
                    this.f16506n = f(mVar, j, k0Var3.f7129b);
                    return true;
                }
            }
        }
        this.f16506n = f(mVar, j, b(j, mVar));
        return true;
    }

    public final void d(s3.c cVar) {
        long jA;
        s3.c cVar2 = this.j;
        if (cVar != null) {
            int i10 = a.f16475b;
            jA = a.a(cVar.e(), cVar.r0());
        } else {
            jA = a.f16474a;
        }
        if (cVar2 == null) {
            this.j = cVar;
            this.f16502i = jA;
        } else if (cVar == null || this.f16502i != jA) {
            this.j = cVar;
            this.f16502i = jA;
            this.f16509q = (this.f16509q << 2) | 1;
            this.f16504l = null;
            this.f16506n = null;
            this.f16508p = -1;
            this.f16507o = -1;
        }
    }

    public final v e(s3.m mVar) {
        v vVar = this.f16504l;
        if (vVar == null || mVar != this.f16505m || vVar.a()) {
            this.f16505m = mVar;
            g3.f fVar = this.f16494a;
            n0 n0VarH = e0.h(this.f16503k, mVar);
            s3.c cVar = this.j;
            fj.l.c(cVar);
            k3.i iVar = this.f16495b;
            List list = this.f16500g;
            if (list == null) {
                list = qi.s.f13520a;
            }
            vVar = new v(fVar, n0VarH, list, cVar, iVar);
        }
        this.f16504l = vVar;
        return vVar;
    }

    public final k0 f(s3.m mVar, long j, g3.o oVar) {
        float fMin = Math.min(oVar.f7154a.c(), oVar.f7157d);
        g3.f fVar = this.f16494a;
        n0 n0Var = this.f16503k;
        List list = this.f16500g;
        if (list == null) {
            list = qi.s.f13520a;
        }
        int i10 = this.f16498e;
        boolean z2 = this.f16497d;
        int i11 = this.f16496c;
        s3.c cVar = this.j;
        fj.l.c(cVar);
        return new k0(new j0(fVar, n0Var, list, i10, z2, i11, cVar, mVar, this.f16495b, j), oVar, s3.b.d(j, (s.m(fMin) << 32) | (s.m(oVar.f7158e) & 4294967295L)));
    }

    public final String toString() {
        j0 j0Var;
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object aVar = "null";
        sb2.append(this.f16506n != null ? "<TextLayoutResult>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f16502i));
        sb2.append(", history=");
        sb2.append(this.f16509q);
        sb2.append(", constraints=");
        k0 k0Var = this.f16506n;
        if (k0Var != null && (j0Var = k0Var.f7128a) != null) {
            aVar = new s3.a(j0Var.j);
        }
        sb2.append(aVar);
        sb2.append(')');
        return sb2.toString();
    }
}
