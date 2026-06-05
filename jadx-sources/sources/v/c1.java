package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f17158b;

    public /* synthetic */ c1(d1 d1Var, int i10) {
        this.f17157a = i10;
        this.f17158b = d1Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f17157a) {
            case 0:
                this.f17158b.s1();
                return pi.o.f13011a;
            case 1:
                return new b2.b(this.f17158b.P);
            default:
                t2.w wVar = (t2.w) this.f17158b.N.getValue();
                return new b2.b(wVar != null ? wVar.q0(0L) : 9205357640488583168L);
        }
    }
}
