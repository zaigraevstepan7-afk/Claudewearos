package v3;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends v1.n implements a2.v {
    @Override // a2.v
    public final void P0(a2.s sVar) {
        View viewC = j.c(this);
        sVar.e(this.f17565a.G && j.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            sVar.c(a2.h.a(viewFindFocus, viewC));
        }
    }
}
