package r5;

import android.util.SparseArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f13763a;

    /* renamed from: b, reason: collision with root package name */
    public x f13764b;

    public u(int i10) {
        this.f13763a = new SparseArray(i10);
    }

    public final void a(x xVar, int i10, int i11) {
        int iA = xVar.a(i10);
        SparseArray sparseArray = this.f13763a;
        u uVar = sparseArray == null ? null : (u) sparseArray.get(iA);
        if (uVar == null) {
            uVar = new u(1);
            sparseArray.put(xVar.a(i10), uVar);
        }
        if (i11 > i10) {
            uVar.a(xVar, i10 + 1, i11);
        } else {
            uVar.f13764b = xVar;
        }
    }
}
