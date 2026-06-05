package f0;

import f1.r2;
import f1.t1;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x0 implements s1.e, s1.b {

    /* renamed from: a, reason: collision with root package name */
    public final s1.f f6203a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.c f6204b;

    /* renamed from: c, reason: collision with root package name */
    public final q.h0 f6205c;

    public x0(s1.e eVar, Map map, s1.c cVar) {
        ab.k kVar = new ab.k(eVar, 14);
        r2 r2Var = s1.h.f14730a;
        this.f6203a = new s1.f(map, kVar);
        this.f6204b = cVar;
        q.h0 h0Var = q.o0.f13110a;
        this.f6205c = new q.h0();
    }

    @Override // s1.b
    public final void a(Object obj, p1.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-858296452);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(this) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            this.f6204b.a(obj, eVar, i0Var, i11 & 126);
            boolean zH = i0Var.h(this) | i0Var.h(obj);
            Object objQ = i0Var.Q();
            if (zH || objQ == f1.m.f6385a) {
                objQ = new b0.c1(16, this, obj);
                i0Var.l0(objQ);
            }
            f1.s.c(obj, (ej.c) objQ, i0Var);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(this, obj, eVar, i10, 3);
        }
    }

    @Override // s1.e
    public final boolean b(Object obj) {
        return this.f6203a.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // s1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            r14 = this;
            q.h0 r0 = r14.f6205c
            java.lang.Object[] r1 = r0.f13082b
            long[] r0 = r0.f13081a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L51
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L46
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            s1.c r11 = r14.f6204b
            q.g0 r12 = r11.f14723b
            java.lang.Object r12 = r12.k(r10)
            if (r12 != 0) goto L46
            java.util.Map r11 = r11.f14722a
            r11.remove(r10)
        L46:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4a:
            if (r7 != r8) goto L51
        L4c:
            if (r4 == r2) goto L51
            int r4 = r4 + 1
            goto Ld
        L51:
            s1.f r0 = r14.f6203a
            java.util.Map r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.x0.c():java.util.Map");
    }

    @Override // s1.e
    public final Object d(String str) {
        return this.f6203a.d(str);
    }

    @Override // s1.e
    public final s1.d e(String str, ej.a aVar) {
        return this.f6203a.e(str, aVar);
    }
}
