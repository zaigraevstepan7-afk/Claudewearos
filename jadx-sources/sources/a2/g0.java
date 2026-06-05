package a2;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f22a = new g0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        e0 e0Var2 = (e0) obj2;
        int i10 = 0;
        if (d.r(e0Var) && d.r(e0Var2)) {
            v2.f0 f0VarY = v2.n.y(e0Var);
            v2.f0 f0VarY2 = v2.n.y(e0Var2);
            if (!fj.l.b(f0VarY, f0VarY2)) {
                v2.f0[] f0VarArr = new v2.f0[16];
                int i11 = 0;
                while (f0VarY != null) {
                    int i12 = i11 + 1;
                    if (f0VarArr.length < i12) {
                        int length = f0VarArr.length;
                        ?? r52 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(f0VarArr, 0, r52, 0, length);
                        f0VarArr = r52;
                    }
                    if (i11 != 0) {
                        System.arraycopy(f0VarArr, 0, f0VarArr, 0 + 1, i11 + 0);
                    }
                    f0VarArr[0] = f0VarY;
                    i11++;
                    f0VarY = f0VarY.u();
                }
                v2.f0[] f0VarArr2 = new v2.f0[16];
                int i13 = 0;
                while (f0VarY2 != null) {
                    int i14 = i13 + 1;
                    if (f0VarArr2.length < i14) {
                        int length2 = f0VarArr2.length;
                        ?? r53 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(f0VarArr2, 0, r53, 0, length2);
                        f0VarArr2 = r53;
                    }
                    if (i13 != 0) {
                        System.arraycopy(f0VarArr2, 0, f0VarArr2, 0 + 1, i13 + 0);
                    }
                    f0VarArr2[0] = f0VarY2;
                    i13++;
                    f0VarY2 = f0VarY2.u();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (fj.l.b(f0VarArr[i10], f0VarArr2[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return fj.l.h(f0VarArr[i10].v(), f0VarArr2[i10].v());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (d.r(e0Var)) {
                return -1;
            }
            if (d.r(e0Var2)) {
                return 1;
            }
        }
        return 0;
    }
}
