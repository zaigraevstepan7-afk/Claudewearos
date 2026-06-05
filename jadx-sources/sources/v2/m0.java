package v2;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 implements t2.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f17726c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.c f17727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej.c f17728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f17729f;

    public m0(int i10, int i11, Map map, ej.c cVar, ej.c cVar2, n0 n0Var) {
        this.f17724a = i10;
        this.f17725b = i11;
        this.f17726c = map;
        this.f17727d = cVar;
        this.f17728e = cVar2;
        this.f17729f = n0Var;
    }

    @Override // t2.r0
    public final Map f() {
        return this.f17726c;
    }

    @Override // t2.r0
    public final void g() {
        this.f17728e.invoke(this.f17729f.E);
    }

    @Override // t2.r0
    public final int getHeight() {
        return this.f17725b;
    }

    @Override // t2.r0
    public final int getWidth() {
        return this.f17724a;
    }

    @Override // t2.r0
    public final ej.c h() {
        return this.f17727d;
    }
}
