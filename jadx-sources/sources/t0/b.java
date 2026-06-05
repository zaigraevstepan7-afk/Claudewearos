package t0;

import a2.w;
import g3.m0;
import k0.t0;
import l3.a0;
import l3.t;
import v0.u0;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f15342b;

    /* renamed from: c, reason: collision with root package name */
    public final t f15343c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f15344d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15345e;

    /* renamed from: f, reason: collision with root package name */
    public final l3.n f15346f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f15347g;

    /* renamed from: h, reason: collision with root package name */
    public final l3.j f15348h;

    /* renamed from: i, reason: collision with root package name */
    public final w f15349i;

    public b(a0 a0Var, t tVar, t0 t0Var, boolean z2, l3.n nVar, u0 u0Var, l3.j jVar, w wVar) {
        this.f15342b = a0Var;
        this.f15343c = tVar;
        this.f15344d = t0Var;
        this.f15345e = z2;
        this.f15346f = nVar;
        this.f15347g = u0Var;
        this.f15348h = jVar;
        this.f15349i = wVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        e eVar = new e();
        eVar.J = this.f15342b;
        eVar.K = this.f15343c;
        eVar.L = this.f15344d;
        eVar.M = this.f15345e;
        eVar.N = this.f15346f;
        u0 u0Var = this.f15347g;
        eVar.O = u0Var;
        eVar.P = this.f15348h;
        eVar.Q = this.f15349i;
        u0Var.f17491f = new c(eVar, 4);
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15342b.equals(bVar.f15342b) && this.f15343c.equals(bVar.f15343c) && this.f15344d.equals(bVar.f15344d) && this.f15345e == bVar.f15345e && fj.l.b(this.f15346f, bVar.f15346f) && this.f15347g.equals(bVar.f15347g) && fj.l.b(this.f15348h, bVar.f15348h) && fj.l.b(this.f15349i, bVar.f15349i);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        e eVar = (e) nVar;
        boolean z2 = eVar.M;
        l3.j jVar = eVar.P;
        u0 u0Var = eVar.O;
        eVar.J = this.f15342b;
        t tVar = this.f15343c;
        eVar.K = tVar;
        eVar.L = this.f15344d;
        boolean z10 = this.f15345e;
        eVar.M = z10;
        eVar.N = this.f15346f;
        u0 u0Var2 = this.f15347g;
        eVar.O = u0Var2;
        l3.j jVar2 = this.f15348h;
        eVar.P = jVar2;
        eVar.Q = this.f15349i;
        if (z10 != z2 || z10 != z2 || !fj.l.b(jVar2, jVar) || !m0.c(tVar.f9938b)) {
            v2.n.o(eVar);
        }
        if (u0Var2.equals(u0Var)) {
            return;
        }
        u0Var2.f17491f = new c(eVar, 0);
    }

    public final int hashCode() {
        return this.f15349i.hashCode() + ((this.f15348h.hashCode() + ((this.f15347g.hashCode() + ((this.f15346f.hashCode() + gk.b.i(gk.b.i(gk.b.i((this.f15344d.hashCode() + ((this.f15343c.hashCode() + (this.f15342b.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f15345e), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f15342b + ", value=" + this.f15343c + ", state=" + this.f15344d + ", readOnly=false, enabled=" + this.f15345e + ", isPassword=false, offsetMapping=" + this.f15346f + ", manager=" + this.f15347g + ", imeOptions=" + this.f15348h + ", focusRequester=" + this.f15349i + ')';
    }
}
