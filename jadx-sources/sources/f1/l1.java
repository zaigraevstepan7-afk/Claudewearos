package f1;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final r f6373a;

    /* renamed from: b, reason: collision with root package name */
    public final p f6374b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f6375c;

    /* renamed from: d, reason: collision with root package name */
    public final ej.e f6376d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6377e;

    /* renamed from: f, reason: collision with root package name */
    public final v2.f2 f6378f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6379g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f6380h = new AtomicReference(m1.f6389c);

    /* renamed from: i, reason: collision with root package name */
    public long f6381i = p1.j.b();
    public q.h0 j;

    /* renamed from: k, reason: collision with root package name */
    public final p1.k f6382k;

    /* renamed from: l, reason: collision with root package name */
    public final b2 f6383l;

    public l1(r rVar, p pVar, i0 i0Var, q.j0 j0Var, ej.e eVar, boolean z2, v2.f2 f2Var, Object obj) {
        this.f6373a = rVar;
        this.f6374b = pVar;
        this.f6375c = i0Var;
        this.f6376d = eVar;
        this.f6377e = z2;
        this.f6378f = f2Var;
        this.f6379g = obj;
        q.h0 h0Var = q.o0.f13110a;
        fj.l.d(h0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.j = h0Var;
        p1.k kVar = new p1.k();
        kVar.g(j0Var, i0Var.D());
        this.f6382k = kVar;
        this.f6383l = new b2(f2Var.f17643c);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.f6380h;
        try {
            switch (((m1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    m1 m1Var = m1.f6392f;
                    m1 m1Var2 = m1.f6393z;
                    while (!atomicReference.compareAndSet(m1Var, m1Var2)) {
                        if (atomicReference.get() != m1Var) {
                            o1.b("Unexpected state change from: " + m1Var + " to: " + m1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new b3.e();
            }
        } catch (Exception e10) {
            atomicReference.set(m1.f6387a);
            throw e10;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f6379g) {
                try {
                    this.f6383l.a(this.f6378f, this.f6382k);
                    this.f6382k.c();
                    this.f6382k.d();
                } finally {
                    this.f6382k.b();
                    this.f6373a.J = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((m1) this.f6380h.get()).compareTo(m1.f6392f) >= 0;
    }

    public final void d() {
        boolean z2;
        m1 m1Var = m1.f6390d;
        m1 m1Var2 = m1.f6392f;
        while (true) {
            AtomicReference atomicReference = this.f6380h;
            if (atomicReference.compareAndSet(m1Var, m1Var2)) {
                z2 = true;
                break;
            } else if (atomicReference.get() != m1Var) {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return;
        }
        o1.b("Unexpected state change from: " + m1Var + " to: " + m1Var2 + '.');
    }

    public final boolean e(h2 h2Var) throws Exception {
        AtomicReference atomicReference = this.f6380h;
        try {
            int iOrdinal = ((m1) atomicReference.get()).ordinal();
            r rVar = this.f6373a;
            p pVar = this.f6374b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    i0 i0Var = this.f6375c;
                    boolean z2 = this.f6377e;
                    if (z2) {
                        i0Var.f6337z = 0;
                        i0Var.f6336y = true;
                    }
                    try {
                        this.j = pVar.b(rVar, h2Var, this.f6376d);
                        m1 m1Var = m1.f6389c;
                        m1 m1Var2 = m1.f6390d;
                        while (true) {
                            if (!atomicReference.compareAndSet(m1Var, m1Var2)) {
                                if (atomicReference.get() != m1Var) {
                                    o1.b("Unexpected state change from: " + m1Var + " to: " + m1Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z2) {
                            i0Var.v();
                        }
                    }
                case 3:
                    m1 m1Var3 = m1.f6390d;
                    m1 m1Var4 = m1.f6391e;
                    while (true) {
                        if (!atomicReference.compareAndSet(m1Var3, m1Var4)) {
                            if (atomicReference.get() != m1Var3) {
                                o1.b("Unexpected state change from: " + m1Var3 + " to: " + m1Var4 + '.');
                            }
                        }
                    }
                    long j = this.f6381i;
                    try {
                        this.f6381i = p1.j.b();
                        this.j = pVar.n(rVar, h2Var, this.j);
                        this.f6381i = j;
                        m1 m1Var5 = m1.f6391e;
                        m1 m1Var6 = m1.f6390d;
                        while (true) {
                            if (!atomicReference.compareAndSet(m1Var5, m1Var6)) {
                                if (atomicReference.get() != m1Var5) {
                                    o1.b("Unexpected state change from: " + m1Var5 + " to: " + m1Var6 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.f6381i = j;
                        m1 m1Var7 = m1.f6391e;
                        m1 m1Var8 = m1.f6390d;
                        while (true) {
                            if (!atomicReference.compareAndSet(m1Var7, m1Var8)) {
                                if (atomicReference.get() != m1Var7) {
                                    o1.b("Unexpected state change from: " + m1Var7 + " to: " + m1Var8 + '.');
                                }
                            }
                        }
                        throw th2;
                    }
                case 4:
                    n.b("Recursive call to resume()");
                    throw new b3.e();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new b3.e();
            }
        } catch (Exception e10) {
            atomicReference.set(m1.f6387a);
            throw e10;
        }
    }
}
