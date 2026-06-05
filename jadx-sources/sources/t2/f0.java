package t2;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f15545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.c f15546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f15547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f15548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ej.c f15549g;

    public f0(int i10, int i11, Map map, ej.c cVar, g0 g0Var, m0 m0Var, ej.c cVar2) {
        this.f15543a = i10;
        this.f15544b = i11;
        this.f15545c = map;
        this.f15546d = cVar;
        this.f15547e = g0Var;
        this.f15548f = m0Var;
        this.f15549g = cVar2;
    }

    @Override // t2.r0
    public final Map f() {
        return this.f15545c;
    }

    @Override // t2.r0
    public final void g() {
        v2.r rVar;
        v2.f0 f0Var = this.f15548f.f15600a;
        boolean zT0 = this.f15547e.t0();
        ej.c cVar = this.f15549g;
        if (!zT0 || (rVar = f0Var.Y.f17583c.f17752l0) == null) {
            cVar.invoke(f0Var.Y.f17583c.E);
        } else {
            cVar.invoke(rVar.E);
        }
    }

    @Override // t2.r0
    public final int getHeight() {
        return this.f15544b;
    }

    @Override // t2.r0
    public final int getWidth() {
        return this.f15543a;
    }

    @Override // t2.r0
    public final ej.c h() {
        return this.f15546d;
    }
}
