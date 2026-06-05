package b0;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.anonlab.voidlauncher.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: w, reason: collision with root package name */
    public static final WeakHashMap f1311w = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a f1312a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1313b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1314c;

    /* renamed from: d, reason: collision with root package name */
    public final a f1315d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1316e;

    /* renamed from: f, reason: collision with root package name */
    public final a f1317f;

    /* renamed from: g, reason: collision with root package name */
    public final a f1318g;

    /* renamed from: h, reason: collision with root package name */
    public final a f1319h;

    /* renamed from: i, reason: collision with root package name */
    public final a f1320i;
    public final c2 j;

    /* renamed from: k, reason: collision with root package name */
    public final f1.j1 f1321k;

    /* renamed from: l, reason: collision with root package name */
    public final x1 f1322l;

    /* renamed from: m, reason: collision with root package name */
    public final c2 f1323m;

    /* renamed from: n, reason: collision with root package name */
    public final c2 f1324n;

    /* renamed from: o, reason: collision with root package name */
    public final c2 f1325o;

    /* renamed from: p, reason: collision with root package name */
    public final c2 f1326p;

    /* renamed from: q, reason: collision with root package name */
    public final c2 f1327q;

    /* renamed from: r, reason: collision with root package name */
    public final c2 f1328r;

    /* renamed from: s, reason: collision with root package name */
    public final c2 f1329s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1330t;

    /* renamed from: u, reason: collision with root package name */
    public int f1331u;

    /* renamed from: v, reason: collision with root package name */
    public final p0 f1332v;

    public f2(View view) {
        a aVarB = c.b(4, "captionBar");
        this.f1312a = aVarB;
        a aVarB2 = c.b(128, "displayCutout");
        this.f1313b = aVarB2;
        a aVarB3 = c.b(8, "ime");
        this.f1314c = aVarB3;
        a aVarB4 = c.b(32, "mandatorySystemGestures");
        this.f1315d = aVarB4;
        a aVarB5 = c.b(2, "navigationBars");
        this.f1316e = aVarB5;
        a aVarB6 = c.b(1, "statusBars");
        this.f1317f = aVarB6;
        a aVarB7 = c.b(519, "systemBars");
        this.f1318g = aVarB7;
        a aVarB8 = c.b(16, "systemGestures");
        this.f1319h = aVarB8;
        a aVarB9 = c.b(64, "tappableElement");
        this.f1320i = aVarB9;
        c2 c2Var = new c2(new u0(0, 0, 0, 0), "waterfall");
        this.j = c2Var;
        this.f1321k = f1.s.A(null);
        x1 x1Var = new x1(new x1(aVarB7, aVarB3), aVarB2);
        this.f1322l = x1Var;
        new x1(x1Var, new x1(new x1(new x1(aVarB9, aVarB4), aVarB8), c2Var));
        this.f1323m = c.d(4, "captionBarIgnoringVisibility");
        this.f1324n = c.d(2, "navigationBarsIgnoringVisibility");
        this.f1325o = c.d(1, "statusBarsIgnoringVisibility");
        this.f1326p = c.d(519, "systemBarsIgnoringVisibility");
        this.f1327q = c.d(64, "tappableElementIgnoringVisibility");
        this.f1328r = new c2(new u0(0, 0, 0, 0), "imeAnimationTarget");
        this.f1329s = new c2(new u0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f1330t = bool != null ? bool.booleanValue() : false;
        this.f1332v = new p0(this);
        Field field = t4.l0.f15744a;
        t4.m1 m1VarA = t4.e0.a(view);
        if (m1VarA != null) {
            t4.j1 j1Var = m1VarA.f15751a;
            aVarB.f(j1Var.q(4));
            aVarB2.f(j1Var.q(128));
            aVarB3.f(j1Var.q(8));
            aVarB4.f(j1Var.q(32));
            aVarB5.f(j1Var.q(2));
            aVarB6.f(j1Var.q(1));
            aVarB7.f(j1Var.q(519));
            aVarB8.f(j1Var.q(16));
            aVarB9.f(j1Var.q(64));
        }
    }

    public static void b(f2 f2Var, t4.m1 m1Var) {
        boolean z2 = false;
        f2Var.f1312a.g(m1Var, 0);
        f2Var.f1314c.g(m1Var, 0);
        f2Var.f1313b.g(m1Var, 0);
        f2Var.f1316e.g(m1Var, 0);
        f2Var.f1317f.g(m1Var, 0);
        f2Var.f1318g.g(m1Var, 0);
        f2Var.f1319h.g(m1Var, 0);
        f2Var.f1320i.g(m1Var, 0);
        f2Var.f1315d.g(m1Var, 0);
        f2Var.f1323m.f(d.y(m1Var.f15751a.h(4)));
        f2Var.f1324n.f(d.y(m1Var.f15751a.h(2)));
        f2Var.f1325o.f(d.y(m1Var.f15751a.h(1)));
        f2Var.f1326p.f(d.y(m1Var.f15751a.h(519)));
        f2Var.f1327q.f(d.y(m1Var.f15751a.h(64)));
        t4.i iVarF = m1Var.f15751a.f();
        f2Var.j.f(d.y(iVarF != null ? iVarF.a() : l4.b.f9966e));
        c2.j jVar = null;
        if (iVarF != null) {
            Path pathA = Build.VERSION.SDK_INT >= 31 ? t4.h.a(iVarF.f15731a) : null;
            if (pathA != null) {
                jVar = new c2.j(pathA);
            }
        }
        f2Var.f1321k.setValue(jVar);
        synchronized (t1.m.f15471c) {
            q.h0 h0Var = t1.m.j.f15411h;
            if (h0Var != null) {
                if (h0Var.h()) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            t1.m.a();
        }
    }

    public final void a(View view) {
        if (this.f1331u == 0) {
            Field field = t4.l0.f15744a;
            p0 p0Var = this.f1332v;
            t4.d0.i(view, p0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(p0Var);
            t4.l0.n(view, p0Var);
        }
        this.f1331u++;
    }
}
