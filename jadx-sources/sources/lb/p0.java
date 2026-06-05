package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 extends fj.j implements ej.c {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t.c cVar, int i10) {
        super(1, fj.k.class, "requestCriticalBounce", "MonarchSheet_yWMTdJE$requestCriticalBounce(Landroidx/compose/animation/core/Animatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = cVar;
                super(1, fj.k.class, "requestCriticalBounce", "MonarchSheet_yWMTdJE$requestCriticalBounce(Landroidx/compose/animation/core/Animatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                break;
            default:
                this.B = cVar;
                break;
        }
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return c.f((t.c) this.B, (ti.c) obj);
            case 1:
                return c.f((t.c) this.B, (ti.c) obj);
            default:
                float[] fArr = ((c2.k0) obj).f3015a;
                t2.w wVar = (t2.w) ((t0.l) this.B).K.getValue();
                if (wVar != null) {
                    if (!wVar.E()) {
                        wVar = null;
                    }
                    if (wVar != null) {
                        wVar.G(fArr);
                    }
                }
                return pi.o.f13011a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t0.l lVar) {
        super(1, fj.k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.A = 2;
        this.B = lVar;
    }
}
