package vj;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qj.t0;
import qj.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18128b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public t0[] f18129a;

    public final void a(t0 t0Var) {
        t0Var.f((u0) this);
        t0[] t0VarArr = this.f18129a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18128b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.f18129a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            t0VarArr = (t0[]) objArrCopyOf;
            this.f18129a = t0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        t0VarArr[i10] = t0Var;
        t0Var.f13624b = i10;
        c(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qj.t0 b(int r9) {
        /*
            r8 = this;
            qj.t0[] r0 = r8.f18129a
            fj.l.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = vj.w.f18128b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            fj.l.c(r4)
            r5 = r0[r2]
            fj.l.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            qj.t0[] r5 = r8.f18129a
            fj.l.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            fj.l.c(r6)
            r7 = r5[r4]
            fj.l.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            fj.l.c(r4)
            r5 = r5[r2]
            fj.l.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            fj.l.c(r9)
            r2 = 0
            r9.f(r2)
            r9.f13624b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.w.b(int):qj.t0");
    }

    public final void c(int i10) {
        while (i10 > 0) {
            t0[] t0VarArr = this.f18129a;
            fj.l.c(t0VarArr);
            int i11 = (i10 - 1) / 2;
            t0 t0Var = t0VarArr[i11];
            fj.l.c(t0Var);
            t0 t0Var2 = t0VarArr[i10];
            fj.l.c(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        t0[] t0VarArr = this.f18129a;
        fj.l.c(t0VarArr);
        t0 t0Var = t0VarArr[i11];
        fj.l.c(t0Var);
        t0 t0Var2 = t0VarArr[i10];
        fj.l.c(t0Var2);
        t0VarArr[i10] = t0Var;
        t0VarArr[i11] = t0Var2;
        t0Var.f13624b = i10;
        t0Var2.f13624b = i11;
    }
}
