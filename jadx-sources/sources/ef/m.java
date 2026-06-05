package ef;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public a.a f6018a = new k();

    /* renamed from: b, reason: collision with root package name */
    public a.a f6019b = new k();

    /* renamed from: c, reason: collision with root package name */
    public a.a f6020c = new k();

    /* renamed from: d, reason: collision with root package name */
    public a.a f6021d = new k();

    /* renamed from: e, reason: collision with root package name */
    public d f6022e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f6023f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f6024g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f6025h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f6026i = new f();
    public f j = new f();

    /* renamed from: k, reason: collision with root package name */
    public f f6027k = new f();

    /* renamed from: l, reason: collision with root package name */
    public f f6028l = new f();

    public static l a(Context context, int i10, int i11, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(me.a.f11661u);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            d dVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            d dVarC2 = c(typedArrayObtainStyledAttributes, 8, dVarC);
            d dVarC3 = c(typedArrayObtainStyledAttributes, 9, dVarC);
            d dVarC4 = c(typedArrayObtainStyledAttributes, 7, dVarC);
            d dVarC5 = c(typedArrayObtainStyledAttributes, 6, dVarC);
            l lVar = new l();
            lVar.f6007a = cg.b.B(i13);
            lVar.f6011e = dVarC2;
            lVar.f6008b = cg.b.B(i14);
            lVar.f6012f = dVarC3;
            lVar.f6009c = cg.b.B(i15);
            lVar.f6013g = dVarC4;
            lVar.f6010d = cg.b.B(i16);
            lVar.f6014h = dVarC5;
            return lVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static l b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.a.f11655o, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        return (this.f6019b instanceof k) && (this.f6018a instanceof k) && (this.f6020c instanceof k) && (this.f6021d instanceof k);
    }

    public final boolean e(RectF rectF) {
        boolean z2 = this.f6028l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.f6026i.getClass().equals(f.class) && this.f6027k.getClass().equals(f.class);
        float fA = this.f6022e.a(rectF);
        return z2 && ((this.f6023f.a(rectF) > fA ? 1 : (this.f6023f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f6025h.a(rectF) > fA ? 1 : (this.f6025h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f6024g.a(rectF) > fA ? 1 : (this.f6024g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final l f() {
        l lVar = new l();
        lVar.f6007a = this.f6018a;
        lVar.f6008b = this.f6019b;
        lVar.f6009c = this.f6020c;
        lVar.f6010d = this.f6021d;
        lVar.f6011e = this.f6022e;
        lVar.f6012f = this.f6023f;
        lVar.f6013g = this.f6024g;
        lVar.f6014h = this.f6025h;
        lVar.f6015i = this.f6026i;
        lVar.j = this.j;
        lVar.f6016k = this.f6027k;
        lVar.f6017l = this.f6028l;
        return lVar;
    }

    public final String toString() {
        return "[" + this.f6022e + ", " + this.f6023f + ", " + this.f6024g + ", " + this.f6025h + "]";
    }
}
