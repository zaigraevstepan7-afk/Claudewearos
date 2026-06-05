package h0;

import fj.l;
import v1.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends n {
    public c H;

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        c cVar = this.H;
        if (cVar != null) {
            cVar.f7565a.k(this);
        }
        if (cVar != null) {
            cVar.f7565a.b(this);
        }
        this.H = cVar;
    }

    @Override // v1.n
    public final void j1() {
        c cVar = this.H;
        if (cVar != null) {
            l.d(cVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            cVar.f7565a.k(this);
        }
    }
}
