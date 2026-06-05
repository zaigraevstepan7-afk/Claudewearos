package c;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import w5.h0;
import w5.i0;
import w5.o0;
import w5.r0;
import w5.s0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, int i10) {
        super(false);
        this.f1807d = i10;
        this.f1808e = obj;
    }

    @Override // c.x
    public void a() {
        switch (this.f1807d) {
            case 1:
                ((d.h) this.f1808e).getClass();
                break;
            case 2:
                i0 i0Var = (i0) this.f1808e;
                if (i0.J(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + i0Var);
                }
                if (i0.J(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + i0Var.f18648h);
                }
                w5.a aVar = i0Var.f18648h;
                if (aVar != null) {
                    aVar.f18602r = false;
                    aVar.d();
                    w5.a aVar2 = i0Var.f18648h;
                    ac.o oVar = new ac.o(i0Var, 25);
                    if (aVar2.f18600p == null) {
                        aVar2.f18600p = new ArrayList();
                    }
                    aVar2.f18600p.add(oVar);
                    i0Var.f18648h.e(false, true);
                    i0Var.f18649i = true;
                    i0Var.z(true);
                    i0Var.D();
                    i0Var.f18649i = false;
                    i0Var.f18648h = null;
                    break;
                }
                break;
        }
    }

    @Override // c.x
    public final void b() {
        switch (this.f1807d) {
            case 0:
                ((w3.a) this.f1808e).invoke(this);
                return;
            case 1:
                ((d.h) this.f1808e).f4333c.a();
                return;
            default:
                i0 i0Var = (i0) this.f1808e;
                if (i0.J(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + i0Var);
                }
                c0 c0Var = i0Var.j;
                ArrayList arrayList = i0Var.f18653n;
                i0Var.f18649i = true;
                i0Var.z(true);
                int i10 = 0;
                i0Var.f18649i = false;
                if (i0Var.f18648h == null) {
                    if (c0Var.f1863b) {
                        if (i0.J(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        i0Var.Q();
                        return;
                    } else {
                        if (i0.J(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        i0Var.f18647g.f1804c.a();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i0.E(i0Var.f18648h));
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw null;
                        }
                    }
                }
                ArrayList arrayList2 = i0Var.f18648h.f18586a;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    w5.t tVar = ((o0) obj2).f18704b;
                    if (tVar != null) {
                        tVar.F = false;
                    }
                }
                Iterator it2 = i0Var.f(new ArrayList(Collections.singletonList(i0Var.f18648h)), 0, 1).iterator();
                while (it2.hasNext()) {
                    w5.m mVar = (w5.m) it2.next();
                    ArrayList arrayList3 = mVar.f18684c;
                    if (i0.J(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    mVar.k(arrayList3);
                    mVar.c(arrayList3);
                }
                ArrayList arrayList4 = i0Var.f18648h.f18586a;
                int size3 = arrayList4.size();
                while (i10 < size3) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    w5.t tVar2 = ((o0) obj3).f18704b;
                    if (tVar2 != null && tVar2.Y == null) {
                        i0Var.g(tVar2).k();
                    }
                }
                i0Var.f18648h = null;
                i0Var.f0();
                if (i0.J(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c0Var.f1863b + " for  FragmentManager " + i0Var);
                    return;
                }
                return;
        }
    }

    @Override // c.x
    public void c(a aVar) {
        switch (this.f1807d) {
            case 1:
                ((d.h) this.f1808e).getClass();
                return;
            case 2:
                i0 i0Var = (i0) this.f1808e;
                if (i0.J(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + i0Var);
                }
                if (i0Var.f18648h != null) {
                    Iterator it = i0Var.f(new ArrayList(Collections.singletonList(i0Var.f18648h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        w5.m mVar = (w5.m) it.next();
                        mVar.getClass();
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + aVar.f1797c);
                        }
                        ArrayList arrayList = mVar.f18684c;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            qi.q.u0(arrayList2, ((s0) obj).f18750k);
                        }
                        List listR0 = qi.l.R0(qi.l.V0(arrayList2));
                        int size2 = listR0.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((r0) listR0.get(i11)).c(aVar, mVar.f18682a);
                        }
                    }
                    Iterator it2 = i0Var.f18653n.iterator();
                    if (it2.hasNext()) {
                        throw gk.b.k(it2);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // c.x
    public void d(a aVar) {
        switch (this.f1807d) {
            case 1:
                ((d.h) this.f1808e).getClass();
                break;
            case 2:
                i0 i0Var = (i0) this.f1808e;
                if (i0.J(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + i0Var);
                }
                i0Var.w();
                i0Var.x(new h0(i0Var), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(w3.a aVar) {
        super(true);
        this.f1807d = 0;
        this.f1808e = aVar;
    }
}
