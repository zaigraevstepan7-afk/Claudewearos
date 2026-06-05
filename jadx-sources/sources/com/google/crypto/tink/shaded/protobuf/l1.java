package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l1 extends m1 {
    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final boolean c(long j, Object obj) {
        return this.f4199a.getBoolean(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final byte d(long j, Object obj) {
        return this.f4199a.getByte(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final double e(long j, Object obj) {
        return this.f4199a.getDouble(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final float f(long j, Object obj) {
        return this.f4199a.getFloat(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void k(Object obj, long j, boolean z2) {
        this.f4199a.putBoolean(obj, j, z2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void l(Object obj, long j, byte b10) {
        this.f4199a.putByte(obj, j, b10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void m(Object obj, long j, double d10) {
        this.f4199a.putDouble(obj, j, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void n(Object obj, long j, float f10) {
        this.f4199a.putFloat(obj, j, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f4199a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            n1.a(th2);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final boolean s() {
        Unsafe unsafe = this.f4199a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (n1.e() != null) {
                    try {
                        Class<?> cls3 = this.f4199a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        n1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                n1.a(th3);
            }
        }
        return false;
    }
}
