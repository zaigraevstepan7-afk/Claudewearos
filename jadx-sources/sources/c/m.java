package c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import androidx.lifecycle.r0;
import androidx.lifecycle.t;
import androidx.lifecycle.y0;
import c.l;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m extends Activity implements b1, androidx.lifecycle.j, a7.f, d0, j6.c, g.g, androidx.lifecycle.t {
    public final AtomicInteger A;
    public final l B;
    public final CopyOnWriteArrayList C;
    public final CopyOnWriteArrayList D;
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public boolean I;
    public boolean J;
    public final pi.m K;
    public final pi.m L;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1840a = new androidx.lifecycle.v(this, true);

    /* renamed from: b, reason: collision with root package name */
    public final f.a f1841b;

    /* renamed from: c, reason: collision with root package name */
    public final p1.l f1842c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.j f1843d;

    /* renamed from: e, reason: collision with root package name */
    public a1 f1844e;

    /* renamed from: f, reason: collision with root package name */
    public final j f1845f;

    /* renamed from: z, reason: collision with root package name */
    public final pi.m f1846z;

    public m() {
        f.a aVar = new f.a();
        this.f1841b = aVar;
        this.f1842c = new p1.l(new c(this, 1));
        c7.b bVar = new c7.b(this, new a7.e(this, 0));
        t0.j jVar = new t0.j(bVar);
        this.f1843d = jVar;
        this.f1845f = new j(this);
        this.f1846z = u6.v.Q(new d(this, 1));
        this.A = new AtomicInteger();
        this.B = new l(this);
        this.C = new CopyOnWriteArrayList();
        this.D = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.K = u6.v.Q(new d(this, 2));
        androidx.lifecycle.v vVar = this.f1840a;
        if (vVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i10 = 0;
        vVar.a(new androidx.lifecycle.r(this) { // from class: c.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f1818b;

            {
                this.f1818b = this;
            }

            @Override // androidx.lifecycle.r
            public final void e(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
                Window window;
                View viewPeekDecorView;
                switch (i10) {
                    case 0:
                        m mVar = this.f1818b;
                        if (nVar == androidx.lifecycle.n.ON_STOP && (window = mVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        m mVar2 = this.f1818b;
                        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                            mVar2.f1841b.f6098b = null;
                            if (!mVar2.isChangingConfigurations()) {
                                mVar2.e().a();
                            }
                            j jVar2 = mVar2.f1845f;
                            m mVar3 = jVar2.f1827d;
                            mVar3.getWindow().getDecorView().removeCallbacks(jVar2);
                            mVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f1840a.a(new androidx.lifecycle.r(this) { // from class: c.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f1818b;

            {
                this.f1818b = this;
            }

            @Override // androidx.lifecycle.r
            public final void e(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
                Window window;
                View viewPeekDecorView;
                switch (i11) {
                    case 0:
                        m mVar = this.f1818b;
                        if (nVar == androidx.lifecycle.n.ON_STOP && (window = mVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        m mVar2 = this.f1818b;
                        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                            mVar2.f1841b.f6098b = null;
                            if (!mVar2.isChangingConfigurations()) {
                                mVar2.e().a();
                            }
                            j jVar2 = mVar2.f1845f;
                            m mVar3 = jVar2.f1827d;
                            mVar3.getWindow().getDecorView().removeCallbacks(jVar2);
                            mVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar2);
                            break;
                        }
                        break;
                }
            }
        });
        this.f1840a.a(new a7.b(this, 3));
        bVar.a();
        r0.d(this);
        ((mh.g) jVar.f15364c).z("android:support:activity-result", new g(this, 0));
        h hVar = new h(this, 0);
        m mVar = aVar.f6098b;
        if (mVar != null) {
            hVar.a(mVar);
        }
        aVar.f6097a.add(hVar);
        u6.v.Q(new d(this, 3));
        this.L = u6.v.Q(new d(this, 4));
    }

    public static void f(m mVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!fj.l.b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!fj.l.b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    @Override // c.d0
    public final b0 a() {
        return (b0) this.L.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        this.f1845f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // j6.c
    public final wh.s b() {
        return a().f1803b;
    }

    @Override // androidx.lifecycle.j
    public final d6.c c() {
        d6.c cVar = new d6.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f4977a;
        if (application != null) {
            linkedHashMap.put(y0.f1158f, getApplication());
        }
        linkedHashMap.put(r0.f1122a, this);
        linkedHashMap.put(r0.f1123b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(r0.f1124c, extras);
        }
        return cVar;
    }

    @Override // g.g
    public final l d() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.m.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        fj.l.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        if (uk.c.x(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.b1
    public final a1 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1844e == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f1844e = iVar.f1823a;
            }
            if (this.f1844e == null) {
                this.f1844e = new a1();
            }
        }
        a1 a1Var = this.f1844e;
        fj.l.c(a1Var);
        return a1Var;
    }

    @Override // a7.f
    public final mh.g g() {
        return (mh.g) this.f1843d.f15364c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v h() {
        return this.f1840a;
    }

    public final void i(s4.a aVar) {
        fj.l.f(aVar, "listener");
        this.C.add(aVar);
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        r0.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        fj.l.e(decorView2, "getDecorView(...)");
        r0.j(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        fj.l.e(decorView3, "getDecorView(...)");
        uk.c.P(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        fj.l.e(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        fj.l.e(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        fj.l.e(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = n0.f1109b;
        k0.b(this);
    }

    public final void l(Bundle bundle) {
        fj.l.f(bundle, "outState");
        androidx.lifecycle.o oVar = androidx.lifecycle.o.f1111a;
        this.f1840a.g();
        super.onSaveInstanceState(bundle);
    }

    public final g.f m(final h.b bVar, final g.b bVar2) {
        final l lVar = this.B;
        fj.l.f(lVar, "registry");
        final String str = "activity_rq#" + this.A.getAndIncrement();
        LinkedHashMap linkedHashMap = lVar.f1834c;
        fj.l.f(str, "key");
        androidx.lifecycle.v vVar = this.f1840a;
        if (vVar.f1141c.compareTo(androidx.lifecycle.o.f1114d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + vVar.f1141c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        lVar.d(str);
        g.e eVar = (g.e) linkedHashMap.get(str);
        if (eVar == null) {
            eVar = new g.e(vVar);
        }
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: g.c
            @Override // androidx.lifecycle.r
            public final void e(t tVar, n nVar) {
                n nVar2 = n.ON_START;
                l lVar2 = lVar;
                String str2 = str;
                if (nVar2 != nVar) {
                    if (n.ON_STOP == nVar) {
                        lVar2.f1836e.remove(str2);
                        return;
                    } else {
                        if (n.ON_DESTROY == nVar) {
                            lVar2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = lVar2.f1836e;
                Bundle bundle = lVar2.f1838g;
                LinkedHashMap linkedHashMap3 = lVar2.f1837f;
                b bVar3 = bVar2;
                linkedHashMap2.put(str2, new d(bVar3, bVar));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar3.b(obj);
                }
                a aVar = (a) v.H(bundle, str2);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar3.b(new a(aVar.f6831a, aVar.f6832b));
                }
            }
        };
        eVar.f6839a.a(rVar);
        eVar.f6840b.add(rVar);
        linkedHashMap.put(str, eVar);
        return new g.f(lVar, str, bVar, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.B.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((j6.a) this.K.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        fj.l.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.C.iterator();
        fj.l.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((s4.a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1843d.r(bundle);
        f.a aVar = this.f1841b;
        aVar.getClass();
        aVar.f6098b = this;
        Iterator it = aVar.f6097a.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(this);
        }
        k(bundle);
        int i10 = n0.f1109b;
        k0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        fj.l.f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1842c.f12661c).iterator();
        while (it.hasNext()) {
            ((w5.b0) it.next()).f18612a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        fj.l.f(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f1842c.f12661c).iterator();
            while (it.hasNext()) {
                if (((w5.b0) it.next()).f18612a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.I) {
            return;
        }
        Iterator it = this.F.iterator();
        fj.l.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((s4.a) it.next()).accept(new h4.e(z2));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        fj.l.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.E.iterator();
        fj.l.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((s4.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        fj.l.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1842c.f12661c).iterator();
        while (it.hasNext()) {
            ((w5.b0) it.next()).f18612a.q();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.J) {
            return;
        }
        Iterator it = this.G.iterator();
        fj.l.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((s4.a) it.next()).accept(new h4.q(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        fj.l.f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1842c.f12661c).iterator();
        while (it.hasNext()) {
            ((w5.b0) it.next()).f18612a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        fj.l.f(strArr, "permissions");
        fj.l.f(iArr, "grantResults");
        if (this.B.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        a1 a1Var = this.f1844e;
        if (a1Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            a1Var = iVar.f1823a;
        }
        if (a1Var == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f1823a = a1Var;
        return iVar2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        fj.l.f(bundle, "outState");
        androidx.lifecycle.v vVar = this.f1840a;
        if (vVar != null) {
            androidx.lifecycle.o oVar = androidx.lifecycle.o.f1111a;
            vVar.g();
        }
        l(bundle);
        this.f1843d.s(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.D.iterator();
        fj.l.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((s4.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.H.iterator();
        fj.l.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (yd.f.H()) {
                Trace.beginSection(yd.f.l0("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            v vVar = (v) this.f1846z.getValue();
            synchronized (vVar.f1857b) {
                try {
                    vVar.f1858c = true;
                    ArrayList arrayList = vVar.f1859d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ej.a) obj).a();
                    }
                    vVar.f1859d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        j();
        View decorView = getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        this.f1845f.a(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        fj.l.f(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        fj.l.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public Context zza() {
        return getApplicationContext();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        fj.l.f(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        fj.l.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        fj.l.f(configuration, "newConfig");
        this.I = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.I = false;
            Iterator it = this.F.iterator();
            fj.l.e(it, "iterator(...)");
            while (it.hasNext()) {
                ((s4.a) it.next()).accept(new h4.e(z2));
            }
        } catch (Throwable th2) {
            this.I = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        fj.l.f(configuration, "newConfig");
        this.J = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.J = false;
            Iterator it = this.G.iterator();
            fj.l.e(it, "iterator(...)");
            while (it.hasNext()) {
                ((s4.a) it.next()).accept(new h4.q(z2));
            }
        } catch (Throwable th2) {
            this.J = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        this.f1845f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        this.f1845f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
