package l7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends p {
    public static final String[] V = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b W = new b(PointF.class, "topLeft", 0);
    public static final b X = new b(PointF.class, "bottomRight", 1);
    public static final b Y = new b(PointF.class, "bottomRight", 2);
    public static final b Z = new b(PointF.class, "topLeft", 3);

    /* renamed from: a0, reason: collision with root package name */
    public static final b f10042a0 = new b(PointF.class, "position", 4);

    public static void L(w wVar) {
        View view = wVar.f10080b;
        HashMap map = wVar.f10079a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // l7.p
    public final void d(w wVar) {
        L(wVar);
    }

    @Override // l7.p
    public final void g(w wVar) {
        L(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l7.p
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        int i10;
        f fVar;
        ObjectAnimator objectAnimatorOfObject;
        if (wVar != null) {
            HashMap map = wVar.f10079a;
            if (wVar2 != null) {
                HashMap map2 = wVar2.f10079a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = wVar2.f10080b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i11 = rect.left;
                    int i12 = rect2.left;
                    int i13 = rect.top;
                    int i14 = rect2.top;
                    int i15 = rect.right;
                    int i16 = rect2.right;
                    int i17 = rect.bottom;
                    int i18 = rect2.bottom;
                    int i19 = i15 - i11;
                    int i20 = i17 - i13;
                    int i21 = i16 - i12;
                    int i22 = i18 - i14;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
                        i10 = 0;
                    } else {
                        i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
                        if (i15 != i16 || i17 != i18) {
                            i10++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i10++;
                    }
                    int i23 = i10;
                    if (i23 > 0) {
                        x.a(view, i11, i13, i15, i17);
                        if (i23 != 2) {
                            fVar = this;
                            if (i11 == i12 && i13 == i14) {
                                fVar.O.getClass();
                                objectAnimatorOfObject = ObjectAnimator.ofObject(view, Y, (TypeConverter) null, ef.f.g(i15, i17, i16, i18));
                            } else {
                                fVar.O.getClass();
                                objectAnimatorOfObject = ObjectAnimator.ofObject(view, Z, (TypeConverter) null, ef.f.g(i11, i13, i12, i14));
                            }
                        } else if (i19 == i21 && i20 == i22) {
                            fVar = this;
                            fVar.O.getClass();
                            objectAnimatorOfObject = ObjectAnimator.ofObject(view, f10042a0, (TypeConverter) null, ef.f.g(i11, i13, i12, i14));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.O.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, W, (TypeConverter) null, ef.f.g(i11, i13, i12, i14));
                            fVar.O.getClass();
                            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(eVar, X, (TypeConverter) null, ef.f.g(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                            animatorSet.addListener(new c(eVar));
                            objectAnimatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            cg.b.P(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return objectAnimatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // l7.p
    public final String[] q() {
        return V;
    }
}
