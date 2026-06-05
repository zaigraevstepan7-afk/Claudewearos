package sa;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends t6.h0 {
    @Override // t6.h0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        x xVar = recyclerView instanceof x ? (x) recyclerView : null;
        if (xVar == null || xVar.X0 == zCanScrollVertically) {
            return;
        }
        xVar.X0 = zCanScrollVertically;
        ValueAnimator valueAnimator = xVar.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(xVar.W0, zCanScrollVertically ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(180L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new hf.h(xVar, 1));
        valueAnimatorOfFloat.start();
        xVar.V0 = valueAnimatorOfFloat;
    }
}
