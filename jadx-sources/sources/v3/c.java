package v3;

import android.view.WindowInsets;
import java.util.HashMap;
import t4.l0;
import t4.m1;
import v2.f0;
import v2.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f17814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f17815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w wVar, f0 f0Var, int i10) {
        super(1);
        this.f17813a = i10;
        this.f17814b = wVar;
        this.f17815c = f0Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsC;
        switch (this.f17813a) {
            case 0:
                r1 r1Var = (r1) obj;
                w2.t tVar = r1Var instanceof w2.t ? (w2.t) r1Var : null;
                w wVar = this.f17814b;
                if (tVar != null) {
                    HashMap<h, f0> holderToLayoutNode = tVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    f0 f0Var = this.f17815c;
                    holderToLayoutNode.put(wVar, f0Var);
                    tVar.getAndroidViewsHandler$ui().addView(wVar);
                    tVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(f0Var, wVar);
                    wVar.setImportantForAccessibility(1);
                    l0.l(wVar, new w2.m(tVar, f0Var, tVar));
                }
                if (wVar.getView().getParent() != wVar) {
                    wVar.addView(wVar.getView());
                }
                break;
            case 1:
                j.d(this.f17814b, this.f17815c);
                break;
            default:
                f0 f0Var2 = this.f17815c;
                w wVar2 = this.f17814b;
                j.d(wVar2, f0Var2);
                ((w2.t) wVar2.f17830c).f18391d0 = true;
                int[] iArr = wVar2.G;
                int i10 = iArr[0];
                int i11 = iArr[1];
                wVar2.getView().getLocationOnScreen(iArr);
                long j = wVar2.H;
                long jI = ((t2.w) obj).I();
                wVar2.H = jI;
                m1 m1Var = wVar2.I;
                if (m1Var != null && ((i10 != iArr[0] || i11 != iArr[1] || !s3.l.b(j, jI)) && (windowInsetsC = wVar2.m(m1Var).c()) != null)) {
                    wVar2.getView().dispatchApplyWindowInsets(windowInsetsC);
                }
                break;
        }
        return pi.o.f13011a;
    }
}
