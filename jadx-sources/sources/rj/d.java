package rj;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import k0.t1;
import qj.b0;
import qj.g0;
import qj.l;
import qj.m0;
import qj.o0;
import qj.p1;
import qj.v;
import qj.z1;
import t.m1;
import ti.h;
import vj.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends v implements g0 {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f14552c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14553d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14554e;

    /* renamed from: f, reason: collision with root package name */
    public final d f14555f;

    public d(Handler handler, String str, boolean z2) {
        this.f14552c = handler;
        this.f14553d = str;
        this.f14554e = z2;
        this.f14555f = z2 ? this : new d(handler, str, true);
    }

    @Override // qj.g0
    public final void Q(long j, l lVar) {
        ac.e eVar = new ac.e(18, lVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f14552c.postDelayed(eVar, j)) {
            lVar.s(new t1(14, this, eVar));
        } else {
            i0(lVar.f13597e, eVar);
        }
    }

    @Override // qj.g0
    public final o0 Z(long j, final z1 z1Var, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f14552c.postDelayed(z1Var, j)) {
            return new o0() { // from class: rj.c
                @Override // qj.o0
                public final void a() {
                    this.f14550a.f14552c.removeCallbacks(z1Var);
                }
            };
        }
        i0(hVar, z1Var);
        return p1.f13611a;
    }

    @Override // qj.v
    public final void e0(h hVar, Runnable runnable) {
        if (this.f14552c.post(runnable)) {
            return;
        }
        i0(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f14552c == this.f14552c && dVar.f14554e == this.f14554e;
    }

    @Override // qj.v
    public final boolean g0(h hVar) {
        return (this.f14554e && fj.l.b(Looper.myLooper(), this.f14552c.getLooper())) ? false : true;
    }

    @Override // qj.v
    public v h0(int i10) {
        vj.b.a(i10);
        return this;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f14552c) ^ (this.f14554e ? 1231 : 1237);
    }

    public final void i0(h hVar, Runnable runnable) {
        b0.g(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        xj.e eVar = m0.f13601a;
        xj.d.f20094c.e0(hVar, runnable);
    }

    @Override // qj.v
    public final String toString() {
        d dVar;
        String str;
        xj.e eVar = m0.f13601a;
        d dVar2 = n.f18117a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f14555f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f14553d;
        if (string == null) {
            string = this.f14552c.toString();
        }
        return this.f14554e ? m1.v(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
