package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final s f20617a = new s();

    @Override // zg.k
    public final String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // zg.k
    public final boolean b(r rVar) {
        return !rVar.c().isEmpty();
    }

    @Override // zg.k
    public final p c(c cVar, r rVar) {
        return new p(cVar, new u("[PRIORITY-POST]", rVar));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        r rVarC = pVar.f20615b.c();
        r rVarC2 = pVar2.f20615b.c();
        c cVar = pVar.f20614a;
        c cVar2 = pVar2.f20614a;
        int iCompareTo = rVarC.compareTo(rVarC2);
        return iCompareTo != 0 ? iCompareTo : cVar.compareTo(cVar2);
    }

    @Override // zg.k
    public final p d() {
        return c(c.f20590c, r.f20616y);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof s;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }
}
