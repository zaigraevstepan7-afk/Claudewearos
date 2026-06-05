package w5;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f18632b;

    public g0(i0 i0Var, int i10) {
        this.f18632b = i0Var;
        this.f18631a = i10;
    }

    @Override // w5.f0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        i0 i0Var = this.f18632b;
        t tVar = i0Var.f18665z;
        int i10 = this.f18631a;
        if (tVar == null || i10 >= 0 || !tVar.l().R(-1, 0)) {
            return i0Var.S(arrayList, arrayList2, i10, 1);
        }
        return false;
    }
}
