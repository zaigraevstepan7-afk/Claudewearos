package d1;

import android.view.autofill.AutofillValue;
import v2.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3.z f4483b;

    public /* synthetic */ c0(d3.z zVar, int i10) {
        this.f4482a = i10;
        this.f4483b = zVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        boolean z2;
        boolean z10;
        switch (this.f4482a) {
            case 0:
                e2 e2Var = (e2) obj;
                fj.l.d(e2Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                q0 q0Var = (q0) e2Var;
                q0Var.I = true;
                q0Var.H.invoke(this.f4483b);
                v2.n.o(q0Var);
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((w1.f) obj).f18177a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    d3.x.f(this.f4483b, boolValueOf.booleanValue() ? f3.a.f6618a : f3.a.f6619b);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                AutofillValue autofillValue2 = ((w1.f) obj).f18177a;
                Boolean boolValueOf2 = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf2 != null) {
                    d3.x.f(this.f4483b, boolValueOf2.booleanValue() ? f3.a.f6618a : f3.a.f6619b);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
