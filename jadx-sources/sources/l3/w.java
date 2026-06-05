package l3;

import a2.f0;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import g3.k0;
import g3.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w implements o {

    /* renamed from: a, reason: collision with root package name */
    public final View f9947a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.d f9948b;

    /* renamed from: c, reason: collision with root package name */
    public final x f9949c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9950d;

    /* renamed from: e, reason: collision with root package name */
    public ej.c f9951e;

    /* renamed from: f, reason: collision with root package name */
    public ej.c f9952f;

    /* renamed from: g, reason: collision with root package name */
    public t f9953g;

    /* renamed from: h, reason: collision with root package name */
    public j f9954h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9955i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f9956k;

    /* renamed from: l, reason: collision with root package name */
    public final c f9957l;

    /* renamed from: m, reason: collision with root package name */
    public final g1.e f9958m;

    /* renamed from: n, reason: collision with root package name */
    public ac.o f9959n;

    public w(View view, w2.t tVar) {
        ac.d dVar = new ac.d(view);
        x xVar = new x(Choreographer.getInstance());
        this.f9947a = view;
        this.f9948b = dVar;
        this.f9949c = xVar;
        this.f9951e = b.f9885d;
        this.f9952f = b.f9886e;
        this.f9953g = new t("", m0.f7143b, 4);
        this.f9954h = j.f9913g;
        this.f9955i = new ArrayList();
        this.j = u6.v.P(pi.f.f12998b, new f0(this, 6));
        this.f9957l = new c(tVar, dVar);
        this.f9958m = new g1.e(new v[16]);
    }

    @Override // l3.o
    public final void a(t tVar, n nVar, k0 k0Var, f1.d dVar, b2.c cVar, b2.c cVar2) {
        c cVar3 = this.f9957l;
        synchronized (cVar3.f9893c) {
            try {
                cVar3.j = tVar;
                cVar3.f9901l = nVar;
                cVar3.f9900k = k0Var;
                cVar3.f9902m = dVar;
                cVar3.f9903n = cVar;
                cVar3.f9904o = cVar2;
                if (cVar3.f9895e || cVar3.f9894d) {
                    cVar3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l3.o
    public final void b(t tVar, j jVar, ab.m mVar, k0.z zVar) {
        this.f9950d = true;
        this.f9953g = tVar;
        this.f9954h = jVar;
        this.f9951e = mVar;
        this.f9952f = zVar;
        i(v.f9942a);
    }

    @Override // l3.o
    public final void c() {
        i(v.f9942a);
    }

    @Override // l3.o
    public final void d() {
        i(v.f9944c);
    }

    @Override // l3.o
    public final void e() {
        this.f9950d = false;
        this.f9951e = b.f9887f;
        this.f9952f = b.f9888z;
        this.f9956k = null;
        i(v.f9943b);
    }

    @Override // l3.o
    public final void f(b2.c cVar) {
        Rect rect;
        this.f9956k = new Rect(hj.a.H(cVar.f1502a), hj.a.H(cVar.f1503b), hj.a.H(cVar.f1504c), hj.a.H(cVar.f1505d));
        if (!this.f9955i.isEmpty() || (rect = this.f9956k) == null) {
            return;
        }
        this.f9947a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // l3.o
    public final void g() {
        i(v.f9945d);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, pi.e] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, pi.e] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, pi.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, pi.e] */
    @Override // l3.o
    public final void h(t tVar, t tVar2) {
        boolean z2 = (m0.b(this.f9953g.f9938b, tVar2.f9938b) && fj.l.b(this.f9953g.f9939c, tVar2.f9939c)) ? false : true;
        this.f9953g = tVar2;
        int size = this.f9955i.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) ((WeakReference) this.f9955i.get(i10)).get();
            if (pVar != null) {
                pVar.f9926d = tVar2;
            }
        }
        c cVar = this.f9957l;
        synchronized (cVar.f9893c) {
            cVar.j = null;
            cVar.f9901l = null;
            cVar.f9900k = null;
            cVar.f9902m = b.f9883b;
            cVar.f9903n = null;
            cVar.f9904o = null;
        }
        if (fj.l.b(tVar, tVar2)) {
            if (z2) {
                ac.d dVar = this.f9948b;
                int iF = m0.f(tVar2.f9938b);
                int iE = m0.e(tVar2.f9938b);
                m0 m0Var = this.f9953g.f9939c;
                int iF2 = m0Var != null ? m0.f(m0Var.f7145a) : -1;
                m0 m0Var2 = this.f9953g.f9939c;
                ((InputMethodManager) dVar.f374c.getValue()).updateSelection((View) dVar.f373b, iF, iE, iF2, m0Var2 != null ? m0.e(m0Var2.f7145a) : -1);
                return;
            }
            return;
        }
        if (tVar != null && (!fj.l.b(tVar.f9937a.f7081b, tVar2.f9937a.f7081b) || (m0.b(tVar.f9938b, tVar2.f9938b) && !fj.l.b(tVar.f9939c, tVar2.f9939c)))) {
            ac.d dVar2 = this.f9948b;
            ((InputMethodManager) dVar2.f374c.getValue()).restartInput((View) dVar2.f373b);
            return;
        }
        int size2 = this.f9955i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar2 = (p) ((WeakReference) this.f9955i.get(i11)).get();
            if (pVar2 != null) {
                t tVar3 = this.f9953g;
                ac.d dVar3 = this.f9948b;
                if (pVar2.f9930h) {
                    pVar2.f9926d = tVar3;
                    if (pVar2.f9928f) {
                        ((InputMethodManager) dVar3.f374c.getValue()).updateExtractedText((View) dVar3.f373b, pVar2.f9927e, a.a.Y(tVar3));
                    }
                    m0 m0Var3 = tVar3.f9939c;
                    long j = tVar3.f9938b;
                    int iF3 = m0Var3 != null ? m0.f(m0Var3.f7145a) : -1;
                    m0 m0Var4 = tVar3.f9939c;
                    ((InputMethodManager) dVar3.f374c.getValue()).updateSelection((View) dVar3.f373b, m0.f(j), m0.e(j), iF3, m0Var4 != null ? m0.e(m0Var4.f7145a) : -1);
                }
            }
        }
    }

    public final void i(v vVar) {
        this.f9958m.b(vVar);
        if (this.f9959n == null) {
            ac.o oVar = new ac.o(this, 14);
            this.f9949c.execute(oVar);
            this.f9959n = oVar;
        }
    }
}
