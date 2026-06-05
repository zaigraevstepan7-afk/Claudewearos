package g6;

import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.t;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends b0 {

    /* renamed from: l, reason: collision with root package name */
    public final ld.d f7213l;

    /* renamed from: m, reason: collision with root package name */
    public t f7214m;

    /* renamed from: n, reason: collision with root package name */
    public b f7215n;

    public a(ld.d dVar) {
        this.f7213l = dVar;
        if (dVar.f10908a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f10908a = this;
    }

    @Override // androidx.lifecycle.b0
    public final void e() {
        ld.d dVar = this.f7213l;
        dVar.f10909b = true;
        dVar.f10911d = false;
        dVar.f10910c = false;
        dVar.f10916i.drainPermits();
        dVar.a();
        dVar.f10914g = new h6.a(dVar);
        dVar.b();
    }

    @Override // androidx.lifecycle.b0
    public final void f() {
        this.f7213l.f10909b = false;
    }

    @Override // androidx.lifecycle.b0
    public final void h(c0 c0Var) {
        super.h(c0Var);
        this.f7214m = null;
        this.f7215n = null;
    }

    public final void j() {
        t tVar = this.f7214m;
        b bVar = this.f7215n;
        if (tVar == null || bVar == null) {
            return;
        }
        super.h(bVar);
        d(tVar, bVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        v.k(sb2, this.f7213l);
        sb2.append("}}");
        return sb2.toString();
    }
}
