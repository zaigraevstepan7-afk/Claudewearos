package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import m.j1;
import m.k1;
import m.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends j implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final k1 A;
    public PopupWindow.OnDismissListener D;
    public View E;
    public View F;
    public m G;
    public ViewTreeObserver H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean M;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9833b;

    /* renamed from: c, reason: collision with root package name */
    public final h f9834c;

    /* renamed from: d, reason: collision with root package name */
    public final f f9835d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9836e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9837f;

    /* renamed from: z, reason: collision with root package name */
    public final int f9838z;
    public final c B = new c(this, 1);
    public final c2.e C = new c2.e(this, 3);
    public int L = 0;

    public q(Context context, h hVar, View view, int i10, boolean z2) {
        this.f9833b = context;
        this.f9834c = hVar;
        this.f9836e = z2;
        this.f9835d = new f(hVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f9838z = i10;
        Resources resources = context.getResources();
        this.f9837f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.E = view;
        this.A = new k1(context, i10);
        hVar.b(this, context);
    }

    @Override // l.n
    public final void a(h hVar, boolean z2) {
        if (hVar != this.f9834c) {
            return;
        }
        dismiss();
        m mVar = this.G;
        if (mVar != null) {
            mVar.a(hVar, z2);
        }
    }

    @Override // l.n
    public final boolean c() {
        return false;
    }

    @Override // l.p
    public final boolean d() {
        return !this.I && this.A.O.isShowing();
    }

    @Override // l.p
    public final void dismiss() {
        if (d()) {
            this.A.dismiss();
        }
    }

    @Override // l.p
    public final void e() {
        View view;
        if (d()) {
            return;
        }
        if (this.I || (view = this.E) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.F = view;
        k1 k1Var = this.A;
        v vVar = k1Var.O;
        v vVar2 = k1Var.O;
        vVar.setOnDismissListener(this);
        k1Var.F = this;
        k1Var.N = true;
        vVar2.setFocusable(true);
        View view2 = this.F;
        boolean z2 = this.H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.H = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.B);
        }
        view2.addOnAttachStateChangeListener(this.C);
        k1Var.E = view2;
        k1Var.C = this.L;
        boolean z10 = this.J;
        Context context = this.f9833b;
        f fVar = this.f9835d;
        if (!z10) {
            this.K = j.m(fVar, context, this.f9837f);
            this.J = true;
        }
        int i10 = this.K;
        Rect rect = k1Var.L;
        Drawable background = vVar2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            k1Var.f11087d = rect.left + rect.right + i10;
        } else {
            k1Var.f11087d = i10;
        }
        vVar2.setInputMethodMode(2);
        Rect rect2 = this.f9821a;
        k1Var.M = rect2 != null ? new Rect(rect2) : null;
        k1Var.e();
        j1 j1Var = k1Var.f11086c;
        j1Var.setOnKeyListener(this);
        if (this.M) {
            h hVar = this.f9834c;
            if (hVar.f9786l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) j1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(hVar.f9786l);
                }
                frameLayout.setEnabled(false);
                j1Var.addHeaderView(frameLayout, null, false);
            }
        }
        k1Var.b(fVar);
        k1Var.e();
    }

    @Override // l.n
    public final void f() {
        this.J = false;
        f fVar = this.f9835d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // l.p
    public final ListView g() {
        return this.A.f11086c;
    }

    @Override // l.n
    public final void h(m mVar) {
        this.G = mVar;
    }

    @Override // l.n
    public final boolean j(r rVar) {
        boolean z2;
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f9833b, rVar, this.F, this.f9836e, this.f9838z, 0);
            m mVar = this.G;
            lVar.f9830h = mVar;
            j jVar = lVar.f9831i;
            if (jVar != null) {
                jVar.h(mVar);
            }
            int size = rVar.f9781f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = rVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i10++;
            }
            lVar.f9829g = z2;
            j jVar2 = lVar.f9831i;
            if (jVar2 != null) {
                jVar2.o(z2);
            }
            lVar.j = this.D;
            this.D = null;
            this.f9834c.c(false);
            k1 k1Var = this.A;
            int width = k1Var.f11088e;
            int i11 = !k1Var.f11090z ? 0 : k1Var.f11089f;
            if ((Gravity.getAbsoluteGravity(this.L, this.E.getLayoutDirection()) & 7) == 5) {
                width += this.E.getWidth();
            }
            if (!lVar.b()) {
                if (lVar.f9827e != null) {
                    lVar.d(width, i11, true, true);
                }
            }
            m mVar2 = this.G;
            if (mVar2 != null) {
                mVar2.c(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // l.j
    public final void n(View view) {
        this.E = view;
    }

    @Override // l.j
    public final void o(boolean z2) {
        this.f9835d.f9771c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.I = true;
        this.f9834c.c(true);
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.H = this.F.getViewTreeObserver();
            }
            this.H.removeGlobalOnLayoutListener(this.B);
            this.H = null;
        }
        this.F.removeOnAttachStateChangeListener(this.C);
        PopupWindow.OnDismissListener onDismissListener = this.D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.j
    public final void p(int i10) {
        this.L = i10;
    }

    @Override // l.j
    public final void q(int i10) {
        this.A.f11088e = i10;
    }

    @Override // l.j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // l.j
    public final void s(boolean z2) {
        this.M = z2;
    }

    @Override // l.j
    public final void t(int i10) {
        k1 k1Var = this.A;
        k1Var.f11089f = i10;
        k1Var.f11090z = true;
    }

    @Override // l.j
    public final void l(h hVar) {
    }
}
