package w2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.anonlab.voidlauncher.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final View f18226a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.p f18227b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.t f18228c;

    /* renamed from: d, reason: collision with root package name */
    public final a7.f f18229d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.b1 f18230e;

    /* renamed from: f, reason: collision with root package name */
    public final b3.c f18231f;

    /* renamed from: g, reason: collision with root package name */
    public final b3.d f18232g;

    /* renamed from: h, reason: collision with root package name */
    public final Configuration f18233h;

    /* renamed from: i, reason: collision with root package name */
    public final f1.a1 f18234i;
    public final g j;

    /* renamed from: k, reason: collision with root package name */
    public final n0 f18235k;

    /* renamed from: l, reason: collision with root package name */
    public final i f18236l;

    /* renamed from: m, reason: collision with root package name */
    public final h f18237m;

    /* renamed from: n, reason: collision with root package name */
    public final k3.h f18238n;

    /* renamed from: o, reason: collision with root package name */
    public final f1.a1 f18239o;

    /* renamed from: p, reason: collision with root package name */
    public final k2.a f18240p;

    /* renamed from: q, reason: collision with root package name */
    public final o0 f18241q;

    /* renamed from: r, reason: collision with root package name */
    public final v2.h0 f18242r;

    /* renamed from: s, reason: collision with root package name */
    public final r1 f18243s;

    /* renamed from: t, reason: collision with root package name */
    public final c2.v f18244t;

    /* renamed from: u, reason: collision with root package name */
    public int f18245u;

    /* renamed from: v, reason: collision with root package name */
    public final a2.f0 f18246v;

    /* renamed from: w, reason: collision with root package name */
    public final c1 f18247w;

    public d1(d1 d1Var, View view, f1.p pVar, androidx.lifecycle.t tVar, a7.f fVar, androidx.lifecycle.b1 b1Var) {
        b3.c cVar;
        Configuration configuration;
        f1.a1 a1VarA;
        g gVar;
        n0 n0Var;
        i iVar;
        h hVar;
        k3.h n1Var;
        f1.a1 j1Var;
        o0 o0Var;
        c2.v vVar;
        v2.h0 h0Var;
        b3.d dVar;
        View view2;
        boolean zB = fj.l.b((d1Var == null || (view2 = d1Var.f18226a) == null) ? null : view2.getContext(), view.getContext());
        this.f18226a = view;
        this.f18227b = pVar;
        this.f18228c = tVar;
        this.f18229d = fVar;
        this.f18230e = b1Var;
        if (zB) {
            fj.l.c(d1Var);
            cVar = d1Var.f18231f;
        } else {
            cVar = new b3.c();
        }
        this.f18231f = cVar;
        this.f18232g = (d1Var == null || (dVar = d1Var.f18232g) == null) ? new b3.d() : dVar;
        if (zB) {
            fj.l.c(d1Var);
            configuration = d1Var.f18233h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f18233h = configuration;
        if (zB) {
            fj.l.c(d1Var);
            a1VarA = d1Var.f18234i;
        } else {
            a1VarA = f1.s.A(new Configuration(configuration));
        }
        this.f18234i = a1VarA;
        if (zB) {
            fj.l.c(d1Var);
            gVar = d1Var.j;
        } else {
            Context context = view.getContext();
            gVar = new g();
            Object systemService = context.getSystemService("accessibility");
            fj.l.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.j = gVar;
        if (zB) {
            fj.l.c(d1Var);
            n0Var = d1Var.f18235k;
        } else {
            n0Var = new n0(view.getContext());
        }
        this.f18235k = n0Var;
        if (zB) {
            fj.l.c(d1Var);
            iVar = d1Var.f18236l;
        } else {
            iVar = new i(view.getContext());
        }
        this.f18236l = iVar;
        if (zB) {
            fj.l.c(d1Var);
            hVar = d1Var.f18237m;
        } else {
            hVar = new h(iVar);
        }
        this.f18237m = hVar;
        if (zB) {
            fj.l.c(d1Var);
            n1Var = d1Var.f18238n;
        } else {
            view.getContext();
            n1Var = new n1();
        }
        this.f18238n = n1Var;
        if (zB) {
            fj.l.c(d1Var);
            j1Var = d1Var.f18239o;
        } else {
            j1Var = new f1.j1(mk.b.n(view.getContext()), f1.f.f6291e);
        }
        this.f18239o = j1Var;
        this.f18240p = view == (d1Var != null ? d1Var.f18226a : null) ? d1Var.f18240p : new k2.c(view);
        if (zB) {
            fj.l.c(d1Var);
            o0Var = d1Var.f18241q;
        } else {
            o0Var = new o0(ViewConfiguration.get(view.getContext()));
        }
        this.f18241q = o0Var;
        this.f18242r = (d1Var == null || (h0Var = d1Var.f18242r) == null) ? new v2.h0() : h0Var;
        this.f18243s = new r1();
        this.f18244t = (d1Var == null || (vVar = d1Var.f18244t) == null) ? new c2.v() : vVar;
        this.f18246v = new a2.f0(this, 16);
        this.f18247w = new c1(this);
    }

    public final void a(t tVar, ej.e eVar, f1.i0 i0Var, int i10) {
        boolean z2;
        boolean z10;
        i0Var.c0(123858079);
        int i11 = (i0Var.h(tVar) ? 4 : 2) | i10 | (i0Var.h(eVar) ? 32 : 16) | (i0Var.h(this) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            Object tag = tVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof gj.a) && !(tag instanceof gj.e))) ? null : (Set) tag;
            if (set == null) {
                Object parent = tVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof gj.a) && !(tag2 instanceof gj.e))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(i0Var.z());
                i0Var.f6328q = true;
                i0Var.C = true;
                i0Var.f6315c.e();
                i0Var.H.e();
                i1.k kVar = i0Var.I;
                i1.h hVar = kVar.f8136a;
                kVar.f8140e = hVar.C;
                kVar.f8141f = hVar.D;
            }
            Object objQ = i0Var.Q();
            a7.f fVar = this.f18229d;
            f1.f fVar2 = f1.m.f6385a;
            if (objQ == fVar2) {
                Object parent2 = tVar.getParent();
                fj.l.d(parent2, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strI = t.m1.i("SaveableStateRegistry:", strValueOf);
                mh.g gVarG = fVar.g();
                Bundle bundleI = gVarG.i(strI);
                if (bundleI != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleI.keySet()) {
                        ArrayList parcelableArrayList = bundleI.getParcelableArrayList(str);
                        fj.l.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                o oVar = o.f18339e;
                f1.r2 r2Var = s1.h.f14730a;
                s1.f fVar3 = new s1.f(linkedHashMap, oVar);
                if (gVarG.p(strI) != null) {
                    z10 = false;
                } else {
                    try {
                        gVarG.z(strI, new c.g(fVar3, 2));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                        z2 = false;
                    }
                    z10 = z2;
                }
                i1 i1Var = new i1(fVar3, new j1(z10, gVarG, strI));
                i0Var.l0(i1Var);
                objQ = i1Var;
            }
            i1 i1Var2 = (i1) objQ;
            boolean zH = i0Var.h(i1Var2);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == fVar2) {
                objQ2 = new c2.x0(i1Var2, 23);
                i0Var.l0(objQ2);
            }
            f1.s.c(pi.o.f13011a, (ej.c) objQ2, i0Var);
            f1.v vVar = f1.f18276w;
            boolean zBooleanValue = ((Boolean) i0Var.j(vVar)).booleanValue() | tVar.getScrollCaptureInProgress$ui();
            boolean zF = i0Var.f(tVar.getView());
            Object objQ3 = i0Var.Q();
            if (zF || objQ3 == fVar2) {
                objQ3 = new j2(tVar.getView());
                i0Var.l0(objQ3);
            }
            f1.s.b(new f1.r1[]{b6.k.f1609a.a(this.f18228c), b7.a.f1610a.a(fVar), AndroidCompositionLocals_androidKt.f840d.a(this.f18231f), AndroidCompositionLocals_androidKt.f841e.a(this.f18232g), AndroidCompositionLocals_androidKt.f838b.a(tVar.getContext()), u1.i.f16574a.a(set), AndroidCompositionLocals_androidKt.f837a.a(tVar.getConfiguration()), s1.h.f14730a.a(i1Var2), AndroidCompositionLocals_androidKt.f842f.a(tVar.getView()), vVar.a(Boolean.valueOf(zBooleanValue)), f1.f18273t.a(tVar.getViewConfiguration()), f1.m0.f6386a.a((j2) objQ3)}, p1.j.d(1317454175, new b1(tVar, this, eVar), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b1(this, tVar, eVar, i10);
        }
    }

    public final void b() {
        int i10 = this.f18245u - 1;
        this.f18245u = i10;
        if (i10 < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f18245u = 0;
        }
        if (this.f18245u == 0) {
            View view = this.f18226a;
            Context context = view.getContext();
            c1 c1Var = this.f18247w;
            context.unregisterComponentCallbacks(c1Var);
            this.f18243s.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(c1Var);
        }
    }

    public final void c() {
        int i10 = this.f18245u + 1;
        this.f18245u = i10;
        if (i10 == 1) {
            View view = this.f18226a;
            Context context = view.getContext();
            c1 c1Var = this.f18247w;
            context.registerComponentCallbacks(c1Var);
            d(view.getResources().getConfiguration());
            this.f18243s.f18367a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(c1Var);
        }
    }

    public final void d(Configuration configuration) {
        int iUpdateFrom = this.f18233h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f18231f.f1519a.entrySet().iterator();
            while (it.hasNext()) {
                b3.a aVar = (b3.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f1516b)) {
                    it.remove();
                }
            }
            this.f18234i.setValue(new Configuration(configuration));
            b3.d dVar = this.f18232g;
            synchronized (dVar) {
                dVar.f1520a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f18239o.setValue(mk.b.n(this.f18226a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                this.f18243s.getClass();
            }
        }
    }
}
