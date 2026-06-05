package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f1380b;

    public /* synthetic */ n0(o0 o0Var, int i10) {
        this.f1379a = i10;
        this.f1380b = o0Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        v2.e2 e2Var = (v2.e2) obj;
        switch (this.f1379a) {
            case 0:
                fj.l.d(e2Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                o0 o0Var = (o0) e2Var;
                d2 d2Var = this.f1380b.I;
                if (!fj.l.b(o0Var.H, d2Var)) {
                    o0Var.H = d2Var;
                    o0Var.r1();
                }
                return v2.d2.f17607b;
            default:
                fj.l.d(e2Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.f1380b.H = ((o0) e2Var).I;
                return Boolean.FALSE;
        }
    }
}
