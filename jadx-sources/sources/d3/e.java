package d3;

import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends v1.n implements z1 {
    public boolean H;
    public final boolean I;
    public ej.c J;

    public e(boolean z2, boolean z10, ej.c cVar) {
        this.H = z2;
        this.I = z10;
        this.J = cVar;
    }

    @Override // v2.z1
    public final boolean X0() {
        return this.H;
    }

    @Override // v2.z1
    public final boolean Y() {
        return this.I;
    }

    @Override // v2.z1
    public final void u0(z zVar) {
        this.J.invoke(zVar);
    }
}
