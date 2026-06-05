package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f4246c = new y0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4248b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final l0 f4247a = new l0();

    public final b1 a(Class cls) {
        b1 b1VarB;
        Class cls2;
        a0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4248b;
        b1 b1Var = (b1) concurrentHashMap.get(cls);
        if (b1Var != null) {
            return b1Var;
        }
        l0 l0Var = this.f4247a;
        l0Var.getClass();
        Class cls3 = c1.f4143a;
        if (!w.class.isAssignableFrom(cls) && (cls2 = c1.f4143a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        a1 a1VarA = ((k0) l0Var.f4196a).a(cls);
        int i10 = a1VarA.f4138d;
        a aVar = a1VarA.f4135a;
        if ((i10 & 2) == 2) {
            if (w.class.isAssignableFrom(cls)) {
                b1VarB = new t0(c1.f4146d, q.f4213a, aVar);
            } else {
                f1 f1Var = c1.f4144b;
                p pVar = q.f4214b;
                if (pVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                b1VarB = new t0(f1Var, pVar, aVar);
            }
        } else if (w.class.isAssignableFrom(cls)) {
            b1VarB = (a1VarA.f4138d & 1) == 1 ? s0.B(a1VarA, v0.f4245b, i0.f4175b, c1.f4146d, q.f4213a, o0.f4211b) : s0.B(a1VarA, v0.f4245b, i0.f4175b, c1.f4146d, null, o0.f4211b);
        } else if ((a1VarA.f4138d & 1) == 1) {
            u0 u0Var = v0.f4244a;
            g0 g0Var = i0.f4174a;
            f1 f1Var2 = c1.f4144b;
            p pVar2 = q.f4214b;
            if (pVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            b1VarB = s0.B(a1VarA, u0Var, g0Var, f1Var2, pVar2, o0.f4210a);
        } else {
            b1VarB = s0.B(a1VarA, v0.f4244a, i0.f4174a, c1.f4145c, null, o0.f4210a);
        }
        b1 b1Var2 = (b1) concurrentHashMap.putIfAbsent(cls, b1VarB);
        return b1Var2 != null ? b1Var2 : b1VarB;
    }
}
