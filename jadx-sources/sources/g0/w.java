package g0;

import f1.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w implements f0.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6980a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.o f6981b;

    /* renamed from: c, reason: collision with root package name */
    public final ak.x f6982c;

    public w(h0 h0Var, v vVar, ak.x xVar) {
        this.f6980a = h0Var;
        this.f6981b = vVar;
        this.f6982c = xVar;
    }

    @Override // f0.b0
    public final int a() {
        return this.f6981b.k().f742b;
    }

    @Override // f0.b0
    public final Object b(int i10) {
        Object objF = this.f6982c.f(i10);
        return objF == null ? this.f6981b.l(i10) : objF;
    }

    @Override // f0.b0
    public final int d(Object obj) {
        return this.f6982c.e(obj);
    }

    @Override // f0.b0
    public final void e(int i10, Object obj, f1.i0 i0Var, int i11) {
        i0Var.c0(-1201380429);
        int i12 = (i0Var.d(i10) ? 4 : 2) | i11 | (i0Var.h(obj) ? 32 : 16) | (i0Var.f(this) ? 256 : 128);
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            f0.o.b(obj, i10, this.f6980a.f6914z, p1.j.d(1142237095, new d0.i(i10, 3, this), i0Var), i0Var, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(this, i10, obj, i11, 5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return fj.l.b(this.f6981b, ((w) obj).f6981b);
    }

    public final int hashCode() {
        return this.f6981b.hashCode();
    }
}
