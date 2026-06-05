package d0;

import ak.x;
import f0.b0;
import f1.i0;
import f1.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f4367a;

    /* renamed from: b, reason: collision with root package name */
    public final h f4368b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4369c;

    /* renamed from: d, reason: collision with root package name */
    public final x f4370d;

    public k(u uVar, h hVar, c cVar, x xVar) {
        this.f4367a = uVar;
        this.f4368b = hVar;
        this.f4369c = cVar;
        this.f4370d = xVar;
    }

    @Override // f0.b0
    public final int a() {
        return this.f4368b.k().f742b;
    }

    @Override // f0.b0
    public final Object b(int i10) {
        Object objF = this.f4370d.f(i10);
        return objF == null ? this.f4368b.l(i10) : objF;
    }

    @Override // f0.b0
    public final Object c(int i10) {
        return this.f4368b.j(i10);
    }

    @Override // f0.b0
    public final int d(Object obj) {
        return this.f4370d.e(obj);
    }

    @Override // f0.b0
    public final void e(int i10, Object obj, i0 i0Var, int i11) {
        i0Var.c0(-462424778);
        int i12 = (i0Var.d(i10) ? 4 : 2) | i11 | (i0Var.h(obj) ? 32 : 16) | (i0Var.f(this) ? 256 : 128);
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            f0.o.b(obj, i10, this.f4367a.f4456r, p1.j.d(-824725566, new i(i10, 0, this), i0Var), i0Var, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new j(this, i10, obj, i11, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return fj.l.b(this.f4368b, ((k) obj).f4368b);
    }

    public final int hashCode() {
        return this.f4368b.hashCode();
    }
}
