package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10249c;

    public /* synthetic */ e1(g gVar, f1.a1 a1Var, int i10) {
        this.f10247a = i10;
        this.f10248b = gVar;
        this.f10249c = a1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f10247a) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                this.f10249c.setValue(bool);
                this.f10248b.f10289a.edit().putBoolean("open_animation_limit_concurrent", zBooleanValue).apply();
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f10249c.setValue(bool2);
                this.f10248b.f10289a.edit().putBoolean("open_animations_enabled", zBooleanValue2).apply();
                break;
            case 2:
                s sVar = (s) obj;
                String str = sVar != null ? sVar.f10634a : null;
                f1.a1 a1Var = this.f10249c;
                a1Var.setValue(str);
                this.f10248b.f10289a.edit().putString("icon_pack_package", (String) a1Var.getValue()).apply();
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                this.f10249c.setValue(bool3);
                this.f10248b.f10289a.edit().putBoolean("home_overlay_image_enabled", zBooleanValue3).apply();
                break;
            default:
                t3 t3Var = (t3) obj;
                fj.l.f(t3Var, "it");
                this.f10249c.setValue(t3Var);
                String strName = t3Var.name();
                g gVar = this.f10248b;
                gVar.getClass();
                fj.l.f(strName, "value");
                gVar.f10289a.edit().putString("transition_effect", strName).apply();
                break;
        }
        return pi.o.f13011a;
    }
}
