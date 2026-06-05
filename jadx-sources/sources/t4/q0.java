package t4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.anonlab.voidlauncher.R;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f15766e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final a6.a f15767f = new a6.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f15768g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f15769h = new AccelerateInterpolator(1.5f);

    public static void f(View view, v0 v0Var) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            jVarK.k(v0Var);
            if (jVarK.f948a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), v0Var);
            }
        }
    }

    public static void g(View view, v0 v0Var, m1 m1Var, boolean z2) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            jVarK.f949b = m1Var;
            if (!z2) {
                jVarK.l(v0Var);
                z2 = jVarK.f948a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), v0Var, m1Var, z2);
            }
        }
    }

    public static void h(View view, m1 m1Var, List list) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            m1Var = jVarK.m(m1Var, list);
            if (jVarK.f948a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), m1Var, list);
            }
        }
    }

    public static void i(View view, v0 v0Var, q5.b bVar) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            jVarK.n(v0Var, bVar);
            if (jVarK.f948a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                i(viewGroup.getChildAt(i10), v0Var, bVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static androidx.datastore.preferences.protobuf.j k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof p0) {
            return ((p0) tag).f15764a;
        }
        return null;
    }
}
