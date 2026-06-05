package qj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class h1 extends vj.j implements o0, b1 {

    /* renamed from: d, reason: collision with root package name */
    public l1 f13581d;

    @Override // qj.o0
    public final void a() {
        l1 l1VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.f13598a;
            Object obj = atomicReferenceFieldUpdater.get(l1VarJ);
            if (obj instanceof h1) {
                if (obj != this) {
                    return;
                }
                q0 q0Var = b0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(l1VarJ, obj, q0Var)) {
                    if (atomicReferenceFieldUpdater.get(l1VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof b1) || ((b1) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vj.j.f18105a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof vj.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                fj.l.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                vj.j jVar = (vj.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = vj.j.f18107c;
                vj.o oVar = (vj.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new vj.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.f();
                return;
            }
        }
    }

    @Override // qj.b1
    public final boolean b() {
        return true;
    }

    @Override // qj.b1
    public final n1 c() {
        return null;
    }

    public e1 getParent() {
        return j();
    }

    public final l1 j() {
        l1 l1Var = this.f13581d;
        if (l1Var != null) {
            return l1Var;
        }
        fj.l.l("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th2);

    @Override // vj.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.n(this) + "[job@" + b0.n(j()) + ']';
    }
}
