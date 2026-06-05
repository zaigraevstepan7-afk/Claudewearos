package b4;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f1559f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1560a;

    /* renamed from: b, reason: collision with root package name */
    public int f1561b;

    /* renamed from: c, reason: collision with root package name */
    public int f1562c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1563d;

    /* renamed from: e, reason: collision with root package name */
    public int f1564e;

    public final void a(ArrayList arrayList) {
        int size = this.f1560a.size();
        if (this.f1564e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n nVar = (n) arrayList.get(i10);
                if (this.f1564e == nVar.f1561b) {
                    c(this.f1562c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(y3.c cVar, int i10) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f1560a;
        if (arrayList.size() == 0) {
            return 0;
        }
        a4.e eVar = (a4.e) ((a4.d) arrayList.get(0)).S;
        cVar.t();
        eVar.b(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((a4.d) arrayList.get(i11)).b(cVar, false);
        }
        if (i10 == 0 && eVar.y0 > 0) {
            a4.j.a(eVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.z0 > 0) {
            a4.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f1563d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a4.d dVar = (a4.d) arrayList.get(i12);
            p9.a aVar = new p9.a(3);
            new WeakReference(dVar);
            y3.c.n(dVar.H);
            y3.c.n(dVar.I);
            y3.c.n(dVar.J);
            y3.c.n(dVar.K);
            y3.c.n(dVar.L);
            this.f1563d.add(aVar);
        }
        if (i10 == 0) {
            iN = y3.c.n(eVar.H);
            iN2 = y3.c.n(eVar.J);
            cVar.t();
        } else {
            iN = y3.c.n(eVar.I);
            iN2 = y3.c.n(eVar.K);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i10, n nVar) {
        int i11 = nVar.f1561b;
        ArrayList arrayList = this.f1560a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            a4.d dVar = (a4.d) obj;
            ArrayList arrayList2 = nVar.f1560a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i10 == 0) {
                dVar.f125m0 = i11;
            } else {
                dVar.f127n0 = i11;
            }
        }
        this.f1564e = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f1562c;
        sb2.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strH = m6.a.h(sb2, this.f1561b, "] <");
        ArrayList arrayList = this.f1560a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            strH = strH + " " + ((a4.d) obj).f114g0;
        }
        return m1.v(strH, " >");
    }
}
