package i8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8373a = new b();

    public final boolean a(Object obj, r8.g gVar) {
        if (this == gVar) {
            return true;
        }
        if (!(obj instanceof r8.g)) {
            return obj.equals(gVar);
        }
        r8.g gVar2 = (r8.g) obj;
        return fj.l.b(gVar2.f13868a, gVar.f13868a) && gVar2.f13869b.equals(gVar.f13869b) && gVar2.f13871d.equals(gVar.f13871d) && fj.l.b(gVar2.f13881o, gVar.f13881o) && gVar2.f13882p == gVar.f13882p && gVar2.f13883q == gVar.f13883q;
    }

    public final int b(Object obj) {
        if (!(obj instanceof r8.g)) {
            return obj.hashCode();
        }
        r8.g gVar = (r8.g) obj;
        return gVar.f13883q.hashCode() + ((gVar.f13882p.hashCode() + ((gVar.f13881o.hashCode() + ((gVar.f13871d.hashCode() + ((gVar.f13869b.hashCode() + (gVar.f13868a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
