package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f1025c = new u0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1027b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g0 f1026a = new g0();

    public final x0 a(Class cls) {
        x0 x0VarW;
        Class cls2;
        y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1027b;
        x0 x0Var = (x0) concurrentHashMap.get(cls);
        if (x0Var != null) {
            return x0Var;
        }
        g0 g0Var = this.f1026a;
        g0Var.getClass();
        Class cls3 = y0.f1037a;
        if (!w.class.isAssignableFrom(cls) && (cls2 = y0.f1037a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        w0 w0VarA = ((f0) g0Var.f932a).a(cls);
        int i10 = w0VarA.f1034d;
        a aVar = w0VarA.f1031a;
        if ((i10 & 2) == 2) {
            if (w.class.isAssignableFrom(cls)) {
                x0VarW = new p0(y0.f1039c, q.f996a, aVar);
            } else {
                f1 f1Var = y0.f1038b;
                p pVar = q.f997b;
                if (pVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x0VarW = new p0(f1Var, pVar, aVar);
            }
        } else if (w.class.isAssignableFrom(cls)) {
            p pVar2 = null;
            q0 q0Var = r0.f1002b;
            d0 d0Var = e0.f917b;
            f1 f1Var2 = y0.f1039c;
            if (y3.e.b(w0VarA.a()) != 1) {
                pVar2 = q.f996a;
            }
            p pVar3 = pVar2;
            k0 k0Var = l0.f966b;
            if (!(w0VarA instanceof w0)) {
                int[] iArr = o0.f979n;
                w0VarA.getClass();
                throw new ClassCastException();
            }
            x0VarW = o0.w(w0VarA, q0Var, d0Var, f1Var2, pVar3, k0Var);
        } else {
            p pVar4 = null;
            q0 q0Var2 = r0.f1001a;
            d0 d0Var2 = e0.f916a;
            f1 f1Var3 = y0.f1038b;
            if (y3.e.b(w0VarA.a()) != 1 && (pVar4 = q.f997b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            p pVar5 = pVar4;
            k0 k0Var2 = l0.f965a;
            if (!(w0VarA instanceof w0)) {
                int[] iArr2 = o0.f979n;
                w0VarA.getClass();
                throw new ClassCastException();
            }
            x0VarW = o0.w(w0VarA, q0Var2, d0Var2, f1Var3, pVar5, k0Var2);
        }
        x0 x0Var2 = (x0) concurrentHashMap.putIfAbsent(cls, x0VarW);
        return x0Var2 != null ? x0Var2 : x0VarW;
    }
}
