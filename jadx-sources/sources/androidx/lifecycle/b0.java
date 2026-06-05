package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f1064k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1065a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o.f f1066b = new o.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1067c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1068d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1069e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1070f;

    /* renamed from: g, reason: collision with root package name */
    public int f1071g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1072h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1073i;
    public final ah.d j;

    public b0() {
        Object obj = f1064k;
        this.f1070f = obj;
        this.j = new ah.d(this, 3);
        this.f1069e = obj;
        this.f1071g = -1;
    }

    public static void a(String str) {
        n.b.p0().f11835b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(m1.j("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(a0 a0Var) {
        if (a0Var.f1058b) {
            if (!a0Var.f()) {
                a0Var.a(false);
                return;
            }
            int i10 = a0Var.f1059c;
            int i11 = this.f1071g;
            if (i10 >= i11) {
                return;
            }
            a0Var.f1059c = i11;
            a0Var.f1057a.t(this.f1069e);
        }
    }

    public final void c(a0 a0Var) {
        if (this.f1072h) {
            this.f1073i = true;
            return;
        }
        this.f1072h = true;
        do {
            this.f1073i = false;
            if (a0Var != null) {
                b(a0Var);
                a0Var = null;
            } else {
                o.f fVar = this.f1066b;
                fVar.getClass();
                o.d dVar = new o.d(fVar);
                fVar.f12364c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((a0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1073i) {
                        break;
                    }
                }
            }
        } while (this.f1073i);
        this.f1072h = false;
    }

    public final void d(t tVar, c0 c0Var) {
        Object obj;
        a("observe");
        if (tVar.h().f1141c == o.f1111a) {
            return;
        }
        z zVar = new z(this, tVar, c0Var);
        o.f fVar = this.f1066b;
        o.c cVarB = fVar.b(c0Var);
        if (cVarB != null) {
            obj = cVarB.f12356b;
        } else {
            o.c cVar = new o.c(c0Var, zVar);
            fVar.f12365d++;
            o.c cVar2 = fVar.f12363b;
            if (cVar2 == null) {
                fVar.f12362a = cVar;
                fVar.f12363b = cVar;
            } else {
                cVar2.f12357c = cVar;
                cVar.f12358d = cVar2;
                fVar.f12363b = cVar;
            }
            obj = null;
        }
        a0 a0Var = (a0) obj;
        if (a0Var != null && !a0Var.d(tVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a0Var != null) {
            return;
        }
        tVar.h().a(zVar);
    }

    public final void g(Object obj) {
        boolean z2;
        synchronized (this.f1065a) {
            z2 = this.f1070f == f1064k;
            this.f1070f = obj;
        }
        if (z2) {
            n.b bVarP0 = n.b.p0();
            ah.d dVar = this.j;
            n.c cVar = bVarP0.f11835b;
            if (cVar.f11838d == null) {
                synchronized (cVar.f11836b) {
                    try {
                        if (cVar.f11838d == null) {
                            cVar.f11838d = n.c.p0(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            cVar.f11838d.post(dVar);
        }
    }

    public void h(c0 c0Var) {
        a("removeObserver");
        a0 a0Var = (a0) this.f1066b.e(c0Var);
        if (a0Var == null) {
            return;
        }
        a0Var.c();
        a0Var.a(false);
    }

    public void i(Object obj) {
        a("setValue");
        this.f1071g++;
        this.f1069e = obj;
        c(null);
    }

    public void e() {
    }

    public void f() {
    }
}
