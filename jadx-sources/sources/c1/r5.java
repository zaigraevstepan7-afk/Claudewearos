package c1;

import android.content.Context;
import android.content.Intent;
import com.anonlab.voidlauncher.feature.home.presentation.settings.LiquidGlassSettingsActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2648f;

    public /* synthetic */ r5(int i10, Object obj, Object obj2, Object obj3, Object obj4, boolean z2) {
        this.f2643a = i10;
        this.f2644b = z2;
        this.f2645c = obj;
        this.f2646d = obj2;
        this.f2647e = obj3;
        this.f2648f = obj4;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f2643a) {
            case 0:
                break;
            case 1:
                ej.a aVar = (ej.a) this.f2645c;
                qj.z zVar = (qj.z) this.f2647e;
                x5 x5Var = (x5) this.f2648f;
                ej.a aVar2 = (ej.a) this.f2646d;
                if (!this.f2644b) {
                    qj.b0.w(zVar, null, new l3(x5Var, null, 8), 3).T(new k3(x5Var, aVar2, 2));
                } else if (aVar != null) {
                    aVar.a();
                }
                break;
            default:
                lb.g gVar = (lb.g) this.f2645c;
                d.k kVar = (d.k) this.f2646d;
                Context context = (Context) this.f2647e;
                f1.a1 a1Var = (f1.a1) this.f2648f;
                if (this.f2644b) {
                    a1Var.setValue(lb.f.f10269f);
                    gVar.f10289a.edit().putString("graphic_quality", "CUSTOM").apply();
                    kVar.a0(new Intent(context, (Class<?>) LiquidGlassSettingsActivity.class));
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ r5(boolean z2, ej.a aVar, qj.z zVar, x5 x5Var, ej.a aVar2) {
        this.f2643a = 1;
        this.f2644b = z2;
        this.f2645c = aVar;
        this.f2647e = zVar;
        this.f2648f = x5Var;
        this.f2646d = aVar2;
    }
}
