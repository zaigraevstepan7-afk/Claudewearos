package d0;

import f1.a1;
import java.util.ArrayList;
import java.util.List;
import t2.e1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f4390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4392d;

    public /* synthetic */ n(a1 a1Var, ArrayList arrayList, List list, boolean z2, int i10) {
        this.f4389a = i10;
        this.f4390b = a1Var;
        this.f4391c = arrayList;
        this.f4392d = list;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // ej.c
    public final Object invoke(Object obj) {
        e1 e1Var = (e1) obj;
        switch (this.f4389a) {
            case 0:
                e1Var.f15541a = true;
                ArrayList arrayList = this.f4391c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p) arrayList.get(i10)).a(e1Var);
                }
                ?? r02 = this.f4392d;
                int size2 = r02.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((p) r02.get(i11)).a(e1Var);
                }
                e1Var.f15541a = false;
                this.f4390b.getValue();
                break;
            default:
                e1Var.f15541a = true;
                ArrayList arrayList2 = this.f4391c;
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((e0.m) arrayList2.get(i12)).a(e1Var);
                }
                ?? r03 = this.f4392d;
                int size4 = r03.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    ((e0.m) r03.get(i13)).a(e1Var);
                }
                e1Var.f15541a = false;
                this.f4390b.getValue();
                break;
        }
        return pi.o.f13011a;
    }
}
