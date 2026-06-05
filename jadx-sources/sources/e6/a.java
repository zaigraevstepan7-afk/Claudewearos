package e6;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.r0;
import b6.j;
import f1.i0;
import f1.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f5801a = new v(new j(24));

    public static b1 a(i0 i0Var) {
        b1 b1VarF = (b1) i0Var.j(f5801a);
        if (b1VarF == null) {
            i0Var.b0(1260197608);
            b1VarF = r0.f((View) i0Var.j(AndroidCompositionLocals_androidKt.f842f));
        } else {
            i0Var.b0(1260196492);
        }
        i0Var.p(false);
        return b1VarF;
    }
}
