package u1;

import f1.i0;
import j1.k0;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements k0, ti.f {

    /* renamed from: b, reason: collision with root package name */
    public static final p9.a f16570b = new p9.a(13);

    /* renamed from: a, reason: collision with root package name */
    public final i0 f16571a;

    public f(i0 i0Var) {
        this.f16571a = i0Var;
    }

    @Override // ti.h
    public final /* bridge */ ti.f C(ti.g gVar) {
        return yd.f.w(this, gVar);
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // ti.h
    public final /* bridge */ ti.h V(ti.h hVar) {
        return yd.f.W(this, hVar);
    }

    @Override // j1.k0
    public final List c(Integer num) {
        return this.f16571a.J();
    }

    @Override // ti.f
    public final ti.g getKey() {
        return f16570b;
    }

    @Override // j1.k0
    public final boolean h() {
        return this.f16571a.C;
    }

    @Override // ti.h
    public final /* bridge */ ti.h s(ti.g gVar) {
        return yd.f.N(this, gVar);
    }
}
