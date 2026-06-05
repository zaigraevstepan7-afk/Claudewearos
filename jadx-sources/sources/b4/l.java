package b4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f1555a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1556b;

    public static long a(f fVar, long j) {
        o oVar = fVar.f1544d;
        ArrayList arrayList = fVar.f1550k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1544d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f1546f + j));
                }
            }
        }
        f fVar3 = oVar.f1573i;
        f fVar4 = oVar.f1572h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j4 = j - oVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j4)), j4 - fVar4.f1546f);
    }

    public static long b(f fVar, long j) {
        o oVar = fVar.f1544d;
        ArrayList arrayList = fVar.f1550k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1544d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f1546f + j));
                }
            }
        }
        f fVar3 = oVar.f1572h;
        f fVar4 = oVar.f1573i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j4 = oVar.j() + j;
        return Math.max(Math.max(jMax, b(fVar4, j4)), j4 - fVar4.f1546f);
    }
}
