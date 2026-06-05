package w5;

import java.lang.reflect.InvocationTargetException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q.p0 f18615b = new q.p0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f18616a;

    public c0(i0 i0Var) {
        this.f18616a = i0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        q.p0 p0Var = f18615b;
        q.p0 p0Var2 = (q.p0) p0Var.get(classLoader);
        if (p0Var2 == null) {
            p0Var2 = new q.p0(0);
            p0Var.put(classLoader, p0Var2);
        }
        Class cls = (Class) p0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        p0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new b3.e(m1.j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new b3.e(m1.j("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final t a(String str) {
        try {
            return (t) c(this.f18616a.f18662w.f18777e.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new b3.e(m1.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new b3.e(m1.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new b3.e(m1.j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new b3.e(m1.j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
