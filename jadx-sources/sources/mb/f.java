package mb;

import f1.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f11455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f11456c;

    public /* synthetic */ f(ej.a aVar, a1 a1Var, int i10) {
        this.f11454a = i10;
        this.f11455b = aVar;
        this.f11456c = a1Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f11454a) {
            case 0:
                this.f11456c.setValue(Boolean.TRUE);
                this.f11455b.a();
                break;
            case 1:
                this.f11456c.setValue(Boolean.FALSE);
                this.f11455b.a();
                break;
            default:
                this.f11456c.setValue(Boolean.FALSE);
                this.f11455b.a();
                break;
        }
        return pi.o.f13011a;
    }
}
