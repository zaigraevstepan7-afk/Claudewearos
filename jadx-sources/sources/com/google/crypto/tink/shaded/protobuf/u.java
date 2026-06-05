package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class u implements q0, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final w f4242a;

    /* renamed from: b, reason: collision with root package name */
    public w f4243b;

    public u(w wVar) {
        this.f4242a = wVar;
        if (wVar.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4243b = wVar.q();
    }

    public static void f(Object obj, Object obj2) {
        y0 y0Var = y0.f4246c;
        y0Var.getClass();
        y0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final w b() {
        w wVarC = c();
        wVarC.getClass();
        if (w.m(wVarC, true)) {
            return wVarC;
        }
        throw new d1();
    }

    public final w c() {
        if (!this.f4243b.n()) {
            return this.f4243b;
        }
        w wVar = this.f4243b;
        wVar.getClass();
        y0 y0Var = y0.f4246c;
        y0Var.getClass();
        y0Var.a(wVar.getClass()).b(wVar);
        wVar.o();
        return this.f4243b;
    }

    public final u d() {
        u uVarP = this.f4242a.d();
        uVarP.f4243b = c();
        return uVarP;
    }

    public final void e() {
        if (this.f4243b.n()) {
            return;
        }
        w wVarQ = this.f4242a.q();
        f(wVarQ, this.f4243b);
        this.f4243b = wVarQ;
    }
}
