package qc;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f13461a;

    /* renamed from: b, reason: collision with root package name */
    public final double[] f13462b;

    /* renamed from: c, reason: collision with root package name */
    public final double[] f13463c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f13464d;

    /* renamed from: e, reason: collision with root package name */
    public int f13465e;

    public u(p1.l lVar) {
        ArrayList arrayList = (ArrayList) lVar.f12661c;
        int size = arrayList.size();
        this.f13461a = (String[]) ((ArrayList) lVar.f12660b).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        this.f13462b = dArr;
        ArrayList arrayList2 = (ArrayList) lVar.f12662d;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i11 = 0; i11 < size3; i11++) {
            dArr2[i11] = ((Double) arrayList2.get(i11)).doubleValue();
        }
        this.f13463c = dArr2;
        this.f13464d = new int[size];
        this.f13465e = 0;
    }
}
