package g0;

import x.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6852a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6853b;

    public b0(s1 s1Var, h0 h0Var) {
        this.f6853b = s1Var;
    }

    @Override // x.s1
    public final float a(float f10) {
        switch (this.f6852a) {
            case 0:
                return ((s1) this.f6853b).a(f10);
            default:
                x.n nVar = (x.n) this.f6853b;
                if (Float.isNaN(f10)) {
                    return 0.0f;
                }
                float fFloatValue = ((Number) nVar.f19637a.invoke(Float.valueOf(f10))).floatValue();
                nVar.f19641e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
                nVar.f19642f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
                return fFloatValue;
        }
    }

    public b0(x.n nVar) {
        this.f6853b = nVar;
    }
}
