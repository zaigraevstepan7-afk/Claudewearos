package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.anonlab.voidlauncher.R;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p9.a f1122a;

    /* renamed from: b, reason: collision with root package name */
    public static final x9.b f1123b;

    /* renamed from: c, reason: collision with root package name */
    public static final y9.a f1124c = new y9.a();

    /* renamed from: d, reason: collision with root package name */
    public static final lh.e f1125d = new lh.e();

    /* renamed from: e, reason: collision with root package name */
    public static final lh.e f1126e = new lh.e();

    static {
        int i10 = 2;
        f1122a = new p9.a(i10);
        f1123b = new x9.b(i10);
    }

    public static final void a(x0 x0Var, mh.g gVar, v vVar) {
        fj.l.f(gVar, "registry");
        fj.l.f(vVar, "lifecycle");
        p0 p0Var = (p0) x0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (p0Var == null || p0Var.f1120c) {
            return;
        }
        p0Var.s(vVar, gVar);
        o oVar = vVar.f1141c;
        if (oVar == o.f1112b || oVar.compareTo(o.f1114d) >= 0) {
            gVar.C();
        } else {
            vVar.a(new g(vVar, gVar));
        }
    }

    public static o0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            o0 o0Var = new o0();
            new LinkedHashMap();
            o0Var.f1117a = new ak.v(qi.t.f13521a);
            return o0Var;
        }
        ClassLoader classLoader = o0.class.getClassLoader();
        fj.l.c(classLoader);
        bundle.setClassLoader(classLoader);
        ri.g gVar = new ri.g(bundle.size());
        for (String str : bundle.keySet()) {
            fj.l.c(str);
            gVar.put(str, bundle.get(str));
        }
        ri.g gVarB = gVar.b();
        o0 o0Var2 = new o0();
        new LinkedHashMap();
        o0Var2.f1117a = new ak.v(gVarB);
        return o0Var2;
    }

    public static final o0 c(d6.c cVar) {
        fj.l.f(cVar, "<this>");
        LinkedHashMap linkedHashMap = cVar.f4977a;
        a7.f fVar = (a7.f) linkedHashMap.get(f1122a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        b1 b1Var = (b1) linkedHashMap.get(f1123b);
        if (b1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1124c);
        String str = (String) linkedHashMap.get(f1126e);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        a7.d dVarP = fVar.g().p("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle2 = null;
        s0 s0Var = dVarP instanceof s0 ? (s0) dVarP : null;
        if (s0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = g(b1Var).f1131b;
        o0 o0Var = (o0) linkedHashMap2.get(str);
        if (o0Var != null) {
            return o0Var;
        }
        s0Var.b();
        Bundle bundle3 = s0Var.f1129c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = uk.c.m((pi.h[]) Arrays.copyOf(new pi.h[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                s0Var.f1129c = null;
            }
            bundle2 = bundle4;
        }
        o0 o0VarB = b(bundle2, bundle);
        linkedHashMap2.put(str, o0VarB);
        return o0VarB;
    }

    public static final void d(a7.f fVar) {
        o oVar = fVar.h().f1141c;
        if (oVar != o.f1112b && oVar != o.f1113c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.g().p("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            s0 s0Var = new s0(fVar.g(), (b1) fVar);
            fVar.g().z("androidx.lifecycle.internal.SavedStateHandlesProvider", s0Var);
            fVar.h().a(new a7.b(s0Var, 2));
        }
    }

    public static final t e(View view) {
        fj.l.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            t tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                return tVar;
            }
            Object objF = u3.a.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return null;
    }

    public static final b1 f(View view) {
        fj.l.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            b1 b1Var = tag instanceof b1 ? (b1) tag : null;
            if (b1Var != null) {
                return b1Var;
            }
            Object objF = u3.a.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return null;
    }

    public static final t0 g(b1 b1Var) {
        q0 q0Var = new q0();
        d6.b bVarC = b1Var instanceof j ? ((j) b1Var).c() : d6.a.f4976b;
        fj.l.f(bVarC, "extras");
        a1 a1VarE = b1Var.e();
        fj.l.f(a1VarE, "store");
        return (t0) new wh.s(a1VarE, q0Var, bVarC).j(fj.w.a(t0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final f6.a h(x0 x0Var) {
        f6.a aVar;
        fj.l.f(x0Var, "<this>");
        synchronized (f1125d) {
            aVar = (f6.a) x0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                ti.h hVar = ti.i.f16336a;
                try {
                    xj.e eVar = qj.m0.f13601a;
                    hVar = vj.n.f18117a.f14555f;
                } catch (IllegalStateException | pi.g unused) {
                }
                f6.a aVar2 = new f6.a(hVar.V(qj.b0.c()));
                x0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void i(View view, t tVar) {
        fj.l.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }

    public static final void j(View view, b1 b1Var) {
        fj.l.f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, b1Var);
    }
}
