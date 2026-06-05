package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {
    public static f a(String str) {
        Object next;
        wi.b bVar = f.A;
        bVar.getClass();
        fj.b bVar2 = new fj.b(bVar);
        while (true) {
            if (!bVar2.hasNext()) {
                next = null;
                break;
            }
            next = bVar2.next();
            if (fj.l.b(((f) next).name(), str)) {
                break;
            }
        }
        f fVar = (f) next;
        return fVar == null ? f.f10266c : fVar;
    }

    public static t3 b(String str) {
        Object next;
        wi.b bVar = t3.f10678e;
        bVar.getClass();
        fj.b bVar2 = new fj.b(bVar);
        while (true) {
            if (!bVar2.hasNext()) {
                next = null;
                break;
            }
            next = bVar2.next();
            if (fj.l.b(((t3) next).name(), str)) {
                break;
            }
        }
        t3 t3Var = (t3) next;
        return t3Var == null ? t3.f10676c : t3Var;
    }
}
