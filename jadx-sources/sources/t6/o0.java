package t6;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f15980a;

    /* renamed from: b, reason: collision with root package name */
    public int f15981b;

    /* renamed from: c, reason: collision with root package name */
    public int f15982c;

    /* renamed from: d, reason: collision with root package name */
    public int f15983d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f15984e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15985f;

    /* renamed from: g, reason: collision with root package name */
    public int f15986g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f15983d;
        if (i10 >= 0) {
            this.f15983d = -1;
            recyclerView.L(i10);
            this.f15985f = false;
            return;
        }
        if (!this.f15985f) {
            this.f15986g = 0;
            return;
        }
        Interpolator interpolator = this.f15984e;
        if (interpolator != null && this.f15982c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.f15982c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1198t0.b(this.f15980a, this.f15981b, i11, interpolator);
        int i12 = this.f15986g + 1;
        this.f15986g = i12;
        if (i12 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f15985f = false;
    }
}
