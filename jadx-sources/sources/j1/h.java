package j1;

import f1.v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f8631c = new h(0, 4, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        v0 v0Var = (v0) kVar.g(2);
        f1.p pVar = (f1.p) kVar.g(1);
        pVar.m(v0Var);
        f1.n.b("Could not resolve state for movable content");
        throw new b3.e();
    }
}
