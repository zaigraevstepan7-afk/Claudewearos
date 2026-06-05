package w5;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f18741a;

    /* renamed from: b, reason: collision with root package name */
    public int f18742b;

    /* renamed from: c, reason: collision with root package name */
    public final t f18743c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18744d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18745e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18746f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18747g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18748h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18749i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f18750k;

    /* renamed from: l, reason: collision with root package name */
    public final n0 f18751l;

    public s0(int i10, int i11, n0 n0Var) {
        m6.a.m(i10, "finalState");
        m6.a.m(i11, "lifecycleImpact");
        t tVar = n0Var.f18698c;
        fj.l.e(tVar, "fragmentStateManager.fragment");
        m6.a.m(i10, "finalState");
        m6.a.m(i11, "lifecycleImpact");
        fj.l.f(tVar, "fragment");
        this.f18741a = i10;
        this.f18742b = i11;
        this.f18743c = tVar;
        this.f18744d = new ArrayList();
        this.f18749i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.f18750k = arrayList;
        this.f18751l = n0Var;
    }

    public final void a(ViewGroup viewGroup) {
        fj.l.f(viewGroup, "container");
        this.f18748h = false;
        if (this.f18745e) {
            return;
        }
        this.f18745e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (r0 r0Var : qi.l.R0(this.f18750k)) {
            r0Var.getClass();
            if (!r0Var.f18730b) {
                r0Var.a(viewGroup);
            }
            r0Var.f18730b = true;
        }
    }

    public final void b() {
        this.f18748h = false;
        if (!this.f18746f) {
            if (i0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f18746f = true;
            ArrayList arrayList = this.f18744d;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
        }
        this.f18743c.F = false;
        this.f18751l.k();
    }

    public final void c(r0 r0Var) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(r0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        m6.a.m(i10, "finalState");
        m6.a.m(i11, "lifecycleImpact");
        int iB = y3.e.b(i11);
        t tVar = this.f18743c;
        if (iB == 0) {
            if (this.f18741a != 1) {
                if (i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + tVar + " mFinalState = " + m1.A(this.f18741a) + " -> " + m1.A(i10) + '.');
                }
                this.f18741a = i10;
                return;
            }
            return;
        }
        if (iB == 1) {
            if (this.f18741a == 1) {
                if (i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + tVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + m1.z(this.f18742b) + " to ADDING.");
                }
                this.f18741a = 2;
                this.f18742b = 2;
                this.f18749i = true;
                return;
            }
            return;
        }
        if (iB != 2) {
            return;
        }
        if (i0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + tVar + " mFinalState = " + m1.A(this.f18741a) + " -> REMOVED. mLifecycleImpact  = " + m1.z(this.f18742b) + " to REMOVING.");
        }
        this.f18741a = 1;
        this.f18742b = 3;
        this.f18749i = true;
    }

    public final String toString() {
        StringBuilder sbK = m6.a.k("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbK.append(m1.A(this.f18741a));
        sbK.append(" lifecycleImpact = ");
        sbK.append(m1.z(this.f18742b));
        sbK.append(" fragment = ");
        sbK.append(this.f18743c);
        sbK.append('}');
        return sbK.toString();
    }
}
