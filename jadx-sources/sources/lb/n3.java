package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n3 extends ad.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10531b;

    public n3(f1.a1 a1Var, f1.a1 a1Var2) {
        this.f10530a = a1Var;
        this.f10531b = a1Var2;
    }

    @Override // fc.d
    public final void onAdFailedToLoad(fc.m mVar) {
        this.f10530a.setValue(null);
        this.f10531b.setValue(Boolean.FALSE);
    }

    @Override // fc.d
    public final void onAdLoaded(Object obj) {
        ad.c cVar = (ad.c) obj;
        fj.l.f(cVar, "ad");
        this.f10530a.setValue(cVar);
        this.f10531b.setValue(Boolean.FALSE);
    }
}
