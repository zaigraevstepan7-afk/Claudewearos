package fj;

import java.util.Collection;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class y {
    public static Collection a(Object obj) {
        if ((obj instanceof gj.a) && !(obj instanceof gj.b)) {
            e(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            l.j(e10, y.class.getName());
            throw e10;
        }
    }

    public static Map b(Object obj) {
        if ((obj instanceof gj.a) && !(obj instanceof gj.d)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            l.j(e10, y.class.getName());
            throw e10;
        }
    }

    public static void c(int i10, Object obj) {
        if (obj == null || d(i10, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean d(int i10, Object obj) {
        int arity;
        if (obj instanceof pi.c) {
            if (obj instanceof i) {
                arity = ((i) obj).getArity();
            } else if (obj instanceof ej.a) {
                arity = 0;
            } else if (obj instanceof ej.c) {
                arity = 1;
            } else if (obj instanceof ej.e) {
                arity = 2;
            } else if (obj instanceof ej.f) {
                arity = 3;
            } else if (obj instanceof ej.g) {
                arity = 4;
            } else if (obj instanceof ej.h) {
                arity = 5;
            } else if (obj instanceof ej.i) {
                arity = 6;
            } else {
                boolean z2 = obj instanceof p1.c;
                arity = z2 ? 7 : obj instanceof ej.j ? 8 : z2 ? 9 : z2 ? 10 : z2 ? 11 : z2 ? 13 : z2 ? 14 : z2 ? 15 : z2 ? 16 : z2 ? 17 : z2 ? 18 : z2 ? 19 : z2 ? 20 : z2 ? 21 : -1;
            }
            if (arity == i10) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(m1.w(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.j(classCastException, y.class.getName());
        throw classCastException;
    }
}
