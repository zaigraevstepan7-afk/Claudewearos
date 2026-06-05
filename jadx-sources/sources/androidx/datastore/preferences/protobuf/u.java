package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final w f1023a;

    /* renamed from: b, reason: collision with root package name */
    public w f1024b;

    public u(w wVar) {
        this.f1023a = wVar;
        if (wVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1024b = wVar.i();
    }

    public final w a() {
        w wVarB = b();
        wVarB.getClass();
        if (w.f(wVarB, true)) {
            return wVarB;
        }
        throw new d1();
    }

    public final w b() {
        if (!this.f1024b.g()) {
            return this.f1024b;
        }
        w wVar = this.f1024b;
        wVar.getClass();
        u0 u0Var = u0.f1025c;
        u0Var.getClass();
        u0Var.a(wVar.getClass()).b(wVar);
        wVar.h();
        return this.f1024b;
    }

    public final void c() {
        if (this.f1024b.g()) {
            return;
        }
        w wVarI = this.f1023a.i();
        w wVar = this.f1024b;
        u0 u0Var = u0.f1025c;
        u0Var.getClass();
        u0Var.a(wVarI.getClass()).a(wVarI, wVar);
        this.f1024b = wVarI;
    }

    public final Object clone() {
        u uVar = (u) this.f1023a.c(5);
        uVar.f1024b = b();
        return uVar;
    }
}
