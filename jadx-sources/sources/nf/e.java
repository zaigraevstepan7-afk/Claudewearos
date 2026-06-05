package nf;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import u6.a0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f12314b = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12315a;

    public e(e eVar) {
        this.f12315a = new ConcurrentHashMap(eVar.f12315a);
    }

    public final synchronized d a(String str) {
        if (!this.f12315a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f12315a.get(str);
    }

    public final synchronized void b(a0 a0Var) {
        int iC = a0Var.c();
        if (!(iC != 1 ? gk.b.b(iC) : gk.b.a(iC))) {
            throw new GeneralSecurityException("failed to register key manager " + a0Var.getClass() + " as it is not FIPS compatible.");
        }
        c(new d(a0Var));
    }

    public final synchronized void c(d dVar) {
        try {
            a0 a0Var = dVar.f12313a;
            Class cls = (Class) a0Var.f16684c;
            if (!((Map) a0Var.f16683b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + a0Var.toString() + " does not support primitive class " + cls.getName());
            }
            String strD = a0Var.d();
            d dVar2 = (d) this.f12315a.get(strD);
            if (dVar2 != null && !dVar2.f12313a.getClass().equals(dVar.f12313a.getClass())) {
                f12314b.warning("Attempted overwrite of a registered key manager for key type ".concat(strD));
                throw new GeneralSecurityException("typeUrl (" + strD + ") is already registered with " + dVar2.f12313a.getClass().getName() + ", cannot be re-registered with " + dVar.f12313a.getClass().getName());
            }
            this.f12315a.putIfAbsent(strD, dVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e() {
        this.f12315a = new ConcurrentHashMap();
    }
}
