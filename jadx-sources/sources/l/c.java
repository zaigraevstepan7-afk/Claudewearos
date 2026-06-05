package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import m.k1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f9759b;

    public /* synthetic */ c(j jVar, int i10) {
        this.f9758a = i10;
        this.f9759b = jVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f9758a) {
            case 0:
                e eVar = (e) this.f9759b;
                ArrayList arrayList = eVar.A;
                if (eVar.d() && arrayList.size() > 0) {
                    int i10 = 0;
                    if (!((d) arrayList.get(0)).f9760a.N) {
                        View view = eVar.H;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                ((d) obj).f9760a.e();
                            }
                            break;
                        } else {
                            eVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                q qVar = (q) this.f9759b;
                k1 k1Var = qVar.A;
                if (qVar.d() && !k1Var.N) {
                    View view2 = qVar.F;
                    if (view2 != null && view2.isShown()) {
                        k1Var.e();
                        break;
                    } else {
                        qVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
