package l7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p implements Cloneable {
    public static final Animator[] R = new Animator[0];
    public static final int[] S = {2, 1, 3, 4};
    public static final ef.f T = new ef.f();
    public static final ThreadLocal U = new ThreadLocal();
    public ArrayList D;
    public ArrayList E;
    public m[] F;
    public long P;
    public long Q;

    /* renamed from: a, reason: collision with root package name */
    public final String f10062a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f10063b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f10064c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f10065d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10066e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10067f = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public wh.s f10068z = new wh.s(7);
    public wh.s A = new wh.s(7);
    public a B = null;
    public final int[] C = S;
    public final ArrayList G = new ArrayList();
    public Animator[] H = R;
    public int I = 0;
    public boolean J = false;
    public boolean K = false;
    public p L = null;
    public ArrayList M = null;
    public ArrayList N = new ArrayList();
    public ef.f O = T;

    public static void b(wh.s sVar, View view, w wVar) {
        q.e eVar = (q.e) sVar.f19379a;
        q.e eVar2 = (q.e) sVar.f19382d;
        SparseArray sparseArray = (SparseArray) sVar.f19380b;
        q.p pVar = (q.p) sVar.f19381c;
        eVar.put(view, wVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        Field field = l0.f15744a;
        String strE = t4.d0.e(view);
        if (strE != null) {
            if (eVar2.containsKey(strE)) {
                eVar2.put(strE, null);
            } else {
                eVar2.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (pVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    pVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) pVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    pVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static q.e p() {
        ThreadLocal threadLocal = U;
        q.e eVar = (q.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        q.e eVar2 = new q.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean v(w wVar, w wVar2, String str) {
        Object obj = wVar.f10079a.get(str);
        Object obj2 = wVar2.f10079a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.J) {
            if (!this.K) {
                ArrayList arrayList = this.G;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
                this.H = R;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.H = animatorArr;
                w(this, o.f10061p, false);
            }
            this.J = false;
        }
    }

    public void B() {
        J();
        q.e eVarP = p();
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (eVarP.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new i(this, eVarP));
                    long j = this.f10064c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j4 = this.f10063b;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    TimeInterpolator timeInterpolator = this.f10065d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new hf.l(this, 1));
                    animator.start();
                }
            }
        }
        this.N.clear();
        m();
    }

    public void C(long j, long j4) {
        long j10 = this.P;
        int i10 = 0;
        boolean z2 = j < j4;
        if ((j4 < 0 && j >= 0) || (j4 > j10 && j <= j10)) {
            this.K = false;
            w(this, o.f10057l, z2);
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
        this.H = R;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i10++;
            j10 = j10;
        }
        long j11 = j10;
        this.H = animatorArr;
        if ((j <= j11 || j4 > j11) && (j >= 0 || j4 < 0)) {
            return;
        }
        if (j > j11) {
            this.K = true;
        }
        w(this, o.f10058m, z2);
    }

    public void D(long j) {
        this.f10064c = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f10065d = timeInterpolator;
    }

    public void G(ef.f fVar) {
        if (fVar == null) {
            this.O = T;
        } else {
            this.O = fVar;
        }
    }

    public void I(long j) {
        this.f10063b = j;
    }

    public final void J() {
        if (this.I == 0) {
            w(this, o.f10057l, false);
            this.K = false;
        }
        this.I++;
    }

    public String K(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f10064c != -1) {
            sb2.append("dur(");
            sb2.append(this.f10064c);
            sb2.append(") ");
        }
        if (this.f10063b != -1) {
            sb2.append("dly(");
            sb2.append(this.f10063b);
            sb2.append(") ");
        }
        if (this.f10065d != null) {
            sb2.append("interp(");
            sb2.append(this.f10065d);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f10066e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10067f;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(m mVar) {
        if (this.M == null) {
            this.M = new ArrayList();
        }
        this.M.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
        this.H = R;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.H = animatorArr;
        w(this, o.f10059n, false);
    }

    public abstract void d(w wVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z2) {
                g(wVar);
            } else {
                d(wVar);
            }
            wVar.f10081c.add(this);
            f(wVar);
            if (z2) {
                b(this.f10068z, view, wVar);
            } else {
                b(this.A, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z2);
            }
        }
    }

    public abstract void g(w wVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f10066e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10067f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                w wVar = new w(viewFindViewById);
                if (z2) {
                    g(wVar);
                } else {
                    d(wVar);
                }
                wVar.f10081c.add(this);
                f(wVar);
                if (z2) {
                    b(this.f10068z, viewFindViewById, wVar);
                } else {
                    b(this.A, viewFindViewById, wVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            w wVar2 = new w(view);
            if (z2) {
                g(wVar2);
            } else {
                d(wVar2);
            }
            wVar2.f10081c.add(this);
            f(wVar2);
            if (z2) {
                b(this.f10068z, view, wVar2);
            } else {
                b(this.A, view, wVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((q.e) this.f10068z.f19379a).clear();
            ((SparseArray) this.f10068z.f19380b).clear();
            ((q.p) this.f10068z.f19381c).a();
        } else {
            ((q.e) this.A.f19379a).clear();
            ((SparseArray) this.A.f19380b).clear();
            ((q.p) this.A.f19381c).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.N = new ArrayList();
            pVar.f10068z = new wh.s(7);
            pVar.A = new wh.s(7);
            pVar.D = null;
            pVar.E = null;
            pVar.L = this;
            pVar.M = null;
            return pVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, wh.s sVar, wh.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int i11;
        View view;
        w wVar;
        Animator animator;
        w wVar2;
        q.e eVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i12 = 0;
        while (i12 < size) {
            w wVar3 = (w) arrayList.get(i12);
            w wVar4 = (w) arrayList2.get(i12);
            if (wVar3 != null && !wVar3.f10081c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f10081c.contains(this)) {
                wVar4 = null;
            }
            if ((wVar3 != null || wVar4 != null) && (wVar3 == null || wVar4 == null || t(wVar3, wVar4))) {
                Animator animatorK = k(viewGroup, wVar3, wVar4);
                if (animatorK != null) {
                    String str = this.f10062a;
                    if (wVar4 != null) {
                        view = wVar4.f10080b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            wVar2 = new w(view);
                            w wVar5 = (w) ((q.e) sVar2.f19379a).get(view);
                            i10 = size;
                            if (wVar5 != null) {
                                int i13 = 0;
                                while (i13 < strArrQ.length) {
                                    String str2 = strArrQ[i13];
                                    wVar2.f10079a.put(str2, wVar5.f10079a.get(str2));
                                    i13++;
                                    i12 = i12;
                                    wVar5 = wVar5;
                                }
                            }
                            i11 = i12;
                            int i14 = eVarP.f13117c;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i14) {
                                    animator = animatorK;
                                    break;
                                }
                                j jVar = (j) eVarP.get((Animator) eVarP.f(i15));
                                if (jVar.f10050c != null && jVar.f10048a == view && jVar.f10049b.equals(str) && jVar.f10050c.equals(wVar2)) {
                                    animator = null;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i10 = size;
                            i11 = i12;
                            animator = animatorK;
                            wVar2 = null;
                        }
                        animatorK = animator;
                        wVar = wVar2;
                    } else {
                        i10 = size;
                        i11 = i12;
                        view = wVar3.f10080b;
                        wVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        j jVar2 = new j();
                        jVar2.f10048a = view;
                        jVar2.f10049b = str;
                        jVar2.f10050c = wVar;
                        jVar2.f10051d = windowId;
                        jVar2.f10052e = this;
                        jVar2.f10053f = animatorK;
                        eVarP.put(animatorK, jVar2);
                        this.N.add(animatorK);
                    }
                }
                i12 = i11 + 1;
                size = i10;
            }
            i10 = size;
            i11 = i12;
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                j jVar3 = (j) eVarP.get((Animator) this.N.get(sparseIntArray.keyAt(i16)));
                jVar3.f10053f.setStartDelay(jVar3.f10053f.getStartDelay() + (sparseIntArray.valueAt(i16) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.I - 1;
        this.I = i10;
        if (i10 == 0) {
            w(this, o.f10058m, false);
            for (int i11 = 0; i11 < ((q.p) this.f10068z.f19381c).g(); i11++) {
                View view = (View) ((q.p) this.f10068z.f19381c).h(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((q.p) this.A.f19381c).g(); i12++) {
                View view2 = (View) ((q.p) this.A.f19381c).h(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.K = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (l7.w) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l7.w n(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            l7.a r0 = r4.B
            if (r0 == 0) goto L9
            l7.w r5 = r0.n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.D
            goto L10
        Le:
            java.util.ArrayList r0 = r4.E
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            l7.w r3 = (l7.w) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f10080b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.E
            goto L35
        L33:
            java.util.ArrayList r5 = r4.D
        L35:
            java.lang.Object r5 = r5.get(r2)
            l7.w r5 = (l7.w) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.p.n(android.view.View, boolean):l7.w");
    }

    public final p o() {
        a aVar = this.B;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final w r(View view, boolean z2) {
        a aVar = this.B;
        if (aVar != null) {
            return aVar.r(view, z2);
        }
        return (w) ((q.e) (z2 ? this.f10068z : this.A).f19379a).get(view);
    }

    public boolean s() {
        return !this.G.isEmpty();
    }

    public boolean t(w wVar, w wVar2) {
        if (wVar != null && wVar2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (v(wVar, wVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wVar.f10079a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(wVar, wVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f10066e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10067f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public final void w(p pVar, o oVar, boolean z2) {
        p pVar2 = this.L;
        if (pVar2 != null) {
            pVar2.w(pVar, oVar, z2);
        }
        ArrayList arrayList = this.M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.M.size();
        m[] mVarArr = this.F;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.F = null;
        m[] mVarArr2 = (m[]) this.M.toArray(mVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            oVar.d(mVarArr2[i10], pVar, z2);
            mVarArr2[i10] = null;
        }
        this.F = mVarArr2;
    }

    public void x(View view) {
        if (this.K) {
            return;
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
        this.H = R;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.H = animatorArr;
        w(this, o.f10060o, false);
        this.J = true;
    }

    public void y() {
        q.e eVarP = p();
        this.P = 0L;
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            Animator animator = (Animator) this.N.get(i10);
            j jVar = (j) eVarP.get(animator);
            if (animator != null && jVar != null) {
                Animator animator2 = jVar.f10053f;
                long j = this.f10064c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j4 = this.f10063b;
                if (j4 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j4);
                }
                TimeInterpolator timeInterpolator = this.f10065d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.G.add(animator);
                this.P = Math.max(this.P, animator.getTotalDuration());
            }
        }
        this.N.clear();
    }

    public p z(m mVar) {
        p pVar;
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (pVar = this.L) != null) {
                pVar.z(mVar);
            }
            if (this.M.size() == 0) {
                this.M = null;
            }
        }
        return this;
    }

    public void H() {
    }

    public void E(a.a aVar) {
    }

    public void f(w wVar) {
    }
}
