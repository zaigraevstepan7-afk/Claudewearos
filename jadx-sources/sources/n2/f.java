package n2;

import android.view.KeyEvent;
import v1.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends n implements e {
    public ej.c H;
    public ej.c I;

    @Override // n2.e
    public final boolean A(KeyEvent keyEvent) {
        ej.c cVar = this.I;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // n2.e
    public final boolean Q(KeyEvent keyEvent) {
        ej.c cVar = this.H;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
