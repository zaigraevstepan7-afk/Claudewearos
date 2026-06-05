package k0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v1 implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9307a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9308b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9309c;

    public /* synthetic */ v1(int i10, Object obj, Object obj2) {
        this.f9307a = i10;
        this.f9308b = obj;
        this.f9309c = obj2;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        pi.h hVar;
        switch (this.f9307a) {
            case 0:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (!(((t2.p0) obj).c0() instanceof w1)) {
                        arrayList3.add(obj);
                    }
                }
                List list2 = (List) ((ej.a) this.f9309c).a();
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        b2.c cVar = (b2.c) list2.get(i11);
                        if (cVar != null) {
                            float f10 = cVar.f1503b;
                            float f11 = cVar.f1502a;
                            arrayList2 = arrayList4;
                            t2.f1 f1VarY = ((t2.p0) arrayList3.get(i11)).Y(s3.b.b(0, (int) Math.floor(cVar.f1504c - f11), 0, (int) Math.floor(cVar.f1505d - f10), 5));
                            int iRound = Math.round(f11);
                            hVar = new pi.h(f1VarY, new s3.j((Math.round(f10) & 4294967295L) | (iRound << 32)));
                        } else {
                            arrayList2 = arrayList4;
                            hVar = null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (hVar != null) {
                            arrayList5.add(hVar);
                        }
                        i11++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj2 = list.get(i12);
                    if (((t2.p0) obj2).c0() instanceof w1) {
                        arrayList6.add(obj2);
                    }
                }
                return s0Var.B(s3.a.h(j), s3.a.g(j), qi.t.f13521a, new t1(2, arrayList, s.l(arrayList6, (ej.a) this.f9308b)));
            default:
                ((w3.x) this.f9308b).setParentLayoutDirection((s3.m) this.f9309c);
                return s0Var.B(0, 0, qi.t.f13521a, w3.c.f18480d);
        }
    }
}
