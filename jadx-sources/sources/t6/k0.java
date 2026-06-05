package t6;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15948a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f15949b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15950c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15951d;

    /* renamed from: e, reason: collision with root package name */
    public int f15952e;

    /* renamed from: f, reason: collision with root package name */
    public int f15953f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f15954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15955h;

    public k0(RecyclerView recyclerView) {
        this.f15955h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f15948a = arrayList;
        this.f15949b = null;
        this.f15950c = new ArrayList();
        this.f15951d = Collections.unmodifiableList(arrayList);
        this.f15952e = 2;
        this.f15953f = 2;
    }

    public final void a(t0 t0Var, boolean z2) {
        RecyclerView.i(t0Var);
        View view = t0Var.f16046a;
        RecyclerView recyclerView = this.f15955h;
        v0 v0Var = recyclerView.D0;
        if (v0Var != null) {
            u0 u0Var = v0Var.f16069e;
            t4.l0.l(view, u0Var != null ? (t4.b) u0Var.f16066e.remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.F;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.w0 != null) {
                recyclerView.f1183f.N(t0Var);
            }
        }
        t0Var.f16063s = null;
        t0Var.f16062r = null;
        j0 j0VarC = c();
        j0VarC.getClass();
        int i10 = t0Var.f16051f;
        ArrayList arrayList2 = j0VarC.a(i10).f15915a;
        if (((i0) j0VarC.f15921a.get(i10)).f15916b <= arrayList2.size()) {
            return;
        }
        t0Var.m();
        arrayList2.add(t0Var);
    }

    public final int b(int i10) {
        RecyclerView recyclerView = this.f15955h;
        if (i10 >= 0 && i10 < recyclerView.w0.b()) {
            return !recyclerView.w0.f16002g ? i10 : recyclerView.f1179d.p(i10, 0);
        }
        StringBuilder sbP = gk.b.p(i10, "invalid position ", ". State item count is ");
        sbP.append(recyclerView.w0.b());
        sbP.append(recyclerView.x());
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public final j0 c() {
        if (this.f15954g == null) {
            j0 j0Var = new j0();
            j0Var.f15921a = new SparseArray();
            j0Var.f15922b = 0;
            this.f15954g = j0Var;
        }
        return this.f15954g;
    }

    public final View d(int i10) {
        return j(i10, Long.MAX_VALUE).f16046a;
    }

    public final void e() {
        ArrayList arrayList = this.f15950c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.P0;
        androidx.datastore.preferences.protobuf.k kVar = this.f15955h.f1200v0;
        int[] iArr2 = (int[]) kVar.f957e;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        kVar.f956d = 0;
    }

    public final void f(int i10) {
        ArrayList arrayList = this.f15950c;
        a((t0) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public final void g(View view) {
        t0 t0VarH = RecyclerView.H(view);
        boolean zJ = t0VarH.j();
        RecyclerView recyclerView = this.f15955h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (t0VarH.i()) {
            t0VarH.f16058n.k(t0VarH);
        } else if (t0VarH.p()) {
            t0VarH.j &= -33;
        }
        h(t0VarH);
        if (recyclerView.f1182e0 == null || t0VarH.g()) {
            return;
        }
        recyclerView.f1182e0.d(t0VarH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(t6.t0 r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.k0.h(t6.t0):void");
    }

    public final void i(View view) {
        b0 b0Var;
        t0 t0VarH = RecyclerView.H(view);
        int i10 = t0VarH.j & 12;
        RecyclerView recyclerView = this.f15955h;
        if (i10 == 0 && t0VarH.k() && (b0Var = recyclerView.f1182e0) != null) {
            h hVar = (h) b0Var;
            if (t0VarH.c().isEmpty() && hVar.f15903g && !t0VarH.f()) {
                if (this.f15949b == null) {
                    this.f15949b = new ArrayList();
                }
                t0VarH.f16058n = this;
                t0VarH.f16059o = true;
                this.f15949b.add(t0VarH);
                return;
            }
        }
        if (t0VarH.f() && !t0VarH.h() && !recyclerView.D.f16077b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.x());
        }
        t0VarH.f16058n = this;
        t0VarH.f16059o = false;
        this.f15948a.add(t0VarH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Type inference failed for: r11v4, types: [t4.b] */
    /* JADX WARN: Type inference failed for: r9v10, types: [t4.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t6.t0 j(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.k0.j(int, long):t6.t0");
    }

    public final void k(t0 t0Var) {
        if (t0Var.f16059o) {
            this.f15949b.remove(t0Var);
        } else {
            this.f15948a.remove(t0Var);
        }
        t0Var.f16058n = null;
        t0Var.f16059o = false;
        t0Var.j &= -33;
    }

    public final void l() {
        e0 e0Var = this.f15955h.E;
        this.f15953f = this.f15952e + (e0Var != null ? e0Var.j : 0);
        ArrayList arrayList = this.f15950c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f15953f; size--) {
            f(size);
        }
    }
}
