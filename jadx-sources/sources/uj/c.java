package uj;

import fj.y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ti.c[] f17100a = new ti.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final d7.c f17101b = new d7.c("NULL");

    public static final Object a(ti.h hVar, Object obj, Object obj2, ej.e eVar, ti.c cVar) {
        Object objInvoke;
        Object objN = vj.b.n(hVar, obj2);
        try {
            t tVar = new t(cVar, hVar);
            if (eVar == null) {
                objInvoke = u3.a.p(eVar, obj, tVar);
            } else {
                y.c(2, eVar);
                objInvoke = eVar.invoke(obj, tVar);
            }
            vj.b.g(hVar, objN);
            if (objInvoke == ui.a.f17085a) {
                fj.l.f(cVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th2) {
            vj.b.g(hVar, objN);
            throw th2;
        }
    }
}
