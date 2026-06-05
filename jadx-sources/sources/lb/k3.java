package lb;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k3 extends vi.i implements ej.e {
    public final /* synthetic */ f1.a1 A;
    public final /* synthetic */ f1.a1 B;
    public final /* synthetic */ f1.a1 C;
    public final /* synthetic */ f1.a1 D;
    public final /* synthetic */ f1.f1 E;
    public final /* synthetic */ f1.f1 F;
    public final /* synthetic */ f1.f1 G;
    public final /* synthetic */ f1.a1 H;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f10421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10423c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10426f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(g gVar, f1.a1 a1Var, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.f1 f1Var5, f1.a1 a1Var2, f1.a1 a1Var3, f1.a1 a1Var4, f1.a1 a1Var5, f1.f1 f1Var6, f1.f1 f1Var7, f1.f1 f1Var8, f1.a1 a1Var6, ti.c cVar) {
        super(2, cVar);
        this.f10421a = gVar;
        this.f10422b = a1Var;
        this.f10423c = f1Var;
        this.f10424d = f1Var2;
        this.f10425e = f1Var3;
        this.f10426f = f1Var4;
        this.f10427z = f1Var5;
        this.A = a1Var2;
        this.B = a1Var3;
        this.C = a1Var4;
        this.D = a1Var5;
        this.E = f1Var6;
        this.F = f1Var7;
        this.G = f1Var8;
        this.H = a1Var6;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new k3(this.f10421a, this.f10422b, this.f10423c, this.f10424d, this.f10425e, this.f10426f, this.f10427z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        k3 k3Var = (k3) create((qj.z) obj, (ti.c) obj2);
        pi.o oVar = pi.o.f13011a;
        k3Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        float f10 = q3.f10603g;
        boolean zBooleanValue = ((Boolean) this.f10422b.getValue()).booleanValue();
        g gVar = this.f10421a;
        gVar.y(zBooleanValue);
        gVar.w(this.f10423c.g());
        gVar.u(this.f10424d.g());
        gVar.A(this.f10425e.g());
        gVar.z(this.f10426f.g());
        gVar.v(this.f10427z.g());
        gVar.x(((Number) this.A.getValue()).floatValue());
        boolean zBooleanValue2 = ((Boolean) this.B.getValue()).booleanValue();
        SharedPreferences sharedPreferences = gVar.f10289a;
        sharedPreferences.edit().putBoolean("dock_no_glass_effect", zBooleanValue2).apply();
        sharedPreferences.edit().putBoolean("dock_no_glass_thumb", ((Boolean) this.C.getValue()).booleanValue()).apply();
        gVar.B(((Boolean) this.D.getValue()).booleanValue());
        sharedPreferences.edit().putFloat("dock_horizontal_padding", this.E.g()).apply();
        sharedPreferences.edit().putFloat("dock_vertical_padding", this.F.g()).apply();
        sharedPreferences.edit().putFloat("dock_icon_gap", this.G.g()).apply();
        sharedPreferences.edit().putBoolean("dock_show_background", ((Boolean) this.H.getValue()).booleanValue()).apply();
        return pi.o.f13011a;
    }
}
