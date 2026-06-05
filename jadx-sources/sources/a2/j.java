package a2;

import q.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final q f31a;

    /* renamed from: b, reason: collision with root package name */
    public final w2.t f32b;

    /* renamed from: c, reason: collision with root package name */
    public final q.h0 f33c;

    /* renamed from: d, reason: collision with root package name */
    public final q.h0 f34d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35e;

    public j(q qVar, w2.t tVar) {
        this.f31a = qVar;
        this.f32b = tVar;
        q.h0 h0Var = o0.f13110a;
        this.f33c = new q.h0();
        this.f34d = new q.h0();
    }

    public final void a() {
        if (this.f35e) {
            return;
        }
        i iVar = new i(0, this, j.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 0);
        q.b0 b0Var = this.f32b.S0;
        if (b0Var.g(iVar) < 0) {
            b0Var.a(iVar);
        }
        this.f35e = true;
    }
}
