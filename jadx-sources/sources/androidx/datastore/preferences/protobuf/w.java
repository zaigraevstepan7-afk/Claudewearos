package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class w extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected e1 unknownFields;

    public w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e1.f918f;
    }

    public static w d(Class cls) throws ClassNotFoundException {
        w wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = (w) ((w) k1.d(cls)).c(6);
        if (wVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, wVar2);
        return wVar2;
    }

    public static Object e(Method method, w wVar, Object... objArr) {
        try {
            return method.invoke(wVar, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(w wVar, boolean z2) {
        byte bByteValue = ((Byte) wVar.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        u0 u0Var = u0.f1025c;
        u0Var.getClass();
        boolean zC = u0Var.a(wVar.getClass()).c(wVar);
        if (z2) {
            wVar.c(2);
        }
        return zC;
    }

    public static void j(Class cls, w wVar) {
        wVar.h();
        defaultInstanceMap.put(cls, wVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(x0 x0Var) {
        int iF;
        int iF2;
        if (g()) {
            if (x0Var == null) {
                u0 u0Var = u0.f1025c;
                u0Var.getClass();
                iF2 = u0Var.a(getClass()).f(this);
            } else {
                iF2 = x0Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(m6.a.d(iF2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (x0Var == null) {
            u0 u0Var2 = u0.f1025c;
            u0Var2.getClass();
            iF = u0Var2.a(getClass()).f(this);
        } else {
            iF = x0Var.f(this);
        }
        k(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(m mVar) {
        u0 u0Var = u0.f1025c;
        u0Var.getClass();
        x0 x0VarA = u0Var.a(getClass());
        g0 g0Var = mVar.f969d;
        if (g0Var == null) {
            g0Var = new g0(mVar);
        }
        x0VarA.e(this, g0Var);
    }

    public abstract Object c(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u0 u0Var = u0.f1025c;
        u0Var.getClass();
        return u0Var.a(getClass()).h(this, (w) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final int hashCode() {
        if (g()) {
            u0 u0Var = u0.f1025c;
            u0Var.getClass();
            return u0Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            u0 u0Var2 = u0.f1025c;
            u0Var2.getClass();
            this.memoizedHashCode = u0Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final w i() {
        return (w) c(4);
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(m6.a.d(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = n0.f975a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        n0.c(this, sb2, 0);
        return sb2.toString();
    }
}
