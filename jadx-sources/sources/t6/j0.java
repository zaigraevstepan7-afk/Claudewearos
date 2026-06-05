package t6;

import android.util.SparseArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f15921a;

    /* renamed from: b, reason: collision with root package name */
    public int f15922b;

    public final i0 a(int i10) {
        SparseArray sparseArray = this.f15921a;
        i0 i0Var = (i0) sparseArray.get(i10);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0();
        sparseArray.put(i10, i0Var2);
        return i0Var2;
    }
}
