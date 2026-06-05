package wa;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.anonlab.voidlauncher.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19104a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19105b;

    public i(Context context) {
        fj.l.f(context, "context");
        this.f19104a = context;
        u6.v.Q(new q0.k(this, 20));
        this.f19105b = new LinkedHashMap();
    }

    public static void a(i iVar, View view, View view2, float f10, float f11, long j) {
        iVar.getClass();
        b(view).f19090e = f11;
        e(view, view2);
        view.animate().cancel();
        float f12 = f10 * f11;
        ViewPropertyAnimator interpolator = view.animate().scaleX(f12).scaleY(f12).setDuration(j).setInterpolator(j.f19110a);
        fj.l.e(interpolator, "setInterpolator(...)");
        interpolator.start();
    }

    public static h b(View view) {
        Object tag = view.getTag();
        h hVar = tag instanceof h ? (h) tag : null;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f19090e = 1.0f;
        hVar2.f19091f = -1;
        hVar2.f19092g = -1;
        view.setTag(hVar2);
        return hVar2;
    }

    public static View c(r0 r0Var, String str) {
        int childCount = r0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = r0Var.getChildAt(i10);
            DecelerateInterpolator decelerateInterpolator = j.f19110a;
            if (fj.l.b(childAt.getTag(R.id.app_icon_image), str)) {
                return childAt;
            }
        }
        return null;
    }

    public static float d(MotionEvent motionEvent, View view, int i10) {
        view.getLocationOnScreen(new int[2]);
        return motionEvent.getX(i10) + r0[0];
    }

    public static void e(View view, View view2) {
        if (view2.getWidth() <= 0 || view2.getHeight() <= 0) {
            return;
        }
        Rect rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view2, rect);
        }
        view.setPivotX(rect.exactCenterX());
        view.setPivotY(rect.exactCenterY());
    }
}
