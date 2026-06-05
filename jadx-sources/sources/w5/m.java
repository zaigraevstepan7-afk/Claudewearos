package w5;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18682a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18683b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18684c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18685d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18686e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18687f;

    public m(ViewGroup viewGroup) {
        fj.l.f(viewGroup, "container");
        this.f18682a = viewGroup;
        this.f18683b = new ArrayList();
        this.f18684c = new ArrayList();
    }

    public static final m i(ViewGroup viewGroup, i0 i0Var) {
        fj.l.f(viewGroup, "container");
        fj.l.f(i0Var, "fragmentManager");
        fj.l.e(i0Var.H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof m) {
            return (m) tag;
        }
        m mVar = new m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, mVar);
        return mVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z2;
        int size = arrayList.size();
        int i10 = 0;
        loop0: while (true) {
            z2 = true;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                s0 s0Var = (s0) obj;
                if (!s0Var.f18750k.isEmpty()) {
                    ArrayList arrayList2 = s0Var.f18750k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            r0 r0Var = (r0) obj2;
                            r0Var.getClass();
                            if (!(r0Var instanceof i)) {
                                break;
                            }
                        }
                    }
                }
                z2 = false;
            }
            break loop0;
        }
        if (z2) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList.get(i12);
                i12++;
                qi.q.u0(arrayList3, ((s0) obj3).f18750k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(s0 s0Var) {
        fj.l.f(s0Var, "operation");
        if (s0Var.f18749i) {
            m1.a(s0Var.f18741a, s0Var.f18743c.J(), this.f18682a);
            s0Var.f18749i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z2) {
        Object obj;
        Object obj2;
        if (i0.J(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            View view = s0Var.f18743c.Z;
            fj.l.e(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(m6.a.d(visibility, "Unknown visibility "));
                    }
                } else if (s0Var.f18741a != 2) {
                    break;
                }
            }
        }
        s0 s0Var2 = (s0) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            Object objPrevious = listIterator.previous();
            s0 s0Var3 = (s0) objPrevious;
            View view2 = s0Var3.f18743c.Z;
            fj.l.e(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(m6.a.d(visibility2, "Unknown visibility "));
                }
            }
            if (s0Var3.f18741a == 2) {
                obj2 = objPrevious;
                break;
            }
        }
        s0 s0Var4 = (s0) obj2;
        if (i0.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + s0Var2 + " to " + s0Var4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        t tVar = ((s0) qi.l.F0(arrayList)).f18743c;
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj3 = arrayList.get(i11);
            i11++;
            s sVar = ((s0) obj3).f18743c.f18758c0;
            s sVar2 = tVar.f18758c0;
            sVar.f18732b = sVar2.f18732b;
            sVar.f18733c = sVar2.f18733c;
            sVar.f18734d = sVar2.f18734d;
            sVar.f18735e = sVar2.f18735e;
        }
        int size3 = arrayList.size();
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= size3) {
                break;
            }
            Object obj4 = arrayList.get(i12);
            i12++;
            s0 s0Var5 = (s0) obj4;
            arrayList2.add(new g(s0Var5, z2));
            if (!z2 ? s0Var5 != s0Var4 : s0Var5 != s0Var2) {
                z10 = false;
            }
            t tVar2 = s0Var5.f18743c;
            l lVar = new l(s0Var5);
            if (s0Var5.f18741a == 2) {
                if (z2) {
                    s sVar3 = tVar2.f18758c0;
                } else {
                    tVar2.getClass();
                }
            } else if (z2) {
                s sVar4 = tVar2.f18758c0;
            } else {
                tVar2.getClass();
            }
            if (s0Var5.f18741a == 2) {
                if (z2) {
                    s sVar5 = tVar2.f18758c0;
                } else {
                    s sVar6 = tVar2.f18758c0;
                }
            }
            if (z10) {
                if (z2) {
                    s sVar7 = tVar2.f18758c0;
                } else {
                    tVar2.getClass();
                }
            }
            arrayList3.add(lVar);
            s0Var5.f18744d.add(new d(this, s0Var5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList3.get(i13);
            i13++;
            if (!((l) obj5).k()) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList4.size();
        int i14 = 0;
        while (i14 < size5) {
            Object obj6 = arrayList4.get(i14);
            i14++;
            ((l) obj6).getClass();
        }
        int size6 = arrayList5.size();
        int i15 = 0;
        while (i15 < size6) {
            Object obj7 = arrayList5.get(i15);
            i15++;
            ((l) obj7).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int size7 = arrayList2.size();
        int i16 = 0;
        while (i16 < size7) {
            Object obj8 = arrayList2.get(i16);
            i16++;
            qi.q.u0(arrayList7, ((s0) ((g) obj8).f6149a).f18750k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        int size8 = arrayList2.size();
        boolean z11 = false;
        int i17 = 0;
        while (i17 < size8) {
            Object obj9 = arrayList2.get(i17);
            i17++;
            g gVar = (g) obj9;
            Context context = this.f18682a.getContext();
            s0 s0Var6 = (s0) gVar.f6149a;
            fj.l.e(context, "context");
            q5.b bVarT = gVar.t(context);
            if (bVarT != null) {
                if (((AnimatorSet) bVarT.f13236c) == null) {
                    arrayList6.add(gVar);
                } else {
                    t tVar3 = s0Var6.f18743c;
                    if (s0Var6.f18750k.isEmpty()) {
                        if (s0Var6.f18741a == 3) {
                            s0Var6.f18749i = false;
                        }
                        s0Var6.j.add(new i(gVar));
                        z11 = true;
                    } else if (i0.J(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + tVar3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size9 = arrayList6.size();
        int i18 = 0;
        while (i18 < size9) {
            Object obj10 = arrayList6.get(i18);
            i18++;
            g gVar2 = (g) obj10;
            s0 s0Var7 = (s0) gVar2.f6149a;
            t tVar4 = s0Var7.f18743c;
            if (zIsEmpty) {
                if (!z11) {
                    s0Var7.j.add(new f(gVar2));
                } else if (i0.J(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + tVar4 + " as Animations cannot run alongside Animators.");
                }
            } else if (i0.J(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + tVar4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(List list) {
        fj.l.f(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qi.q.u0(arrayList, ((s0) it.next()).f18750k);
        }
        List listR0 = qi.l.R0(qi.l.V0(arrayList));
        int size = listR0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r0) listR0.get(i10)).b(this.f18682a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((s0) list.get(i11));
        }
        List listR02 = qi.l.R0(list);
        int size3 = listR02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            s0 s0Var = (s0) listR02.get(i12);
            if (s0Var.f18750k.isEmpty()) {
                s0Var.b();
            }
        }
    }

    public final void d(int i10, int i11, n0 n0Var) {
        synchronized (this.f18683b) {
            try {
                t tVar = n0Var.f18698c;
                fj.l.e(tVar, "fragmentStateManager.fragment");
                s0 s0VarF = f(tVar);
                if (s0VarF == null) {
                    t tVar2 = n0Var.f18698c;
                    s0VarF = (tVar2.F || tVar2.E) ? g(tVar2) : null;
                }
                if (s0VarF != null) {
                    s0VarF.d(i10, i11);
                    return;
                }
                s0 s0Var = new s0(i10, i11, n0Var);
                this.f18683b.add(s0Var);
                s0Var.f18744d.add(new d(this, s0Var, 1));
                s0Var.f18744d.add(new d(this, s0Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z2;
        if (this.f18687f) {
            return;
        }
        if (!this.f18682a.isAttachedToWindow()) {
            h();
            this.f18686e = false;
            return;
        }
        synchronized (this.f18683b) {
            try {
                ArrayList arrayListT0 = qi.l.T0(this.f18684c);
                this.f18684c.clear();
                int size = arrayListT0.size();
                int i10 = 0;
                while (true) {
                    z2 = true;
                    if (i10 >= size) {
                        break;
                    }
                    Object obj = arrayListT0.get(i10);
                    i10++;
                    s0 s0Var = (s0) obj;
                    if (this.f18683b.isEmpty() || !s0Var.f18743c.F) {
                        z2 = false;
                    }
                    s0Var.f18747g = z2;
                }
                int size2 = arrayListT0.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayListT0.get(i11);
                    i11++;
                    s0 s0Var2 = (s0) obj2;
                    if (this.f18685d) {
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + s0Var2);
                        }
                        s0Var2.b();
                    } else {
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + s0Var2);
                        }
                        s0Var2.a(this.f18682a);
                    }
                    this.f18685d = false;
                    if (!s0Var2.f18746f) {
                        this.f18684c.add(s0Var2);
                    }
                }
                if (!this.f18683b.isEmpty()) {
                    l();
                    ArrayList arrayListT02 = qi.l.T0(this.f18683b);
                    if (arrayListT02.isEmpty()) {
                        return;
                    }
                    this.f18683b.clear();
                    this.f18684c.addAll(arrayListT02);
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListT02, this.f18686e);
                    boolean zJ = j(arrayListT02);
                    int size3 = arrayListT02.size();
                    int i12 = 0;
                    boolean z10 = true;
                    while (i12 < size3) {
                        Object obj3 = arrayListT02.get(i12);
                        i12++;
                        if (!((s0) obj3).f18743c.F) {
                            z10 = false;
                        }
                    }
                    if (!z10 || zJ) {
                        z2 = false;
                    }
                    this.f18685d = z2;
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z10);
                    }
                    if (!z10) {
                        k(arrayListT02);
                        c(arrayListT02);
                    } else if (zJ) {
                        k(arrayListT02);
                        int size4 = arrayListT02.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            a((s0) arrayListT02.get(i13));
                        }
                    }
                    this.f18686e = false;
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final s0 f(t tVar) {
        Object obj;
        ArrayList arrayList = this.f18683b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            if (fj.l.b(s0Var.f18743c, tVar) && !s0Var.f18745e) {
                break;
            }
        }
        return (s0) obj;
    }

    public final s0 g(t tVar) {
        Object obj;
        ArrayList arrayList = this.f18684c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            if (fj.l.b(s0Var.f18743c, tVar) && !s0Var.f18745e) {
                break;
            }
        }
        return (s0) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (i0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f18682a.isAttachedToWindow();
        synchronized (this.f18683b) {
            try {
                l();
                k(this.f18683b);
                ArrayList arrayListT0 = qi.l.T0(this.f18684c);
                int size = arrayListT0.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayListT0.get(i11);
                    i11++;
                    ((s0) obj).f18747g = false;
                }
                int size2 = arrayListT0.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListT0.get(i12);
                    i12++;
                    s0 s0Var = (s0) obj2;
                    if (i0.J(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f18682a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + s0Var);
                    }
                    s0Var.a(this.f18682a);
                }
                ArrayList arrayListT02 = qi.l.T0(this.f18683b);
                int size3 = arrayListT02.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayListT02.get(i13);
                    i13++;
                    ((s0) obj3).f18747g = false;
                }
                int size4 = arrayListT02.size();
                while (i10 < size4) {
                    Object obj4 = arrayListT02.get(i10);
                    i10++;
                    s0 s0Var2 = (s0) obj4;
                    if (i0.J(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f18682a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + s0Var2);
                    }
                    s0Var2.a(this.f18682a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0 s0Var = (s0) list.get(i10);
            n0 n0Var = s0Var.f18751l;
            if (!s0Var.f18748h) {
                s0Var.f18748h = true;
                int i11 = s0Var.f18742b;
                if (i11 == 2) {
                    t tVar = n0Var.f18698c;
                    fj.l.e(tVar, "fragmentStateManager.fragment");
                    View viewFindFocus = tVar.Z.findFocus();
                    if (viewFindFocus != null) {
                        tVar.k().f18740k = viewFindFocus;
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + tVar);
                        }
                    }
                    View viewJ = s0Var.f18743c.J();
                    if (viewJ.getParent() == null) {
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "Adding fragment " + tVar + " view " + viewJ + " to container in onStart");
                        }
                        n0Var.b();
                        viewJ.setAlpha(0.0f);
                    }
                    if (viewJ.getAlpha() == 0.0f && viewJ.getVisibility() == 0) {
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "Making view " + viewJ + " INVISIBLE in onStart");
                        }
                        viewJ.setVisibility(4);
                    }
                    s sVar = tVar.f18758c0;
                    viewJ.setAlpha(sVar == null ? 1.0f : sVar.j);
                    if (i0.J(2)) {
                        StringBuilder sb2 = new StringBuilder("Setting view alpha to ");
                        s sVar2 = tVar.f18758c0;
                        sb2.append(sVar2 != null ? sVar2.j : 1.0f);
                        sb2.append(" in onStart");
                        Log.v("FragmentManager", sb2.toString());
                    }
                } else if (i11 == 3) {
                    t tVar2 = n0Var.f18698c;
                    fj.l.e(tVar2, "fragmentStateManager.fragment");
                    View viewJ2 = tVar2.J();
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewJ2.findFocus() + " on view " + viewJ2 + " for Fragment " + tVar2);
                    }
                    viewJ2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qi.q.u0(arrayList, ((s0) it.next()).f18750k);
        }
        List listR0 = qi.l.R0(qi.l.V0(arrayList));
        int size2 = listR0.size();
        for (int i12 = 0; i12 < size2; i12++) {
            r0 r0Var = (r0) listR0.get(i12);
            r0Var.getClass();
            ViewGroup viewGroup = this.f18682a;
            fj.l.f(viewGroup, "container");
            if (!r0Var.f18729a) {
                r0Var.d(viewGroup);
            }
            r0Var.f18729a = true;
        }
    }

    public final void l() {
        ArrayList arrayList = this.f18683b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s0 s0Var = (s0) obj;
            int i11 = 2;
            if (s0Var.f18742b == 2) {
                int visibility = s0Var.f18743c.J().getVisibility();
                if (visibility != 0) {
                    i11 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(m6.a.d(visibility, "Unknown visibility "));
                        }
                        i11 = 3;
                    }
                }
                s0Var.d(i11, 1);
            }
        }
    }
}
