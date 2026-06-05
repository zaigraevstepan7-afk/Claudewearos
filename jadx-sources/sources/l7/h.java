package l7;

import android.animation.ObjectAnimator;
import android.view.View;
import com.anonlab.voidlauncher.R;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends p {
    public static final String[] W = {"android:visibility:visibility", "android:visibility:parent"};
    public final int V;

    public h(int i10) {
        this();
        this.V = i10;
    }

    public static void L(w wVar) {
        View view = wVar.f10080b;
        int visibility = view.getVisibility();
        HashMap map = wVar.f10079a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float N(w wVar, float f10) {
        Float f11;
        return (wVar == null || (f11 = (Float) wVar.f10079a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l7.d0 O(l7.w r8, l7.w r9) {
        /*
            l7.d0 r0 = new l7.d0
            r0.<init>()
            r1 = 0
            r0.f10029a = r1
            r0.f10030b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f10079a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f10031c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f10033e = r6
            goto L33
        L2f:
            r0.f10031c = r3
            r0.f10033e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f10079a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f10032d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f10034f = r2
            goto L56
        L52:
            r0.f10032d = r3
            r0.f10034f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f10031c
            int r9 = r0.f10032d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f10033e
            android.view.ViewGroup r4 = r0.f10034f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f10030b = r1
            r0.f10029a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f10030b = r2
            r0.f10029a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f10034f
            if (r8 != 0) goto L81
            r0.f10030b = r1
            r0.f10029a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f10033e
            if (r8 != 0) goto L9f
            r0.f10030b = r2
            r0.f10029a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f10032d
            if (r8 != 0) goto L95
            r0.f10030b = r2
            r0.f10029a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f10031c
            if (r8 != 0) goto L9f
            r0.f10030b = r1
            r0.f10029a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.h.O(l7.w, l7.w):l7.d0");
    }

    public final ObjectAnimator M(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        x.f10082a.M(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, x.f10083b, f11);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        o().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override // l7.p
    public final void d(w wVar) {
        L(wVar);
    }

    @Override // l7.p
    public final void g(w wVar) {
        L(wVar);
        View view = wVar.f10080b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(x.f10082a.y(view)) : Float.valueOf(0.0f);
        }
        wVar.f10079a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (O(n(r3, false), r(r3, false)).f10029a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212  */
    @Override // l7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r25, l7.w r26, l7.w r27) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.h.k(android.view.ViewGroup, l7.w, l7.w):android.animation.Animator");
    }

    @Override // l7.p
    public final String[] q() {
        return W;
    }

    @Override // l7.p
    public final boolean t(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f10079a.containsKey("android:visibility:visibility") != wVar.f10079a.containsKey("android:visibility:visibility")) {
            return false;
        }
        d0 d0VarO = O(wVar, wVar2);
        if (d0VarO.f10029a) {
            return d0VarO.f10031c == 0 || d0VarO.f10032d == 0;
        }
        return false;
    }

    public h() {
        this.V = 3;
    }
}
