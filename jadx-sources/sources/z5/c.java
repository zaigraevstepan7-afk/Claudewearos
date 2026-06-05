package z5;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends u0.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0.b f20380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u0.b f20381h;

    public c(u0.b bVar, u0.b bVar2) {
        this.f20380g = bVar;
        this.f20381h = bVar2;
    }

    @Override // u0.b
    public final int g(View view, int i10, int i11) {
        return (view.getLayoutDirection() == 1 ? this.f20381h : this.f20380g).g(view, i10, i11);
    }

    @Override // u0.b
    public final String j() {
        return "SWITCHING[L:" + this.f20380g.j() + ", R:" + this.f20381h.j() + "]";
    }

    @Override // u0.b
    public final int k(View view, int i10) {
        return (view.getLayoutDirection() == 1 ? this.f20381h : this.f20380g).k(view, i10);
    }
}
