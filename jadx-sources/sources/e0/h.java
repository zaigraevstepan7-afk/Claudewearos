package e0;

import f0.b0;
import f1.i0;
import f1.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f5239a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5240b;

    /* renamed from: c, reason: collision with root package name */
    public final ak.x f5241c;

    public h(v vVar, g gVar, ak.x xVar) {
        this.f5239a = vVar;
        this.f5240b = gVar;
        this.f5241c = xVar;
    }

    @Override // f0.b0
    public final int a() {
        return this.f5240b.k().f742b;
    }

    @Override // f0.b0
    public final Object b(int i10) {
        Object objF = this.f5241c.f(i10);
        return objF == null ? this.f5240b.l(i10) : objF;
    }

    @Override // f0.b0
    public final Object c(int i10) {
        return this.f5240b.j(i10);
    }

    @Override // f0.b0
    public final int d(Object obj) {
        return this.f5241c.e(obj);
    }

    @Override // f0.b0
    public final void e(int i10, Object obj, i0 i0Var, int i11) {
        i0Var.c0(1493551140);
        int i12 = (i0Var.d(i10) ? 4 : 2) | i11 | (i0Var.h(obj) ? 32 : 16) | (i0Var.f(this) ? 256 : 128);
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            f0.o.b(obj, i10, this.f5239a.f5342q, p1.j.d(726189336, new d0.i(i10, 1, this), i0Var), i0Var, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(this, i10, obj, i11, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return fj.l.b(this.f5240b, ((h) obj).f5240b);
    }

    public final int hashCode() {
        return this.f5240b.hashCode();
    }
}
