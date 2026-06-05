package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f11124a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11125b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11126c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11127d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11128e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11129f;

    public m(View view) {
        p pVar;
        this.f11124a = -1;
        this.f11125b = view;
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
        this.f11126c = pVar;
    }

    public void a() {
        View view = (View) this.f11125b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((ak.g) this.f11127d) != null) {
                if (((ak.g) this.f11129f) == null) {
                    this.f11129f = new ak.g();
                }
                ak.g gVar = (ak.g) this.f11129f;
                gVar.f636c = null;
                gVar.f635b = false;
                gVar.f637d = null;
                gVar.f634a = false;
                Field field = t4.l0.f15744a;
                ColorStateList colorStateListC = t4.d0.c(view);
                if (colorStateListC != null) {
                    gVar.f635b = true;
                    gVar.f636c = colorStateListC;
                }
                PorterDuff.Mode modeD = t4.d0.d(view);
                if (modeD != null) {
                    gVar.f634a = true;
                    gVar.f637d = modeD;
                }
                if (gVar.f635b || gVar.f634a) {
                    p.d(background, gVar, view.getDrawableState());
                    return;
                }
            }
            ak.g gVar2 = (ak.g) this.f11128e;
            if (gVar2 != null) {
                p.d(background, gVar2, view.getDrawableState());
                return;
            }
            ak.g gVar3 = (ak.g) this.f11127d;
            if (gVar3 != null) {
                p.d(background, gVar3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        ak.g gVar = (ak.g) this.f11128e;
        if (gVar != null) {
            return (ColorStateList) gVar.f636c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        ak.g gVar = (ak.g) this.f11128e;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f637d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListF;
        View view = (View) this.f11125b;
        Context context = view.getContext();
        int[] iArr = i.a.f8065t;
        ac.d dVarF = ac.d.F(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        View view2 = (View) this.f11125b;
        t4.l0.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) dVarF.f374c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f11124a = typedArray.getResourceId(0, -1);
                p pVar = (p) this.f11126c;
                Context context2 = view.getContext();
                int i11 = this.f11124a;
                synchronized (pVar) {
                    colorStateListF = pVar.f11157a.f(context2, i11);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                t4.d0.g(view, dVarF.i(1));
            }
            if (typedArray.hasValue(2)) {
                t4.d0.h(view, n0.b(typedArray.getInt(2, -1), null));
            }
            dVarF.I();
        } catch (Throwable th2) {
            dVarF.I();
            throw th2;
        }
    }

    public void e() {
        this.f11124a = -1;
        g(null);
        a();
    }

    public void f(int i10) {
        ColorStateList colorStateListF;
        this.f11124a = i10;
        p pVar = (p) this.f11126c;
        if (pVar != null) {
            Context context = ((View) this.f11125b).getContext();
            synchronized (pVar) {
                colorStateListF = pVar.f11157a.f(context, i10);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((ak.g) this.f11127d) == null) {
                this.f11127d = new ak.g();
            }
            ak.g gVar = (ak.g) this.f11127d;
            gVar.f636c = colorStateList;
            gVar.f635b = true;
        } else {
            this.f11127d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((ak.g) this.f11128e) == null) {
            this.f11128e = new ak.g();
        }
        ak.g gVar = (ak.g) this.f11128e;
        gVar.f636c = colorStateList;
        gVar.f635b = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((ak.g) this.f11128e) == null) {
            this.f11128e = new ak.g();
        }
        ak.g gVar = (ak.g) this.f11128e;
        gVar.f637d = mode;
        gVar.f634a = true;
        a();
    }

    public m() {
        this.f11125b = new t2.o[32];
        this.f11126c = new float[32];
        this.f11127d = new byte[32];
        q.h0 h0Var = q.o0.f13110a;
        this.f11128e = new q.h0();
        this.f11129f = new q.h0();
    }
}
