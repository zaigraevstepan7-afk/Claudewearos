package mb;

import android.content.Intent;
import b0.t1;
import c1.s3;
import c2.e0;
import com.anonlab.voidlauncher.feature.home.presentation.wallpaper.WallpaperSelectorActivity;
import f1.a1;
import f1.i0;
import f1.n1;
import t2.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WallpaperSelectorActivity f11468b;

    public /* synthetic */ k(WallpaperSelectorActivity wallpaperSelectorActivity, int i10) {
        this.f11467a = i10;
        this.f11468b = wallpaperSelectorActivity;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        a1 a1Var;
        int i10 = this.f11467a;
        pi.o oVar = pi.o.f13011a;
        int i11 = 1;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = WallpaperSelectorActivity.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    ha.d.a(false, p1.j.d(-1305405772, new k(this.f11468b, i11), i0Var), i0Var, 48);
                    break;
                }
            default:
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = WallpaperSelectorActivity.M;
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    Object objQ = i0Var2.Q();
                    final WallpaperSelectorActivity wallpaperSelectorActivity = this.f11468b;
                    Object obj3 = f1.m.f6385a;
                    if (objQ == obj3) {
                        objQ = new lb.g(wallpaperSelectorActivity);
                        i0Var2.l0(objQ);
                    }
                    final lb.g gVar = (lb.g) objQ;
                    Object objQ2 = i0Var2.Q();
                    if (objQ2 == obj3) {
                        objQ2 = f1.s.A(gVar.a());
                        i0Var2.l0(objQ2);
                    }
                    final a1 a1Var2 = (a1) objQ2;
                    Object objQ3 = i0Var2.Q();
                    if (objQ3 == obj3) {
                        objQ3 = f1.s.A(Integer.valueOf(gVar.r()));
                        i0Var2.l0(objQ3);
                    }
                    final a1 a1Var3 = (a1) objQ3;
                    Object objQ4 = i0Var2.Q();
                    if (objQ4 == obj3) {
                        objQ4 = f1.s.A(Boolean.FALSE);
                        i0Var2.l0(objQ4);
                    }
                    final a1 a1Var4 = (a1) objQ4;
                    v1.o oVarF = v.n.f(t1.f1433c, e0.d(4294111991L), e0.f2986b);
                    q0 q0VarD = b0.r.d(v1.b.f17547a, false);
                    int iHashCode = Long.hashCode(i0Var2.T);
                    n1 n1VarL = i0Var2.l();
                    v1.o oVarC = v1.a.c(i0Var2, oVarF);
                    v2.h.f17668w.getClass();
                    ej.a aVar = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(aVar);
                    } else {
                        i0Var2.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
                    f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                    f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var2);
                    f1.s.M(v2.g.f17647d, i0Var2, oVarC);
                    String str = (String) a1Var2.getValue();
                    int iIntValue3 = ((Number) a1Var3.getValue()).intValue();
                    boolean zH = i0Var2.h(gVar) | i0Var2.h(wallpaperSelectorActivity);
                    Object objQ5 = i0Var2.Q();
                    if (zH || objQ5 == obj3) {
                        final int i14 = 0;
                        Object obj4 = new ej.c() { // from class: mb.l
                            @Override // ej.c
                            public final Object invoke(Object obj5) {
                                int i15 = i14;
                                pi.o oVar2 = pi.o.f13011a;
                                a1 a1Var5 = a1Var4;
                                a1 a1Var6 = a1Var3;
                                a1 a1Var7 = a1Var2;
                                WallpaperSelectorActivity wallpaperSelectorActivity2 = wallpaperSelectorActivity;
                                lb.g gVar2 = gVar;
                                String str2 = (String) obj5;
                                switch (i15) {
                                    case 0:
                                        int i16 = WallpaperSelectorActivity.M;
                                        fj.l.f(str2, "name");
                                        gVar2.f10289a.edit().putString("asset_wallpaper_name", str2).apply();
                                        gVar2.C(null);
                                        gVar2.f10289a.edit().putInt("wallpaper_customization_version", gVar2.r() + 1).apply();
                                        a1Var7.setValue(str2);
                                        a1Var6.setValue(Integer.valueOf(gVar2.r()));
                                        a1Var5.setValue(Boolean.TRUE);
                                        wallpaperSelectorActivity2.setResult(-1, new Intent());
                                        break;
                                    default:
                                        int i17 = WallpaperSelectorActivity.M;
                                        fj.l.f(str2, "deletedName");
                                        if (fj.l.b((String) a1Var7.getValue(), str2)) {
                                            gVar2.f10289a.edit().putString("asset_wallpaper_name", "1ae847a81dcea4b292f85893a166620e.jpg").apply();
                                            gVar2.C(null);
                                            a1Var7.setValue("1ae847a81dcea4b292f85893a166620e.jpg");
                                        }
                                        gVar2.f10289a.edit().putInt("wallpaper_customization_version", gVar2.r() + 1).apply();
                                        a1Var6.setValue(Integer.valueOf(gVar2.r()));
                                        a1Var5.setValue(Boolean.TRUE);
                                        wallpaperSelectorActivity2.setResult(-1, new Intent());
                                        break;
                                }
                                return oVar2;
                            }
                        };
                        i0Var2.l0(obj4);
                        objQ5 = obj4;
                    }
                    ej.c cVar = (ej.c) objQ5;
                    boolean zH2 = i0Var2.h(gVar) | i0Var2.h(wallpaperSelectorActivity);
                    Object objQ6 = i0Var2.Q();
                    if (zH2 || objQ6 == obj3) {
                        final int i15 = 1;
                        Object obj5 = new ej.c() { // from class: mb.l
                            @Override // ej.c
                            public final Object invoke(Object obj52) {
                                int i152 = i15;
                                pi.o oVar2 = pi.o.f13011a;
                                a1 a1Var5 = a1Var4;
                                a1 a1Var6 = a1Var3;
                                a1 a1Var7 = a1Var2;
                                WallpaperSelectorActivity wallpaperSelectorActivity2 = wallpaperSelectorActivity;
                                lb.g gVar2 = gVar;
                                String str2 = (String) obj52;
                                switch (i152) {
                                    case 0:
                                        int i16 = WallpaperSelectorActivity.M;
                                        fj.l.f(str2, "name");
                                        gVar2.f10289a.edit().putString("asset_wallpaper_name", str2).apply();
                                        gVar2.C(null);
                                        gVar2.f10289a.edit().putInt("wallpaper_customization_version", gVar2.r() + 1).apply();
                                        a1Var7.setValue(str2);
                                        a1Var6.setValue(Integer.valueOf(gVar2.r()));
                                        a1Var5.setValue(Boolean.TRUE);
                                        wallpaperSelectorActivity2.setResult(-1, new Intent());
                                        break;
                                    default:
                                        int i17 = WallpaperSelectorActivity.M;
                                        fj.l.f(str2, "deletedName");
                                        if (fj.l.b((String) a1Var7.getValue(), str2)) {
                                            gVar2.f10289a.edit().putString("asset_wallpaper_name", "1ae847a81dcea4b292f85893a166620e.jpg").apply();
                                            gVar2.C(null);
                                            a1Var7.setValue("1ae847a81dcea4b292f85893a166620e.jpg");
                                        }
                                        gVar2.f10289a.edit().putInt("wallpaper_customization_version", gVar2.r() + 1).apply();
                                        a1Var6.setValue(Integer.valueOf(gVar2.r()));
                                        a1Var5.setValue(Boolean.TRUE);
                                        wallpaperSelectorActivity2.setResult(-1, new Intent());
                                        break;
                                }
                                return oVar2;
                            }
                        };
                        a1Var = a1Var4;
                        i0Var2.l0(obj5);
                        objQ6 = obj5;
                    } else {
                        a1Var = a1Var4;
                    }
                    ej.c cVar2 = (ej.c) objQ6;
                    boolean zH3 = i0Var2.h(wallpaperSelectorActivity);
                    Object objQ7 = i0Var2.Q();
                    if (zH3 || objQ7 == obj3) {
                        objQ7 = new s3(17, wallpaperSelectorActivity, a1Var);
                        i0Var2.l0(objQ7);
                    }
                    a.j(str, iIntValue3, cVar, cVar2, (ej.a) objQ7, i0Var2, 0);
                    i0Var2.p(true);
                    break;
                }
        }
        return oVar;
    }
}
