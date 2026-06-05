package t6;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f16023a;

    /* renamed from: b, reason: collision with root package name */
    public int f16024b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f16025c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f16026d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16028f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f16029z;

    public s0(RecyclerView recyclerView) {
        this.f16029z = recyclerView;
        l5.d dVar = RecyclerView.R0;
        this.f16026d = dVar;
        this.f16027e = false;
        this.f16028f = false;
        this.f16025c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f16027e) {
            this.f16028f = true;
            return;
        }
        RecyclerView recyclerView = this.f16029z;
        recyclerView.removeCallbacks(this);
        Field field = t4.l0.f15744a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        RecyclerView recyclerView = this.f16029z;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z2 = iAbs > iAbs2;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                iAbs = iAbs2;
            }
            i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.R0;
        }
        if (this.f16026d != interpolator) {
            this.f16026d = interpolator;
            this.f16025c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f16024b = 0;
        this.f16023a = 0;
        recyclerView.setScrollState(2);
        this.f16025c.startScroll(0, 0, i10, i11, i13);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView recyclerView = this.f16029z;
        int[] iArr = recyclerView.I0;
        if (recyclerView.E == null) {
            recyclerView.removeCallbacks(this);
            this.f16025c.abortAnimation();
            return;
        }
        this.f16028f = false;
        this.f16027e = true;
        recyclerView.l();
        OverScroller overScroller = this.f16025c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f16023a;
            int i15 = currY - this.f16024b;
            this.f16023a = currX;
            this.f16024b = currY;
            int[] iArr2 = recyclerView.I0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.q(i14, i15, 1, iArr2, null)) {
                i10 = i14 - iArr[0];
                i11 = i15 - iArr[1];
            } else {
                i10 = i14;
                i11 = i15;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.k(i10, i11);
            }
            if (recyclerView.D != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.X(iArr, i10, i11);
                i12 = iArr[0];
                i13 = iArr[1];
                i10 -= i12;
                i11 -= i13;
                t tVar = recyclerView.E.f15873e;
                if (tVar != null && !tVar.f16033d && tVar.f16034e) {
                    int iB = recyclerView.w0.b();
                    if (iB == 0) {
                        tVar.i();
                    } else if (tVar.f16030a >= iB) {
                        tVar.f16030a = iB - 1;
                        tVar.g(i12, i13);
                    } else {
                        tVar.g(i12, i13);
                    }
                }
            } else {
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.G.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.I0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.r(i12, i13, i10, i11, null, 1, iArr3);
            int i16 = i10 - iArr[0];
            int i17 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.s(i12, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i16 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i17 != 0));
            t tVar2 = recyclerView.E.f15873e;
            if ((tVar2 == null || !tVar2.f16033d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i18 = i16 < 0 ? -currVelocity : i16 > 0 ? currVelocity : 0;
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    if (i18 < 0) {
                        recyclerView.u();
                        if (recyclerView.f1174a0.isFinished()) {
                            recyclerView.f1174a0.onAbsorb(-i18);
                        }
                    } else if (i18 > 0) {
                        recyclerView.v();
                        if (recyclerView.f1178c0.isFinished()) {
                            recyclerView.f1178c0.onAbsorb(i18);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.w();
                        if (recyclerView.f1176b0.isFinished()) {
                            recyclerView.f1176b0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.t();
                        if (recyclerView.f1180d0.isFinished()) {
                            recyclerView.f1180d0.onAbsorb(currVelocity);
                        }
                    }
                    if (i18 != 0 || currVelocity != 0) {
                        Field field = t4.l0.f15744a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                androidx.datastore.preferences.protobuf.k kVar = recyclerView.f1200v0;
                int[] iArr4 = (int[]) kVar.f957e;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                kVar.f956d = 0;
            } else {
                a();
                m mVar = recyclerView.f1199u0;
                if (mVar != null) {
                    mVar.a(recyclerView, i12, i13);
                }
            }
        }
        t tVar3 = recyclerView.E.f15873e;
        if (tVar3 != null && tVar3.f16033d) {
            tVar3.g(0, 0);
        }
        this.f16027e = false;
        if (!this.f16028f) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = t4.l0.f15744a;
            recyclerView.postOnAnimation(this);
        }
    }
}
