package t4;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f15763a;

    public p(NestedScrollView nestedScrollView) {
        this.f15763a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // t4.q
    public final void c(boolean z2, int i10, int i11, int i12) {
        this.f15763a.onScrollLimit(i10, i11, i12, z2);
    }

    @Override // t4.q
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f15763a.onScrollProgress(i10, i11, i12, i13);
    }
}
