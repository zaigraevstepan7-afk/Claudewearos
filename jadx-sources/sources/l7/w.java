package l7;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f10080b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10079a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10081c = new ArrayList();

    public w(View view) {
        this.f10080b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f10080b == wVar.f10080b && this.f10079a.equals(wVar.f10079a);
    }

    public final int hashCode() {
        return this.f10079a.hashCode() + (this.f10080b.hashCode() * 31);
    }

    public final String toString() {
        String strV = m1.v(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f10080b + "\n", "    values:");
        HashMap map = this.f10079a;
        for (String str : map.keySet()) {
            strV = strV + "    " + str + ": " + map.get(str) + "\n";
        }
        return strV;
    }
}
