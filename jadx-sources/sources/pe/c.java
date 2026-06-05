package pe;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: h, reason: collision with root package name */
    public int f12871h;

    /* renamed from: i, reason: collision with root package name */
    public int f12872i = -1;
    public final /* synthetic */ SwipeDismissBehavior j;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.j = swipeDismissBehavior;
    }

    @Override // yd.f
    public final int E(View view) {
        return view.getWidth();
    }

    @Override // yd.f
    public final void P(View view, int i10) {
        this.f12872i = i10;
        this.f12871h = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.j;
            swipeDismissBehavior.f3788c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f3788c = false;
        }
    }

    @Override // yd.f
    public final void R(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.j;
        float f10 = width * swipeDismissBehavior.f3790e;
        float width2 = view.getWidth() * swipeDismissBehavior.f3791f;
        float fAbs = Math.abs(i10 - this.f12871h);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // yd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f12872i = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.j
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f3789d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f12871h
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f12871h
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f12871h
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f12871h
        L67:
            l5.e r10 = r3.f3786a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7b
            a8.e r10 = new a8.e
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.c.S(android.view.View, float, float):void");
    }

    @Override // yd.f
    public final boolean m0(View view, int i10) {
        int i11 = this.f12872i;
        return (i11 == -1 || i11 == i10) && this.j.r(view);
    }

    @Override // yd.f
    public final int o(View view, int i10) {
        int width;
        int width2;
        int width3;
        boolean z2 = view.getLayoutDirection() == 1;
        int i11 = this.j.f3789d;
        if (i11 == 0) {
            if (z2) {
                width = this.f12871h - view.getWidth();
                width2 = this.f12871h;
            } else {
                width = this.f12871h;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f12871h - view.getWidth();
            width2 = view.getWidth() + this.f12871h;
        } else if (z2) {
            width = this.f12871h;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f12871h - view.getWidth();
            width2 = this.f12871h;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // yd.f
    public final int p(View view, int i10) {
        return view.getTop();
    }

    @Override // yd.f
    public final void Q(int i10) {
    }
}
