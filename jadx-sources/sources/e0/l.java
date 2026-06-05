package e0;

import java.util.List;
import java.util.Map;
import qj.z;
import t2.r0;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f5257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5258b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5259c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5260d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f5261e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5262f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5263g;

    /* renamed from: h, reason: collision with root package name */
    public final z f5264h;

    /* renamed from: i, reason: collision with root package name */
    public final s3.c f5265i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final ej.c f5266k;

    /* renamed from: l, reason: collision with root package name */
    public final ej.c f5267l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f5268m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5269n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5270o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5271p;

    /* renamed from: q, reason: collision with root package name */
    public final o1 f5272q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5273r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5274s;

    public l(n nVar, int i10, boolean z2, float f10, r0 r0Var, float f11, boolean z10, z zVar, s3.c cVar, int i11, ej.c cVar2, ej.c cVar3, List list, int i12, int i13, int i14, o1 o1Var, int i15, int i16) {
        this.f5257a = nVar;
        this.f5258b = i10;
        this.f5259c = z2;
        this.f5260d = f10;
        this.f5261e = r0Var;
        this.f5262f = f11;
        this.f5263g = z10;
        this.f5264h = zVar;
        this.f5265i = cVar;
        this.j = i11;
        this.f5266k = cVar2;
        this.f5267l = cVar3;
        this.f5268m = list;
        this.f5269n = i12;
        this.f5270o = i13;
        this.f5271p = i14;
        this.f5272q = o1Var;
        this.f5273r = i15;
        this.f5274s = i16;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final l a(int i10, boolean z2) {
        n nVar;
        int i11;
        if (this.f5263g) {
            return null;
        }
        ?? r2 = this.f5268m;
        if (r2.isEmpty() || (nVar = this.f5257a) == null) {
            return null;
        }
        int i12 = nVar.f5298g;
        int i13 = this.f5258b - i10;
        if (i13 < 0 || i13 >= i12) {
            return null;
        }
        m mVar = (m) qi.l.z0(r2);
        m mVar2 = (m) qi.l.F0(r2);
        if (mVar.f5291r || mVar2.f5291r) {
            return null;
        }
        int i14 = this.f5270o;
        int i15 = this.f5269n;
        o1 o1Var = this.f5272q;
        if (i10 < 0) {
            if (Math.min((u0.l.l(mVar, o1Var) + mVar.f5285l) - i15, (u0.l.l(mVar2, o1Var) + mVar2.f5285l) - i14) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i15 - u0.l.l(mVar, o1Var), i14 - u0.l.l(mVar2, o1Var)) <= i10) {
            return null;
        }
        int size = r2.size();
        int i16 = 0;
        while (i16 < size) {
            m mVar3 = (m) r2.get(i16);
            mVar3.getClass();
            if (mVar3.f5291r) {
                i11 = i13;
            } else {
                long j = mVar3.f5288o;
                i11 = i13;
                mVar3.f5288o = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + i10) & 4294967295L);
                if (z2) {
                    int size2 = mVar3.f5279e.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        mVar3.f5282h.a(i17, mVar3.f5276b);
                    }
                }
            }
            i16++;
            i13 = i11;
        }
        return new l(this.f5257a, i13, this.f5259c || i10 > 0, i10, this.f5261e, this.f5262f, this.f5263g, this.f5264h, this.f5265i, this.j, this.f5266k, this.f5267l, r2, this.f5269n, this.f5270o, this.f5271p, o1Var, this.f5273r, this.f5274s);
    }

    public final long b() {
        r0 r0Var = this.f5261e;
        return (r0Var.getWidth() << 32) | (r0Var.getHeight() & 4294967295L);
    }

    @Override // t2.r0
    public final Map f() {
        return this.f5261e.f();
    }

    @Override // t2.r0
    public final void g() {
        this.f5261e.g();
    }

    @Override // t2.r0
    public final int getHeight() {
        return this.f5261e.getHeight();
    }

    @Override // t2.r0
    public final int getWidth() {
        return this.f5261e.getWidth();
    }

    @Override // t2.r0
    public final ej.c h() {
        return this.f5261e.h();
    }
}
