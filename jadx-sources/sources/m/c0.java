package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f11062a;

    /* renamed from: b, reason: collision with root package name */
    public ak.g f11063b;

    /* renamed from: c, reason: collision with root package name */
    public ak.g f11064c;

    /* renamed from: d, reason: collision with root package name */
    public ak.g f11065d;

    /* renamed from: e, reason: collision with root package name */
    public ak.g f11066e;

    /* renamed from: f, reason: collision with root package name */
    public ak.g f11067f;

    /* renamed from: g, reason: collision with root package name */
    public ak.g f11068g;

    /* renamed from: h, reason: collision with root package name */
    public ak.g f11069h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f11070i;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f11071k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f11072l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11073m;

    public c0(TextView textView) {
        this.f11062a = textView;
        this.f11070i = new k0(textView);
    }

    public static ak.g c(Context context, p pVar, int i10) {
        ColorStateList colorStateListF;
        synchronized (pVar) {
            colorStateListF = pVar.f11157a.f(context, i10);
        }
        if (colorStateListF == null) {
            return null;
        }
        ak.g gVar = new ak.g();
        gVar.f635b = true;
        gVar.f636c = colorStateListF;
        return gVar;
    }

    public final void a(Drawable drawable, ak.g gVar) {
        if (drawable == null || gVar == null) {
            return;
        }
        p.d(drawable, gVar, this.f11062a.getDrawableState());
    }

    public final void b() {
        ak.g gVar = this.f11063b;
        TextView textView = this.f11062a;
        if (gVar != null || this.f11064c != null || this.f11065d != null || this.f11066e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f11063b);
            a(compoundDrawables[1], this.f11064c);
            a(compoundDrawables[2], this.f11065d);
            a(compoundDrawables[3], this.f11066e);
        }
        if (this.f11067f == null && this.f11068g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f11067f);
        a(compoundDrawablesRelative[2], this.f11068g);
    }

    public final void d(AttributeSet attributeSet, int i10) {
        p pVar;
        String string;
        boolean z2;
        boolean z10;
        String string2;
        char c6;
        int i11;
        int i12;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        int[] iArr = i.a.f8053g;
        int[] iArr2 = i.a.f8063r;
        k0 k0Var = this.f11070i;
        TextView textView = this.f11062a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = p.f11155b;
        synchronized (p.class) {
            try {
                if (p.f11156c == null) {
                    p.c();
                }
                pVar = p.f11156c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int[] iArr3 = i.a.f8052f;
        ac.d dVarF = ac.d.F(context, attributeSet, iArr3, i10);
        TextView textView2 = this.f11062a;
        t4.l0.k(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) dVarF.f374c, i10);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f11063b = c(context, pVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f11064c = c(context, pVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f11065d = c(context, pVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f11066e = c(context, pVar, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f11067f = c(context, pVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f11068g = c(context, pVar, typedArray.getResourceId(6, 0));
        }
        dVarF.I();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            ac.d dVar = new ac.d(context, typedArrayObtainStyledAttributes);
            if (z11 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z10 = false;
            } else {
                z10 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            h(context, dVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            dVar.I();
        } else {
            string = null;
            z2 = false;
            z10 = false;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        ac.d dVar2 = new ac.d(context, typedArrayObtainStyledAttributes2);
        if (!z11 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z10 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z12 = z10;
        int i14 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i14 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        h(context, dVar2);
        dVar2.I();
        if (!z11 && z2) {
            this.f11062a.setAllCaps(z12);
        }
        Typeface typeface = this.f11072l;
        if (typeface != null) {
            if (this.f11071k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            a0.d(textView, string);
        }
        if (string2 != null) {
            z.b(textView, z.a(string2));
        }
        Context context2 = k0Var.f11119h;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView3 = k0Var.f11118g;
        t4.l0.k(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            k0Var.f11112a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            c6 = 3;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            c6 = 3;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = typedArrayObtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                int[] iArrA = k0.a(iArr4);
                k0Var.f11116e = iArrA;
                boolean z13 = iArrA.length > 0;
                k0Var.f11117f = z13;
                if (z13) {
                    k0Var.f11112a = 1;
                    k0Var.f11114c = iArrA[0];
                    k0Var.f11115d = iArrA[r3 - 1];
                    k0Var.f11113b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!k0Var.b()) {
            k0Var.f11112a = 0;
        } else if (k0Var.f11112a == 1) {
            if (!k0Var.f11117f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                k0Var.f11112a = 1;
                k0Var.f11114c = dimension2;
                k0Var.f11115d = dimension3;
                k0Var.f11113b = dimension;
                k0Var.f11117f = false;
            }
            if (k0Var.b() && k0Var.f11112a == 1 && (!k0Var.f11117f || k0Var.f11116e.length == 0)) {
                int iFloor = ((int) Math.floor((k0Var.f11115d - k0Var.f11114c) / k0Var.f11113b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i16 = 0; i16 < iFloor; i16++) {
                    iArr5[i16] = Math.round((i16 * k0Var.f11113b) + k0Var.f11114c);
                }
                k0Var.f11116e = k0.a(iArr5);
            }
        }
        if (k0Var.f11112a != 0) {
            int[] iArr6 = k0Var.f11116e;
            if (iArr6.length > 0) {
                if (a0.a(textView) != -1.0f) {
                    a0.b(textView, Math.round(k0Var.f11114c), Math.round(k0Var.f11115d), Math.round(k0Var.f11113b), 0);
                } else {
                    a0.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? pVar.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? pVar.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? pVar.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? pVar.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? pVar.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? pVar.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableA5 == null) {
                drawableA5 = compoundDrawablesRelative[0];
            }
            if (drawableA2 == null) {
                drawableA2 = compoundDrawablesRelative[1];
            }
            if (drawableA6 == null) {
                drawableA6 = compoundDrawablesRelative[2];
            }
            if (drawableA4 == null) {
                drawableA4 = compoundDrawablesRelative[c6];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[c6];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawablesRelative2[1];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawablesRelative2[c6];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableA2, compoundDrawablesRelative2[2], drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = i4.c.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(n0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i11 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i12 = -1;
            } else {
                int i17 = typedValuePeekValue.data;
                int i18 = i17 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i17);
                i12 = i18;
                i11 = -1;
            }
        } else {
            i11 = -1;
            i12 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i11) {
            u3.c.n(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i11) {
            u3.c.p(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i12 == i11) {
                u3.c.q(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                t4.v.k(textView, i12, dimensionPixelSize);
            } else {
                u3.c.q(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void e(Context context, int i10) throws Resources.NotFoundException {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, i.a.f8063r);
        ac.d dVar = new ac.d(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f11062a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        h(context, dVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            a0.d(textView, string);
        }
        dVar.I();
        Typeface typeface = this.f11072l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(ColorStateList colorStateList) {
        if (this.f11069h == null) {
            this.f11069h = new ak.g();
        }
        ak.g gVar = this.f11069h;
        gVar.f636c = colorStateList;
        gVar.f635b = colorStateList != null;
        this.f11063b = gVar;
        this.f11064c = gVar;
        this.f11065d = gVar;
        this.f11066e = gVar;
        this.f11067f = gVar;
        this.f11068g = gVar;
    }

    public final void g(PorterDuff.Mode mode) {
        if (this.f11069h == null) {
            this.f11069h = new ak.g();
        }
        ak.g gVar = this.f11069h;
        gVar.f637d = mode;
        gVar.f634a = mode != null;
        this.f11063b = gVar;
        this.f11064c = gVar;
        this.f11065d = gVar;
        this.f11066e = gVar;
        this.f11067f = gVar;
        this.f11068g = gVar;
    }

    public final void h(Context context, ac.d dVar) {
        String string;
        int i10 = this.j;
        TypedArray typedArray = (TypedArray) dVar.f374c;
        this.j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f11071k = i12;
            if (i12 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f11073m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f11072l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f11072l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f11072l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f11072l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f11071k;
        int i16 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceN = dVar.n(i14, this.j, new y(this, i15, i16, new WeakReference(this.f11062a)));
                if (typefaceN != null) {
                    if (i11 < 28 || this.f11071k == -1) {
                        this.f11072l = typefaceN;
                    } else {
                        this.f11072l = b0.a(Typeface.create(typefaceN, 0), this.f11071k, (this.j & 2) != 0);
                    }
                }
                this.f11073m = this.f11072l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f11072l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f11071k == -1) {
            this.f11072l = Typeface.create(string, this.j);
        } else {
            this.f11072l = b0.a(Typeface.create(string, 0), this.f11071k, (this.j & 2) != 0);
        }
    }
}
