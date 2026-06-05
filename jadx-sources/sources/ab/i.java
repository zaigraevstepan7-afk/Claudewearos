package ab;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzbch;
import f1.a1;
import java.util.List;
import ra.o1;
import ra.s0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f299b;

    public /* synthetic */ i(a1 a1Var, int i10) {
        this.f298a = i10;
        this.f299b = a1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f298a;
        pi.o oVar = pi.o.f13011a;
        a1 a1Var = this.f299b;
        switch (i10) {
            case 0:
                t2.w wVar = (t2.w) obj;
                fj.l.f(wVar, "coordinates");
                b2.c cVarF = t2.z.f(wVar, true);
                a1Var.setValue(new Rect((int) cVarF.f1502a, (int) cVarF.f1503b, (int) cVarF.f1504c, (int) cVarF.f1505d));
                break;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                a1Var.setValue(num);
                break;
            case 2:
                a1Var.setValue((t2.w) obj);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a1Var.setValue(bool);
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                a1Var.setValue(bool2);
                break;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                a1Var.setValue(bool3);
                break;
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                a1Var.setValue(bool4);
                break;
            case 7:
                u0.j jVar = (u0.j) obj;
                a1Var.setValue(jVar.f16542c ? jVar.f16541b : jVar.f16540a);
                break;
            case 8:
                List list = (List) obj;
                if (a1Var != null) {
                    a1Var.setValue(list);
                    break;
                }
                break;
            case 9:
                ((ej.c) a1Var.getValue()).invoke((b2.b) obj);
                break;
            case 10:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                a1Var.setValue(bool5);
                break;
            case 11:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                a1Var.setValue(bool6);
                break;
            case 12:
                nb.q qVar = (nb.q) obj;
                fj.l.f(qVar, "it");
                a1Var.setValue(qVar);
                break;
            case 13:
                String str = (String) obj;
                fj.l.f(str, "it");
                a1Var.setValue(str);
                break;
            case 14:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                a1Var.setValue(bool7);
                break;
            case 15:
                String str2 = (String) obj;
                fj.l.f(str2, "it");
                a1Var.setValue(str2);
                break;
            case 16:
                nb.q qVar2 = (nb.q) obj;
                fj.l.f(qVar2, "it");
                a1Var.setValue(qVar2);
                break;
            case 17:
                a1Var.setValue((t2.w) obj);
                break;
            case 18:
                a1Var.setValue((t2.w) obj);
                break;
            case 19:
                a1Var.setValue((t2.w) obj);
                break;
            case 20:
                String str3 = (String) obj;
                fj.l.f(str3, "categoryId");
                a1Var.setValue(str3);
                break;
            case zzbch.zzt.zzm /* 21 */:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                a1Var.setValue(bool8);
                break;
            case 22:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                a1Var.setValue(bool9);
                break;
            case 23:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                a1Var.setValue(bool10);
                break;
            case 24:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                a1Var.setValue(bool11);
                break;
            case 25:
                t2.w wVar2 = (t2.w) obj;
                fj.l.f(wVar2, "coords");
                a1Var.setValue(new s0(wVar2.q0(0L), cg.b.S(wVar2.I())));
                break;
            case 26:
                if (((Float) obj).floatValue() == 0.0f) {
                    a1Var.setValue(null);
                    break;
                }
                break;
            case 27:
                boolean zB = ((mg.a) obj).b();
                j0.d dVar = o1.f14113a;
                a1Var.setValue(Boolean.valueOf(zB));
                break;
            case 28:
                RecyclerView recyclerView = (RecyclerView) obj;
                fj.l.f(recyclerView, "it");
                a1Var.setValue(recyclerView);
                break;
            default:
                RecyclerView recyclerView2 = (RecyclerView) obj;
                fj.l.f(recyclerView2, "it");
                a1Var.setValue(recyclerView2);
                break;
        }
        return oVar;
    }
}
