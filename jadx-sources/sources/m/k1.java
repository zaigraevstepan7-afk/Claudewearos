package m;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 extends f1 implements g1 {
    public static final Method S;
    public p7.k R;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                S = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.g1
    public final void a(l.h hVar, MenuItem menuItem) {
        p7.k kVar = this.R;
        if (kVar != null) {
            kVar.a(hVar, menuItem);
        }
    }

    @Override // m.g1
    public final void f(l.h hVar, l.i iVar) {
        p7.k kVar = this.R;
        if (kVar != null) {
            kVar.f(hVar, iVar);
        }
    }
}
