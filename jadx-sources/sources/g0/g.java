package g0;

import f1.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6878a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f6879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f6880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f6881d;

    public /* synthetic */ g(ej.a aVar, a1 a1Var, a1 a1Var2) {
        this.f6879b = aVar;
        this.f6880c = a1Var;
        this.f6881d = a1Var2;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f6878a) {
            case 0:
                return new v((ej.g) this.f6880c.getValue(), (ej.c) this.f6881d.getValue(), ((Number) this.f6879b.a()).intValue());
            default:
                a1 a1Var = this.f6880c;
                if (!((Boolean) a1Var.getValue()).booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    a1Var.setValue(bool);
                    this.f6881d.setValue(bool);
                    this.f6879b.a();
                }
                return pi.o.f13011a;
        }
    }

    public /* synthetic */ g(a1 a1Var, a1 a1Var2, ej.a aVar) {
        this.f6880c = a1Var;
        this.f6881d = a1Var2;
        this.f6879b = aVar;
    }
}
