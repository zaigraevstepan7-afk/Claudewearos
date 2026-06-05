package v3;

import android.os.Parcelable;
import android.util.SparseArray;
import v2.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f17827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(w wVar, int i10) {
        super(0);
        this.f17826a = i10;
        this.f17827b = wVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f17826a) {
            case 0:
                this.f17827b.getLayoutNode().B();
                break;
            case 1:
                w wVar = this.f17827b;
                if (wVar.f17832e && wVar.isAttachedToWindow() && wVar.getView().getParent() == wVar) {
                    t1 snapshotObserver = wVar.getSnapshotObserver();
                    snapshotObserver.f17770a.c(wVar, b.f17808b, wVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f17827b.T.saveHierarchyState(sparseArray);
                break;
            case 3:
                w wVar2 = this.f17827b;
                wVar2.getReleaseBlock().invoke(wVar2.T);
                w.n(wVar2);
                break;
            case 4:
                w wVar3 = this.f17827b;
                wVar3.getResetBlock().invoke(wVar3.T);
                break;
            default:
                w wVar4 = this.f17827b;
                wVar4.getUpdateBlock().invoke(wVar4.T);
                break;
        }
        return pi.o.f13011a;
    }
}
