package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.r0;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class o extends Dialog implements androidx.lifecycle.t, d0, j6.c, a7.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f1849a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.j f1850b;

    /* renamed from: c, reason: collision with root package name */
    public final pi.m f1851c;

    /* renamed from: d, reason: collision with root package name */
    public final pi.m f1852d;

    public o(Context context, int i10) {
        super(context, i10);
        this.f1850b = new t0.j(new c7.b(this, new a7.e(this, 0)));
        final int i11 = 0;
        this.f1851c = u6.v.Q(new ej.a(this) { // from class: c.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f1848b;

            {
                this.f1848b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i11) {
                    case 0:
                        j6.a aVar = new j6.a();
                        this.f1848b.a().f1803b.b(aVar);
                        return aVar;
                    default:
                        return new b0(new ac.o(this.f1848b, 5));
                }
            }
        });
        final int i12 = 1;
        this.f1852d = u6.v.Q(new ej.a(this) { // from class: c.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f1848b;

            {
                this.f1848b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i12) {
                    case 0:
                        j6.a aVar = new j6.a();
                        this.f1848b.a().f1803b.b(aVar);
                        return aVar;
                    default:
                        return new b0(new ac.o(this.f1848b, 5));
                }
            }
        });
    }

    public static void c(o oVar) {
        super.onBackPressed();
    }

    @Override // c.d0
    public final b0 a() {
        return (b0) this.f1852d.getValue();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fj.l.f(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // j6.c
    public final wh.s b() {
        return a().f1803b;
    }

    public final void d() {
        Window window = getWindow();
        fj.l.c(window);
        View decorView = window.getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        r0.i(decorView, this);
        Window window2 = getWindow();
        fj.l.c(window2);
        View decorView2 = window2.getDecorView();
        fj.l.e(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        fj.l.c(window3);
        View decorView3 = window3.getDecorView();
        fj.l.e(decorView3, "getDecorView(...)");
        uk.c.P(decorView3, this);
        Window window4 = getWindow();
        fj.l.c(window4);
        View decorView4 = window4.getDecorView();
        fj.l.e(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // a7.f
    public final mh.g g() {
        return (mh.g) this.f1850b.f15364c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v h() {
        androidx.lifecycle.v vVar = this.f1849a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this, true);
        this.f1849a = vVar2;
        return vVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((j6.a) this.f1851c.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            b0 b0VarA = a();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            fj.l.e(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            b0VarA.b(onBackInvokedDispatcher);
        }
        this.f1850b.r(bundle);
        androidx.lifecycle.v vVar = this.f1849a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this, true);
            this.f1849a = vVar;
        }
        vVar.d(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        fj.l.e(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f1850b.s(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.v vVar = this.f1849a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this, true);
            this.f1849a = vVar;
        }
        vVar.d(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        androidx.lifecycle.v vVar = this.f1849a;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this, true);
            this.f1849a = vVar;
        }
        vVar.d(androidx.lifecycle.n.ON_DESTROY);
        this.f1849a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        fj.l.f(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fj.l.f(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
