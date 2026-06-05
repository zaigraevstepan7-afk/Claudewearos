package ta;

import android.graphics.Rect;
import f1.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f16204b;

    public /* synthetic */ v(a1 a1Var, int i10) {
        this.f16203a = i10;
        this.f16204b = a1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f16203a) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                this.f16204b.setValue(num);
                return pi.o.f13011a;
            case 1:
                String str = (String) obj;
                fj.l.f(str, "it");
                this.f16204b.setValue(str);
                return pi.o.f13011a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                a1 a1Var = this.f16204b;
                if (((String) a1Var.getValue()).length() < 6) {
                    a1Var.setValue(((String) a1Var.getValue()) + iIntValue);
                }
                return pi.o.f13011a;
            case 3:
                t2.w wVar = (t2.w) obj;
                fj.l.f(wVar, "coordinates");
                b2.c cVarF = t2.z.f(wVar, true);
                this.f16204b.setValue(new Rect((int) cVarF.f1502a, (int) cVarF.f1503b, (int) cVarF.f1504c, (int) cVarF.f1505d));
                return pi.o.f13011a;
            case 4:
                Float f10 = (Float) obj;
                f10.getClass();
                ((ej.c) this.f16204b.getValue()).invoke(f10);
                return pi.o.f13011a;
            default:
                Float f11 = (Float) obj;
                f11.getClass();
                return Float.valueOf(((Number) ((ej.c) this.f16204b.getValue()).invoke(f11)).floatValue());
        }
    }
}
