package qj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class g1 extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e1 e1Var) {
        super(true);
        boolean z2 = true;
        K(e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.f13599b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z2 = false;
            break;
        }
        l1 l1VarJ = pVar.j();
        while (!l1VarJ.E()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(l1VarJ);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z2 = false;
                break;
            }
            l1VarJ = pVar2.j();
        }
        this.f13578c = z2;
    }

    @Override // qj.l1
    public final boolean E() {
        return this.f13578c;
    }

    @Override // qj.l1
    public final boolean G() {
        return true;
    }
}
