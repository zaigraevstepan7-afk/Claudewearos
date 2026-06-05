package wa;

import f1.f1;
import f1.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0.d f19147b;

    public /* synthetic */ r(g0.d dVar, int i10) {
        this.f19146a = i10;
        this.f19147b = dVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f19146a) {
            case 0:
                g0.d dVar = this.f19147b;
                com.google.android.gms.common.api.internal.i0 i0Var = dVar.f6893d;
                return Boolean.valueOf(((g1) i0Var.f3553c).g() == dVar.l() - 1 && ((f1) i0Var.f3554d).g() <= 0.0f);
            case 1:
                com.google.android.gms.common.api.internal.i0 i0Var2 = this.f19147b.f6893d;
                return Boolean.valueOf(((g1) i0Var2.f3553c).g() == 0 && ((f1) i0Var2.f3554d).g() >= 0.0f);
            default:
                return Boolean.valueOf(this.f19147b.f6899k.a());
        }
    }
}
