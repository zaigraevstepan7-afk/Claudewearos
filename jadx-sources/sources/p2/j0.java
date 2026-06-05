package p2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f12704b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12705c;

    /* renamed from: d, reason: collision with root package name */
    public final PointerInputEventHandler f12706d;

    public j0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i10) {
        obj2 = (i10 & 2) != 0 ? null : obj2;
        this.f12704b = obj;
        this.f12705c = obj2;
        this.f12706d = pointerInputEventHandler;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new p0(this.f12704b, this.f12705c, this.f12706d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return fj.l.b(this.f12704b, j0Var.f12704b) && fj.l.b(this.f12705c, j0Var.f12705c) && this.f12706d == j0Var.f12706d;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        p0 p0Var = (p0) nVar;
        Object obj = p0Var.H;
        Object obj2 = this.f12704b;
        boolean z2 = !fj.l.b(obj, obj2);
        p0Var.H = obj2;
        Object obj3 = p0Var.I;
        Object obj4 = this.f12705c;
        if (!fj.l.b(obj3, obj4)) {
            z2 = true;
        }
        p0Var.I = obj4;
        Class<?> cls = p0Var.J.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f12706d;
        if (cls == pointerInputEventHandler.getClass() ? z2 : true) {
            p0Var.s1();
        }
        p0Var.J = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.f12704b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f12705c;
        return this.f12706d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
