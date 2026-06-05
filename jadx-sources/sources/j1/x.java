package j1;

import f1.t1;
import java.util.Set;
import q.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f8661c = new x(0, 1, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        t1 t1Var = (t1) kVar.g(0);
        Set set = kVar3.f12649a;
        if (set == null) {
            return;
        }
        p1.g gVar = new p1.g(set);
        q.g0 g0Var = kVar3.f12657i;
        if (g0Var == null) {
            long[] jArr = n0.f13108a;
            g0Var = new q.g0();
            kVar3.f12657i = g0Var;
        }
        g0Var.m(t1Var, gVar);
        kVar3.f12653e.b(new f1.l0(gVar, -1));
    }
}
