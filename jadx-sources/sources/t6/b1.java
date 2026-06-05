package t6;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15838a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f15839b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f15840c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f15841d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f15842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f15843f;

    public b1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f15843f = staggeredGridLayoutManager;
        this.f15842e = i10;
    }

    public final void a() {
        View view = (View) this.f15838a.get(r0.size() - 1);
        y0 y0Var = (y0) view.getLayoutParams();
        this.f15840c = this.f15843f.f1204r.d(view);
        y0Var.getClass();
    }

    public final void b() {
        this.f15838a.clear();
        this.f15839b = Integer.MIN_VALUE;
        this.f15840c = Integer.MIN_VALUE;
        this.f15841d = 0;
    }

    public final int c() {
        return this.f15843f.f1209w ? e(r1.size() - 1, -1) : e(0, this.f15838a.size());
    }

    public final int d() {
        return this.f15843f.f1209w ? e(0, this.f15838a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f15843f;
        int iM = staggeredGridLayoutManager.f1204r.m();
        int i12 = staggeredGridLayoutManager.f1204r.i();
        int i13 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) this.f15838a.get(i10);
            int iG = staggeredGridLayoutManager.f1204r.g(view);
            int iD = staggeredGridLayoutManager.f1204r.d(view);
            boolean z2 = iG <= i12;
            boolean z10 = iD >= iM;
            if (z2 && z10 && (iG < iM || iD > i12)) {
                return e0.H(view);
            }
            i10 += i13;
        }
        return -1;
    }

    public final int f(int i10) {
        int i11 = this.f15840c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f15838a.size() == 0) {
            return i10;
        }
        a();
        return this.f15840c;
    }

    public final View g(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f15843f;
        ArrayList arrayList = this.f15838a;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1209w && e0.H(view2) >= i10) || ((!staggeredGridLayoutManager.f1209w && e0.H(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f1209w && e0.H(view3) <= i10) || ((!staggeredGridLayoutManager.f1209w && e0.H(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    public final int h(int i10) {
        int i11 = this.f15839b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        ArrayList arrayList = this.f15838a;
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        y0 y0Var = (y0) view.getLayoutParams();
        this.f15839b = this.f15843f.f1204r.g(view);
        y0Var.getClass();
        return this.f15839b;
    }
}
