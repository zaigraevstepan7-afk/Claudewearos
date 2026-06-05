package l7;

import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10027a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f10028b;

    public d(ViewGroup viewGroup) {
        this.f10028b = viewGroup;
    }

    @Override // l7.q, l7.m
    public final void a() {
        cg.b.P(this.f10028b, false);
    }

    @Override // l7.q, l7.m
    public final void b(p pVar) {
        cg.b.P(this.f10028b, false);
        this.f10027a = true;
    }

    @Override // l7.q, l7.m
    public final void e() {
        cg.b.P(this.f10028b, true);
    }

    @Override // l7.q, l7.m
    public final void f(p pVar) {
        if (!this.f10027a) {
            cg.b.P(this.f10028b, false);
        }
        pVar.z(this);
    }
}
