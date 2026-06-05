package w5;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.a1;
import com.anonlab.voidlauncher.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t.m1;
import w2.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 {
    public final c0 A;
    public final h9.a B;
    public g.f C;
    public g.f D;
    public g.f E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public k0 O;
    public final t7.s P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18642b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f18645e;

    /* renamed from: g, reason: collision with root package name */
    public c.b0 f18647g;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f18653n;

    /* renamed from: o, reason: collision with root package name */
    public final qh.c f18654o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f18655p;

    /* renamed from: q, reason: collision with root package name */
    public final z f18656q;

    /* renamed from: r, reason: collision with root package name */
    public final z f18657r;

    /* renamed from: s, reason: collision with root package name */
    public final z f18658s;

    /* renamed from: t, reason: collision with root package name */
    public final z f18659t;

    /* renamed from: u, reason: collision with root package name */
    public final b0 f18660u;

    /* renamed from: v, reason: collision with root package name */
    public int f18661v;

    /* renamed from: w, reason: collision with root package name */
    public v f18662w;

    /* renamed from: x, reason: collision with root package name */
    public u1.b f18663x;

    /* renamed from: y, reason: collision with root package name */
    public t f18664y;

    /* renamed from: z, reason: collision with root package name */
    public t f18665z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18641a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final a8.j f18643c = new a8.j(13);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f18644d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final y f18646f = new y(this);

    /* renamed from: h, reason: collision with root package name */
    public a f18648h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18649i = false;
    public final c.c0 j = new c.c0(this, 2);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f18650k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f18651l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f18652m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [w5.z] */
    /* JADX WARN: Type inference failed for: r0v17, types: [w5.z] */
    /* JADX WARN: Type inference failed for: r0v18, types: [w5.z] */
    /* JADX WARN: Type inference failed for: r0v19, types: [w5.z] */
    public i0() {
        Collections.synchronizedMap(new HashMap());
        this.f18653n = new ArrayList();
        this.f18654o = new qh.c(this);
        this.f18655p = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f18656q = new s4.a(this) { // from class: w5.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f18787b;

            {
                this.f18787b = this;
            }

            @Override // s4.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        i0 i0Var = this.f18787b;
                        if (i0Var.L()) {
                            i0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.f18787b;
                        if (i0Var2.L() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        h4.e eVar = (h4.e) obj;
                        i0 i0Var3 = this.f18787b;
                        if (i0Var3.L()) {
                            boolean z2 = eVar.f7621a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        h4.q qVar = (h4.q) obj;
                        i0 i0Var4 = this.f18787b;
                        if (i0Var4.L()) {
                            boolean z10 = qVar.f7653a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f18657r = new s4.a(this) { // from class: w5.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f18787b;

            {
                this.f18787b = this;
            }

            @Override // s4.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        i0 i0Var = this.f18787b;
                        if (i0Var.L()) {
                            i0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.f18787b;
                        if (i0Var2.L() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        h4.e eVar = (h4.e) obj;
                        i0 i0Var3 = this.f18787b;
                        if (i0Var3.L()) {
                            boolean z2 = eVar.f7621a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        h4.q qVar = (h4.q) obj;
                        i0 i0Var4 = this.f18787b;
                        if (i0Var4.L()) {
                            boolean z10 = qVar.f7653a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f18658s = new s4.a(this) { // from class: w5.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f18787b;

            {
                this.f18787b = this;
            }

            @Override // s4.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        i0 i0Var = this.f18787b;
                        if (i0Var.L()) {
                            i0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.f18787b;
                        if (i0Var2.L() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        h4.e eVar = (h4.e) obj;
                        i0 i0Var3 = this.f18787b;
                        if (i0Var3.L()) {
                            boolean z2 = eVar.f7621a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        h4.q qVar = (h4.q) obj;
                        i0 i0Var4 = this.f18787b;
                        if (i0Var4.L()) {
                            boolean z10 = qVar.f7653a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f18659t = new s4.a(this) { // from class: w5.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f18787b;

            {
                this.f18787b = this;
            }

            @Override // s4.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        i0 i0Var = this.f18787b;
                        if (i0Var.L()) {
                            i0Var.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.f18787b;
                        if (i0Var2.L() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        h4.e eVar = (h4.e) obj;
                        i0 i0Var3 = this.f18787b;
                        if (i0Var3.L()) {
                            boolean z2 = eVar.f7621a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        h4.q qVar = (h4.q) obj;
                        i0 i0Var4 = this.f18787b;
                        if (i0Var4.L()) {
                            boolean z10 = qVar.f7653a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f18660u = new b0(this);
        this.f18661v = -1;
        this.A = new c0(this);
        this.B = new h9.a(15);
        this.F = new ArrayDeque();
        this.P = new t7.s(this, 4);
    }

    public static HashSet E(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f18586a.size(); i10++) {
            t tVar = ((o0) aVar.f18586a.get(i10)).f18704b;
            if (tVar != null && aVar.f18592g) {
                hashSet.add(tVar);
            }
        }
        return hashSet;
    }

    public static boolean J(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean K(t tVar) {
        tVar.getClass();
        ArrayList arrayListY = tVar.O.f18643c.y();
        int size = arrayListY.size();
        boolean zK = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListY.get(i10);
            i10++;
            t tVar2 = (t) obj;
            if (tVar2 != null) {
                zK = K(tVar2);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(t tVar) {
        if (tVar == null) {
            return true;
        }
        if (tVar.W) {
            return tVar.M == null || M(tVar.P);
        }
        return false;
    }

    public static boolean N(t tVar) {
        if (tVar == null) {
            return true;
        }
        i0 i0Var = tVar.M;
        return tVar.equals(i0Var.f18665z) && N(i0Var.f18664y);
    }

    public static void c0(t tVar) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + tVar);
        }
        if (tVar.T) {
            tVar.T = false;
            tVar.f18760d0 = !tVar.f18760d0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x021e A[PHI: r15
      0x021e: PHI (r15v24 int) = (r15v23 int), (r15v26 int) binds: [B:103:0x020b, B:107:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.util.ArrayList r28, java.util.ArrayList r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.i0.A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final t B(int i10) {
        a8.j jVar = this.f18643c;
        ArrayList arrayList = (ArrayList) jVar.f215a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t tVar = (t) arrayList.get(size);
            if (tVar != null && tVar.Q == i10) {
                return tVar;
            }
        }
        for (n0 n0Var : ((HashMap) jVar.f216b).values()) {
            if (n0Var != null) {
                t tVar2 = n0Var.f18698c;
                if (tVar2.Q == i10) {
                    return tVar2;
                }
            }
        }
        return null;
    }

    public final t C(String str) {
        a8.j jVar = this.f18643c;
        ArrayList arrayList = (ArrayList) jVar.f215a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t tVar = (t) arrayList.get(size);
            if (tVar != null && str.equals(tVar.S)) {
                return tVar;
            }
        }
        for (n0 n0Var : ((HashMap) jVar.f216b).values()) {
            if (n0Var != null) {
                t tVar2 = n0Var.f18698c;
                if (str.equals(tVar2.S)) {
                    return tVar2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar.f18687f) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                mVar.f18687f = false;
                mVar.e();
            }
        }
    }

    public final ViewGroup F(t tVar) {
        ViewGroup viewGroup = tVar.Y;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (tVar.R <= 0 || !this.f18663x.u()) {
            return null;
        }
        View viewT = this.f18663x.t(tVar.R);
        if (viewT instanceof ViewGroup) {
            return (ViewGroup) viewT;
        }
        return null;
    }

    public final c0 G() {
        t tVar = this.f18664y;
        return tVar != null ? tVar.M.G() : this.A;
    }

    public final h9.a H() {
        t tVar = this.f18664y;
        return tVar != null ? tVar.M.H() : this.B;
    }

    public final void I(t tVar) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + tVar);
        }
        if (tVar.T) {
            return;
        }
        tVar.T = true;
        tVar.f18760d0 = true ^ tVar.f18760d0;
        b0(tVar);
    }

    public final boolean L() {
        t tVar = this.f18664y;
        if (tVar == null) {
            return true;
        }
        return tVar.N != null && tVar.D && tVar.o().L();
    }

    public final void O(int i10, boolean z2) {
        v vVar;
        if (this.f18662w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i10 != this.f18661v) {
            this.f18661v = i10;
            a8.j jVar = this.f18643c;
            HashMap map = (HashMap) jVar.f216b;
            ArrayList arrayList = (ArrayList) jVar.f215a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                n0 n0Var = (n0) map.get(((t) obj).f18761e);
                if (n0Var != null) {
                    n0Var.k();
                }
            }
            for (n0 n0Var2 : map.values()) {
                if (n0Var2 != null) {
                    n0Var2.k();
                    t tVar = n0Var2.f18698c;
                    if (tVar.E && !tVar.s()) {
                        jVar.C(n0Var2);
                    }
                }
            }
            d0();
            if (this.G && (vVar = this.f18662w) != null && this.f18661v == 7) {
                vVar.A.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void P() {
        if (this.f18662w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f18681g = false;
        for (t tVar : this.f18643c.z()) {
            if (tVar != null) {
                tVar.O.P();
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i10, int i11) {
        z(false);
        y(true);
        t tVar = this.f18665z;
        if (tVar != null && i10 < 0 && tVar.l().Q()) {
            return true;
        }
        boolean zS = S(this.L, this.M, i10, i11);
        if (zS) {
            this.f18642b = true;
            try {
                U(this.L, this.M);
            } finally {
                d();
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        ((HashMap) this.f18643c.f216b).values().removeAll(Collections.singleton(null));
        return zS;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z2 = (i11 & 1) != 0;
        int size = -1;
        if (!this.f18644d.isEmpty()) {
            if (i10 < 0) {
                size = z2 ? 0 : this.f18644d.size() - 1;
            } else {
                int size2 = this.f18644d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f18644d.get(size2);
                    if (i10 >= 0 && i10 == aVar.f18603s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z2) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f18644d.get(size - 1);
                        if (i10 < 0 || i10 != aVar2.f18603s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f18644d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f18644d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f18644d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(t tVar) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + tVar + " nesting=" + tVar.L);
        }
        boolean zS = tVar.s();
        if (tVar.U && zS) {
            return;
        }
        a8.j jVar = this.f18643c;
        synchronized (((ArrayList) jVar.f215a)) {
            ((ArrayList) jVar.f215a).remove(tVar);
        }
        tVar.D = false;
        if (K(tVar)) {
            this.G = true;
        }
        tVar.E = true;
        b0(tVar);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((a) arrayList.get(i10)).f18599o) {
                if (i11 != i10) {
                    A(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).f18599o) {
                        i11++;
                    }
                }
                A(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            A(arrayList, arrayList2, i11, size);
        }
    }

    public final void V(Bundle bundle) {
        qh.c cVar;
        int i10;
        int i11;
        Bundle bundle2;
        n0 n0Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f18662w.f18777e.getClassLoader());
                this.f18652m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f18662w.f18777e.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        a8.j jVar = this.f18643c;
        HashMap map2 = (HashMap) jVar.f217c;
        HashMap map3 = (HashMap) jVar.f216b;
        map2.clear();
        map2.putAll(map);
        j0 j0Var = (j0) bundle.getParcelable("state");
        if (j0Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = j0Var.f18667a;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            cVar = this.f18654o;
            if (i12 >= size) {
                break;
            }
            Object obj = arrayList.get(i12);
            i12++;
            Bundle bundleG = jVar.G(null, (String) obj);
            if (bundleG != null) {
                t tVar = (t) this.O.f18676b.get(((m0) bundleG.getParcelable("state")).f18689b);
                if (tVar != null) {
                    if (J(2)) {
                        i11 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + tVar);
                    } else {
                        i11 = 2;
                    }
                    n0Var = new n0(cVar, jVar, tVar, bundleG);
                    bundle2 = bundleG;
                } else {
                    i11 = 2;
                    bundle2 = bundleG;
                    n0Var = new n0(this.f18654o, this.f18643c, this.f18662w.f18777e.getClassLoader(), G(), bundleG);
                }
                t tVar2 = n0Var.f18698c;
                tVar2.f18755b = bundle2;
                tVar2.M = this;
                if (J(i11)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + tVar2.f18761e + "): " + tVar2);
                }
                n0Var.m(this.f18662w.f18777e.getClassLoader());
                jVar.B(n0Var);
                n0Var.f18700e = this.f18661v;
            }
        }
        k0 k0Var = this.O;
        k0Var.getClass();
        ArrayList arrayList2 = new ArrayList(k0Var.f18676b.values());
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            t tVar3 = (t) obj2;
            if (map3.get(tVar3.f18761e) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + tVar3 + " that was not found in the set of active Fragments " + j0Var.f18667a);
                }
                this.O.h(tVar3);
                tVar3.M = this;
                n0 n0Var2 = new n0(cVar, jVar, tVar3);
                n0Var2.f18700e = 1;
                n0Var2.k();
                tVar3.E = true;
                n0Var2.k();
            }
        }
        ArrayList arrayList3 = j0Var.f18668b;
        ((ArrayList) jVar.f215a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                String str3 = (String) obj3;
                t tVarS = jVar.s(str3);
                if (tVarS == null) {
                    throw new IllegalStateException(m1.j("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + tVarS);
                }
                jVar.c(tVarS);
            }
        }
        if (j0Var.f18669c != null) {
            this.f18644d = new ArrayList(j0Var.f18669c.length);
            int i15 = 0;
            while (true) {
                b[] bVarArr = j0Var.f18669c;
                if (i15 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i15];
                ArrayList arrayList4 = bVar.f18606b;
                a aVar = new a(this);
                int[] iArr = bVar.f18605a;
                int i16 = 0;
                int i17 = 0;
                while (i16 < iArr.length) {
                    o0 o0Var = new o0();
                    int i18 = i16 + 1;
                    o0Var.f18703a = iArr[i16];
                    if (J(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i17 + " base fragment #" + iArr[i18]);
                    }
                    o0Var.f18710h = androidx.lifecycle.o.values()[bVar.f18607c[i17]];
                    o0Var.f18711i = androidx.lifecycle.o.values()[bVar.f18608d[i17]];
                    int i19 = i16 + 2;
                    o0Var.f18705c = iArr[i18] != 0;
                    int i20 = iArr[i19];
                    o0Var.f18706d = i20;
                    int i21 = iArr[i16 + 3];
                    o0Var.f18707e = i21;
                    int i22 = i16 + 5;
                    int i23 = iArr[i16 + 4];
                    o0Var.f18708f = i23;
                    i16 += 6;
                    int[] iArr2 = iArr;
                    int i24 = iArr2[i22];
                    o0Var.f18709g = i24;
                    aVar.f18587b = i20;
                    aVar.f18588c = i21;
                    aVar.f18589d = i23;
                    aVar.f18590e = i24;
                    aVar.b(o0Var);
                    i17++;
                    iArr = iArr2;
                }
                aVar.f18591f = bVar.f18609e;
                aVar.f18593h = bVar.f18610f;
                aVar.f18592g = true;
                aVar.f18594i = bVar.A;
                aVar.j = bVar.B;
                aVar.f18595k = bVar.C;
                aVar.f18596l = bVar.D;
                aVar.f18597m = bVar.E;
                aVar.f18598n = bVar.F;
                aVar.f18599o = bVar.G;
                aVar.f18603s = bVar.f18611z;
                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                    String str4 = (String) arrayList4.get(i25);
                    if (str4 != null) {
                        ((o0) aVar.f18586a.get(i25)).f18704b = jVar.s(str4);
                    }
                }
                aVar.c(1);
                if (J(2)) {
                    StringBuilder sbP = gk.b.p(i15, "restoreAllState: back stack #", " (index ");
                    sbP.append(aVar.f18603s);
                    sbP.append("): ");
                    sbP.append(aVar);
                    Log.v("FragmentManager", sbP.toString());
                    PrintWriter printWriter = new PrintWriter(new q0());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f18644d.add(aVar);
                i15++;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f18644d = new ArrayList();
        }
        this.f18650k.set(j0Var.f18670d);
        String str5 = j0Var.f18671e;
        if (str5 != null) {
            t tVarS2 = jVar.s(str5);
            this.f18665z = tVarS2;
            r(tVarS2);
        }
        ArrayList arrayList5 = j0Var.f18672f;
        if (arrayList5 != null) {
            for (int i26 = i10; i26 < arrayList5.size(); i26++) {
                this.f18651l.put((String) arrayList5.get(i26), (c) j0Var.f18673z.get(i26));
            }
        }
        this.F = new ArrayDeque(j0Var.A);
    }

    public final Bundle W() {
        int i10;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        w();
        z(true);
        this.H = true;
        this.O.f18681g = true;
        a8.j jVar = this.f18643c;
        jVar.getClass();
        HashMap map = (HashMap) jVar.f216b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n0 n0Var = (n0) it.next();
            if (n0Var != null) {
                t tVar = n0Var.f18698c;
                String str = tVar.f18761e;
                Bundle bundle3 = new Bundle();
                t tVar2 = n0Var.f18698c;
                if (tVar2.f18753a == -1 && (bundle = tVar2.f18755b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new m0(tVar2));
                if (tVar2.f18753a > 0) {
                    Bundle bundle4 = new Bundle();
                    tVar2.D(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    n0Var.f18696a.u(tVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    tVar2.f18769k0.s(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleW = tVar2.O.W();
                    if (!bundleW.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleW);
                    }
                    if (tVar2.Z != null) {
                        n0Var.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = tVar2.f18757c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = tVar2.f18759d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = tVar2.f18763f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                jVar.G(bundle3, str);
                arrayList2.add(tVar.f18761e);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + tVar + ": " + tVar.f18755b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f18643c.f217c;
        if (!map2.isEmpty()) {
            a8.j jVar2 = this.f18643c;
            synchronized (((ArrayList) jVar2.f215a)) {
                try {
                    if (((ArrayList) jVar2.f215a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) jVar2.f215a).size());
                        ArrayList arrayList3 = (ArrayList) jVar2.f215a;
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            t tVar3 = (t) obj;
                            arrayList.add(tVar3.f18761e);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + tVar3.f18761e + "): " + tVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f18644d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i10 = 0; i10 < size2; i10++) {
                    bVarArr[i10] = new b((a) this.f18644d.get(i10));
                    if (J(2)) {
                        StringBuilder sbP = gk.b.p(i10, "saveAllState: adding back stack #", ": ");
                        sbP.append(this.f18644d.get(i10));
                        Log.v("FragmentManager", sbP.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            j0 j0Var = new j0();
            j0Var.f18671e = null;
            ArrayList arrayList4 = new ArrayList();
            j0Var.f18672f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            j0Var.f18673z = arrayList5;
            j0Var.f18667a = arrayList2;
            j0Var.f18668b = arrayList;
            j0Var.f18669c = bVarArr;
            j0Var.f18670d = this.f18650k.get();
            t tVar4 = this.f18665z;
            if (tVar4 != null) {
                j0Var.f18671e = tVar4.f18761e;
            }
            arrayList4.addAll(this.f18651l.keySet());
            arrayList5.addAll(this.f18651l.values());
            j0Var.A = new ArrayList(this.F);
            bundle2.putParcelable("state", j0Var);
            for (String str2 : this.f18652m.keySet()) {
                bundle2.putBundle(m1.i("result_", str2), (Bundle) this.f18652m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(m1.i("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void X() {
        synchronized (this.f18641a) {
            try {
                if (this.f18641a.size() == 1) {
                    this.f18662w.f18778f.removeCallbacks(this.P);
                    this.f18662w.f18778f.post(this.P);
                    f0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Y(t tVar, boolean z2) {
        ViewGroup viewGroupF = F(tVar);
        if (viewGroupF == null || !(viewGroupF instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupF).setDrawDisappearingViewsLast(!z2);
    }

    public final void Z(t tVar, androidx.lifecycle.o oVar) {
        if (tVar.equals(this.f18643c.s(tVar.f18761e)) && (tVar.N == null || tVar.M == this)) {
            tVar.f18765g0 = oVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + tVar + " is not an active fragment of FragmentManager " + this);
    }

    public final n0 a(t tVar) {
        String str = tVar.f18764f0;
        if (str != null) {
            x5.c.c(tVar, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + tVar);
        }
        n0 n0VarG = g(tVar);
        tVar.M = this;
        a8.j jVar = this.f18643c;
        jVar.B(n0VarG);
        if (!tVar.U) {
            jVar.c(tVar);
            tVar.E = false;
            if (tVar.Z == null) {
                tVar.f18760d0 = false;
            }
            if (K(tVar)) {
                this.G = true;
            }
        }
        return n0VarG;
    }

    public final void a0(t tVar) {
        if (tVar != null) {
            if (!tVar.equals(this.f18643c.s(tVar.f18761e)) || (tVar.N != null && tVar.M != this)) {
                throw new IllegalArgumentException("Fragment " + tVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        t tVar2 = this.f18665z;
        this.f18665z = tVar;
        r(tVar2);
        r(this.f18665z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(v vVar, u1.b bVar, t tVar) {
        if (this.f18662w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f18662w = vVar;
        this.f18663x = bVar;
        this.f18664y = tVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18655p;
        if (tVar != 0) {
            copyOnWriteArrayList.add(new d0(tVar));
        } else if (vVar != null) {
            copyOnWriteArrayList.add(vVar);
        }
        if (this.f18664y != null) {
            f0();
        }
        if (vVar != null) {
            c.b0 b0VarA = vVar.A.a();
            this.f18647g = b0VarA;
            b0VarA.a(tVar != 0 ? tVar : vVar, this.j);
        }
        if (tVar != 0) {
            k0 k0Var = tVar.M.O;
            HashMap map = k0Var.f18677c;
            k0 k0Var2 = (k0) map.get(tVar.f18761e);
            if (k0Var2 == null) {
                k0Var2 = new k0(k0Var.f18679e);
                map.put(tVar.f18761e, k0Var2);
            }
            this.O = k0Var2;
        } else if (vVar != null) {
            a1 a1VarE = vVar.A.e();
            d6.a aVar = d6.a.f4976b;
            fj.l.f(aVar, "defaultCreationExtras");
            wh.s sVar = new wh.s(a1VarE, k0.f18675h, aVar);
            fj.f fVarA = fj.w.a(k0.class);
            String strB = fVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.O = (k0) sVar.j(fVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            this.O = new k0(false);
        }
        k0 k0Var3 = this.O;
        k0Var3.f18681g = this.H || this.I;
        this.f18643c.f218d = k0Var3;
        v vVar2 = this.f18662w;
        if (vVar2 != null && tVar == 0) {
            mh.g gVarG = vVar2.g();
            gVarG.z("android:support:fragments", new c.g(this, 4));
            Bundle bundleI = gVarG.i("android:support:fragments");
            if (bundleI != null) {
                V(bundleI);
            }
        }
        v vVar3 = this.f18662w;
        if (vVar3 != null) {
            c.l lVar = vVar3.A.B;
            String strI = m1.i("FragmentManager:", tVar != 0 ? m6.a.j(new StringBuilder(), tVar.f18761e, ":") : "");
            this.C = lVar.c(m1.v(strI, "StartActivityForResult"), new h.b(false), new yh.c(this, 23));
            this.D = lVar.c(m1.v(strI, "StartIntentSenderForResult"), new h.b(7), new s1(this, 1));
            this.E = lVar.c(m1.v(strI, "RequestPermissions"), new h.b(4), new a0(this));
        }
        v vVar4 = this.f18662w;
        if (vVar4 != null) {
            vVar4.A.i(this.f18656q);
        }
        v vVar5 = this.f18662w;
        if (vVar5 != null) {
            w wVar = vVar5.A;
            wVar.getClass();
            z zVar = this.f18657r;
            fj.l.f(zVar, "listener");
            wVar.D.add(zVar);
        }
        v vVar6 = this.f18662w;
        if (vVar6 != null) {
            w wVar2 = vVar6.A;
            wVar2.getClass();
            z zVar2 = this.f18658s;
            fj.l.f(zVar2, "listener");
            wVar2.F.add(zVar2);
        }
        v vVar7 = this.f18662w;
        if (vVar7 != null) {
            w wVar3 = vVar7.A;
            wVar3.getClass();
            z zVar3 = this.f18659t;
            fj.l.f(zVar3, "listener");
            wVar3.G.add(zVar3);
        }
        v vVar8 = this.f18662w;
        if (vVar8 == null || tVar != 0) {
            return;
        }
        w wVar4 = vVar8.A;
        wVar4.getClass();
        b0 b0Var = this.f18660u;
        fj.l.f(b0Var, "provider");
        p1.l lVar2 = wVar4.f1842c;
        ((CopyOnWriteArrayList) lVar2.f12661c).add(b0Var);
        ((Runnable) lVar2.f12660b).run();
    }

    public final void b0(t tVar) {
        ViewGroup viewGroupF = F(tVar);
        if (viewGroupF != null) {
            s sVar = tVar.f18758c0;
            if ((sVar == null ? 0 : sVar.f18735e) + (sVar == null ? 0 : sVar.f18734d) + (sVar == null ? 0 : sVar.f18733c) + (sVar == null ? 0 : sVar.f18732b) > 0) {
                if (viewGroupF.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupF.setTag(R.id.visible_removing_fragment_view_tag, tVar);
                }
                t tVar2 = (t) viewGroupF.getTag(R.id.visible_removing_fragment_view_tag);
                s sVar2 = tVar.f18758c0;
                boolean z2 = sVar2 != null ? sVar2.f18731a : false;
                if (tVar2.f18758c0 == null) {
                    return;
                }
                tVar2.k().f18731a = z2;
            }
        }
    }

    public final void c(t tVar) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + tVar);
        }
        if (tVar.U) {
            tVar.U = false;
            if (tVar.D) {
                return;
            }
            this.f18643c.c(tVar);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + tVar);
            }
            if (K(tVar)) {
                this.G = true;
            }
        }
    }

    public final void d() {
        this.f18642b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0() {
        ArrayList arrayListX = this.f18643c.x();
        int size = arrayListX.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListX.get(i10);
            i10++;
            n0 n0Var = (n0) obj;
            t tVar = n0Var.f18698c;
            if (tVar.f18754a0) {
                if (this.f18642b) {
                    this.K = true;
                } else {
                    tVar.f18754a0 = false;
                    n0Var.k();
                }
            }
        }
    }

    public final HashSet e() {
        m mVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListX = this.f18643c.x();
        int size = arrayListX.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListX.get(i10);
            i10++;
            ViewGroup viewGroup = ((n0) obj).f18698c.Y;
            if (viewGroup != null) {
                fj.l.f(H(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof m) {
                    mVar = (m) tag;
                } else {
                    mVar = new m(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, mVar);
                }
                hashSet.add(mVar);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new q0());
        v vVar = this.f18662w;
        if (vVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            vVar.A.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final HashSet f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList arrayList2 = ((a) arrayList.get(i10)).f18586a;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                t tVar = ((o0) obj).f18704b;
                if (tVar != null && (viewGroup = tVar.Y) != null) {
                    hashSet.add(m.i(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final void f0() {
        synchronized (this.f18641a) {
            try {
                if (!this.f18641a.isEmpty()) {
                    this.j.f(true);
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z2 = this.f18644d.size() + (this.f18648h != null ? 1 : 0) > 0 && N(this.f18664y);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z2);
                }
                this.j.f(z2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n0 g(t tVar) {
        String str = tVar.f18761e;
        a8.j jVar = this.f18643c;
        n0 n0Var = (n0) ((HashMap) jVar.f216b).get(str);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(this.f18654o, jVar, tVar);
        n0Var2.m(this.f18662w.f18777e.getClassLoader());
        n0Var2.f18700e = this.f18661v;
        return n0Var2;
    }

    public final void h(t tVar) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + tVar);
        }
        if (tVar.U) {
            return;
        }
        tVar.U = true;
        if (tVar.D) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + tVar);
            }
            a8.j jVar = this.f18643c;
            synchronized (((ArrayList) jVar.f215a)) {
                ((ArrayList) jVar.f215a).remove(tVar);
            }
            tVar.D = false;
            if (K(tVar)) {
                this.G = true;
            }
            b0(tVar);
        }
    }

    public final void i(boolean z2) {
        if (z2 && this.f18662w != null) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (t tVar : this.f18643c.z()) {
            if (tVar != null) {
                tVar.X = true;
                if (z2) {
                    tVar.O.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f18661v < 1) {
            return false;
        }
        for (t tVar : this.f18643c.z()) {
            if (tVar != null) {
                if (!tVar.T ? tVar.O.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f18661v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (t tVar : this.f18643c.z()) {
            if (tVar != null && M(tVar)) {
                if (!tVar.T ? tVar.O.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tVar);
                    z2 = true;
                }
            }
        }
        if (this.f18645e != null) {
            for (int i10 = 0; i10 < this.f18645e.size(); i10++) {
                t tVar2 = (t) this.f18645e.get(i10);
                if (arrayList == null || !arrayList.contains(tVar2)) {
                    tVar2.getClass();
                }
            }
        }
        this.f18645e = arrayList;
        return z2;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        z(true);
        w();
        v vVar = this.f18662w;
        a8.j jVar = this.f18643c;
        if (vVar != null) {
            zIsChangingConfigurations = ((k0) jVar.f218d).f18680f;
        } else {
            w wVar = vVar.f18777e;
            if (wVar != null) {
                zIsChangingConfigurations = true ^ wVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f18651l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((c) it.next()).f18613a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((k0) jVar.f218d).e((String) obj, false);
                }
            }
        }
        u(-1);
        v vVar2 = this.f18662w;
        if (vVar2 != null) {
            w wVar2 = vVar2.A;
            wVar2.getClass();
            z zVar = this.f18657r;
            fj.l.f(zVar, "listener");
            wVar2.D.remove(zVar);
        }
        v vVar3 = this.f18662w;
        if (vVar3 != null) {
            w wVar3 = vVar3.A;
            wVar3.getClass();
            z zVar2 = this.f18656q;
            fj.l.f(zVar2, "listener");
            wVar3.C.remove(zVar2);
        }
        v vVar4 = this.f18662w;
        if (vVar4 != null) {
            w wVar4 = vVar4.A;
            wVar4.getClass();
            z zVar3 = this.f18658s;
            fj.l.f(zVar3, "listener");
            wVar4.F.remove(zVar3);
        }
        v vVar5 = this.f18662w;
        if (vVar5 != null) {
            w wVar5 = vVar5.A;
            wVar5.getClass();
            z zVar4 = this.f18659t;
            fj.l.f(zVar4, "listener");
            wVar5.G.remove(zVar4);
        }
        v vVar6 = this.f18662w;
        if (vVar6 != null && this.f18664y == null) {
            w wVar6 = vVar6.A;
            wVar6.getClass();
            b0 b0Var = this.f18660u;
            fj.l.f(b0Var, "provider");
            p1.l lVar = wVar6.f1842c;
            ((CopyOnWriteArrayList) lVar.f12661c).remove(b0Var);
            if (((HashMap) lVar.f12662d).remove(b0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) lVar.f12660b).run();
        }
        this.f18662w = null;
        this.f18663x = null;
        this.f18664y = null;
        if (this.f18647g != null) {
            this.j.e();
            this.f18647g = null;
        }
        g.f fVar = this.C;
        if (fVar != null) {
            fVar.b0();
            this.D.b0();
            this.E.b0();
        }
    }

    public final void m(boolean z2) {
        if (z2 && this.f18662w != null) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (t tVar : this.f18643c.z()) {
            if (tVar != null) {
                tVar.X = true;
                if (z2) {
                    tVar.O.m(true);
                }
            }
        }
    }

    public final void n(boolean z2) {
        if (z2 && this.f18662w != null) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (t tVar : this.f18643c.z()) {
            if (tVar != null && z2) {
                tVar.O.n(true);
            }
        }
    }

    public final void o() {
        ArrayList arrayListY = this.f18643c.y();
        int size = arrayListY.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListY.get(i10);
            i10++;
            t tVar = (t) obj;
            if (tVar != null) {
                tVar.r();
                tVar.O.o();
            }
        }
    }

    public final boolean p() {
        if (this.f18661v >= 1) {
            for (t tVar : this.f18643c.z()) {
                if (tVar != null) {
                    if (!tVar.T ? tVar.O.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f18661v < 1) {
            return;
        }
        for (t tVar : this.f18643c.z()) {
            if (tVar != null && !tVar.T) {
                tVar.O.q();
            }
        }
    }

    public final void r(t tVar) {
        if (tVar != null) {
            if (tVar.equals(this.f18643c.s(tVar.f18761e))) {
                tVar.M.getClass();
                boolean zN = N(tVar);
                Boolean bool = tVar.C;
                if (bool == null || bool.booleanValue() != zN) {
                    tVar.C = Boolean.valueOf(zN);
                    i0 i0Var = tVar.O;
                    i0Var.f0();
                    i0Var.r(i0Var.f18665z);
                }
            }
        }
    }

    public final void s(boolean z2) {
        if (z2 && this.f18662w != null) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (t tVar : this.f18643c.z()) {
            if (tVar != null && z2) {
                tVar.O.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f18661v < 1) {
            return false;
        }
        boolean z2 = false;
        for (t tVar : this.f18643c.z()) {
            if (tVar != null && M(tVar)) {
                if (!tVar.T ? tVar.O.t() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        t tVar = this.f18664y;
        if (tVar != null) {
            sb2.append(tVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f18664y)));
            sb2.append("}");
        } else {
            v vVar = this.f18662w;
            if (vVar != null) {
                sb2.append(vVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f18662w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i10) {
        try {
            this.f18642b = true;
            for (n0 n0Var : ((HashMap) this.f18643c.f216b).values()) {
                if (n0Var != null) {
                    n0Var.f18700e = i10;
                }
            }
            O(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((m) it.next()).h();
            }
            this.f18642b = false;
            z(true);
        } catch (Throwable th2) {
            this.f18642b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strV = m1.v(str, "    ");
        a8.j jVar = this.f18643c;
        ArrayList arrayList = (ArrayList) jVar.f215a;
        String strV2 = m1.v(str, "    ");
        HashMap map = (HashMap) jVar.f216b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (n0 n0Var : map.values()) {
                printWriter.print(str);
                if (n0Var != null) {
                    t tVar = n0Var.f18698c;
                    printWriter.println(tVar);
                    tVar.j(strV2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                t tVar2 = (t) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(tVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f18645e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                t tVar3 = (t) this.f18645e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(tVar3.toString());
            }
        }
        int size3 = this.f18644d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                a aVar = (a) this.f18644d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(strV, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f18650k.get());
        synchronized (this.f18641a) {
            try {
                int size4 = this.f18641a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (f0) this.f18641a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f18662w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f18663x);
        if (this.f18664y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f18664y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f18661v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((m) it.next()).h();
        }
    }

    public final void x(f0 f0Var, boolean z2) {
        if (!z2) {
            if (this.f18662w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.H || this.I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f18641a) {
            try {
                if (this.f18662w == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f18641a.add(f0Var);
                    X();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z2) {
        if (this.f18642b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f18662w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f18662w.f18778f.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.H || this.I)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean z(boolean z2) {
        boolean zA;
        a aVar;
        y(z2);
        if (!this.f18649i && (aVar = this.f18648h) != null) {
            aVar.f18602r = false;
            aVar.d();
            if (J(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f18648h + " as part of execPendingActions for actions " + this.f18641a);
            }
            this.f18648h.e(false, false);
            this.f18641a.add(0, this.f18648h);
            ArrayList arrayList = this.f18648h.f18586a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                t tVar = ((o0) obj).f18704b;
                if (tVar != null) {
                    tVar.F = false;
                }
            }
            this.f18648h = null;
        }
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.f18641a) {
                if (this.f18641a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.f18641a.size();
                        zA = false;
                        for (int i11 = 0; i11 < size2; i11++) {
                            zA |= ((f0) this.f18641a.get(i11)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            z10 = true;
            this.f18642b = true;
            try {
                U(this.L, this.M);
            } finally {
                d();
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            d0();
        }
        ((HashMap) this.f18643c.f216b).values().removeAll(Collections.singleton(null));
        return z10;
    }
}
