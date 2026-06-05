package w2;

import android.view.View;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final q.g0 f18375a;

    static {
        long[] jArr = q.n0.f13108a;
        f18375a = new q.g0();
    }

    public static final f1.p a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof f1.p) {
            return (f1.p) tag;
        }
        return null;
    }
}
