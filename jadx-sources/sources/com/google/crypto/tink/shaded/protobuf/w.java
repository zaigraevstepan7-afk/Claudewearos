package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
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
        this.unknownFields = e1.f4158f;
    }

    public static void g(w wVar) throws c0 {
        if (!m(wVar, true)) {
            throw new c0(new d1().getMessage());
        }
    }

    public static w j(Class cls) throws ClassNotFoundException {
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
        w wVarA = ((w) n1.b(cls)).a();
        if (wVarA == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, wVarA);
        return wVarA;
    }

    public static Object l(Method method, w wVar, Object... objArr) {
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

    public static final boolean m(w wVar, boolean z2) {
        byte bByteValue = ((Byte) wVar.i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        y0 y0Var = y0.f4246c;
        y0Var.getClass();
        boolean zC = y0Var.a(wVar.getClass()).c(wVar);
        if (z2) {
            wVar.i(2);
        }
        return zC;
    }

    public static w r(w wVar, i iVar, o oVar) throws c0 {
        h hVar = (h) iVar;
        j jVarH = androidx.datastore.preferences.protobuf.j.h(hVar.f4169d, hVar.y(), hVar.size(), true);
        w wVarS = s(wVar, jVarH, oVar);
        jVarH.b(0);
        g(wVarS);
        return wVarS;
    }

    public static w s(w wVar, androidx.datastore.preferences.protobuf.j jVar, o oVar) throws c0 {
        w wVarQ = wVar.q();
        try {
            y0 y0Var = y0.f4246c;
            y0Var.getClass();
            b1 b1VarA = y0Var.a(wVarQ.getClass());
            androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) jVar.f949b;
            if (kVar == null) {
                kVar = new androidx.datastore.preferences.protobuf.k(jVar, (byte) 0);
            }
            b1VarA.j(wVarQ, kVar, oVar);
            b1VarA.b(wVarQ);
            return wVarQ;
        } catch (c0 e10) {
            if (e10.f4142a) {
                throw new c0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (d1 e11) {
            throw new c0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof c0) {
                throw ((c0) e12.getCause());
            }
            throw new c0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof c0) {
                throw ((c0) e13.getCause());
            }
            throw e13;
        }
    }

    public static void t(Class cls, w wVar) {
        wVar.o();
        defaultInstanceMap.put(cls, wVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int b(b1 b1Var) {
        int iG;
        int iG2;
        if (n()) {
            if (b1Var == null) {
                y0 y0Var = y0.f4246c;
                y0Var.getClass();
                iG2 = y0Var.a(getClass()).g(this);
            } else {
                iG2 = b1Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(m6.a.d(iG2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (b1Var == null) {
            y0 y0Var2 = y0.f4246c;
            y0Var2.getClass();
            iG = y0Var2.a(getClass()).g(this);
        } else {
            iG = b1Var.g(this);
        }
        u(iG);
        return iG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y0 y0Var = y0.f4246c;
        y0Var.getClass();
        return y0Var.a(getClass()).e(this, (w) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final void f(l lVar) {
        y0 y0Var = y0.f4246c;
        y0Var.getClass();
        b1 b1VarA = y0Var.a(getClass());
        l0 l0Var = lVar.f4191d;
        if (l0Var == null) {
            l0Var = new l0(lVar);
        }
        b1VarA.i(this, l0Var);
    }

    public final u h() {
        return (u) i(5);
    }

    public final int hashCode() {
        if (n()) {
            y0 y0Var = y0.f4246c;
            y0Var.getClass();
            return y0Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            y0 y0Var2 = y0.f4246c;
            y0Var2.getClass();
            this.memoizedHashCode = y0Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(int i10);

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final w a() {
        return (w) i(6);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final u d() {
        return (u) i(5);
    }

    public final w q() {
        return (w) i(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = r0.f4221a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        r0.c(this, sb2, 0);
        return sb2.toString();
    }

    public final void u(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(m6.a.d(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final u v() {
        u uVar = (u) i(5);
        if (!uVar.f4242a.equals(this)) {
            uVar.e();
            u.f(uVar.f4243b, this);
        }
        return uVar;
    }
}
