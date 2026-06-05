package b0;

import android.content.Context;
import android.hardware.SensorManager;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e2 implements f1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1307c;

    public /* synthetic */ e2(int i10, Object obj, Object obj2) {
        this.f1305a = i10;
        this.f1306b = obj;
        this.f1307c = obj2;
    }

    @Override // f1.a0
    public final void a() {
        int i10 = this.f1305a;
        Object obj = this.f1307c;
        Object obj2 = this.f1306b;
        switch (i10) {
            case 0:
                f2 f2Var = (f2) obj2;
                View view = (View) obj;
                int i11 = f2Var.f1331u - 1;
                f2Var.f1331u = i11;
                if (i11 == 0) {
                    Field field = t4.l0.f15744a;
                    t4.d0.i(view, null);
                    t4.l0.n(view, null);
                    view.removeOnAttachStateChangeListener(f2Var.f1332v);
                    return;
                }
                return;
            case 1:
                e.b bVar = (e.b) obj2;
                d.h hVar = (d.h) obj;
                if (bVar.f5216a != null) {
                    hVar.f4332b.e();
                    return;
                } else {
                    if (bVar.f5217b == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    hVar.f4331a.e();
                    return;
                }
            case 2:
                ((f0.x0) obj2).f6205c.j(obj);
                return;
            case 3:
                f1.a1 a1Var = (f1.a1) obj2;
                z.m mVar = (z.m) a1Var.getValue();
                if (mVar != null) {
                    z.l lVar = new z.l(mVar);
                    z.k kVar = (z.k) obj;
                    if (kVar != null) {
                        kVar.b(lVar);
                    }
                    a1Var.setValue(null);
                    return;
                }
                return;
            case 4:
                ((k0.u1) obj2).f9302c.remove((ej.c) obj);
                return;
            case 5:
                ((mg.d) obj2).b("config").f((uf.p) obj);
                return;
            case 6:
                ((SensorManager) obj2).unregisterListener((mb.i) obj);
                return;
            case 7:
                ((androidx.lifecycle.t) obj2).h().f((c7.a) obj);
                return;
            case 8:
                ((Context) obj2).unregisterReceiver((ra.e0) obj);
                return;
            case 9:
                ((Context) obj2).unregisterReceiver((ra.g0) obj);
                return;
            case 10:
                ((lb.g) obj2).f10289a.unregisterOnSharedPreferenceChangeListener((ra.j) obj);
                return;
            case 11:
                ((t.h0) obj2).f15174a.k((t.f0) obj);
                return;
            case 12:
                ((t.j1) obj2).j.remove((t.j1) obj);
                return;
            case 13:
                t.j1 j1Var = (t.j1) obj2;
                t.e1 e1Var = (t.e1) ((t.f1) obj).f15166b.getValue();
                if (e1Var != null) {
                    j1Var.f15208i.remove(e1Var.f15154a);
                    return;
                }
                return;
            default:
                ((t.j1) obj2).f15208i.remove((t.i1) obj);
                return;
        }
    }
}
