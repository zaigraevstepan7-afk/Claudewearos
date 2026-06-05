package wa;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final DecelerateInterpolator f19110a = new DecelerateInterpolator(1.8f);

    public static final Rect a(View view, View view2) {
        Rect rectB = b(view);
        Rect rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view2, rect);
        }
        int i10 = rectB.left;
        int i11 = rect.left + i10;
        int i12 = rectB.top;
        return new Rect(i11, rect.top + i12, i10 + rect.right, i12 + rect.bottom);
    }

    public static final Rect b(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            return new Rect(view.getLeft() + iArr[0], view.getTop() + iArr[1], view.getRight() + iArr[0], view.getBottom() + iArr[1]);
        }
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        int i10 = iArr2[0];
        return new Rect(i10, iArr2[1], view.getWidth() + i10, view.getHeight() + iArr2[1]);
    }
}
