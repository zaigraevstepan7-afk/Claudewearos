package g3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qh.c f7075a;

    /* renamed from: b, reason: collision with root package name */
    public static final qh.c f7076b;

    /* renamed from: c, reason: collision with root package name */
    public static final qh.c f7077c;

    /* renamed from: d, reason: collision with root package name */
    public static final qh.c f7078d;

    /* renamed from: e, reason: collision with root package name */
    public static final qh.c f7079e;

    static {
        int i10 = 4;
        f7075a = new qh.c(i10, new z(2), new y(5));
        f7076b = new qh.c(i10, new z(3), new y(6));
        f7077c = new qh.c(i10, new z(4), new y(7));
        f7078d = new qh.c(i10, new z(5), new y(8));
        f7079e = new qh.c(i10, new z(6), new y(9));
    }

    public static fk.g a(String str, n0 n0Var, long j, s3.c cVar, k3.i iVar, int i10, int i11) {
        qi.s sVar = qi.s.f13520a;
        return new fk.g(new o3.c(str, n0Var, sVar, sVar, iVar, cVar), i10, 1, j);
    }

    public static final long b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            m3.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j = (i11 & 4294967295L) | (i10 << 32);
        int i12 = m0.f7144c;
        return j;
    }

    public static final long c(int i10, long j) {
        int i11 = m0.f7144c;
        int i12 = (int) (j >> 32);
        int i13 = i12 < 0 ? 0 : i12;
        if (i13 > i10) {
            i13 = i10;
        }
        int i14 = (int) (4294967295L & j);
        int i15 = i14 >= 0 ? i14 : 0;
        if (i15 <= i10) {
            i10 = i15;
        }
        return (i13 == i12 && i10 == i14) ? j : b(i13, i10);
    }

    public static final int d(int i10, List list) {
        int i11;
        int i12 = ((q) qi.l.F0(list)).f7168c;
        if (i10 > ((q) qi.l.F0(list)).f7168c) {
            m3.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            q qVar = (q) list.get(i11);
            char c6 = qVar.f7167b > i10 ? (char) 1 : qVar.f7168c <= i10 ? '\uffff' : (char) 0;
            if (c6 >= 0) {
                if (c6 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        StringBuilder sbP = gk.b.p(i11, "Found paragraph index ", " should be in range [0, ");
        sbP.append(list.size());
        sbP.append(").\nDebug info: index=");
        sbP.append(i10);
        sbP.append(", paragraphs=[");
        sbP.append(u3.b.a(list, null, new fb.e(3), 31));
        sbP.append(']');
        m3.a.a(sbP.toString());
        return i11;
    }

    public static final int e(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            q qVar = (q) list.get(i12);
            char c6 = qVar.f7169d > i10 ? (char) 1 : qVar.f7170e <= i10 ? '\uffff' : (char) 0;
            if (c6 < 0) {
                i11 = i12 + 1;
            } else {
                if (c6 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int f(ArrayList arrayList, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((q) qi.l.F0(arrayList)).f7172g) {
            return yd.f.B(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            q qVar = (q) arrayList.get(i11);
            char c6 = qVar.f7171f > f10 ? (char) 1 : qVar.f7172g <= f10 ? '\uffff' : (char) 0;
            if (c6 < 0) {
                i10 = i11 + 1;
            } else {
                if (c6 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void g(ArrayList arrayList, long j, ej.c cVar) {
        int size = arrayList.size();
        for (int iD = d(m0.f(j), arrayList); iD < size; iD++) {
            q qVar = (q) arrayList.get(iD);
            if (qVar.f7167b >= m0.e(j)) {
                return;
            }
            if (qVar.f7167b != qVar.f7168c) {
                cVar.invoke(qVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g3.n0 h(g3.n0 r30, s3.m r31) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.e0.h(g3.n0, s3.m):g3.n0");
    }
}
