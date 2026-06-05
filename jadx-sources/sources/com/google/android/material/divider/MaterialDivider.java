package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.anonlab.voidlauncher.R;
import ef.i;
import i4.c;
import jf.a;
import ze.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* renamed from: a, reason: collision with root package name */
    public final i f3905a;

    /* renamed from: b, reason: collision with root package name */
    public int f3906b;

    /* renamed from: c, reason: collision with root package name */
    public int f3907c;

    /* renamed from: d, reason: collision with root package name */
    public int f3908d;

    /* renamed from: e, reason: collision with root package name */
    public int f3909e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f3905a = new i();
        TypedArray typedArrayE = k.e(context2, attributeSet, me.a.f11654n, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f3906b = typedArrayE.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f3908d = typedArrayE.getDimensionPixelOffset(2, 0);
        this.f3909e = typedArrayE.getDimensionPixelOffset(1, 0);
        setDividerColor(wd.a.z(context2, typedArrayE, 0).getDefaultColor());
        typedArrayE.recycle();
    }

    public int getDividerColor() {
        return this.f3907c;
    }

    public int getDividerInsetEnd() {
        return this.f3909e;
    }

    public int getDividerInsetStart() {
        return this.f3908d;
    }

    public int getDividerThickness() {
        return this.f3906b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z2 = getLayoutDirection() == 1;
        int i11 = z2 ? this.f3909e : this.f3908d;
        if (z2) {
            width = getWidth();
            i10 = this.f3908d;
        } else {
            width = getWidth();
            i10 = this.f3909e;
        }
        int i12 = width - i10;
        int bottom = getBottom() - getTop();
        i iVar = this.f3905a;
        iVar.setBounds(i11, 0, i12, bottom);
        iVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f3906b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f3907c != i10) {
            this.f3907c = i10;
            this.f3905a.n(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(c.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f3909e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f3908d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f3906b != i10) {
            this.f3906b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
