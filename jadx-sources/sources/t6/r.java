package t6;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16009a;

    /* renamed from: b, reason: collision with root package name */
    public int f16010b;

    /* renamed from: c, reason: collision with root package name */
    public int f16011c;

    /* renamed from: d, reason: collision with root package name */
    public int f16012d;

    /* renamed from: e, reason: collision with root package name */
    public int f16013e;

    /* renamed from: f, reason: collision with root package name */
    public int f16014f;

    /* renamed from: g, reason: collision with root package name */
    public int f16015g;

    /* renamed from: h, reason: collision with root package name */
    public int f16016h;

    /* renamed from: i, reason: collision with root package name */
    public int f16017i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f16018k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16019l;

    public final void a(View view) {
        int iB;
        int size = this.f16018k.size();
        View view2 = null;
        int i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((t0) this.f16018k.get(i11)).f16046a;
            f0 f0Var = (f0) view3.getLayoutParams();
            if (view3 != view && !f0Var.f15893a.h() && (iB = (f0Var.f15893a.b() - this.f16012d) * this.f16013e) >= 0 && iB < i10) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i10 = iB;
                }
            }
        }
        if (view2 == null) {
            this.f16012d = -1;
        } else {
            this.f16012d = ((f0) view2.getLayoutParams()).f15893a.b();
        }
    }

    public final View b(k0 k0Var) {
        List list = this.f16018k;
        if (list == null) {
            View viewD = k0Var.d(this.f16012d);
            this.f16012d += this.f16013e;
            return viewD;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = ((t0) this.f16018k.get(i10)).f16046a;
            f0 f0Var = (f0) view.getLayoutParams();
            if (!f0Var.f15893a.h() && this.f16012d == f0Var.f15893a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
