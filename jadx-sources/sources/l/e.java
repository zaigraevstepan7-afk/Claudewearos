package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.anonlab.voidlauncher.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.h1;
import m.k1;
import m.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends j implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View G;
    public View H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean O;
    public m P;
    public ViewTreeObserver Q;
    public PopupWindow.OnDismissListener R;
    public boolean S;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9764c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9765d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9766e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f9767f;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f9768z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final c B = new c(this, 0);
    public final c2.e C = new c2.e(this, 2);
    public final p7.k D = new p7.k(this, 12);
    public int E = 0;
    public int F = 0;
    public boolean N = false;

    public e(Context context, View view, int i10, boolean z2) {
        this.f9763b = context;
        this.G = view;
        this.f9765d = i10;
        this.f9766e = z2;
        this.I = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f9764c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9767f = new Handler();
    }

    @Override // l.n
    public final void a(h hVar, boolean z2) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (hVar == ((d) arrayList.get(i10)).f9761b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f9761b.c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        h hVar2 = dVar.f9761b;
        k1 k1Var = dVar.f9760a;
        v vVar = k1Var.O;
        CopyOnWriteArrayList copyOnWriteArrayList = hVar2.f9793s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null || nVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.S) {
            h1.b(vVar, null);
            vVar.setAnimationStyle(0);
        }
        k1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.I = ((d) arrayList.get(size2 - 1)).f9762c;
        } else {
            this.I = this.G.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((d) arrayList.get(0)).f9761b.c(false);
                return;
            }
            return;
        }
        dismiss();
        m mVar = this.P;
        if (mVar != null) {
            mVar.a(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.Q.removeGlobalOnLayoutListener(this.B);
            }
            this.Q = null;
        }
        this.H.removeOnAttachStateChangeListener(this.C);
        this.R.onDismiss();
    }

    @Override // l.n
    public final boolean c() {
        return false;
    }

    @Override // l.p
    public final boolean d() {
        ArrayList arrayList = this.A;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f9760a.O.isShowing();
    }

    @Override // l.p
    public final void dismiss() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f9760a.O.isShowing()) {
                    dVar.f9760a.dismiss();
                }
            }
        }
    }

    @Override // l.p
    public final void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (d()) {
            return;
        }
        ArrayList arrayList = this.f9768z;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u((h) obj);
        }
        arrayList.clear();
        View view = this.G;
        this.H = view;
        if (view != null) {
            boolean z2 = this.Q == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.Q = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.B);
            }
            this.H.addOnAttachStateChangeListener(this.C);
        }
    }

    @Override // l.n
    public final void f() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).f9760a.f11086c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.p
    public final ListView g() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f9760a.f11086c;
    }

    @Override // l.n
    public final void h(m mVar) {
        this.P = mVar;
    }

    @Override // l.n
    public final boolean j(r rVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (rVar == dVar.f9761b) {
                dVar.f9760a.f11086c.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m mVar = this.P;
        if (mVar != null) {
            mVar.c(rVar);
        }
        return true;
    }

    @Override // l.j
    public final void l(h hVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        hVar.b(this, this.f9763b);
        if (d()) {
            u(hVar);
        } else {
            this.f9768z.add(hVar);
        }
    }

    @Override // l.j
    public final void n(View view) {
        if (this.G != view) {
            this.G = view;
            this.F = Gravity.getAbsoluteGravity(this.E, view.getLayoutDirection());
        }
    }

    @Override // l.j
    public final void o(boolean z2) {
        this.N = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f9760a.O.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f9761b.c(false);
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
        if (this.E != i10) {
            this.E = i10;
            this.F = Gravity.getAbsoluteGravity(i10, this.G.getLayoutDirection());
        }
    }

    @Override // l.j
    public final void q(int i10) {
        this.J = true;
        this.L = i10;
    }

    @Override // l.j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.R = onDismissListener;
    }

    @Override // l.j
    public final void s(boolean z2) {
        this.O = z2;
    }

    @Override // l.j
    public final void t(int i10) {
        this.K = true;
        this.M = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(l.h r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.u(l.h):void");
    }
}
