package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p9.a f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final p9.a f3851b;

    public c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(uk.c.O(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, me.a.f11652l);
        p9.a.d(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        p9.a.d(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        p9.a.d(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        p9.a.d(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListZ = wd.a.z(context, typedArrayObtainStyledAttributes, 7);
        this.f3850a = p9.a.d(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        p9.a.d(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f3851b = p9.a.d(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListZ.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
