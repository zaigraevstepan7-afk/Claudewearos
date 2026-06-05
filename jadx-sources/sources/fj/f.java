package fj;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements lj.b, e {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f6797b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f6798a;

    static {
        List listC0 = qi.k.c0(new Class[]{ej.a.class, ej.c.class, ej.e.class, ej.f.class, ej.g.class, ej.h.class, ej.i.class, p1.c.class, ej.j.class, p1.c.class, p1.c.class, p1.c.class, ej.b.class, p1.c.class, p1.c.class, p1.c.class, p1.c.class, p1.c.class, p1.c.class, p1.c.class, p1.c.class, p1.c.class, ej.d.class});
        ArrayList arrayList = new ArrayList(qi.m.s0(listC0));
        int i10 = 0;
        for (Object obj : listC0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                yd.f.i0();
                throw null;
            }
            arrayList.add(new pi.h((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f6797b = qi.v.l0(arrayList);
    }

    public f(Class cls) {
        l.f(cls, "jClass");
        this.f6798a = cls;
    }

    @Override // fj.e
    public final Class a() {
        return this.f6798a;
    }

    public final String b() {
        String strG;
        Class cls = this.f6798a;
        l.f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strG2 = l.g(cls.getName());
            return strG2 == null ? cls.getCanonicalName() : strG2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strG = l.g(componentType.getName())) != null) {
            strConcat = strG.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strK;
        Class cls = this.f6798a;
        l.f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strK2 = l.k(cls.getName());
                return strK2 == null ? cls.getSimpleName() : strK2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strK = l.k(componentType.getName())) != null) {
                strConcat = strK.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return nj.e.V0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return nj.e.V0(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int iH0 = nj.e.H0(simpleName, '$', 0, 6);
        if (iH0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iH0 + 1, simpleName.length());
        l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d(Object obj) {
        Class clsE = this.f6798a;
        l.f(clsE, "jClass");
        Map map = f6797b;
        l.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsE);
        if (num != null) {
            return y.d(num.intValue(), obj);
        }
        if (clsE.isPrimitive()) {
            clsE = cg.b.E(w.a(clsE));
        }
        return clsE.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && cg.b.E(this).equals(cg.b.E((lj.b) obj));
    }

    public final int hashCode() {
        return cg.b.E(this).hashCode();
    }

    public final String toString() {
        return this.f6798a.toString() + " (Kotlin reflection is not available)";
    }
}
