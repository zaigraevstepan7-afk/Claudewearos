package t4;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f15770a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f15770a = new p(nestedScrollView);
        } else {
            this.f15770a = new p9.a(12);
        }
    }
}
