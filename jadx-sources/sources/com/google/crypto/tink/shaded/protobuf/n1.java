package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f4201a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f4202b;

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f4203c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4204d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4205e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f4206f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f4207g;

    static {
        Unsafe unsafeJ = j();
        f4201a = unsafeJ;
        f4202b = c.f4140a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        m1 l1Var = null;
        if (unsafeJ != null) {
            if (!c.a()) {
                l1Var = new l1(unsafeJ);
            } else if (zF) {
                l1Var = new k1(unsafeJ, 1);
            } else if (zF2) {
                l1Var = new k1(unsafeJ, 0);
            }
        }
        f4203c = l1Var;
        f4204d = l1Var == null ? false : l1Var.s();
        f4205e = l1Var == null ? false : l1Var.r();
        f4206f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && l1Var != null) {
            l1Var.j(fieldE);
        }
        f4207g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f4201a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f4205e) {
            return f4203c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f4205e) {
            f4203c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f4202b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j) {
        return f4203c.d(f4206f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f4203c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f4203c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b10) {
        f4203c.l(bArr, f4206f + j, b10);
    }

    public static void l(Object obj, long j, byte b10) {
        long j4 = (-4) & j;
        int iG = f4203c.g(j4, obj);
        int i10 = ((~((int) j)) & 3) << 3;
        n(obj, ((255 & b10) << i10) | (iG & (~(255 << i10))), j4);
    }

    public static void m(Object obj, long j, byte b10) {
        long j4 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        n(obj, ((255 & b10) << i10) | (f4203c.g(j4, obj) & (~(255 << i10))), j4);
    }

    public static void n(Object obj, int i10, long j) {
        f4203c.o(obj, i10, j);
    }

    public static void o(Object obj, long j, long j4) {
        f4203c.p(obj, j, j4);
    }

    public static void p(Object obj, long j, Object obj2) {
        f4203c.q(obj, j, obj2);
    }
}
