package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f952a;

    public j1(Unsafe unsafe) {
        this.f952a = unsafe;
    }

    public final int a(Class cls) {
        return this.f952a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f952a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f952a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f952a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f952a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f952a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z2);

    public abstract void k(Object obj, long j, byte b10);

    public abstract void l(Object obj, long j, double d10);

    public abstract void m(Object obj, long j, float f10);

    public final void n(Object obj, int i10, long j) {
        this.f952a.putInt(obj, j, i10);
    }

    public final void o(Object obj, long j, long j4) {
        this.f952a.putLong(obj, j, j4);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f952a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f952a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            k1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}
