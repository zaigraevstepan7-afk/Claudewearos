package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import d4.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
class ClockFaceView extends h implements f {
    public final ClockHandView O;
    public final Rect P;
    public final RectF Q;
    public final Rect R;
    public final SparseArray S;
    public final c T;
    public final int[] U;
    public final float[] V;
    public final int W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f3978a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f3979b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f3980c0;

    /* renamed from: d0, reason: collision with root package name */
    public final String[] f3981d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f3982e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ColorStateList f3983f0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = new Rect();
        this.Q = new RectF();
        this.R = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.S = sparseArray;
        this.V = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.a.f11645d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListZ = wd.a.z(context, typedArrayObtainStyledAttributes, 1);
        this.f3983f0 = colorStateListZ;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.O = clockHandView;
        this.W = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListZ.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListZ.getDefaultColor());
        this.U = new int[]{colorForState, colorForState, colorStateListZ.getDefaultColor()};
        clockHandView.f3986c.add(this);
        int defaultColor = i4.c.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListZ2 = wd.a.z(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListZ2 != null ? colorStateListZ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.T = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3981d0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i10 = 0; i10 < Math.max(this.f3981d0.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f3981d0.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f3981d0[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z2 = i11 > 1 ? true : z2;
                l0.l(textView, this.T);
                textView.setTextColor(this.f3983f0);
            }
        }
        ClockHandView clockHandView2 = this.O;
        if (clockHandView2.f3985b && !z2) {
            clockHandView2.F = 1;
        }
        clockHandView2.f3985b = z2;
        clockHandView2.invalidate();
        this.f3978a0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f3979b0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3980c0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        o oVar = new o();
        oVar.b(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.M * 0.66f) : this.M;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id2);
                HashMap map2 = oVar.f4966c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id2), new d4.j());
                }
                d4.k kVar = ((d4.j) map2.get(Integer.valueOf(id2))).f4892d;
                kVar.f4933y = R.id.circle_center;
                kVar.f4934z = iRound;
                kVar.A = size;
                size += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.S;
            if (i12 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i12)).setVisibility(0);
            i12++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.O.f3990z;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.S;
            int size = sparseArray.size();
            rect = this.P;
            rectF = this.Q;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.R);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.U, this.V, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f3981d0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        super.onLayout(z2, i10, i11, i12, i13);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f3980c0 / Math.max(Math.max(this.f3978a0 / displayMetrics.heightPixels, this.f3979b0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
