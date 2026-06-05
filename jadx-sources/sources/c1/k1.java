package c1;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2317b;

    public /* synthetic */ k1(Object obj, int i10) {
        this.f2316a = i10;
        this.f2317b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ej.a
    public final Object a() {
        int i10 = this.f2316a;
        Object obj = this.f2317b;
        switch (i10) {
            case 0:
                k8 k8Var = ((z5) obj).f2952h;
                return new c2.w(c2.e0.v(k8Var.f2349a, k8Var.f2350b, t.y.f15328c.c(0.0f)));
            default:
                ArrayList arrayList = ((f1.k0) obj).f6359a;
                q.g0 g0Var = new q.g0(arrayList.size());
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i1.e eVar = (i1.e) arrayList.get(i11);
                    Object obj2 = eVar.f8108b;
                    int i12 = eVar.f8107a;
                    Object q0Var = obj2 != null ? new f1.q0(Integer.valueOf(i12), eVar.f8108b) : Integer.valueOf(i12);
                    int iF = g0Var.f(q0Var);
                    boolean z2 = iF < 0;
                    Object obj3 = z2 ? null : g0Var.f13075c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof q.b0) {
                            q.b0 b0Var = (q.b0) obj3;
                            b0Var.a(eVar);
                            eVar = b0Var;
                        } else {
                            Object[] objArr = q.l0.f13103a;
                            q.b0 b0Var2 = new q.b0(2);
                            b0Var2.a(obj3);
                            b0Var2.a(eVar);
                            eVar = b0Var2;
                        }
                    }
                    if (z2) {
                        int i13 = ~iF;
                        g0Var.f13074b[i13] = q0Var;
                        g0Var.f13075c[i13] = eVar;
                    } else {
                        g0Var.f13075c[iF] = eVar;
                    }
                }
                return new g1.a(g0Var);
        }
    }
}
