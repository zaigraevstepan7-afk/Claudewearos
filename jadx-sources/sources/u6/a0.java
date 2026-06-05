package u6;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import t.m1;
import zf.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16682a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16683b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f16684c;

    public a0(u uVar) {
        fj.l.f(uVar, "database");
        this.f16682a = uVar;
        this.f16683b = new AtomicBoolean(false);
        this.f16684c = v.Q(new q0.k(this, 14));
    }

    public g7.i a() {
        u uVar = (u) this.f16682a;
        uVar.a();
        if (((AtomicBoolean) this.f16683b).compareAndSet(false, true)) {
            return (g7.i) ((pi.m) this.f16684c).getValue();
        }
        String strB = b();
        uVar.getClass();
        uVar.a();
        uVar.b();
        return uVar.j().H().m(strB);
    }

    public abstract String b();

    public int c() {
        return 1;
    }

    public abstract String d();

    public Object e(com.google.crypto.tink.shaded.protobuf.a aVar, Class cls) {
        of.f fVar = (of.f) ((Map) this.f16683b).get(cls);
        if (fVar != null) {
            return fVar.a(aVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract f0.i0 f();

    public abstract w0 g();

    public abstract com.google.crypto.tink.shaded.protobuf.a h(com.google.crypto.tink.shaded.protobuf.i iVar);

    public void i(g7.i iVar) {
        fj.l.f(iVar, "statement");
        if (iVar == ((g7.i) ((pi.m) this.f16684c).getValue())) {
            ((AtomicBoolean) this.f16683b).set(false);
        }
    }

    public abstract void j(com.google.crypto.tink.shaded.protobuf.a aVar);

    public a0(Class cls, of.f... fVarArr) {
        this.f16682a = cls;
        HashMap map = new HashMap();
        for (of.f fVar : fVarArr) {
            Class cls2 = fVar.f12453a;
            if (!map.containsKey(cls2)) {
                map.put(cls2, fVar);
            } else {
                throw new IllegalArgumentException(m1.h(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (fVarArr.length > 0) {
            this.f16684c = fVarArr[0].f12453a;
        } else {
            this.f16684c = Void.class;
        }
        this.f16683b = Collections.unmodifiableMap(map);
    }
}
