package d4;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4862a;

    /* renamed from: b, reason: collision with root package name */
    public int f4863b;

    /* renamed from: c, reason: collision with root package name */
    public int f4864c;

    /* renamed from: d, reason: collision with root package name */
    public int f4865d;

    /* renamed from: e, reason: collision with root package name */
    public int f4866e;

    /* renamed from: f, reason: collision with root package name */
    public int f4867f;

    /* renamed from: g, reason: collision with root package name */
    public int f4868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f4869h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4869h = constraintLayout;
        this.f4862a = constraintLayout2;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    public final void b(a4.d dVar, b4.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i10;
        if (dVar == null) {
            return;
        }
        a4.c cVar = dVar.J;
        a4.c cVar2 = dVar.H;
        if (dVar.f112f0 == 8) {
            bVar.f1525e = 0;
            bVar.f1526f = 0;
            bVar.f1527g = 0;
            return;
        }
        if (dVar.S == null) {
            return;
        }
        int i11 = bVar.f1521a;
        int i12 = bVar.f1522b;
        int i13 = bVar.f1523c;
        int i14 = bVar.f1524d;
        int i15 = this.f4863b + this.f4864c;
        int i16 = this.f4865d;
        View view = dVar.f110e0;
        int iB = y3.e.b(i11);
        if (iB == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iB == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4867f, i16, -2);
        } else if (iB == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4867f, i16, -2);
            boolean z10 = dVar.f131q == 1;
            int i17 = bVar.j;
            if (i17 == 1 || i17 == 2) {
                boolean z11 = view.getMeasuredHeight() == dVar.k();
                if (bVar.j == 2 || !z10 || ((z10 && z11) || dVar.x())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.n(), 1073741824);
                }
            }
        } else if (iB != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i18 = this.f4867f;
            int i19 = cVar2 != null ? cVar2.f98g : 0;
            if (cVar != null) {
                i19 += cVar.f98g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i18, i16 + i19, -1);
        }
        int iB2 = y3.e.b(i12);
        if (iB2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else if (iB2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4868g, i15, -2);
        } else if (iB2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4868g, i15, -2);
            boolean z12 = dVar.f132r == 1;
            int i20 = bVar.j;
            if (i20 == 1 || i20 == 2) {
                boolean z13 = view.getMeasuredWidth() == dVar.n();
                if (bVar.j == 2 || !z12 || ((z12 && z13) || dVar.y())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iB2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i21 = this.f4868g;
            int i22 = cVar2 != null ? dVar.I.f98g : 0;
            if (cVar != null) {
                i22 += dVar.K.f98g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i21, i15 + i22, -1);
        }
        a4.e eVar = (a4.e) dVar.S;
        ConstraintLayout constraintLayout = this.f4869h;
        if (eVar != null && a4.j.c(constraintLayout.B, 256) && view.getMeasuredWidth() == dVar.n() && view.getMeasuredWidth() < eVar.n() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.Z && !dVar.w() && a(dVar.F, iMakeMeasureSpec, dVar.n()) && a(dVar.G, iMakeMeasureSpec2, dVar.k())) {
            bVar.f1525e = dVar.n();
            bVar.f1526f = dVar.k();
            bVar.f1527g = dVar.Z;
            return;
        }
        boolean z14 = i11 == 3;
        boolean z15 = i12 == 3;
        boolean z16 = i12 == 4 || i12 == 1;
        boolean z17 = i11 == 4 || i11 == 1;
        boolean z18 = z14 && dVar.V > 0.0f;
        boolean z19 = z15 && dVar.V > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i23 = bVar.j;
        if (i23 != 1 && i23 != 2 && z14 && dVar.f131q == 0 && z15 && dVar.f132r == 0) {
            z2 = false;
            measuredWidth = 0;
            baseline = 0;
            i10 = -1;
            iMax = 0;
        } else {
            if ((view instanceof u) && (dVar instanceof a4.g)) {
                ((u) view).j((a4.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.F = iMakeMeasureSpec;
            dVar.G = iMakeMeasureSpec2;
            dVar.f113g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i24 = dVar.f134t;
            int iMax2 = i24 > 0 ? Math.max(i24, measuredWidth2) : measuredWidth2;
            int i25 = dVar.f135u;
            if (i25 > 0) {
                iMax2 = Math.min(i25, iMax2);
            }
            int i26 = dVar.f137w;
            iMax = i26 > 0 ? Math.max(i26, measuredHeight) : measuredHeight;
            int i27 = iMakeMeasureSpec2;
            int i28 = dVar.f138x;
            if (i28 > 0) {
                iMax = Math.min(i28, iMax);
            }
            if (!a4.j.c(constraintLayout.B, 1)) {
                if (z18 && z16) {
                    iMax2 = (int) ((iMax * dVar.V) + 0.5f);
                } else if (z19 && z17) {
                    iMax = (int) ((iMax2 / dVar.V) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z2 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i27;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                dVar.F = iMakeMeasureSpec;
                dVar.G = iMakeMeasureSpec3;
                z2 = false;
                dVar.f113g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i10 = -1;
        }
        boolean z20 = baseline != i10 ? true : z2;
        bVar.f1529i = (measuredWidth == bVar.f1523c && iMax == bVar.f1524d) ? z2 : true;
        boolean z21 = eVar2.f4825b0 ? true : z20;
        if (z21 && baseline != -1 && dVar.Z != baseline) {
            bVar.f1529i = true;
        }
        bVar.f1525e = measuredWidth;
        bVar.f1526f = iMax;
        bVar.f1528h = z21;
        bVar.f1527g = baseline;
    }
}
