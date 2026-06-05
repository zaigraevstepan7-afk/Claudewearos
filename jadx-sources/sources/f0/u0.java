package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f6195b;

    public /* synthetic */ u0(w0 w0Var, int i10) {
        this.f6194a = i10;
        this.f6195b = w0Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f6194a) {
            case 0:
                return Float.valueOf(this.f6195b.I.b());
            case 1:
                return Float.valueOf(this.f6195b.I.d());
            default:
                w0 w0Var = this.f6195b;
                return Float.valueOf(w0Var.I.a() - w0Var.I.c());
        }
    }
}
