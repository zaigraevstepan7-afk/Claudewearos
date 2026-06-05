package kg;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9608a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f9609b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9610c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9611d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9612e;

    /* renamed from: f, reason: collision with root package name */
    public final e f9613f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f9614g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.f9608a = str;
        this.f9609b = Collections.unmodifiableSet(set);
        this.f9610c = Collections.unmodifiableSet(set2);
        this.f9611d = i10;
        this.f9612e = i11;
        this.f9613f = eVar;
        this.f9614g = Collections.unmodifiableSet(set3);
    }

    public static a a(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static a b(r rVar) {
        return new a(rVar, new r[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            yd.f.n(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ac.h(obj, 14), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f9609b.toArray()) + ">{" + this.f9611d + ", type=" + this.f9612e + ", deps=" + Arrays.toString(this.f9610c.toArray()) + "}";
    }
}
