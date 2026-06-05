package o3;

import f1.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends r5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f12414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld.i f12415b;

    public g(j1 j1Var, ld.i iVar) {
        this.f12414a = j1Var;
        this.f12415b = iVar;
    }

    @Override // r5.i
    public final void a() {
        this.f12415b.f10924b = j.f12418a;
    }

    @Override // r5.i
    public final void b() {
        this.f12414a.setValue(Boolean.TRUE);
        this.f12415b.f10924b = new k(true);
    }
}
