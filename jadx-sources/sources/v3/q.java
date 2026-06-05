package v3;

import a2.e0;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(1);
        this.f17857a = i10;
        this.f17858b = rVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f17857a) {
            case 0:
                a2.a aVar = (a2.a) obj;
                r rVar = this.f17858b;
                View viewC = j.c(rVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    a2.m focusOwner = ((w2.t) v2.n.z(rVar)).getFocusOwner();
                    View viewA = v2.n.A(rVar);
                    Integer numC = a2.h.c(aVar.f4a);
                    int[] iArr = new int[2];
                    viewA.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewC.getLocationOnScreen(iArr2);
                    e0 e0VarF = a2.d.f(((a2.q) focusOwner).f46c);
                    Rect rect = null;
                    b2.c cVarI = e0VarF != null ? a2.d.i(e0VarF) : null;
                    if (cVarI != null) {
                        int i10 = (int) cVarI.f1502a;
                        int i11 = iArr[0];
                        int i12 = iArr2[0];
                        int i13 = (int) cVarI.f1503b;
                        int i14 = iArr[1];
                        int i15 = iArr2[1];
                        rect = new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) cVarI.f1504c) + i11) - i12, (((int) cVarI.f1505d) + i14) - i15);
                    }
                    if (!a2.h.b(viewC, numC, rect)) {
                        aVar.f5b = true;
                    }
                }
                break;
            default:
                j.c(this.f17858b);
                break;
        }
        return pi.o.f13011a;
    }
}
