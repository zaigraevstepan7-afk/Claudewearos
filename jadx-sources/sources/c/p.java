package c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1853a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1854b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    public static q f1855c;

    public static final void a(m mVar, e0 e0Var, e0 e0Var2) {
        View decorView = mVar.getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        ej.c cVar = e0Var.f1816d;
        Resources resources = decorView.getResources();
        fj.l.e(resources, "getResources(...)");
        boolean zBooleanValue = ((Boolean) cVar.invoke(resources)).booleanValue();
        ej.c cVar2 = e0Var2.f1816d;
        Resources resources2 = decorView.getResources();
        fj.l.e(resources2, "getResources(...)");
        boolean zBooleanValue2 = ((Boolean) cVar2.invoke(resources2)).booleanValue();
        q uVar = f1855c;
        if (uVar == null) {
            int i10 = Build.VERSION.SDK_INT;
            uVar = i10 >= 35 ? new u() : i10 >= 30 ? new t() : i10 >= 29 ? new s() : i10 >= 28 ? new r() : new q();
            f1855c = uVar;
        }
        q qVar = uVar;
        Window window = mVar.getWindow();
        fj.l.e(window, "getWindow(...)");
        qVar.b(e0Var, e0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = mVar.getWindow();
        fj.l.e(window2, "getWindow(...)");
        qVar.a(window2);
    }
}
