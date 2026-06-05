package lb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.anonlab.voidlauncher.feature.home.presentation.settings.MoreSettingsActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10412f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10413z;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f10407a = i10;
        this.f10408b = obj;
        this.f10409c = obj2;
        this.f10410d = obj3;
        this.f10411e = obj4;
        this.f10412f = obj5;
        this.f10413z = obj6;
    }

    @Override // ej.a
    public final Object a() throws Throwable {
        boolean z2;
        switch (this.f10407a) {
            case 0:
                g gVar = (g) this.f10408b;
                Context context = (Context) this.f10409c;
                f1.a1 a1Var = (f1.a1) this.f10410d;
                f1.a1 a1Var2 = (f1.a1) this.f10411e;
                f1.a1 a1Var3 = (f1.a1) this.f10412f;
                f1.g1 g1Var = (f1.g1) this.f10413z;
                boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                SharedPreferences sharedPreferences = gVar.f10289a;
                sharedPreferences.edit().putBoolean("dont_show_text", zBooleanValue).apply();
                sharedPreferences.edit().putBoolean("fill_cells_of_uninstalled_apps", ((Boolean) a1Var2.getValue()).booleanValue()).apply();
                sharedPreferences.edit().putBoolean("lock_home_screen_layout", ((Boolean) a1Var3.getValue()).booleanValue()).apply();
                gVar.t(g1Var.g());
                context.startActivity(new Intent(context, (Class<?>) MoreSettingsActivity.class));
                break;
            default:
                s1.a aVar = (s1.a) this.f10408b;
                s1.j jVar = (s1.j) this.f10409c;
                s1.e eVar = (s1.e) this.f10410d;
                String str = (String) this.f10411e;
                Object[] objArr = (Object[]) this.f10413z;
                boolean z10 = true;
                if (aVar.f14715b != eVar) {
                    aVar.f14715b = eVar;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fj.l.b(aVar.f14716c, str)) {
                    z10 = z2;
                } else {
                    aVar.f14716c = str;
                }
                aVar.f14714a = jVar;
                aVar.f14717d = this.f10412f;
                aVar.f14718e = objArr;
                s1.d dVar = aVar.f14719f;
                if (dVar != null && z10) {
                    ((p1.l) dVar).I();
                    aVar.f14719f = null;
                    aVar.b();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
