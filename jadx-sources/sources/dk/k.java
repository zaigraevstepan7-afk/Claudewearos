package dk;

import ak.r;
import ak.u;
import ak.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final r f5201a;

    /* renamed from: b, reason: collision with root package name */
    public final f f5202b;

    /* renamed from: c, reason: collision with root package name */
    public final u f5203c;

    /* renamed from: d, reason: collision with root package name */
    public final ak.j f5204d;

    /* renamed from: e, reason: collision with root package name */
    public final i f5205e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5206f;

    /* renamed from: g, reason: collision with root package name */
    public w f5207g;

    /* renamed from: h, reason: collision with root package name */
    public d f5208h;

    /* renamed from: i, reason: collision with root package name */
    public e f5209i;
    public s j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5210k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5211l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5212m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5213n;

    public k(r rVar, u uVar) {
        i iVar = new i(this);
        this.f5205e = iVar;
        this.f5201a = rVar;
        ak.j jVar = ak.j.f658c;
        p7.k kVar = rVar.I;
        jVar.getClass();
        this.f5202b = (f) kVar.f12813b;
        this.f5203c = uVar;
        rVar.f714f.getClass();
        this.f5204d = ak.j.f657b;
        long j = rVar.N;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.g(j);
    }

    public final void a() {
        s sVar;
        e eVar;
        synchronized (this.f5202b) {
            try {
                this.f5212m = true;
                sVar = this.j;
                d dVar = this.f5208h;
                if (dVar == null || (eVar = dVar.f5165g) == null) {
                    eVar = this.f5209i;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sVar != null) {
            ((ek.b) sVar.f19382d).cancel();
        } else if (eVar != null) {
            bk.d.d(eVar.f5170d);
        }
    }

    public final void b() {
        synchronized (this.f5202b) {
            try {
                if (this.f5213n) {
                    throw new IllegalStateException();
                }
                this.j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final IOException c(s sVar, boolean z2, boolean z10, IOException iOException) {
        boolean z11;
        synchronized (this.f5202b) {
            try {
                s sVar2 = this.j;
                if (sVar != sVar2) {
                    return iOException;
                }
                boolean z12 = true;
                if (z2) {
                    z11 = !this.f5210k;
                    this.f5210k = true;
                } else {
                    z11 = false;
                }
                if (z10) {
                    if (!this.f5211l) {
                        z11 = true;
                    }
                    this.f5211l = true;
                }
                if (this.f5210k && this.f5211l && z11) {
                    ((ek.b) sVar2.f19382d).f().f5178m++;
                    this.j = null;
                } else {
                    z12 = false;
                }
                return z12 ? e(iOException, false) : iOException;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        boolean z2;
        synchronized (this.f5202b) {
            z2 = this.f5212m;
        }
        return z2;
    }

    public final IOException e(IOException iOException, boolean z2) {
        e eVar;
        Socket socketG;
        boolean z10;
        synchronized (this.f5202b) {
            if (z2) {
                try {
                    if (this.j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            eVar = this.f5209i;
            socketG = (eVar != null && this.j == null && (z2 || this.f5213n)) ? g() : null;
            if (this.f5209i != null) {
                eVar = null;
            }
            z10 = this.f5213n && this.j == null;
        }
        bk.d.d(socketG);
        if (eVar != null) {
            this.f5204d.getClass();
        }
        if (z10) {
            boolean z11 = iOException != null;
            if (this.f5205e.i()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            if (z11) {
                this.f5204d.getClass();
                return iOException;
            }
            this.f5204d.getClass();
        }
        return iOException;
    }

    public final IOException f(IOException iOException) {
        synchronized (this.f5202b) {
            this.f5213n = true;
        }
        return e(iOException, false);
    }

    public final Socket g() {
        int size = this.f5209i.f5181p.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            if (((Reference) this.f5209i.f5181p.get(i10)).get() == this) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f5209i;
        eVar.f5181p.remove(i10);
        this.f5209i = null;
        if (!eVar.f5181p.isEmpty()) {
            return null;
        }
        eVar.f5182q = System.nanoTime();
        f fVar = this.f5202b;
        fVar.getClass();
        if (eVar.f5176k || fVar.f5184a == 0) {
            fVar.f5187d.remove(eVar);
            return eVar.f5171e;
        }
        fVar.notifyAll();
        return null;
    }
}
