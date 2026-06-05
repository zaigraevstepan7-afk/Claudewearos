package f0;

import f1.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6156a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f6157b;

    /* renamed from: d, reason: collision with root package name */
    public int f6159d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f6160e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6161f;

    /* renamed from: c, reason: collision with root package name */
    public int f6158c = -1;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f6162g = f1.s.A(null);

    public k0(Object obj, l0 l0Var) {
        this.f6156a = obj;
        this.f6157b = l0Var;
    }

    public final k0 a() {
        if (this.f6161f) {
            a0.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f6159d == 0) {
            this.f6157b.f6166a.add(this);
            k0 k0Var = (k0) this.f6162g.getValue();
            if (k0Var != null) {
                k0Var.a();
            } else {
                k0Var = null;
            }
            this.f6160e = k0Var;
        }
        this.f6159d++;
        return this;
    }

    public final void b() {
        if (this.f6161f) {
            return;
        }
        if (this.f6159d <= 0) {
            a0.a.c("Release should only be called once");
        }
        int i10 = this.f6159d - 1;
        this.f6159d = i10;
        if (i10 == 0) {
            this.f6157b.f6166a.remove(this);
            k0 k0Var = this.f6160e;
            if (k0Var != null) {
                k0Var.b();
            }
            this.f6160e = null;
        }
    }
}
