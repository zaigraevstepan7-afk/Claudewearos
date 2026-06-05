package r0;

import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import com.google.android.gms.internal.ads.zzbch;
import f1.a1;
import fj.l;
import pi.o;
import t2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f13661b;

    public /* synthetic */ d(a1 a1Var, int i10) {
        this.f13660a = i10;
        this.f13661b = a1Var;
    }

    @Override // ej.a
    public final Object a() {
        int i10 = this.f13660a;
        o oVar = o.f13011a;
        a1 a1Var = this.f13661b;
        switch (i10) {
            case 0:
                w wVar = (w) a1Var.getValue();
                if (wVar != null) {
                    return wVar;
                }
                a0.a.d("Required value was null.");
                throw new b3.e();
            case 1:
                int i11 = HomeActivity.N;
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 2:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 3:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 4:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 5:
                ra.b.m(a1Var, true);
                return oVar;
            case 6:
                ra.b.m(a1Var, false);
                return oVar;
            case 7:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 8:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 9:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 10:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 11:
                ra.b.v(a1Var, true);
                return oVar;
            case 12:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 13:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 14:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 15:
                ra.b.v(a1Var, false);
                return oVar;
            case 16:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 17:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 18:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 19:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 20:
                a1Var.setValue(ua.c.f16894b);
                return oVar;
            case zzbch.zzt.zzm /* 21 */:
                a1Var.setValue(ua.c.f16893a);
                return oVar;
            case 22:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 23:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 24:
                a1Var.setValue(Boolean.FALSE);
                return oVar;
            case 25:
                if (((String) a1Var.getValue()).length() > 0) {
                    String str = (String) a1Var.getValue();
                    l.f(str, "<this>");
                    int length = str.length() - 1;
                    a1Var.setValue(nj.e.Z0(length >= 0 ? length : 0, str));
                }
                return oVar;
            case 26:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            default:
                a1Var.setValue(Boolean.TRUE);
                return oVar;
        }
    }
}
