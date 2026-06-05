package kg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9645a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f9646b;

    public r(Class cls, Class cls2) {
        this.f9645a = cls;
        this.f9646b = cls2;
    }

    public static r a(Class cls) {
        return new r(q.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f9646b.equals(rVar.f9646b)) {
            return this.f9645a.equals(rVar.f9645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9645a.hashCode() + (this.f9646b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f9646b;
        Class cls2 = this.f9645a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
