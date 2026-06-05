package l5;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.zzbch;
import java.lang.reflect.Field;
import java.util.Arrays;
import t4.l0;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f9992v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f9993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9994b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f9996d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f9997e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f9998f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f9999g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f10000h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f10001i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f10002k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f10003l;

    /* renamed from: m, reason: collision with root package name */
    public final float f10004m;

    /* renamed from: n, reason: collision with root package name */
    public final float f10005n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10006o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f10007p;

    /* renamed from: q, reason: collision with root package name */
    public final f f10008q;

    /* renamed from: r, reason: collision with root package name */
    public View f10009r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10010s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f10011t;

    /* renamed from: c, reason: collision with root package name */
    public int f9995c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final ah.d f10012u = new ah.d(this, 10);

    public e(Context context, CoordinatorLayout coordinatorLayout, f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f10011t = coordinatorLayout;
        this.f10008q = fVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10006o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f9994b = viewConfiguration.getScaledTouchSlop();
        this.f10004m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10005n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10007p = new OverScroller(context, f9992v);
    }

    public final void a() {
        this.f9995c = -1;
        float[] fArr = this.f9996d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f9997e, 0.0f);
            Arrays.fill(this.f9998f, 0.0f);
            Arrays.fill(this.f9999g, 0.0f);
            Arrays.fill(this.f10000h, 0);
            Arrays.fill(this.f10001i, 0);
            Arrays.fill(this.j, 0);
            this.f10002k = 0;
        }
        VelocityTracker velocityTracker = this.f10003l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10003l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f10011t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f10009r = view;
        this.f9995c = i10;
        this.f10008q.P(view, i10);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            yd.f r1 = r3.f10008q
            int r4 = r1.E(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.F()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f9994b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f9994b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f9994b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.e.c(android.view.View, float, float):boolean");
    }

    public final void d(int i10) {
        float[] fArr = this.f9996d;
        if (fArr != null) {
            int i11 = this.f10002k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f9997e[i10] = 0.0f;
                this.f9998f[i10] = 0.0f;
                this.f9999g[i10] = 0.0f;
                this.f10000h[i10] = 0;
                this.f10001i[i10] = 0;
                this.j[i10] = 0;
                this.f10002k = (~i12) & i11;
            }
        }
    }

    public final int e(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f10011t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f9993a == 2) {
            OverScroller overScroller = this.f10007p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f10009r.getLeft();
            int top = currY - this.f10009r.getTop();
            if (left != 0) {
                View view = this.f10009r;
                Field field = l0.f15744a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f10009r;
                Field field2 = l0.f15744a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f10008q.R(this.f10009r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f10011t.post(this.f10012u);
            }
        }
        return this.f9993a == 2;
    }

    public final View g(int i10, int i11) {
        CoordinatorLayout coordinatorLayout = this.f10011t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f10008q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f10009r.getLeft();
        int top = this.f10009r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f10007p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f10009r;
        int i16 = (int) this.f10005n;
        int i17 = (int) this.f10004m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i16) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i18;
        } else {
            f10 = iAbs3;
            f11 = i19;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i18;
        } else {
            f12 = iAbs4;
            f13 = i19;
        }
        float f15 = f12 / f13;
        f fVar = this.f10008q;
        overScroller.startScroll(left, top, i14, i15, (int) ((e(i15, i13, fVar.F()) * f15) + (e(i14, i12, fVar.E(view)) * f14)));
        n(2);
        return true;
    }

    public final boolean i(int i10) {
        if ((this.f10002k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10003l == null) {
            this.f10003l = VelocityTracker.obtain();
        }
        this.f10003l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x2, (int) y2);
            l(x2, y2, pointerId);
            q(viewG, pointerId);
            int i12 = this.f10000h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f9993a == 1) {
                k();
            }
            a();
            return;
        }
        f fVar = this.f10008q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f9993a == 1) {
                    this.f10010s = true;
                    fVar.S(this.f10009r, 0.0f, 0.0f);
                    this.f10010s = false;
                    if (this.f9993a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                l(x4, y10, pointerId2);
                if (this.f9993a == 0) {
                    q(g((int) x4, (int) y10), pointerId2);
                    int i13 = this.f10000h[pointerId2];
                    return;
                }
                int i14 = (int) x4;
                int i15 = (int) y10;
                View view = this.f10009r;
                if (view != null && i14 >= view.getLeft() && i14 < view.getRight() && i15 >= view.getTop() && i15 < view.getBottom()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    q(this.f10009r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f9993a == 1 && pointerId3 == this.f9995c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i11 >= pointerCount) {
                        i10 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (pointerId4 != this.f9995c) {
                        View viewG2 = g((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                        View view2 = this.f10009r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            i10 = this.f9995c;
                            break;
                        }
                    }
                    i11++;
                }
                if (i10 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f9993a == 1) {
            if (i(this.f9995c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9995c);
                float x10 = motionEvent.getX(iFindPointerIndex);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f9998f;
                int i16 = this.f9995c;
                int i17 = (int) (x10 - fArr[i16]);
                int i18 = (int) (y11 - this.f9999g[i16]);
                int left = this.f10009r.getLeft() + i17;
                int top = this.f10009r.getTop() + i18;
                int left2 = this.f10009r.getLeft();
                int top2 = this.f10009r.getTop();
                if (i17 != 0) {
                    left = fVar.o(this.f10009r, left);
                    Field field = l0.f15744a;
                    this.f10009r.offsetLeftAndRight(left - left2);
                }
                if (i18 != 0) {
                    top = fVar.p(this.f10009r, top);
                    Field field2 = l0.f15744a;
                    this.f10009r.offsetTopAndBottom(top - top2);
                }
                if (i17 != 0 || i18 != 0) {
                    fVar.R(this.f10009r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i11 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if (i(pointerId5)) {
                float x11 = motionEvent.getX(i11);
                float y12 = motionEvent.getY(i11);
                float f10 = x11 - this.f9996d[pointerId5];
                float f11 = y12 - this.f9997e[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i19 = this.f10000h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i20 = this.f10000h[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i21 = this.f10000h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i22 = this.f10000h[pointerId5];
                if (this.f9993a != 1) {
                    View viewG3 = g((int) x11, (int) y12);
                    if (c(viewG3, f10, f11) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i11++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f10003l;
        float f10 = this.f10004m;
        velocityTracker.computeCurrentVelocity(zzbch.zzq.zzf, f10);
        float xVelocity = this.f10003l.getXVelocity(this.f9995c);
        float fAbs = Math.abs(xVelocity);
        float f11 = this.f10005n;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f10003l.getYVelocity(this.f9995c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f10010s = true;
        this.f10008q.S(this.f10009r, xVelocity, f10);
        this.f10010s = false;
        if (this.f9993a == 1) {
            n(0);
        }
    }

    public final void l(float f10, float f11, int i10) {
        float[] fArr = this.f9996d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f9997e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f9998f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f9999g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10000h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10001i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f9996d = fArr2;
            this.f9997e = fArr3;
            this.f9998f = fArr4;
            this.f9999g = fArr5;
            this.f10000h = iArr;
            this.f10001i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f9996d;
        this.f9998f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f9997e;
        this.f9999g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f10000h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f10011t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f10006o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < coordinatorLayout.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.f10002k |= 1 << i10;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i10);
                float y2 = motionEvent.getY(i10);
                this.f9998f[pointerId] = x2;
                this.f9999g[pointerId] = y2;
            }
        }
    }

    public final void n(int i10) {
        this.f10011t.removeCallbacks(this.f10012u);
        if (this.f9993a != i10) {
            this.f9993a = i10;
            this.f10008q.Q(i10);
            if (this.f9993a == 0) {
                this.f10009r = null;
            }
        }
    }

    public final boolean o(int i10, int i11) {
        if (this.f10010s) {
            return h(i10, i11, (int) this.f10003l.getXVelocity(this.f9995c), (int) this.f10003l.getYVelocity(this.f9995c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i10) {
        if (view == this.f10009r && this.f9995c == i10) {
            return true;
        }
        if (view == null || !this.f10008q.m0(view, i10)) {
            return false;
        }
        this.f9995c = i10;
        b(view, i10);
        return true;
    }
}
