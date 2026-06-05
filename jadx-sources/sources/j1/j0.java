package j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8637b;

    public j0(int i10, int i11) {
        this.f8636a = i10;
        this.f8637b = i11;
    }

    public abstract void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var);

    public i1.b b(androidx.datastore.preferences.protobuf.k kVar) {
        return null;
    }

    public final String toString() {
        String strC = fj.w.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public /* synthetic */ j0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
