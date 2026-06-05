package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.anonlab.voidlauncher.R;
import java.util.Arrays;
import t.m1;
import t4.l0;
import z5.a;
import z5.b;
import z5.c;
import z5.g;
import z5.h;
import z5.i;
import z5.j;
import z5.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    public static final LogPrinter B = new LogPrinter(3, GridLayout.class.getName());
    public static final a C = new a();
    public static final int D = 3;
    public static final int E = 4;
    public static final int F = 1;
    public static final int G = 6;
    public static final int H = 5;
    public static final int I = 2;
    public static final b J = new b(0);
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;
    public static final c O;
    public static final c P;
    public static final b Q;
    public static final b R;
    public static final b S;
    public Printer A;

    /* renamed from: a, reason: collision with root package name */
    public final g f1050a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1051b;

    /* renamed from: c, reason: collision with root package name */
    public int f1052c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1053d;

    /* renamed from: e, reason: collision with root package name */
    public int f1054e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1055f;

    /* renamed from: z, reason: collision with root package name */
    public int f1056z;

    static {
        b bVar = new b(1);
        b bVar2 = new b(2);
        K = bVar;
        L = bVar2;
        M = bVar;
        N = bVar2;
        O = new c(bVar, bVar2);
        P = new c(bVar2, bVar);
        Q = new b(3);
        R = new b(4);
        S = new b(5);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1050a = new g(this, true);
        this.f1051b = new g(this, false);
        this.f1052c = 0;
        this.f1053d = false;
        this.f1054e = 1;
        this.f1056z = 0;
        this.A = B;
        this.f1055f = context.getResources().getDimensionPixelOffset(R.dimen.default_gap);
        int[] iArr = y5.a.f20226a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        l0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(E, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(F, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(D, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(G, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(0, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(H, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(I, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static u0.b d(int i10, boolean z2) {
        int i11 = (i10 & (z2 ? 7 : 112)) >> (z2 ? 0 : 4);
        return i11 != 1 ? i11 != 3 ? i11 != 5 ? i11 != 7 ? i11 != 8388611 ? i11 != 8388613 ? J : N : M : S : z2 ? P : L : z2 ? O : K : Q;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(m1.v(str, ". "));
    }

    public static void k(j jVar, int i10, int i11, int i12, int i13) {
        i iVar = new i(i10, i11 + i10);
        l lVar = jVar.f20428a;
        jVar.f20428a = new l(lVar.f20432a, iVar, lVar.f20434c, lVar.f20435d);
        i iVar2 = new i(i12, i13 + i12);
        l lVar2 = jVar.f20429b;
        jVar.f20429b = new l(lVar2.f20432a, iVar2, lVar2.f20434c, lVar2.f20435d);
    }

    public static l l(int i10, int i11, u0.b bVar, float f10) {
        return new l(i10 != Integer.MIN_VALUE, new i(i10, i11 + i10), bVar, f10);
    }

    public final void a(j jVar, boolean z2) {
        String str = z2 ? "column" : "row";
        i iVar = (z2 ? jVar.f20429b : jVar.f20428a).f20433b;
        int i10 = iVar.f20414a;
        if (i10 != Integer.MIN_VALUE && i10 < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i11 = (z2 ? this.f1050a : this.f1051b).f20389b;
        if (i11 != Integer.MIN_VALUE) {
            if (iVar.f20415b > i11) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (iVar.a() <= i11) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((j) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public final void c() {
        int i10 = this.f1056z;
        if (i10 != 0) {
            if (i10 != b()) {
                this.A.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                h();
                c();
                return;
            }
            return;
        }
        boolean z2 = this.f1052c == 0;
        int i11 = (z2 ? this.f1050a : this.f1051b).f20389b;
        if (i11 == Integer.MIN_VALUE) {
            i11 = 0;
        }
        int[] iArr = new int[i11];
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            j jVar = (j) getChildAt(i14).getLayoutParams();
            l lVar = z2 ? jVar.f20428a : jVar.f20429b;
            i iVar = lVar.f20433b;
            boolean z10 = lVar.f20432a;
            int iA = iVar.a();
            if (z10) {
                i12 = iVar.f20414a;
            }
            l lVar2 = z2 ? jVar.f20429b : jVar.f20428a;
            i iVar2 = lVar2.f20433b;
            boolean z11 = lVar2.f20432a;
            int iA2 = iVar2.a();
            int i15 = iVar2.f20414a;
            if (i11 != 0) {
                iA2 = Math.min(iA2, i11 - (z11 ? Math.min(i15, i11) : 0));
            }
            if (z11) {
                i13 = i15;
            }
            if (i11 != 0) {
                if (!z10 || !z11) {
                    while (true) {
                        int i16 = i13 + iA2;
                        if (i16 <= i11) {
                            for (int i17 = i13; i17 < i16; i17++) {
                                if (iArr[i17] <= i12) {
                                }
                            }
                            break;
                        }
                        if (z11) {
                            i12++;
                        } else if (i16 <= i11) {
                            i13++;
                        } else {
                            i12++;
                            i13 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i13, i11), Math.min(i13 + iA2, i11), i12 + iA);
            }
            if (z2) {
                k(jVar, i12, iA, i13, iA2);
            } else {
                k(jVar, i13, iA2, i12, iA);
            }
            i13 += iA2;
        }
        this.f1056z = b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof j)) {
            return false;
        }
        j jVar = (j) layoutParams;
        a(jVar, true);
        a(jVar, false);
        return true;
    }

    public final int e(View view, boolean z2, boolean z10) {
        int[] iArr;
        if (this.f1054e == 1) {
            return f(view, z2, z10);
        }
        g gVar = z2 ? this.f1050a : this.f1051b;
        if (z10) {
            if (gVar.j == null) {
                gVar.j = new int[gVar.f() + 1];
            }
            if (!gVar.f20397k) {
                gVar.c(true);
                gVar.f20397k = true;
            }
            iArr = gVar.j;
        } else {
            if (gVar.f20398l == null) {
                gVar.f20398l = new int[gVar.f() + 1];
            }
            if (!gVar.f20399m) {
                gVar.c(false);
                gVar.f20399m = true;
            }
            iArr = gVar.f20398l;
        }
        j jVar = (j) view.getLayoutParams();
        i iVar = (z2 ? jVar.f20429b : jVar.f20428a).f20433b;
        return iArr[z10 ? iVar.f20414a : iVar.f20415b];
    }

    public final int f(View view, boolean z2, boolean z10) {
        j jVar = (j) view.getLayoutParams();
        int i10 = z2 ? z10 ? ((ViewGroup.MarginLayoutParams) jVar).leftMargin : ((ViewGroup.MarginLayoutParams) jVar).rightMargin : z10 ? ((ViewGroup.MarginLayoutParams) jVar).topMargin : ((ViewGroup.MarginLayoutParams) jVar).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f1053d && view.getClass() != Space.class) {
            return this.f1055f / 2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = l.f20431e;
        j jVar = new j(-2, -2);
        jVar.f20428a = lVar;
        jVar.f20429b = lVar;
        jVar.setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        jVar.f20428a = lVar;
        jVar.f20429b = lVar;
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        j jVar = new j(context, attributeSet);
        l lVar = l.f20431e;
        jVar.f20428a = lVar;
        jVar.f20429b = lVar;
        int[] iArr = y5.a.f20227b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f20417d, Integer.MIN_VALUE);
            ((ViewGroup.MarginLayoutParams) jVar).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f20418e, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) jVar).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f20419f, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) jVar).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f20420g, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) jVar).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f20421h, dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int i10 = typedArrayObtainStyledAttributes.getInt(j.f20427o, 0);
                int i11 = typedArrayObtainStyledAttributes.getInt(j.f20422i, Integer.MIN_VALUE);
                int i12 = j.j;
                int i13 = j.f20416c;
                jVar.f20429b = l(i11, typedArrayObtainStyledAttributes.getInt(i12, i13), d(i10, true), typedArrayObtainStyledAttributes.getFloat(j.f20423k, 0.0f));
                jVar.f20428a = l(typedArrayObtainStyledAttributes.getInt(j.f20424l, Integer.MIN_VALUE), typedArrayObtainStyledAttributes.getInt(j.f20425m, i13), d(i10, false), typedArrayObtainStyledAttributes.getFloat(j.f20426n, 0.0f));
                return jVar;
            } finally {
            }
        } finally {
        }
    }

    public int getAlignmentMode() {
        return this.f1054e;
    }

    public int getColumnCount() {
        return this.f1050a.f();
    }

    public int getOrientation() {
        return this.f1052c;
    }

    public Printer getPrinter() {
        return this.A;
    }

    public int getRowCount() {
        return this.f1051b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.f1053d;
    }

    public final void h() {
        this.f1056z = 0;
        g gVar = this.f1050a;
        if (gVar != null) {
            gVar.l();
        }
        g gVar2 = this.f1051b;
        if (gVar2 != null) {
            gVar2.l();
        }
        if (gVar == null || gVar2 == null) {
            return;
        }
        gVar.m();
        gVar2.m();
    }

    public final void i(View view, int i10, int i11, int i12, int i13) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, e(view, true, false) + e(view, true, true), i12), ViewGroup.getChildMeasureSpec(i11, e(view, false, false) + e(view, false, true), i13));
    }

    public final void j(int i10, int i11, boolean z2) {
        int i12;
        int i13;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                i12 = i10;
                i13 = i11;
            } else {
                j jVar = (j) childAt.getLayoutParams();
                if (z2) {
                    i12 = i10;
                    i13 = i11;
                    i(childAt, i12, i13, ((ViewGroup.MarginLayoutParams) jVar).width, ((ViewGroup.MarginLayoutParams) jVar).height);
                } else {
                    i12 = i10;
                    i13 = i11;
                    boolean z10 = this.f1052c == 0;
                    l lVar = z10 ? jVar.f20429b : jVar.f20428a;
                    if (lVar.a(z10) == S) {
                        i iVar = lVar.f20433b;
                        int[] iArrH = (z10 ? this.f1050a : this.f1051b).h();
                        int iE = (iArrH[iVar.f20415b] - iArrH[iVar.f20414a]) - (e(childAt, z10, false) + e(childAt, z10, true));
                        if (z10) {
                            i(childAt, i12, i13, iE, ((ViewGroup.MarginLayoutParams) jVar).height);
                        } else {
                            i(childAt, i12, i13, ((ViewGroup.MarginLayoutParams) jVar).width, iE);
                        }
                    }
                }
            }
            i14++;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        GridLayout gridLayout = this;
        gridLayout.c();
        int i18 = i12 - i10;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        int i19 = (i18 - paddingLeft) - paddingRight;
        g gVar = gridLayout.f1050a;
        gVar.f20408v.f20430a = i19;
        gVar.f20409w.f20430a = -i19;
        boolean z11 = false;
        gVar.f20403q = false;
        gVar.h();
        int i20 = ((i13 - i11) - paddingTop) - paddingBottom;
        g gVar2 = gridLayout.f1051b;
        gVar2.f20408v.f20430a = i20;
        gVar2.f20409w.f20430a = -i20;
        gVar2.f20403q = false;
        gVar2.h();
        int[] iArrH = gVar.h();
        int[] iArrH2 = gVar2.h();
        int childCount = gridLayout.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = gridLayout.getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                i15 = i21;
                i14 = i18;
                i16 = paddingLeft;
                i17 = paddingTop;
                z10 = z11;
            } else {
                j jVar = (j) childAt.getLayoutParams();
                l lVar = jVar.f20429b;
                l lVar2 = jVar.f20428a;
                i iVar = lVar.f20433b;
                i iVar2 = lVar2.f20433b;
                int i22 = i21;
                int i23 = iArrH[iVar.f20414a];
                int i24 = iArrH2[iVar2.f20414a];
                int i25 = iArrH[iVar.f20415b];
                int i26 = iArrH2[iVar2.f20415b];
                int i27 = i25 - i23;
                int i28 = i26 - i24;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                u0.b bVarA = lVar.a(true);
                u0.b bVarA2 = lVar2.a(false);
                p1.l lVarG = gVar.g();
                h hVar = (h) ((Object[]) lVarG.f12662d)[((int[]) lVarG.f12660b)[i22]];
                p1.l lVarG2 = gVar2.g();
                i14 = i18;
                h hVar2 = (h) ((Object[]) lVarG2.f12662d)[((int[]) lVarG2.f12660b)[i22]];
                int iK = bVarA.k(childAt, i27 - hVar.d(true));
                int iK2 = bVarA2.k(childAt, i28 - hVar2.d(true));
                int iE = gridLayout.e(childAt, true, true);
                int iE2 = gridLayout.e(childAt, false, true);
                int iE3 = gridLayout.e(childAt, true, false);
                int i29 = iE + iE3;
                int iE4 = iE2 + gridLayout.e(childAt, false, false);
                i15 = i22;
                i16 = paddingLeft;
                i17 = paddingTop;
                z10 = false;
                int iA = hVar.a(gridLayout, childAt, bVarA, measuredWidth + i29, true);
                int iA2 = hVar2.a(this, childAt, bVarA2, measuredHeight + iE4, false);
                int iM = bVarA.m(measuredWidth, i27 - i29);
                int iM2 = bVarA2.m(measuredHeight, i28 - iE4);
                int i30 = i23 + iK + iA;
                int i31 = getLayoutDirection() == 1 ? (((i14 - iM) - paddingRight) - iE3) - i30 : i16 + iE + i30;
                int i32 = i17 + i24 + iK2 + iA2 + iE2;
                if (iM != childAt.getMeasuredWidth() || iM2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iM, 1073741824), View.MeasureSpec.makeMeasureSpec(iM2, 1073741824));
                }
                childAt.layout(i31, i32, iM + i31, iM2 + i32);
            }
            i21 = i15 + 1;
            gridLayout = this;
            paddingLeft = i16;
            paddingTop = i17;
            i18 = i14;
            z11 = z10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iJ;
        int iJ2;
        c();
        g gVar = this.f1051b;
        g gVar2 = this.f1050a;
        if (gVar2 != null && gVar != null) {
            gVar2.m();
            gVar.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i10), View.MeasureSpec.getMode(i10));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i11), View.MeasureSpec.getMode(i11));
        j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.f1052c == 0) {
            iJ2 = gVar2.j(iMakeMeasureSpec);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ = gVar.j(iMakeMeasureSpec2);
        } else {
            iJ = gVar.j(iMakeMeasureSpec2);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ2 = gVar2.j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iJ2 + paddingRight, getSuggestedMinimumWidth()), i10, 0), View.resolveSizeAndState(Math.max(iJ + paddingBottom, getSuggestedMinimumHeight()), i11, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i10) {
        this.f1054e = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f1050a.o(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z2) {
        g gVar = this.f1050a;
        gVar.f20407u = z2;
        gVar.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f1052c != i10) {
            this.f1052c = i10;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = C;
        }
        this.A = printer;
    }

    public void setRowCount(int i10) {
        this.f1051b.o(i10);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z2) {
        g gVar = this.f1051b;
        gVar.f20407u = z2;
        gVar.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z2) {
        this.f1053d = z2;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof j) {
            j jVar = (j) layoutParams;
            j jVar2 = new j(jVar);
            l lVar = l.f20431e;
            jVar2.f20428a = lVar;
            jVar2.f20429b = lVar;
            jVar2.f20428a = jVar.f20428a;
            jVar2.f20429b = jVar.f20429b;
            return jVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            j jVar3 = new j((ViewGroup.MarginLayoutParams) layoutParams);
            l lVar2 = l.f20431e;
            jVar3.f20428a = lVar2;
            jVar3.f20429b = lVar2;
            return jVar3;
        }
        j jVar4 = new j(layoutParams);
        l lVar3 = l.f20431e;
        jVar4.f20428a = lVar3;
        jVar4.f20429b = lVar3;
        return jVar4;
    }
}
