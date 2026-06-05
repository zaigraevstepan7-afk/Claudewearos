package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10232c;

    public /* synthetic */ d1(g gVar, f1.f1 f1Var, int i10) {
        this.f10230a = i10;
        this.f10231b = gVar;
        this.f10232c = f1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f10230a;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i10) {
            case 0:
                this.f10232c.h(fFloatValue);
                this.f10231b.f10289a.edit().putFloat("open_animation_spring_damping", fFloatValue).apply();
                break;
            case 1:
                this.f10232c.h(fFloatValue);
                this.f10231b.f10289a.edit().putFloat("open_animation_spring_stiffness", fFloatValue).apply();
                break;
            case 2:
                this.f10232c.h(fFloatValue);
                this.f10231b.f10289a.edit().putFloat("open_animation_spring_overshoot", fFloatValue).apply();
                break;
            case 3:
                this.f10232c.h(fFloatValue);
                this.f10231b.f10289a.edit().putFloat("open_animation_speed", fFloatValue).apply();
                break;
            case 4:
                this.f10232c.h(fFloatValue);
                this.f10231b.f10289a.edit().putFloat("open_animation_position_speed", fFloatValue).apply();
                break;
            case 5:
                this.f10232c.h(fFloatValue);
                this.f10231b.f10289a.edit().putFloat("open_animation_scale_speed", fFloatValue).apply();
                break;
            default:
                this.f10232c.h(fFloatValue);
                this.f10231b.f10289a.edit().putFloat("dock_icon_gap", fFloatValue).apply();
                break;
        }
        return pi.o.f13011a;
    }
}
