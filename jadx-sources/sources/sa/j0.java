package sa;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import f1.a1;
import wa.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14882a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14884c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14886e;

    public /* synthetic */ j0(Context context, View view, ej.c cVar, boolean z2) {
        this.f14884c = context;
        this.f14885d = view;
        this.f14886e = cVar;
        this.f14883b = z2;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f14882a) {
            case 0:
                Context context = (Context) this.f14884c;
                View view = (View) this.f14885d;
                ej.c cVar = (ej.c) this.f14886e;
                fj.l.f(context, "context");
                SharedPreferences sharedPreferences = context.getSharedPreferences("home_launcher_settings", 0);
                fj.l.e(sharedPreferences, "getSharedPreferences(...)");
                if (sharedPreferences.getBoolean("switch_haptics_enabled", true)) {
                    view.performHapticFeedback(3);
                }
                cVar.invoke(Boolean.valueOf(!this.f14883b));
                break;
            default:
                a1 a1Var = (a1) this.f14884c;
                a1 a1Var2 = (a1) this.f14885d;
                a1 a1Var3 = (a1) this.f14886e;
                if (((q0) a1Var.getValue()) != null && !this.f14883b) {
                    a1Var2.setValue(Boolean.TRUE);
                    a1Var3.setValue(null);
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ j0(boolean z2, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f14883b = z2;
        this.f14884c = a1Var;
        this.f14885d = a1Var2;
        this.f14886e = a1Var3;
    }
}
