package v1;

import a2.d0;
import qj.b0;
import qj.e1;
import qj.g1;
import qj.w;
import qj.z;
import v2.i1;
import v2.n1;
import w2.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n implements v2.j {
    public i1 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public d0 F;
    public boolean G;

    /* renamed from: b, reason: collision with root package name */
    public vj.d f17566b;

    /* renamed from: c, reason: collision with root package name */
    public int f17567c;

    /* renamed from: e, reason: collision with root package name */
    public n f17569e;

    /* renamed from: f, reason: collision with root package name */
    public n f17570f;

    /* renamed from: z, reason: collision with root package name */
    public n1 f17571z;

    /* renamed from: a, reason: collision with root package name */
    public n f17565a = this;

    /* renamed from: d, reason: collision with root package name */
    public int f17568d = -1;

    public final z e1() {
        vj.d dVar = this.f17566b;
        if (dVar != null) {
            return dVar;
        }
        vj.d dVarB = b0.b(((t) v2.n.z(this)).getCoroutineContext().V(new g1((e1) ((t) v2.n.z(this)).getCoroutineContext().C(w.f13632b))));
        this.f17566b = dVarB;
        return dVarB;
    }

    public boolean f1() {
        return !(this instanceof v.o);
    }

    public void g1() {
        if (this.G) {
            s2.a.b("node attached multiple times");
        }
        if (this.A == null) {
            s2.a.b("attach invoked on a node without a coordinator");
        }
        this.G = true;
        this.D = true;
    }

    public void h1() {
        if (!this.G) {
            s2.a.b("Cannot detach a node that is not attached");
        }
        if (this.D) {
            s2.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.E) {
            s2.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.G = false;
        vj.d dVar = this.f17566b;
        if (dVar != null) {
            b0.f(dVar, new p2.z("The Modifier.Node was detached", 2));
            this.f17566b = null;
        }
    }

    public void l1() {
        if (!this.G) {
            s2.a.b("reset() called on an unattached node");
        }
        k1();
    }

    public void m1() {
        if (!this.G) {
            s2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.D) {
            s2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.D = false;
        i1();
        this.E = true;
    }

    public void n1() {
        if (!this.G) {
            s2.a.b("node detached multiple times");
        }
        if (this.A == null) {
            s2.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.E) {
            s2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.E = false;
        d0 d0Var = this.F;
        if (d0Var != null) {
            d0Var.a();
        }
        j1();
    }

    public void o1(n nVar) {
        this.f17565a = nVar;
    }

    public void p1(i1 i1Var) {
        this.A = i1Var;
    }

    public void i1() {
    }

    public void j1() {
    }

    public void k1() {
    }
}
