package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.anonlab.voidlauncher.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: g, reason: collision with root package name */
    public static m1 f11131g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f11133a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f11134b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f11135c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11136d;

    /* renamed from: e, reason: collision with root package name */
    public uf.p f11137e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f11130f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final l1 f11132h = new l1(6);

    public static synchronized m1 b() {
        try {
            if (f11131g == null) {
                f11131g = new m1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11131g;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        l1 l1Var = f11132h;
        l1Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) l1Var.get(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i10) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f11135c == null) {
            this.f11135c = new TypedValue();
        }
        TypedValue typedValue = this.f11135c;
        context.getResources().getValue(i10, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            q.p pVar = (q.p) this.f11134b.get(context);
            drawableNewDrawable = null;
            if (pVar != null && (weakReference = (WeakReference) pVar.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    pVar.f(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableQ = null;
        if (this.f11137e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableQ = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableQ = uf.p.q(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableQ = uf.p.q(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableQ = uf.p.q(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableQ == null) {
            return layerDrawableQ;
        }
        layerDrawableQ.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableQ.getConstantState();
                if (constantState2 != null) {
                    q.p pVar2 = (q.p) this.f11134b.get(context);
                    if (pVar2 == null) {
                        pVar2 = new q.p((Object) null);
                        this.f11134b.put(context, pVar2);
                    }
                    pVar2.e(j, new WeakReference(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableQ;
    }

    public final synchronized Drawable c(Context context, int i10) {
        return d(context, i10);
    }

    public final synchronized Drawable d(Context context, int i10) {
        Drawable drawableA;
        try {
            if (!this.f11136d) {
                this.f11136d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof m7.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f11136d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i10);
            if (drawableA == null) {
                drawableA = i4.c.getDrawable(context, i10);
            }
            if (drawableA != null) {
                drawableA = g(context, i10, drawableA);
            }
            if (drawableA != null) {
                n0.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i10) {
        ColorStateList colorStateList;
        q.q0 q0Var;
        WeakHashMap weakHashMap = this.f11133a;
        ColorStateList colorStateListR = null;
        colorStateList = (weakHashMap == null || (q0Var = (q.q0) weakHashMap.get(context)) == null) ? null : (ColorStateList) q0Var.c(i10);
        if (colorStateList == null) {
            uf.p pVar = this.f11137e;
            if (pVar != null) {
                colorStateListR = pVar.r(context, i10);
            }
            if (colorStateListR != null) {
                if (this.f11133a == null) {
                    this.f11133a = new WeakHashMap();
                }
                q.q0 q0Var2 = (q.q0) this.f11133a.get(context);
                if (q0Var2 == null) {
                    q0Var2 = new q.q0(0);
                    this.f11133a.put(context, q0Var2);
                }
                q0Var2.a(i10, colorStateListR);
            }
            colorStateList = colorStateListR;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.m1.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
