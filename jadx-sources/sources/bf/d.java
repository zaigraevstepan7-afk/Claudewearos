package bf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import k4.l;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1758a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1759b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1760c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1761d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1762e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1763f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1764g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1765h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1766i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f1767k;

    /* renamed from: l, reason: collision with root package name */
    public float f1768l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1769m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1770n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1771o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f1772p;

    public d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, i.a.f8063r);
        this.f1768l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1767k = wd.a.z(context, typedArrayObtainStyledAttributes, 3);
        wd.a.z(context, typedArrayObtainStyledAttributes, 4);
        wd.a.z(context, typedArrayObtainStyledAttributes, 5);
        this.f1761d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1762e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1769m = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f1759b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f1758a = wd.a.z(context, typedArrayObtainStyledAttributes, 6);
        this.f1763f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f1764g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1765h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, me.a.f11657q);
        this.f1766i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f1760c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1772p;
        int i10 = this.f1761d;
        if (typeface == null && (str = this.f1759b) != null) {
            this.f1772p = Typeface.create(str, i10);
        }
        if (this.f1772p == null) {
            int i11 = this.f1762e;
            if (i11 == 1) {
                this.f1772p = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f1772p = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f1772p = Typeface.DEFAULT;
            } else {
                this.f1772p = Typeface.MONOSPACE;
            }
            this.f1772p = Typeface.create(this.f1772p, i10);
        }
    }

    public final void b(Context context, x8.a aVar) {
        if (!c(context)) {
            a();
        }
        int i10 = this.f1769m;
        if (i10 == 0) {
            this.f1770n = true;
        }
        if (this.f1770n) {
            aVar.S(this.f1772p, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = l.f9440a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                l.b(context, i10, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1770n = true;
            aVar.R(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f1759b, e10);
            this.f1770n = true;
            aVar.R(-3);
        }
    }

    public final boolean c(Context context) throws Exception {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        if (this.f1770n) {
            return true;
        }
        int i10 = this.f1769m;
        if (i10 != 0) {
            ThreadLocal threadLocal = l.f9440a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceB = null;
            } else {
                context2 = context;
                typefaceB = l.b(context2, i10, new TypedValue(), 0, null, false, true);
            }
            if (typefaceB != null) {
                this.f1772p = typefaceB;
                this.f1770n = true;
                return true;
            }
            if (!this.f1771o) {
                this.f1771o = true;
                Resources resources = context2.getResources();
                int i11 = this.f1769m;
                if (i11 == 0 || !resources.getResourceTypeName(i11).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f1761d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i11);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), g4.a.f7196b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f1761d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f1772p = typefaceCreate2;
                this.f1770n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, x8.a aVar) {
        e(context, textPaint, aVar);
        ColorStateList colorStateList = this.f1767k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1758a;
        textPaint.setShadowLayer(this.f1765h, this.f1763f, this.f1764g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, x8.a aVar) {
        Typeface typeface;
        if (c(context) && this.f1770n && (typeface = this.f1772p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f1772p);
        b(context, new c(this, context, textPaint, aVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM = f.M(context.getResources().getConfiguration(), typeface);
        if (typefaceM != null) {
            typeface = typefaceM;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f1761d;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1768l);
        textPaint.setFontVariationSettings(this.f1760c);
        if (this.f1766i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
