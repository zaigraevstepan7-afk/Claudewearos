package j1;

import f1.t1;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f8624c = new d0(0, 1, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        t1 t1Var = (t1) kVar.g(0);
        q.g0 g0Var = kVar3.f12657i;
        p1.g gVar = g0Var != null ? (p1.g) g0Var.g(t1Var) : null;
        if (gVar != null) {
            ArrayList arrayList = kVar3.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                kVar3.j = arrayList;
            }
            arrayList.add(kVar3.f12653e);
            kVar3.f12653e = gVar.f12644b;
        }
    }
}
