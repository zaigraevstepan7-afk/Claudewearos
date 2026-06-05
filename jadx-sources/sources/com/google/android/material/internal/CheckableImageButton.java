package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.j;
import m.t;
import t4.l0;
import ze.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class CheckableImageButton extends t implements Checkable {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f3912z = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f3913d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3914e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3915f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.anonlab.voidlauncher.R.attr.imageButtonStyle);
        this.f3914e = true;
        this.f3915f = true;
        l0.l(this, new j(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3913d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f3913d ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f3912z) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f9454a);
        setChecked(aVar.f20498c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f20498c = this.f3913d;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f3914e != z2) {
            this.f3914e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f3914e || this.f3913d == z2) {
            return;
        }
        this.f3913d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f3915f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f3915f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3913d);
    }
}
