package ti;

import fj.l;
import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i f16336a = new i();

    @Override // ti.h
    public final f C(g gVar) {
        l.f(gVar, "key");
        return null;
    }

    @Override // ti.h
    public final h V(h hVar) {
        l.f(hVar, "context");
        return hVar;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // ti.h
    public final h s(g gVar) {
        l.f(gVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return obj;
    }
}
