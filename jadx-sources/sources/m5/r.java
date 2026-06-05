package m5;

import android.os.Build;
import android.view.View;
import w2.f1;
import w2.w1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements tj.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11367b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f11366a = i10;
        this.f11367b = obj;
    }

    @Override // tj.f
    public final Object b(Object obj, ti.c cVar) {
        Object objE;
        switch (this.f11366a) {
            case 0:
                z zVar = (z) this.f11367b;
                return ((((p0) zVar.f11413f.f11268a.getValue()) instanceof j0) || (objE = z.e(zVar, true, cVar)) != ui.a.f17085a) ? pi.o.f13011a : objE;
            case 1:
                if (((androidx.lifecycle.o) obj).compareTo(androidx.lifecycle.o.f1113c) <= 0) {
                    mi.o oVar = (mi.o) this.f11367b;
                    mi.c cVar2 = oVar.H;
                    fj.l.f(cVar2, "<this>");
                    f2.b bVarA = cVar2.a();
                    if (bVarA != null) {
                        ((c2.b0) v2.n.h(oVar, f1.f18261g)).a(bVarA);
                    }
                    cVar2.f11742f.setValue(null);
                }
                return pi.o.f13011a;
            case 2:
                t0.j jVar = (t0.j) this.f11367b;
                if (Build.VERSION.SDK_INT >= 34) {
                    jVar.m().startStylusHandwriting((View) jVar.f15363b);
                }
                return pi.o.f13011a;
            case 3:
                ((fj.v) this.f11367b).f6807a = obj;
                throw new uj.a(this);
            case 4:
                ((w1) this.f11367b).f18448c.h(((Number) obj).floatValue());
                return pi.o.f13011a;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ej.c) this.f11367b).invoke(bool);
                return pi.o.f13011a;
        }
    }
}
