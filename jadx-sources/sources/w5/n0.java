package w5;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.anonlab.voidlauncher.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final qh.c f18696a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.j f18697b;

    /* renamed from: c, reason: collision with root package name */
    public final t f18698c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18699d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f18700e = -1;

    public n0(qh.c cVar, a8.j jVar, t tVar) {
        this.f18696a = cVar;
        this.f18697b = jVar;
        this.f18698c = tVar;
    }

    public final void a() {
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + tVar);
        }
        Bundle bundle = tVar.f18755b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        tVar.O.P();
        tVar.f18753a = 3;
        tVar.X = false;
        tVar.t();
        if (!tVar.X) {
            throw new u0("Fragment " + tVar + " did not call through to super.onActivityCreated()");
        }
        if (i0.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + tVar);
        }
        if (tVar.Z != null) {
            Bundle bundle2 = tVar.f18755b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = tVar.f18757c;
            if (sparseArray != null) {
                tVar.Z.restoreHierarchyState(sparseArray);
                tVar.f18757c = null;
            }
            tVar.X = false;
            tVar.G(bundle3);
            if (!tVar.X) {
                throw new u0("Fragment " + tVar + " did not call through to super.onViewStateRestored()");
            }
            if (tVar.Z != null) {
                tVar.f18767i0.b(androidx.lifecycle.n.ON_CREATE);
            }
        }
        tVar.f18755b = null;
        i0 i0Var = tVar.O;
        i0Var.H = false;
        i0Var.I = false;
        i0Var.O.f18681g = false;
        i0Var.u(4);
        this.f18696a.l(tVar, false);
    }

    public final void b() {
        t tVar;
        View view;
        View view2;
        t tVar2 = this.f18698c;
        View view3 = tVar2.Y;
        while (true) {
            tVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            t tVar3 = tag instanceof t ? (t) tag : null;
            if (tVar3 != null) {
                tVar = tVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        t tVar4 = tVar2.P;
        if (tVar != null && !tVar.equals(tVar4)) {
            int i10 = tVar2.R;
            x5.b bVar = x5.c.f19834a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(tVar2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(tVar);
            sb2.append(" via container with ID ");
            x5.c.b(new x5.a(tVar2, m6.a.h(sb2, i10, " without using parent's childFragmentManager")));
            x5.c.a(tVar2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f18697b.f215a;
        ViewGroup viewGroup = tVar2.Y;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(tVar2);
            int i11 = iIndexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        t tVar5 = (t) arrayList.get(iIndexOf);
                        if (tVar5.Y == viewGroup && (view = tVar5.Z) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    t tVar6 = (t) arrayList.get(i11);
                    if (tVar6.Y == viewGroup && (view2 = tVar6.Z) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        tVar2.Y.addView(tVar2.Z, iIndexOfChild);
    }

    public final void c() {
        n0 n0Var;
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ATTACHED: " + tVar);
        }
        t tVar2 = tVar.f18772z;
        a8.j jVar = this.f18697b;
        if (tVar2 != null) {
            n0Var = (n0) ((HashMap) jVar.f216b).get(tVar2.f18761e);
            if (n0Var == null) {
                throw new IllegalStateException("Fragment " + tVar + " declared target fragment " + tVar.f18772z + " that does not belong to this FragmentManager!");
            }
            tVar.A = tVar.f18772z.f18761e;
            tVar.f18772z = null;
        } else {
            String str = tVar.A;
            if (str != null) {
                n0Var = (n0) ((HashMap) jVar.f216b).get(str);
                if (n0Var == null) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(tVar);
                    sb2.append(" declared target fragment ");
                    throw new IllegalStateException(m6.a.j(sb2, tVar.A, " that does not belong to this FragmentManager!"));
                }
            } else {
                n0Var = null;
            }
        }
        if (n0Var != null) {
            n0Var.k();
        }
        i0 i0Var = tVar.M;
        tVar.N = i0Var.f18662w;
        tVar.P = i0Var.f18664y;
        qh.c cVar = this.f18696a;
        cVar.r(tVar, false);
        ArrayList arrayList = tVar.f18770l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t tVar3 = ((q) obj).f18725a;
            ((c7.b) tVar3.f18769k0.f15363b).a();
            androidx.lifecycle.r0.d(tVar3);
            Bundle bundle = tVar3.f18755b;
            tVar3.f18769k0.r(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        tVar.O.b(tVar.N, tVar.i(), tVar);
        tVar.f18753a = 0;
        tVar.X = false;
        tVar.v(tVar.N.f18777e);
        if (!tVar.X) {
            throw new u0("Fragment " + tVar + " did not call through to super.onAttach()");
        }
        Iterator it = tVar.M.f18655p.iterator();
        while (it.hasNext()) {
            ((l0) it.next()).b();
        }
        i0 i0Var2 = tVar.O;
        i0Var2.H = false;
        i0Var2.I = false;
        i0Var2.O.f18681g = false;
        i0Var2.u(0);
        cVar.m(tVar, false);
    }

    public final int d() {
        t tVar = this.f18698c;
        if (tVar.M == null) {
            return tVar.f18753a;
        }
        int iMin = this.f18700e;
        int iOrdinal = tVar.f18765g0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (tVar.G) {
            if (tVar.H) {
                iMin = Math.max(this.f18700e, 2);
                View view = tVar.Z;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f18700e < 4 ? Math.min(iMin, tVar.f18753a) : Math.min(iMin, 1);
            }
        }
        if (tVar.I && tVar.Y == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!tVar.D) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = tVar.Y;
        if (viewGroup != null) {
            m mVarI = m.i(viewGroup, tVar.o());
            s0 s0VarF = mVarI.f(tVar);
            int i10 = s0VarF != null ? s0VarF.f18742b : 0;
            s0 s0VarG = mVarI.g(tVar);
            i = s0VarG != null ? s0VarG.f18742b : 0;
            int i11 = i10 == 0 ? -1 : t0.f18773a[y3.e.b(i10)];
            if (i11 != -1 && i11 != 1) {
                i = i10;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (tVar.E) {
            iMin = tVar.s() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (tVar.f18754a0 && tVar.f18753a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (tVar.F) {
            iMin = Math.max(iMin, 3);
        }
        if (i0.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + tVar);
        }
        return iMin;
    }

    public final void e() {
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "moveto CREATED: " + tVar);
        }
        Bundle bundle = tVar.f18755b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (tVar.f18762e0) {
            tVar.f18753a = 1;
            tVar.K();
            return;
        }
        qh.c cVar = this.f18696a;
        cVar.s(tVar, false);
        tVar.O.P();
        tVar.f18753a = 1;
        tVar.X = false;
        tVar.f18766h0.a(new a7.b(tVar, 4));
        tVar.w(bundle2);
        tVar.f18762e0 = true;
        if (tVar.X) {
            tVar.f18766h0.d(androidx.lifecycle.n.ON_CREATE);
            cVar.n(tVar, false);
        } else {
            throw new u0("Fragment " + tVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        t tVar = this.f18698c;
        if (tVar.G) {
            return;
        }
        if (i0.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + tVar);
        }
        Bundle bundle = tVar.f18755b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterB = tVar.B(bundle2);
        ViewGroup viewGroup2 = tVar.Y;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = tVar.R;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + tVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) tVar.M.f18663x.t(i10);
                if (viewGroup == null) {
                    if (!tVar.J && !tVar.I) {
                        try {
                            resourceName = tVar.I().getResources().getResourceName(tVar.R);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(tVar.R) + " (" + resourceName + ") for fragment " + tVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    x5.b bVar = x5.c.f19834a;
                    x5.c.b(new x5.d(tVar, viewGroup, 1));
                    x5.c.a(tVar).getClass();
                }
            }
        }
        tVar.Y = viewGroup;
        tVar.H(layoutInflaterB, viewGroup, bundle2);
        if (tVar.Z != null) {
            if (i0.J(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + tVar);
            }
            tVar.Z.setSaveFromParentEnabled(false);
            tVar.Z.setTag(R.id.fragment_container_view_tag, tVar);
            if (viewGroup != null) {
                b();
            }
            int i11 = 8;
            if (tVar.T) {
                tVar.Z.setVisibility(8);
            }
            if (tVar.Z.isAttachedToWindow()) {
                View view = tVar.Z;
                Field field = t4.l0.f15744a;
                t4.b0.c(view);
            } else {
                View view2 = tVar.Z;
                view2.addOnAttachStateChangeListener(new c2.e(view2, i11));
            }
            Bundle bundle3 = tVar.f18755b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            tVar.O.u(2);
            this.f18696a.y(tVar, tVar.Z, false);
            int visibility = tVar.Z.getVisibility();
            tVar.k().j = tVar.Z.getAlpha();
            if (tVar.Y != null && visibility == 0) {
                View viewFindFocus = tVar.Z.findFocus();
                if (viewFindFocus != null) {
                    tVar.k().f18740k = viewFindFocus;
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + tVar);
                    }
                }
                tVar.Z.setAlpha(0.0f);
            }
        }
        tVar.f18753a = 2;
    }

    public final void g() {
        t tVarS;
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATED: " + tVar);
        }
        boolean zIsChangingConfigurations = true;
        int i10 = 0;
        boolean z2 = tVar.E && !tVar.s();
        a8.j jVar = this.f18697b;
        if (z2) {
            jVar.G(null, tVar.f18761e);
        }
        if (!z2) {
            k0 k0Var = (k0) jVar.f218d;
            if (!((k0Var.f18676b.containsKey(tVar.f18761e) && k0Var.f18679e) ? k0Var.f18680f : true)) {
                String str = tVar.A;
                if (str != null && (tVarS = jVar.s(str)) != null && tVarS.V) {
                    tVar.f18772z = tVarS;
                }
                tVar.f18753a = 0;
                return;
            }
        }
        v vVar = tVar.N;
        if (vVar != null) {
            zIsChangingConfigurations = ((k0) jVar.f218d).f18680f;
        } else {
            w wVar = vVar.f18777e;
            if (wVar != null) {
                zIsChangingConfigurations = true ^ wVar.isChangingConfigurations();
            }
        }
        if (z2 || zIsChangingConfigurations) {
            ((k0) jVar.f218d).f(tVar, false);
        }
        tVar.O.l();
        tVar.f18766h0.d(androidx.lifecycle.n.ON_DESTROY);
        tVar.f18753a = 0;
        tVar.X = false;
        tVar.f18762e0 = false;
        tVar.y();
        if (!tVar.X) {
            throw new u0("Fragment " + tVar + " did not call through to super.onDestroy()");
        }
        this.f18696a.o(tVar, false);
        ArrayList arrayListX = jVar.x();
        int size = arrayListX.size();
        while (i10 < size) {
            Object obj = arrayListX.get(i10);
            i10++;
            n0 n0Var = (n0) obj;
            if (n0Var != null) {
                t tVar2 = n0Var.f18698c;
                if (tVar.f18761e.equals(tVar2.A)) {
                    tVar2.f18772z = tVar;
                    tVar2.A = null;
                }
            }
        }
        String str2 = tVar.A;
        if (str2 != null) {
            tVar.f18772z = jVar.s(str2);
        }
        jVar.C(this);
    }

    public final void h() {
        View view;
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + tVar);
        }
        ViewGroup viewGroup = tVar.Y;
        if (viewGroup != null && (view = tVar.Z) != null) {
            viewGroup.removeView(view);
        }
        tVar.O.u(1);
        if (tVar.Z != null) {
            p0 p0Var = tVar.f18767i0;
            p0Var.d();
            if (p0Var.f18723d.f1141c.compareTo(androidx.lifecycle.o.f1113c) >= 0) {
                tVar.f18767i0.b(androidx.lifecycle.n.ON_DESTROY);
            }
        }
        tVar.f18753a = 1;
        tVar.X = false;
        tVar.z();
        if (!tVar.X) {
            throw new u0("Fragment " + tVar + " did not call through to super.onDestroyView()");
        }
        q.q0 q0Var = ((g6.d) new t0.j(tVar, tVar.e()).f15364c).f7221b;
        int i10 = q0Var.f13123c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g6.a) q0Var.e(i11)).j();
        }
        tVar.K = false;
        this.f18696a.z(tVar, false);
        tVar.Y = null;
        tVar.Z = null;
        tVar.f18767i0 = null;
        tVar.f18768j0.i(null);
        tVar.H = false;
    }

    public final void i() {
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + tVar);
        }
        tVar.f18753a = -1;
        tVar.X = false;
        tVar.A();
        if (!tVar.X) {
            throw new u0("Fragment " + tVar + " did not call through to super.onDetach()");
        }
        i0 i0Var = tVar.O;
        if (!i0Var.J) {
            i0Var.l();
            tVar.O = new i0();
        }
        this.f18696a.p(tVar, false);
        tVar.f18753a = -1;
        tVar.N = null;
        tVar.P = null;
        tVar.M = null;
        if (!tVar.E || tVar.s()) {
            k0 k0Var = (k0) this.f18697b.f218d;
            if (!((k0Var.f18676b.containsKey(tVar.f18761e) && k0Var.f18679e) ? k0Var.f18680f : true)) {
                return;
            }
        }
        if (i0.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + tVar);
        }
        tVar.q();
    }

    public final void j() {
        t tVar = this.f18698c;
        if (tVar.G && tVar.H && !tVar.K) {
            if (i0.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + tVar);
            }
            Bundle bundle = tVar.f18755b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            tVar.H(tVar.B(bundle2), null, bundle2);
            View view = tVar.Z;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                tVar.Z.setTag(R.id.fragment_container_view_tag, tVar);
                if (tVar.T) {
                    tVar.Z.setVisibility(8);
                }
                Bundle bundle3 = tVar.f18755b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                tVar.O.u(2);
                this.f18696a.y(tVar, tVar.Z, false);
                tVar.f18753a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        a8.j jVar = this.f18697b;
        boolean z2 = this.f18699d;
        t tVar = this.f18698c;
        if (z2) {
            if (i0.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + tVar);
                return;
            }
            return;
        }
        try {
            this.f18699d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                int i10 = tVar.f18753a;
                int i11 = 3;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && tVar.E && !tVar.s()) {
                        if (i0.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + tVar);
                        }
                        ((k0) jVar.f218d).f(tVar, true);
                        jVar.C(this);
                        if (i0.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + tVar);
                        }
                        tVar.q();
                    }
                    if (tVar.f18760d0) {
                        if (tVar.Z != null && (viewGroup = tVar.Y) != null) {
                            m mVarI = m.i(viewGroup, tVar.o());
                            if (tVar.T) {
                                if (i0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar);
                                }
                                mVarI.d(3, 1, this);
                            } else {
                                if (i0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar);
                                }
                                mVarI.d(2, 1, this);
                            }
                        }
                        i0 i0Var = tVar.M;
                        if (i0Var != null && tVar.D && i0.K(tVar)) {
                            i0Var.G = true;
                        }
                        tVar.f18760d0 = false;
                        tVar.O.o();
                    }
                    this.f18699d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            tVar.f18753a = 1;
                            break;
                        case 2:
                            tVar.H = false;
                            tVar.f18753a = 2;
                            break;
                        case 3:
                            if (i0.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + tVar);
                            }
                            if (tVar.Z != null && tVar.f18757c == null) {
                                o();
                            }
                            if (tVar.Z != null && (viewGroup2 = tVar.Y) != null) {
                                m mVarI2 = m.i(viewGroup2, tVar.o());
                                if (i0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar);
                                }
                                mVarI2.d(1, 3, this);
                            }
                            tVar.f18753a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            tVar.f18753a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (tVar.Z != null && (viewGroup3 = tVar.Y) != null) {
                                m mVarI3 = m.i(viewGroup3, tVar.o());
                                int visibility = tVar.Z.getVisibility();
                                if (visibility == 0) {
                                    i11 = 2;
                                } else if (visibility == 4) {
                                    i11 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                m6.a.m(i11, "finalState");
                                if (i0.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar);
                                }
                                mVarI3.d(i11, 2, this);
                            }
                            tVar.f18753a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            tVar.f18753a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f18699d = false;
            throw th2;
        }
    }

    public final void l() {
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom RESUMED: " + tVar);
        }
        tVar.O.u(5);
        if (tVar.Z != null) {
            tVar.f18767i0.b(androidx.lifecycle.n.ON_PAUSE);
        }
        tVar.f18766h0.d(androidx.lifecycle.n.ON_PAUSE);
        tVar.f18753a = 6;
        tVar.X = true;
        this.f18696a.q(tVar, false);
    }

    public final void m(ClassLoader classLoader) {
        t tVar = this.f18698c;
        Bundle bundle = tVar.f18755b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (tVar.f18755b.getBundle("savedInstanceState") == null) {
            tVar.f18755b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            tVar.f18757c = tVar.f18755b.getSparseParcelableArray("viewState");
            tVar.f18759d = tVar.f18755b.getBundle("viewRegistryState");
            m0 m0Var = (m0) tVar.f18755b.getParcelable("state");
            if (m0Var != null) {
                tVar.A = m0Var.F;
                tVar.B = m0Var.G;
                tVar.f18756b0 = m0Var.H;
            }
            if (tVar.f18756b0) {
                return;
            }
            tVar.f18754a0 = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + tVar, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = w5.i0.J(r0)
            java.lang.String r1 = "FragmentManager"
            w5.t r2 = r7.f18698c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            w5.s r0 = r2.f18758c0
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f18740k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.Z
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.Z
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = w5.i0.J(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.Z
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            w5.s r0 = r2.k()
            r0.f18740k = r3
            w5.i0 r0 = r2.O
            r0.P()
            w5.i0 r0 = r2.O
            r1 = 1
            r0.z(r1)
            r0 = 7
            r2.f18753a = r0
            r1 = 0
            r2.X = r1
            r2.C()
            boolean r4 = r2.X
            if (r4 == 0) goto Lcd
            androidx.lifecycle.v r4 = r2.f18766h0
            androidx.lifecycle.n r5 = androidx.lifecycle.n.ON_RESUME
            r4.d(r5)
            android.view.View r4 = r2.Z
            if (r4 == 0) goto Lad
            w5.p0 r4 = r2.f18767i0
            androidx.lifecycle.v r4 = r4.f18723d
            r4.d(r5)
        Lad:
            w5.i0 r4 = r2.O
            r4.H = r1
            r4.I = r1
            w5.k0 r5 = r4.O
            r5.f18681g = r1
            r4.u(r0)
            qh.c r0 = r7.f18696a
            r0.t(r2, r1)
            a8.j r0 = r7.f18697b
            java.lang.String r1 = r2.f18761e
            r0.G(r3, r1)
            r2.f18755b = r3
            r2.f18757c = r3
            r2.f18759d = r3
            return
        Lcd:
            w5.u0 r0 = new w5.u0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " did not call through to super.onResume()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.n0.n():void");
    }

    public final void o() {
        t tVar = this.f18698c;
        if (tVar.Z == null) {
            return;
        }
        if (i0.J(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + tVar + " with view " + tVar.Z);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        tVar.Z.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            tVar.f18757c = sparseArray;
        }
        Bundle bundle = new Bundle();
        tVar.f18767i0.f18724e.s(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        tVar.f18759d = bundle;
    }

    public final void p() {
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "moveto STARTED: " + tVar);
        }
        tVar.O.P();
        tVar.O.z(true);
        tVar.f18753a = 5;
        tVar.X = false;
        tVar.E();
        if (!tVar.X) {
            throw new u0("Fragment " + tVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.v vVar = tVar.f18766h0;
        androidx.lifecycle.n nVar = androidx.lifecycle.n.ON_START;
        vVar.d(nVar);
        if (tVar.Z != null) {
            tVar.f18767i0.f18723d.d(nVar);
        }
        i0 i0Var = tVar.O;
        i0Var.H = false;
        i0Var.I = false;
        i0Var.O.f18681g = false;
        i0Var.u(5);
        this.f18696a.v(tVar, false);
    }

    public final void q() {
        boolean zJ = i0.J(3);
        t tVar = this.f18698c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom STARTED: " + tVar);
        }
        i0 i0Var = tVar.O;
        i0Var.I = true;
        i0Var.O.f18681g = true;
        i0Var.u(4);
        if (tVar.Z != null) {
            tVar.f18767i0.b(androidx.lifecycle.n.ON_STOP);
        }
        tVar.f18766h0.d(androidx.lifecycle.n.ON_STOP);
        tVar.f18753a = 4;
        tVar.X = false;
        tVar.F();
        if (tVar.X) {
            this.f18696a.x(tVar, false);
            return;
        }
        throw new u0("Fragment " + tVar + " did not call through to super.onStop()");
    }

    public n0(qh.c cVar, a8.j jVar, ClassLoader classLoader, c0 c0Var, Bundle bundle) {
        this.f18696a = cVar;
        this.f18697b = jVar;
        m0 m0Var = (m0) bundle.getParcelable("state");
        t tVarA = c0Var.a(m0Var.f18688a);
        tVarA.f18761e = m0Var.f18689b;
        tVarA.G = m0Var.f18690c;
        tVarA.I = m0Var.f18691d;
        tVarA.J = true;
        tVarA.Q = m0Var.f18692e;
        tVarA.R = m0Var.f18693f;
        tVarA.S = m0Var.f18694z;
        tVarA.V = m0Var.A;
        tVarA.E = m0Var.B;
        tVarA.U = m0Var.C;
        tVarA.T = m0Var.D;
        tVarA.f18765g0 = androidx.lifecycle.o.values()[m0Var.E];
        tVarA.A = m0Var.F;
        tVarA.B = m0Var.G;
        tVarA.f18756b0 = m0Var.H;
        this.f18698c = tVarA;
        tVarA.f18755b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        tVarA.M(bundle2);
        if (i0.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + tVarA);
        }
    }

    public n0(qh.c cVar, a8.j jVar, t tVar, Bundle bundle) {
        this.f18696a = cVar;
        this.f18697b = jVar;
        this.f18698c = tVar;
        tVar.f18757c = null;
        tVar.f18759d = null;
        tVar.L = 0;
        tVar.H = false;
        tVar.D = false;
        t tVar2 = tVar.f18772z;
        tVar.A = tVar2 != null ? tVar2.f18761e : null;
        tVar.f18772z = null;
        tVar.f18755b = bundle;
        tVar.f18763f = bundle.getBundle("arguments");
    }
}
