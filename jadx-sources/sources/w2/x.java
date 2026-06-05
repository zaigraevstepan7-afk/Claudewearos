package w2;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f18452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i10) {
        super(1);
        this.f18451a = i10;
        this.f18452b = yVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f18451a) {
            case 0:
                y yVar = this.f18452b;
                return Boolean.valueOf(yVar.f18458d.getParent().requestSendAccessibilityEvent(yVar.f18458d, (AccessibilityEvent) obj));
            default:
                b2 b2Var = (b2) obj;
                if (b2Var.f18207b.contains(b2Var)) {
                    y yVar2 = this.f18452b;
                    v2.t1 snapshotObserver = yVar2.f18458d.getSnapshotObserver();
                    snapshotObserver.f17770a.c(b2Var, yVar2.f18463f0, new a2.d0(19, b2Var, yVar2));
                }
                return pi.o.f13011a;
        }
    }
}
