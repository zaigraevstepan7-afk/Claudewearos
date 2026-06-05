package t6;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((m0) ((Observable) this).mObservers.get(size)).f15967a;
            recyclerView.h(null);
            recyclerView.w0.f16001f = true;
            recyclerView.S(true);
            if (!recyclerView.f1179d.v()) {
                recyclerView.requestLayout();
            }
        }
    }
}
