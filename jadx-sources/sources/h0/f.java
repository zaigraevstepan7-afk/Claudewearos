package h0;

import a2.d0;
import c1.k3;
import c1.l3;
import c1.x5;
import fj.j;
import fj.k;
import pi.o;
import qj.b0;
import qj.z;
import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f extends j implements ej.a {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ ej.a D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x5 x5Var, ej.a aVar, z zVar) {
        super(0, k.class, "requestDismiss", "MonarchSheet_yWMTdJE$requestDismiss(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V", 0);
        this.B = zVar;
        this.C = x5Var;
        this.D = aVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.A) {
            case 0:
                return h.q1((h) this.B, (i1) this.C, (d0) this.D);
            default:
                z zVar = (z) this.B;
                x5 x5Var = (x5) this.C;
                b0.w(zVar, null, new l3(x5Var, null, 8), 3).T(new k3(x5Var, this.D, 2));
                return o.f13011a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, i1 i1Var, d0 d0Var) {
        super(0, k.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.B = hVar;
        this.C = i1Var;
        this.D = d0Var;
    }
}
