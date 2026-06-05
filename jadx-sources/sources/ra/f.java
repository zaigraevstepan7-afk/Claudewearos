package ra;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import b0.g2;
import c1.s3;
import c1.z4;
import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import v2.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f13992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lb.g f13993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f13994d;

    public /* synthetic */ f(HomeActivity homeActivity, lb.g gVar, SharedPreferences sharedPreferences, int i10) {
        this.f13991a = i10;
        this.f13992b = homeActivity;
        this.f13993c = gVar;
        this.f13994d = sharedPreferences;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        int i10 = this.f13991a;
        pi.o oVar = pi.o.f13011a;
        SharedPreferences sharedPreferences = this.f13994d;
        lb.g gVar = this.f13993c;
        final HomeActivity homeActivity = this.f13992b;
        switch (i10) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i11 = HomeActivity.N;
                int i12 = 1;
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ha.d.a(false, p1.j.d(1580000410, new f(homeActivity, gVar, sharedPreferences, i12), i0Var), i0Var, 48);
                } else {
                    i0Var.W();
                }
                return oVar;
            default:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = HomeActivity.N;
                boolean z10 = (iIntValue2 & 3) != 2;
                f2 f2Var = i0Var2.f6313a;
                if (i0Var2.T(iIntValue2 & 1, z10)) {
                    f1.a1 a1VarM = f1.s.m(homeActivity.M, i0Var2);
                    f1.a1 a1VarM2 = f1.s.m(nb.o.f12035k, i0Var2);
                    f1.a1 a1VarM3 = f1.s.m(nb.o.f12037m, i0Var2);
                    f1.a1 a1VarM4 = f1.s.m(nb.o.f12039o, i0Var2);
                    f1.a1 a1VarM5 = f1.s.m(nb.o.f12041q, i0Var2);
                    f1.a1 a1VarM6 = f1.s.m(nb.o.f12034i, i0Var2);
                    Boolean bool = (Boolean) a1VarM6.getValue();
                    bool.booleanValue();
                    boolean zH = i0Var2.h(gVar) | i0Var2.f(a1VarM6);
                    Object objQ = i0Var2.Q();
                    Object obj3 = f1.m.f6385a;
                    ti.c cVar = null;
                    if (zH || objQ == obj3) {
                        objQ = new ab.r(gVar, a1VarM6, cVar, 8);
                        i0Var2.l0(objQ);
                    }
                    f1.s.f((ej.e) objQ, i0Var2, bool);
                    boolean zH2 = i0Var2.h(sharedPreferences) | i0Var2.h(homeActivity);
                    Object objQ2 = i0Var2.Q();
                    if (zH2 || objQ2 == obj3) {
                        objQ2 = new androidx.lifecycle.h0(sharedPreferences, homeActivity, cVar, 26);
                        i0Var2.l0(objQ2);
                    }
                    f1.s.f((ej.e) objQ2, i0Var2, oVar);
                    Object objQ3 = i0Var2.Q();
                    if (objQ3 == obj3) {
                        objQ3 = f1.s.A(Boolean.valueOf(Build.VERSION.SDK_INT >= 33));
                        i0Var2.l0(objQ3);
                    }
                    f1.a1 a1Var = (f1.a1) objQ3;
                    if (((Boolean) a1VarM4.getValue()).booleanValue()) {
                        i0Var2.b0(1247772103);
                        Object objQ4 = i0Var2.Q();
                        if (objQ4 == obj3) {
                            objQ4 = new jb.e(27);
                            i0Var2.l0(objQ4);
                        }
                        final int i14 = 0;
                        z4.a((ej.a) objQ4, p1.j.d(-943218713, new ej.e() { // from class: ra.g
                            @Override // ej.e
                            public final Object invoke(Object obj4, Object obj5) {
                                int i15 = i14;
                                pi.o oVar2 = pi.o.f13011a;
                                f1.f fVar = f1.m.f6385a;
                                final HomeActivity homeActivity2 = homeActivity;
                                final int i16 = 2;
                                final int i17 = 1;
                                switch (i15) {
                                    case 0:
                                        f1.i0 i0Var3 = (f1.i0) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        int i18 = HomeActivity.N;
                                        if (!i0Var3.T(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            i0Var3.W();
                                            break;
                                        } else {
                                            boolean zH3 = i0Var3.h(homeActivity2);
                                            Object objQ5 = i0Var3.Q();
                                            if (zH3 || objQ5 == fVar) {
                                                objQ5 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i19 = i16;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i19) {
                                                            case 0:
                                                                int i20 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i21 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var3.l0(objQ5);
                                            }
                                            z4.i((ej.a) objQ5, null, false, null, null, null, b.f13927a, i0Var3, 805306368, 510);
                                            break;
                                        }
                                    case 1:
                                        f1.i0 i0Var4 = (f1.i0) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        int i19 = HomeActivity.N;
                                        if (!i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            i0Var4.W();
                                            break;
                                        } else {
                                            boolean zH4 = i0Var4.h(homeActivity2);
                                            Object objQ6 = i0Var4.Q();
                                            if (zH4 || objQ6 == fVar) {
                                                final int i20 = z ? 1 : 0;
                                                objQ6 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i20;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i21 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var4.l0(objQ6);
                                            }
                                            z4.i((ej.a) objQ6, null, false, null, null, null, b.f13929c, i0Var4, 805306368, 510);
                                            break;
                                        }
                                    default:
                                        f1.i0 i0Var5 = (f1.i0) obj4;
                                        int iIntValue5 = ((Integer) obj5).intValue();
                                        int i21 = HomeActivity.N;
                                        if (!i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            i0Var5.W();
                                            break;
                                        } else {
                                            boolean zH5 = i0Var5.h(homeActivity2);
                                            Object objQ7 = i0Var5.Q();
                                            if (zH5 || objQ7 == fVar) {
                                                objQ7 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i17;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i212 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var5.l0(objQ7);
                                            }
                                            z4.i((ej.a) objQ7, null, false, null, null, null, b.f13932f, i0Var5, 805306368, 510);
                                            break;
                                        }
                                }
                                return oVar2;
                            }
                        }, i0Var2), null, null, b.f13928b, p1.j.d(-832226132, new g2(a1VarM5, 25), i0Var2), null, 0L, 0L, 0L, 0L, 0.0f, null, i0Var2, 1769526, 0, 16284);
                        i0Var2.p(false);
                    } else if (((Boolean) a1VarM2.getValue()).booleanValue()) {
                        i0Var2.b0(1248210846);
                        Object objQ5 = i0Var2.Q();
                        if (objQ5 == obj3) {
                            objQ5 = new jb.e(27);
                            i0Var2.l0(objQ5);
                        }
                        final int i15 = 1;
                        z4.a((ej.a) objQ5, p1.j.d(-214915618, new ej.e() { // from class: ra.g
                            @Override // ej.e
                            public final Object invoke(Object obj4, Object obj5) {
                                int i152 = i15;
                                pi.o oVar2 = pi.o.f13011a;
                                f1.f fVar = f1.m.f6385a;
                                final HomeActivity homeActivity2 = homeActivity;
                                final int i16 = 2;
                                final int i17 = 1;
                                switch (i152) {
                                    case 0:
                                        f1.i0 i0Var3 = (f1.i0) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        int i18 = HomeActivity.N;
                                        if (!i0Var3.T(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            i0Var3.W();
                                            break;
                                        } else {
                                            boolean zH3 = i0Var3.h(homeActivity2);
                                            Object objQ52 = i0Var3.Q();
                                            if (zH3 || objQ52 == fVar) {
                                                objQ52 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i16;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i212 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var3.l0(objQ52);
                                            }
                                            z4.i((ej.a) objQ52, null, false, null, null, null, b.f13927a, i0Var3, 805306368, 510);
                                            break;
                                        }
                                    case 1:
                                        f1.i0 i0Var4 = (f1.i0) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        int i19 = HomeActivity.N;
                                        if (!i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            i0Var4.W();
                                            break;
                                        } else {
                                            boolean zH4 = i0Var4.h(homeActivity2);
                                            Object objQ6 = i0Var4.Q();
                                            if (zH4 || objQ6 == fVar) {
                                                final int i20 = z ? 1 : 0;
                                                objQ6 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i20;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i212 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var4.l0(objQ6);
                                            }
                                            z4.i((ej.a) objQ6, null, false, null, null, null, b.f13929c, i0Var4, 805306368, 510);
                                            break;
                                        }
                                    default:
                                        f1.i0 i0Var5 = (f1.i0) obj4;
                                        int iIntValue5 = ((Integer) obj5).intValue();
                                        int i21 = HomeActivity.N;
                                        if (!i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            i0Var5.W();
                                            break;
                                        } else {
                                            boolean zH5 = i0Var5.h(homeActivity2);
                                            Object objQ7 = i0Var5.Q();
                                            if (zH5 || objQ7 == fVar) {
                                                objQ7 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i17;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i212 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var5.l0(objQ7);
                                            }
                                            z4.i((ej.a) objQ7, null, false, null, null, null, b.f13932f, i0Var5, 805306368, 510);
                                            break;
                                        }
                                }
                                return oVar2;
                            }
                        }, i0Var2), null, null, b.f13930d, b.f13931e, null, 0L, 0L, 0L, 0L, 0.0f, null, i0Var2, 1769526, 0, 16284);
                        i0Var2.p(false);
                    } else if (((Boolean) a1VarM3.getValue()).booleanValue()) {
                        i0Var2.b0(1248706722);
                        Object objQ6 = i0Var2.Q();
                        if (objQ6 == obj3) {
                            objQ6 = new jb.e(27);
                            i0Var2.l0(objQ6);
                        }
                        final int i16 = 2;
                        z4.a((ej.a) objQ6, p1.j.d(1003363999, new ej.e() { // from class: ra.g
                            @Override // ej.e
                            public final Object invoke(Object obj4, Object obj5) {
                                int i152 = i16;
                                pi.o oVar2 = pi.o.f13011a;
                                f1.f fVar = f1.m.f6385a;
                                final HomeActivity homeActivity2 = homeActivity;
                                final int i162 = 2;
                                final int i17 = 1;
                                switch (i152) {
                                    case 0:
                                        f1.i0 i0Var3 = (f1.i0) obj4;
                                        int iIntValue3 = ((Integer) obj5).intValue();
                                        int i18 = HomeActivity.N;
                                        if (!i0Var3.T(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            i0Var3.W();
                                            break;
                                        } else {
                                            boolean zH3 = i0Var3.h(homeActivity2);
                                            Object objQ52 = i0Var3.Q();
                                            if (zH3 || objQ52 == fVar) {
                                                objQ52 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i162;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i212 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var3.l0(objQ52);
                                            }
                                            z4.i((ej.a) objQ52, null, false, null, null, null, b.f13927a, i0Var3, 805306368, 510);
                                            break;
                                        }
                                    case 1:
                                        f1.i0 i0Var4 = (f1.i0) obj4;
                                        int iIntValue4 = ((Integer) obj5).intValue();
                                        int i19 = HomeActivity.N;
                                        if (!i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            i0Var4.W();
                                            break;
                                        } else {
                                            boolean zH4 = i0Var4.h(homeActivity2);
                                            Object objQ62 = i0Var4.Q();
                                            if (zH4 || objQ62 == fVar) {
                                                final int i20 = z ? 1 : 0;
                                                objQ62 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i20;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i212 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var4.l0(objQ62);
                                            }
                                            z4.i((ej.a) objQ62, null, false, null, null, null, b.f13929c, i0Var4, 805306368, 510);
                                            break;
                                        }
                                    default:
                                        f1.i0 i0Var5 = (f1.i0) obj4;
                                        int iIntValue5 = ((Integer) obj5).intValue();
                                        int i21 = HomeActivity.N;
                                        if (!i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            i0Var5.W();
                                            break;
                                        } else {
                                            boolean zH5 = i0Var5.h(homeActivity2);
                                            Object objQ7 = i0Var5.Q();
                                            if (zH5 || objQ7 == fVar) {
                                                objQ7 = new ej.a() { // from class: ra.e
                                                    @Override // ej.a
                                                    public final Object a() {
                                                        int i192 = i17;
                                                        pi.o oVar3 = pi.o.f13011a;
                                                        HomeActivity homeActivity3 = homeActivity2;
                                                        switch (i192) {
                                                            case 0:
                                                                int i202 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                            case 1:
                                                                int i212 = HomeActivity.N;
                                                                homeActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity3.getPackageName())));
                                                                homeActivity3.finish();
                                                                break;
                                                            default:
                                                                int i22 = HomeActivity.N;
                                                                homeActivity3.finish();
                                                                break;
                                                        }
                                                        return oVar3;
                                                    }
                                                };
                                                i0Var5.l0(objQ7);
                                            }
                                            z4.i((ej.a) objQ7, null, false, null, null, null, b.f13932f, i0Var5, 805306368, 510);
                                            break;
                                        }
                                }
                                return oVar2;
                            }
                        }, i0Var2), null, null, b.f13933g, b.f13934h, null, 0L, 0L, 0L, 0L, 0.0f, null, i0Var2, 1769526, 0, 16284);
                        i0Var2.p(false);
                    } else if (((Boolean) a1VarM.getValue()).booleanValue()) {
                        i0Var2.b0(1249605288);
                        boolean zH3 = i0Var2.h(sharedPreferences) | i0Var2.h(homeActivity);
                        Object objQ7 = i0Var2.Q();
                        if (zH3 || objQ7 == obj3) {
                            objQ7 = new s3(22, sharedPreferences, homeActivity);
                            i0Var2.l0(objQ7);
                        }
                        o1.e((ej.a) objQ7, i0Var2, 0);
                        i0Var2.p(false);
                    } else {
                        i0Var2.b0(1250002677);
                        mi.p pVarG = mi.d.g(i0Var2);
                        gi.d dVarD = gi.f.d(null, i0Var2, 0, 3);
                        i0Var2.b0(-1614864554);
                        androidx.lifecycle.b1 b1VarA = e6.a.a(i0Var2);
                        if (b1VarA == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        androidx.lifecycle.x0 x0VarR = a.a.R(fj.w.a(r0.class), b1VarA.e(), yd.f.s(b1VarA), pk.b.a(i0Var2));
                        i0Var2.p(false);
                        a.a.h(((r0) x0VarR).f14146c, i0Var2);
                        b0.i0 i0Var3 = b0.t1.f1433c;
                        v1.g gVar2 = v1.b.f17547a;
                        t2.q0 q0VarD = b0.r.d(gVar2, false);
                        int iHashCode = Long.hashCode(i0Var2.T);
                        f1.n1 n1VarL = i0Var2.l();
                        v1.o oVarC = v1.a.c(i0Var2, i0Var3);
                        v2.h.f17668w.getClass();
                        ej.a aVar = v2.g.f17645b;
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        v2.e eVar = v2.g.f17649f;
                        f1.s.M(eVar, i0Var2, q0VarD);
                        v2.e eVar2 = v2.g.f17648e;
                        f1.s.M(eVar2, i0Var2, n1VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        v2.e eVar3 = v2.g.f17650g;
                        f1.s.w(i0Var2, numValueOf, eVar3);
                        v2.d dVar = v2.g.f17651h;
                        f1.s.I(dVar, i0Var2);
                        v2.e eVar4 = v2.g.f17647d;
                        f1.s.M(eVar4, i0Var2, oVarC);
                        v1.o oVarM = a.a.M(gi.f.a(i0Var3, dVarD), pVarG);
                        t2.q0 q0VarD2 = b0.r.d(gVar2, false);
                        int iHashCode2 = Long.hashCode(i0Var2.T);
                        f1.n1 n1VarL2 = i0Var2.l();
                        v1.o oVarC2 = v1.a.c(i0Var2, oVarM);
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        f1.s.M(eVar, i0Var2, q0VarD2);
                        f1.s.M(eVar2, i0Var2, n1VarL2);
                        gk.b.u(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
                        f1.s.M(eVar4, i0Var2, oVarC2);
                        wd.a.i(48, i0Var2);
                        i0Var2.p(true);
                        if (((Boolean) a1Var.getValue()).booleanValue()) {
                            z2 = false;
                            i0Var2.b0(800369106);
                            i0Var2.p(false);
                        } else {
                            i0Var2.b0(798258750);
                            Object objQ8 = i0Var2.Q();
                            if (objQ8 == obj3) {
                                objQ8 = new f1.g1(5);
                                i0Var2.l0(objQ8);
                            }
                            f1.g1 g1Var = (f1.g1) objQ8;
                            Object objQ9 = i0Var2.Q();
                            if (objQ9 == obj3) {
                                objQ9 = new gb.m(g1Var, null, 1);
                                i0Var2.l0(objQ9);
                            }
                            f1.s.f((ej.e) objQ9, i0Var2, oVar);
                            Object objQ10 = i0Var2.Q();
                            if (objQ10 == obj3) {
                                objQ10 = new jb.e(27);
                                i0Var2.l0(objQ10);
                            }
                            z4.a((ej.a) objQ10, p1.j.d(-175543619, new ab.g(21, a1Var, g1Var), i0Var2), null, null, b.f13938m, b.f13939n, null, 0L, 0L, 0L, 0L, 0.0f, null, i0Var2, 1769526, 0, 16284);
                            z2 = false;
                            i0Var2.p(false);
                        }
                        i0Var2.p(true);
                        i0Var2.p(z2);
                    }
                } else {
                    i0Var2.W();
                }
                return oVar;
        }
    }
}
