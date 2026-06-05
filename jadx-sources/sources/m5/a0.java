package m5;

import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final tj.r0 f11268a;

    public a0() {
        this.f11268a = tj.i0.b(q0.f11365b);
    }

    public void a(Set set) {
        tj.r0 r0Var;
        Object value;
        int[] iArr;
        fj.l.f(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        do {
            r0Var = this.f11268a;
            value = r0Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = set.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!r0Var.i(value, iArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(m5.p0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            fj.l.f(r6, r0)
        L5:
            tj.r0 r0 = r5.f11268a
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            m5.p0 r2 = (m5.p0) r2
            boolean r3 = r2 instanceof m5.k0
            if (r3 != 0) goto L34
            m5.q0 r3 = m5.q0.f11365b
            boolean r3 = fj.l.b(r2, r3)
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            boolean r3 = r2 instanceof m5.c
            if (r3 == 0) goto L29
            int r3 = r6.f11360a
            r4 = r2
            m5.c r4 = (m5.c) r4
            int r4 = r4.f11360a
            if (r3 <= r4) goto L35
            goto L34
        L29:
            boolean r3 = r2 instanceof m5.j0
            if (r3 == 0) goto L2e
            goto L35
        L2e:
            b3.e r6 = new b3.e
            r6.<init>()
            throw r6
        L34:
            r2 = r6
        L35:
            boolean r0 = r0.i(r1, r2)
            if (r0 == 0) goto L5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.a0.b(m5.p0):void");
    }

    public a0(int i10) {
        this.f11268a = tj.i0.b(new int[i10]);
    }
}
