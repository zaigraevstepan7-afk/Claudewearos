package ff;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6738c;

    public /* synthetic */ c(int i10, int i11, Object obj) {
        this.f6736a = i11;
        this.f6738c = obj;
        this.f6737b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6736a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6738c;
                View view = (View) sideSheetBehavior.f3935p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f6737b, false);
                    break;
                }
                break;
            case 1:
                ((k4.b) this.f6738c).g(this.f6737b);
                break;
            default:
                ((IntConsumer) this.f6738c).accept(this.f6737b);
                break;
        }
    }
}
