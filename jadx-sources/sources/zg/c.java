package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class c implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f20589b = new c("[MIN_NAME]");

    /* renamed from: c, reason: collision with root package name */
    public static final c f20590c = new c("[MAX_KEY]");

    /* renamed from: d, reason: collision with root package name */
    public static final c f20591d = new c(".priority");

    /* renamed from: a, reason: collision with root package name */
    public final String f20592a;

    public c(String str) {
        this.f20592a = str;
    }

    public static c b(String str) {
        Integer numG = ug.l.g(str);
        if (numG != null) {
            return new b(str, numG.intValue());
        }
        if (str.equals(".priority")) {
            return f20591d;
        }
        ug.l.c(!str.contains("/"));
        return new c(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c cVar) {
        if (this == cVar) {
            return 0;
        }
        String str = this.f20592a;
        if (!str.equals("[MIN_NAME]")) {
            String str2 = cVar.f20592a;
            if (!str2.equals("[MAX_KEY]")) {
                if (str2.equals("[MIN_NAME]") || str.equals("[MAX_KEY]")) {
                    return 1;
                }
                if (!(this instanceof b)) {
                    if (cVar instanceof b) {
                        return 1;
                    }
                    return str.compareTo(str2);
                }
                if (cVar instanceof b) {
                    int iE = cVar.e();
                    char[] cArr = ug.l.f17082a;
                    int i10 = ((b) this).f20588e;
                    int i11 = i10 < iE ? -1 : i10 == iE ? 0 : 1;
                    if (i11 != 0) {
                        return i11;
                    }
                    int length = str.length();
                    int length2 = str2.length();
                    if (length < length2) {
                        return -1;
                    }
                    return length == length2 ? 0 : 1;
                }
            }
        }
        return -1;
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f20592a.equals(((c) obj).f20592a);
    }

    public final int hashCode() {
        return this.f20592a.hashCode();
    }

    public String toString() {
        return m6.a.j(new StringBuilder("ChildKey(\""), this.f20592a, "\")");
    }
}
