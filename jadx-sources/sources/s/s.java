package s;

import java.util.ArrayList;
import t2.e1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(ArrayList arrayList, int i10) {
        super(1);
        this.f14669a = i10;
        this.f14670b = arrayList;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14669a) {
            case 0:
                e1 e1Var = (e1) obj;
                ArrayList arrayList = this.f14670b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e1Var.z((f1) arrayList.get(i10), 0, 0, 0.0f);
                }
                break;
            case 1:
                e1 e1Var2 = (e1) obj;
                ArrayList arrayList2 = this.f14670b;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    e1.E(e1Var2, (f1) arrayList2.get(i11), 0, 0);
                }
                break;
            case 2:
                e1 e1Var3 = (e1) obj;
                ArrayList arrayList3 = this.f14670b;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    e1.D(e1Var3, (f1) arrayList3.get(i12), 0, 0);
                }
                break;
            default:
                e1 e1Var4 = (e1) obj;
                ArrayList arrayList4 = this.f14670b;
                int iB = yd.f.B(arrayList4);
                if (iB >= 0) {
                    int i13 = 0;
                    while (true) {
                        e1.D(e1Var4, (f1) arrayList4.get(i13), 0, 0);
                        if (i13 != iB) {
                            i13++;
                        }
                    }
                }
                break;
        }
        return pi.o.f13011a;
    }
}
