package t4;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public e1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // t4.j1
    public m1 a() {
        return m1.d(null, this.f15705c.consumeDisplayCutout());
    }

    @Override // t4.c1, t4.j1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Objects.equals(this.f15705c, e1Var.f15705c) && Objects.equals(this.f15709g, e1Var.f15709g) && c1.C(this.f15710h, e1Var.f15710h);
    }

    @Override // t4.j1
    public i f() {
        DisplayCutout displayCutout = this.f15705c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // t4.j1
    public int hashCode() {
        return this.f15705c.hashCode();
    }

    public e1(m1 m1Var, e1 e1Var) {
        super(m1Var, e1Var);
    }
}
