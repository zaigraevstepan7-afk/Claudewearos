package s;

import android.view.ViewConfiguration;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f14573a = ViewConfiguration.getScrollFriction();

    public static final t.u a(f1.i0 i0Var) {
        s3.c cVar = (s3.c) i0Var.j(f1.f18262h);
        boolean zC = i0Var.c(cVar.e());
        Object objQ = i0Var.Q();
        if (zC || objQ == f1.m.f6385a) {
            objQ = new t.u(new ld.i(cVar));
            i0Var.l0(objQ);
        }
        return (t.u) objQ;
    }
}
