package nf;

import com.google.crypto.tink.shaded.protobuf.c0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import u6.a0;
import zf.a1;
import zf.q1;
import zf.x0;
import zf.z0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f12333a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f12334b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f12335c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f12336d;

    static {
        Logger.getLogger(n.class.getName());
        f12333a = new AtomicReference(new e());
        f12334b = new ConcurrentHashMap();
        f12335c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f12336d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z2) {
        if (z2) {
            try {
                ConcurrentHashMap concurrentHashMap = f12335c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z2) {
            if (((e) f12333a.get()).f12315a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f12336d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f12336d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(b bVar, Class cls) throws GeneralSecurityException {
        uf.o oVar = (uf.o) uf.h.f17040b.f17041a.get();
        oVar.getClass();
        uf.n nVar = new uf.n(bVar.getClass(), cls);
        HashMap map = oVar.f17050a;
        if (map.containsKey(nVar)) {
            return ((uf.l) map.get(nVar)).f17047b.e(bVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + nVar + " available");
    }

    public static Object c(String str, com.google.crypto.tink.shaded.protobuf.i iVar, Class cls) throws GeneralSecurityException {
        e eVar = (e) f12333a.get();
        eVar.getClass();
        d dVarA = eVar.a(str);
        Set setKeySet = ((Map) dVarA.f12313a.f16683b).keySet();
        a0 a0Var = dVarA.f12313a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb2 = new StringBuilder("Primitive type ");
            sb2.append(cls.getName());
            sb2.append(" not supported by key manager of type ");
            sb2.append(a0Var.getClass());
            sb2.append(", supported primitives: ");
            Set<Class> setKeySet2 = ((Map) a0Var.f16683b).keySet();
            StringBuilder sb3 = new StringBuilder();
            boolean z2 = true;
            for (Class cls2 : setKeySet2) {
                if (!z2) {
                    sb3.append(", ");
                }
                sb3.append(cls2.getCanonicalName());
                z2 = false;
            }
            sb2.append(sb3.toString());
            throw new GeneralSecurityException(sb2.toString());
        }
        try {
            if (!((Map) a0Var.f16683b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + a0Var.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                com.google.crypto.tink.shaded.protobuf.a aVarH = a0Var.h(iVar);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                a0Var.j(aVarH);
                return a0Var.e(aVarH, cls);
            } catch (c0 e10) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) a0Var.f16682a).getName()), e10);
            }
        } catch (IllegalArgumentException e11) {
            throw new GeneralSecurityException("Primitive type not supported", e11);
        }
    }

    public static Object d(String str, byte[] bArr) {
        com.google.crypto.tink.shaded.protobuf.h hVar = com.google.crypto.tink.shaded.protobuf.i.f4171b;
        return c(str, com.google.crypto.tink.shaded.protobuf.i.i(0, bArr, bArr.length), a.class);
    }

    public static synchronized x0 e(a1 a1Var) {
        f fVar;
        a0 a0Var = ((e) f12333a.get()).a(a1Var.B()).f12313a;
        fVar = new f(a0Var, (Class) a0Var.f16684c);
        if (!((Boolean) f12335c.get(a1Var.B())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a1Var.B());
        }
        return fVar.e(a1Var.C());
    }

    public static synchronized void f(a0 a0Var, boolean z2) {
        try {
            AtomicReference atomicReference = f12333a;
            e eVar = new e((e) atomicReference.get());
            eVar.b(a0Var);
            String strD = a0Var.d();
            a(strD, z2 ? a0Var.f().l() : Collections.EMPTY_MAP, z2);
            if (!((e) atomicReference.get()).f12315a.containsKey(strD)) {
                f12334b.put(strD, new y9.a());
                if (z2) {
                    g(strD, a0Var.f().l());
                }
            }
            f12335c.put(strD, Boolean.valueOf(z2));
            atomicReference.set(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void g(String str, Map map) {
        q1 q1Var;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrE = ((com.google.crypto.tink.shaded.protobuf.a) ((uf.d) entry.getValue()).f17035a).e();
            int i10 = ((uf.d) entry.getValue()).f17036b;
            z0 z0VarD = a1.D();
            z0VarD.e();
            a1.w((a1) z0VarD.f4243b, str);
            com.google.crypto.tink.shaded.protobuf.h hVarI = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrE, bArrE.length);
            z0VarD.e();
            a1.x((a1) z0VarD.f4243b, hVarI);
            int iB = y3.e.b(i10);
            if (iB == 0) {
                q1Var = q1.TINK;
            } else if (iB == 1) {
                q1Var = q1.LEGACY;
            } else if (iB == 2) {
                q1Var = q1.RAW;
            } else {
                if (iB != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                q1Var = q1.CRUNCHY;
            }
            z0VarD.e();
            a1.y((a1) z0VarD.f4243b, q1Var);
            f12336d.put(str2, new g((a1) z0VarD.b()));
        }
    }

    public static synchronized void h(m mVar) {
        uf.h hVar = uf.h.f17040b;
        synchronized (hVar) {
            qh.c cVar = new qh.c((uf.o) hVar.f17041a.get());
            cVar.L(mVar);
            hVar.f17041a.set(new uf.o(cVar));
        }
    }
}
