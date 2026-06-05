package ff;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f4.a f6740i;

    public /* synthetic */ d(f4.a aVar, int i10) {
        this.f6739h = i10;
        this.f6740i = aVar;
    }

    @Override // yd.f
    public int E(View view) {
        switch (this.f6739h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6740i;
                return sideSheetBehavior.f3931l + sideSheetBehavior.f3934o;
            default:
                return super.E(view);
        }
    }

    @Override // yd.f
    public int F() {
        switch (this.f6739h) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6740i;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.F();
        }
    }

    @Override // yd.f
    public final void Q(int i10) throws Resources.NotFoundException {
        switch (this.f6739h) {
            case 0:
                if (i10 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6740i;
                    if (sideSheetBehavior.f3927g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i10 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6740i;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // yd.f
    public final void R(View view, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f6739h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6740i;
                WeakReference weakReference = sideSheetBehavior.f3936q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f3921a.X(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f3940u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f3921a.m(i10);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw gk.b.k(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f6740i).u(i11);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // yd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.d.S(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    @Override // yd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m0(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f6739h
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            f4.a r0 = r4.f6740i
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f3798c0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f3794a0
            if (r1 != r6) goto L31
            java.lang.ref.WeakReference r6 = r0.X
            if (r6 == 0) goto L26
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L31
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L31
            goto L3f
        L31:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.W
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            f4.a r6 = r4.f6740i
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f3928h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r6 = r6.f3935p
            if (r6 == 0) goto L57
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L57
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.d.m0(android.view.View, int):boolean");
    }

    @Override // yd.f
    public final int o(View view, int i10) {
        switch (this.f6739h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6740i;
                return hj.a.o(i10, sideSheetBehavior.f3921a.E(), sideSheetBehavior.f3921a.D());
            default:
                return view.getLeft();
        }
    }

    @Override // yd.f
    public final int p(View view, int i10) {
        switch (this.f6739h) {
            case 0:
                return view.getTop();
            default:
                return hj.a.o(i10, ((BottomSheetBehavior) this.f6740i).x(), F());
        }
    }
}
