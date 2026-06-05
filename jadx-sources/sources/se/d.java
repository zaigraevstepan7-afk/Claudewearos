package se;

import ag.i;
import ak.m;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.api.f;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import d3.a0;
import ef.b0;
import ef.y;
import ef.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import ze.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class d extends LinearLayout {
    public int A;
    public b0 B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14995a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14996b;

    /* renamed from: c, reason: collision with root package name */
    public final i f14997c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f14998d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f14999e;

    /* renamed from: f, reason: collision with root package name */
    public y f15000f;

    /* renamed from: z, reason: collision with root package name */
    public z f15001z;

    public d(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        y yVarB;
        XmlResourceParser xml;
        int next;
        b0 b0Var;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        super(jf.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f14995a = new ArrayList();
        this.f14996b = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f14997c = new i(materialButtonToggleGroup, 22);
        this.f14998d = new a0(materialButtonToggleGroup, 1);
        this.C = true;
        Context context2 = getContext();
        TypedArray typedArrayE = k.e(context2, attributeSet, me.a.j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayE.hasValue(2)) {
            int resourceId = typedArrayE.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        b0Var = new b0();
                        b0Var.f5978c = new int[10][];
                        b0Var.f5979d = new yh.c[10];
                        attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    b0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                }
                xml.close();
                this.B = b0Var;
            } else {
                b0Var = null;
                this.B = b0Var;
            }
        }
        if (typedArrayE.hasValue(4)) {
            z zVarB = z.b(context2, typedArrayE, 4);
            this.f15001z = zVarB;
            if (zVarB == null) {
                m mVar = new m(ef.m.a(context2, typedArrayE.getResourceId(4, 0), typedArrayE.getResourceId(5, 0), new ef.a(0)).a());
                this.f15001z = mVar.f665b != 0 ? new z(mVar) : null;
            }
        }
        if (typedArrayE.hasValue(3)) {
            ef.a aVar = new ef.a(0.0f);
            int resourceId2 = typedArrayE.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        yVarB = new y();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            yVarB.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    yVarB = y.b(aVar);
                }
            } else {
                yVarB = y.b(ef.m.c(typedArrayE, 3, aVar));
            }
            this.f15000f = yVarB;
        }
        this.A = typedArrayE.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i10 - 1);
            if (this.A <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.A - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.A - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.C = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f14997c);
        this.f14995a.add(materialButton.getShapeAppearanceModel());
        this.f14996b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.B == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = f.API_PRIORITY_OTHER;
        for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
            if (c(i10)) {
                if (c(i10) && this.B != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i10);
                    b0 b0Var = this.B;
                    int width = materialButton3.getWidth();
                    int i11 = -width;
                    for (int i12 = 0; i12 < b0Var.f5976a; i12++) {
                        ef.a0 a0Var = (ef.a0) b0Var.f5979d[i12].f20314b;
                        int i13 = a0Var.f5972a;
                        float f10 = a0Var.f5973b;
                        if (i13 == 2) {
                            fMax = Math.max(i11, f10);
                        } else if (i13 == 1) {
                            fMax = Math.max(i11, width * f10);
                        }
                        i11 = (int) fMax;
                    }
                    int iMax = Math.max(0, i11);
                    int i14 = i10 - 1;
                    while (true) {
                        materialButton = null;
                        if (i14 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i14)) {
                                materialButton2 = (MaterialButton) getChildAt(i14);
                                break;
                            }
                            i14--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i15 = i10 + 1;
                    while (true) {
                        if (i15 >= childCount) {
                            break;
                        }
                        if (c(i15)) {
                            materialButton = (MaterialButton) getChildAt(i15);
                            break;
                        }
                        i15++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i16 = firstVisibleChildIndex;
        while (i16 <= lastVisibleChildIndex) {
            if (c(i16)) {
                ((MaterialButton) getChildAt(i16)).setSizeChange(this.B);
                ((MaterialButton) getChildAt(i16)).setWidthChangeMax((i16 == firstVisibleChildIndex || i16 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i16++;
        }
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = materialButton.O;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.O = null;
                materialButton.L = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f14998d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f14999e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ef.m[], java.io.Serializable] */
    public final void e() {
        m mVar;
        int i10;
        if (!(this.f15000f == null && this.f15001z == null) && this.C) {
            this.C = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i11 = 0;
            while (i11 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i11);
                if (materialButton.getVisibility() != 8) {
                    boolean z2 = i11 == firstVisibleChildIndex;
                    boolean z10 = i11 == lastVisibleChildIndex;
                    z zVar = this.f15001z;
                    if (zVar == null || (!z2 && !z10)) {
                        zVar = (z) this.f14996b.get(i11);
                    }
                    if (zVar == null) {
                        mVar = new m((ef.m) this.f14995a.get(i11));
                    } else {
                        m mVar2 = new m(1);
                        int i12 = zVar.f6070a;
                        mVar2.f665b = i12;
                        mVar2.f666c = zVar.f6071b;
                        int[][] iArr = zVar.f6072c;
                        ?? r14 = new int[iArr.length][];
                        mVar2.f667d = r14;
                        ef.m[] mVarArr = zVar.f6073d;
                        mVar2.f668e = new ef.m[mVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i12);
                        System.arraycopy(mVarArr, 0, (ef.m[]) mVar2.f668e, 0, mVar2.f665b);
                        mVar2.f669f = zVar.f6074e;
                        mVar2.f670g = zVar.f6075f;
                        mVar2.f671h = zVar.f6076g;
                        mVar2.f672i = zVar.f6077h;
                        mVar = mVar2;
                    }
                    boolean z11 = getOrientation() == 0;
                    boolean z12 = getLayoutDirection() == 1;
                    if (z11) {
                        i10 = z2 ? 5 : 0;
                        if (z10) {
                            i10 |= 10;
                        }
                        if (z12) {
                            i10 = ((i10 & 10) >> 1) | ((i10 & 5) << 1);
                        }
                    } else {
                        i10 = z2 ? 3 : 0;
                        if (z10) {
                            i10 |= 12;
                        }
                    }
                    int i13 = ~i10;
                    y yVar = this.f15000f;
                    if ((i13 | 1) == i13) {
                        mVar.f669f = yVar;
                    }
                    if ((i13 | 2) == i13) {
                        mVar.f670g = yVar;
                    }
                    if ((i13 | 4) == i13) {
                        mVar.f671h = yVar;
                    }
                    if ((i13 | 8) == i13) {
                        mVar.f672i = yVar;
                    }
                    z zVar2 = mVar.f665b == 0 ? null : new z(mVar);
                    if (zVar2.d()) {
                        materialButton.setStateListShapeAppearanceModel(zVar2);
                    } else {
                        materialButton.setShapeAppearanceModel(zVar2.c());
                    }
                }
                i11++;
            }
        }
    }

    public b0 getButtonSizeChange() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f14999e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    public ef.d getInnerCornerSize() {
        return this.f15000f.f6067b;
    }

    public y getInnerCornerSizeStateList() {
        return this.f15000f;
    }

    public ef.m getShapeAppearance() {
        z zVar = this.f15001z;
        if (zVar == null) {
            return null;
        }
        return zVar.c();
    }

    public int getSpacing() {
        return this.A;
    }

    public z getStateListShapeAppearance() {
        return this.f15001z;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        super.onLayout(z2, i10, i11, i12, i13);
        if (z2) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f14995a.remove(iIndexOfChild);
            this.f14996b.remove(iIndexOfChild);
        }
        this.C = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(b0 b0Var) {
        if (this.B != b0Var) {
            this.B = b0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z2);
        }
    }

    public void setInnerCornerSize(ef.d dVar) {
        this.f15000f = y.b(dVar);
        this.C = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(y yVar) {
        this.f15000f = yVar;
        this.C = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.C = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(ef.m mVar) {
        m mVar2 = new m(mVar);
        this.f15001z = mVar2.f665b == 0 ? null : new z(mVar2);
        this.C = true;
        e();
        invalidate();
    }

    public void setSpacing(int i10) {
        this.A = i10;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(z zVar) {
        this.f15001z = zVar;
        this.C = true;
        e();
        invalidate();
    }
}
