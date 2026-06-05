package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f1 implements l.p {
    public static final Method P;
    public static final Method Q;
    public boolean A;
    public boolean B;
    public c1 D;
    public View E;
    public l.j F;
    public final Handler K;
    public Rect M;
    public boolean N;
    public final v O;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11084a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f11085b;

    /* renamed from: c, reason: collision with root package name */
    public j1 f11086c;

    /* renamed from: e, reason: collision with root package name */
    public int f11088e;

    /* renamed from: f, reason: collision with root package name */
    public int f11089f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11090z;

    /* renamed from: d, reason: collision with root package name */
    public int f11087d = -2;
    public int C = 0;
    public final b1 G = new b1(this, 1);
    public final e1 H = new e1(this, 0);
    public final d1 I = new d1(this);
    public final b1 J = new b1(this, 0);
    public final Rect L = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                P = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public f1(Context context, int i10) {
        int resourceId;
        this.f11084a = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, i.a.f8057l, i10, 0);
        this.f11088e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f11089f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11090z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        v vVar = new v(context, null, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, i.a.f8061p, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            vVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        vVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : u6.v.G(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.O = vVar;
        vVar.setInputMethodMode(1);
    }

    public final void b(ListAdapter listAdapter) {
        c1 c1Var = this.D;
        if (c1Var == null) {
            this.D = new c1(this);
        } else {
            ListAdapter listAdapter2 = this.f11085b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1Var);
            }
        }
        this.f11085b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.D);
        }
        j1 j1Var = this.f11086c;
        if (j1Var != null) {
            j1Var.setAdapter(this.f11085b);
        }
    }

    @Override // l.p
    public final boolean d() {
        return this.O.isShowing();
    }

    @Override // l.p
    public final void dismiss() {
        v vVar = this.O;
        vVar.dismiss();
        vVar.setContentView(null);
        this.f11086c = null;
        this.K.removeCallbacks(this.G);
    }

    @Override // l.p
    public final void e() {
        int i10;
        j1 j1Var;
        j1 j1Var2 = this.f11086c;
        Context context = this.f11084a;
        v vVar = this.O;
        if (j1Var2 == null) {
            j1 j1Var3 = new j1(context, !this.N);
            j1Var3.setHoverListener((k1) this);
            this.f11086c = j1Var3;
            j1Var3.setAdapter(this.f11085b);
            this.f11086c.setOnItemClickListener(this.F);
            this.f11086c.setFocusable(true);
            this.f11086c.setFocusableInTouchMode(true);
            this.f11086c.setOnItemSelectedListener(new y0(this));
            this.f11086c.setOnScrollListener(this.I);
            vVar.setContentView(this.f11086c);
        }
        Drawable background = vVar.getBackground();
        Rect rect = this.L;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f11090z) {
                this.f11089f = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = z0.a(vVar, this.E, this.f11089f, vVar.getInputMethodMode() == 2);
        int i12 = this.f11087d;
        int iA2 = this.f11086c.a(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.f11086c.getPaddingBottom() + this.f11086c.getPaddingTop() + i10 : 0);
        vVar.getInputMethodMode();
        vVar.setWindowLayoutType(1002);
        if (vVar.isShowing()) {
            if (this.E.isAttachedToWindow()) {
                int width = this.f11087d;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.E.getWidth();
                }
                vVar.setOutsideTouchable(true);
                vVar.update(this.E, this.f11088e, this.f11089f, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f11087d;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.E.getWidth();
        }
        vVar.setWidth(width2);
        vVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = P;
            if (method != null) {
                try {
                    method.invoke(vVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a1.b(vVar, true);
        }
        vVar.setOutsideTouchable(true);
        vVar.setTouchInterceptor(this.H);
        if (this.B) {
            vVar.setOverlapAnchor(this.A);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(vVar, this.M);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            a1.a(vVar, this.M);
        }
        vVar.showAsDropDown(this.E, this.f11088e, this.f11089f, this.C);
        this.f11086c.setSelection(-1);
        if ((!this.N || this.f11086c.isInTouchMode()) && (j1Var = this.f11086c) != null) {
            j1Var.setListSelectionHidden(true);
            j1Var.requestLayout();
        }
        if (this.N) {
            return;
        }
        this.K.post(this.J);
    }

    @Override // l.p
    public final ListView g() {
        return this.f11086c;
    }
}
