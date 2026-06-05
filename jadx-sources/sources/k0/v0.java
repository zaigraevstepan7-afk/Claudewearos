package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f9306b;

    public /* synthetic */ v0(b1 b1Var, int i10) {
        this.f9305a = i10;
        this.f9306b = b1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f9305a) {
            case 0:
                this.f9306b.a(((b2.b) obj).f1500a, v0.v.f17513d);
                break;
            case 1:
                p2.w wVar = (p2.w) obj;
                this.f9306b.e(p2.v.h(wVar, false));
                wVar.a();
                break;
            default:
                p2.w wVar2 = (p2.w) obj;
                this.f9306b.e(p2.v.h(wVar2, false));
                wVar2.a();
                break;
        }
        return pi.o.f13011a;
    }
}
