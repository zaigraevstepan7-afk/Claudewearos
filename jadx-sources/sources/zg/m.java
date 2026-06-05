package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final m f20608a = new m();

    @Override // zg.k
    public final String a() {
        return ".key";
    }

    @Override // zg.k
    public final boolean b(r rVar) {
        return true;
    }

    @Override // zg.k
    public final p c(c cVar, r rVar) {
        ug.l.c(rVar instanceof u);
        return new p(c.b((String) rVar.getValue()), j.f20603e);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((p) obj).f20614a.compareTo(((p) obj2).f20614a);
    }

    @Override // zg.k
    public final p d() {
        return p.f20613d;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof m;
    }

    public final int hashCode() {
        return 37;
    }

    public final String toString() {
        return "KeyIndex";
    }
}
