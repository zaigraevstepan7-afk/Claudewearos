package com.google.android.recaptcha.internal;

import fj.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzce implements InvocationHandler {
    private final Object zza;

    public zzce(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (l.b(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (l.b(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (l.b(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z2 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
        boolean zZza = zza(obj, method, objArr);
        o oVar = o.f13011a;
        if (!zZza) {
            return oVar;
        }
        if ((this.zza == null && l.b(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && l.b(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? oVar : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
