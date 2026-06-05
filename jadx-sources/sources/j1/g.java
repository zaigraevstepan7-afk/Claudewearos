package j1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f8629c = new g(0, 2, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        int i10 = ((p1.f) kVar.g(0)).f12642a;
        List list = (List) kVar.g(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            aVar.c(i12, obj);
            aVar.l(i12, obj);
        }
    }
}
