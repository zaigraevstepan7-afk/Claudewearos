package g0;

import java.util.ArrayList;
import java.util.List;
import t2.e1;
import t2.f1;
import t2.g1;
import t2.h1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6984b;

    public /* synthetic */ x(ArrayList arrayList, int i10) {
        this.f6983a = i10;
        this.f6984b = arrayList;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        int i12 = this.f6983a;
        pi.o oVar = pi.o.f13011a;
        int i13 = 0;
        ArrayList arrayList = this.f6984b;
        switch (i12) {
            case 0:
                e1 e1Var = (e1) obj;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    i iVar = (i) arrayList.get(i14);
                    List list = iVar.f6916b;
                    boolean z2 = iVar.f6921g;
                    if (iVar.f6924k == Integer.MIN_VALUE) {
                        a0.a.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i15 = i13;
                    while (i15 < size2) {
                        f1 f1Var = (f1) list.get(i15);
                        ArrayList arrayList2 = arrayList;
                        long jC = s3.j.c((r10[r11 + 1] & 4294967295L) | (iVar.f6923i[i15 * 2] << 32), iVar.f6917c);
                        if (z2) {
                            i10 = i15;
                            e1.I(e1Var, f1Var, jC, null, 6);
                            i11 = size;
                        } else {
                            i10 = i15;
                            int i16 = h1.f15575b;
                            g1 g1Var = g1.f15560b;
                            if (e1Var.r() == s3.m.f14752a || e1Var.x() == 0) {
                                i11 = size;
                                e1.f(e1Var, f1Var);
                                f1Var.G0(s3.j.c(jC, f1Var.f15554e), 0.0f, g1Var);
                            } else {
                                i11 = size;
                                int iX = (e1Var.x() - f1Var.f15550a) - ((int) (jC >> 32));
                                e1.f(e1Var, f1Var);
                                f1Var.G0(s3.j.c((((int) (jC & 4294967295L)) & 4294967295L) | (iX << 32), f1Var.f15554e), 0.0f, g1Var);
                            }
                        }
                        i15 = i10 + 1;
                        size = i11;
                        arrayList = arrayList2;
                    }
                    i14++;
                    i13 = 0;
                }
                break;
            case 1:
                e1 e1Var2 = (e1) obj;
                int size3 = arrayList.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    e1.D(e1Var2, (f1) arrayList.get(i17), 0, 0);
                }
                break;
            default:
                e1 e1Var3 = (e1) obj;
                int size4 = arrayList.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    e1Var3.z((f1) arrayList.get(i18), 0, 0, 0.0f);
                }
                break;
        }
        return oVar;
    }
}
