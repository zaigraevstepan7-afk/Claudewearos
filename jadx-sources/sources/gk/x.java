package gk;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long f7530a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f7531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7532c;

    /* renamed from: d, reason: collision with root package name */
    public final q f7533d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f7534e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7535f;

    /* renamed from: g, reason: collision with root package name */
    public final v f7536g;

    /* renamed from: h, reason: collision with root package name */
    public final u f7537h;

    /* renamed from: i, reason: collision with root package name */
    public final w f7538i;
    public final w j;

    /* renamed from: k, reason: collision with root package name */
    public int f7539k;

    /* renamed from: l, reason: collision with root package name */
    public IOException f7540l;

    public x(int i10, q qVar, boolean z2, boolean z10, ak.l lVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f7534e = arrayDeque;
        this.f7538i = new w(this);
        this.j = new w(this);
        if (qVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f7532c = i10;
        this.f7533d = qVar;
        this.f7531b = qVar.K.a();
        v vVar = new v(this, qVar.J.a());
        this.f7536g = vVar;
        u uVar = new u(this);
        this.f7537h = uVar;
        vVar.f7527e = z10;
        uVar.f7521c = z2;
        if (lVar != null) {
            arrayDeque.add(lVar);
        }
        if (g() && lVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!g() && lVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            gk.v r0 = r2.f7536g     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f7527e     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1a
            boolean r0 = r0.f7526d     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            gk.u r0 = r2.f7537h     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f7521c     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            boolean r0 = r0.f7520b     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            goto L18
        L16:
            r0 = move-exception
            goto L32
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L28
            r0 = 6
            r1 = 0
            r2.c(r1, r0)
            return
        L28:
            if (r1 != 0) goto L31
            gk.q r0 = r2.f7533d
            int r1 = r2.f7532c
            r0.n(r1)
        L31:
            return
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.x.a():void");
    }

    public final void b() throws IOException {
        u uVar = this.f7537h;
        if (uVar.f7520b) {
            throw new IOException("stream closed");
        }
        if (uVar.f7521c) {
            throw new IOException("stream finished");
        }
        if (this.f7539k != 0) {
            IOException iOException = this.f7540l;
            if (iOException == null) {
                throw new b0(this.f7539k);
            }
        }
    }

    public final void c(IOException iOException, int i10) {
        if (d(iOException, i10)) {
            this.f7533d.M.t(this.f7532c, i10);
        }
    }

    public final boolean d(IOException iOException, int i10) {
        synchronized (this) {
            try {
                if (this.f7539k != 0) {
                    return false;
                }
                if (this.f7536g.f7527e && this.f7537h.f7521c) {
                    return false;
                }
                this.f7539k = i10;
                this.f7540l = iOException;
                notifyAll();
                this.f7533d.n(this.f7532c);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(int i10) {
        if (d(null, i10)) {
            this.f7533d.D(this.f7532c, i10);
        }
    }

    public final u f() {
        synchronized (this) {
            try {
                if (!this.f7535f && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f7537h;
    }

    public final boolean g() {
        return this.f7533d.f7493a == ((this.f7532c & 1) == 1);
    }

    public final synchronized boolean h() {
        try {
            if (this.f7539k != 0) {
                return false;
            }
            v vVar = this.f7536g;
            if (vVar.f7527e || vVar.f7526d) {
                u uVar = this.f7537h;
                if (uVar.f7521c || uVar.f7520b) {
                    if (this.f7535f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(ak.l lVar, boolean z2) {
        boolean zH;
        synchronized (this) {
            try {
                if (this.f7535f && z2) {
                    this.f7536g.getClass();
                } else {
                    this.f7535f = true;
                    this.f7534e.add(lVar);
                }
                if (z2) {
                    this.f7536g.f7527e = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f7533d.n(this.f7532c);
    }
}
