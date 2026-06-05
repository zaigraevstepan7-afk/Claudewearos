package t;

import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f15151a = d.s(0.0f, 0.0f, null, 7);

    static {
        Object obj = y1.f15332a;
        d.s(0.0f, 0.0f, new s3.f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final q2 a(float f10, z zVar, String str, f1.i0 i0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new s3.f(f10), d.f15138l, zVar, null, str, null, i0Var, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
    }

    public static final q2 b(float f10, j jVar, String str, ej.c cVar, f1.i0 i0Var, int i10, int i11) {
        int i12 = i11 & 2;
        u0 u0Var = f15151a;
        j jVar2 = i12 != 0 ? u0Var : jVar;
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        ej.c cVar2 = (i11 & 16) != 0 ? null : cVar;
        if (jVar2 == u0Var) {
            i0Var.b0(1144115775);
            boolean zC = i0Var.c(0.01f);
            Object objQ = i0Var.Q();
            if (zC || objQ == f1.m.f6385a) {
                objQ = d.s(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                i0Var.l0(objQ);
            }
            jVar2 = (u0) objQ;
            i0Var.p(false);
        } else {
            i0Var.b0(1144225701);
            i0Var.p(false);
        }
        return c(Float.valueOf(f10), d.j, jVar2, null, str2, cVar2, i0Var, (i10 << 3) & 516096, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f1.q2 c(java.lang.Object r14, t.p1 r15, t.j r16, java.lang.Float r17, java.lang.String r18, ej.c r19, f1.i0 r20, int r21, int r22) {
        /*
            r0 = r16
            r1 = r20
            r2 = r22 & 8
            r3 = 0
            if (r2 == 0) goto Lb
            r2 = r3
            goto Ld
        Lb:
            r2 = r17
        Ld:
            java.lang.Object r4 = r1.Q()
            f1.f r5 = f1.m.f6385a
            if (r4 != r5) goto L1c
            f1.j1 r4 = f1.s.A(r3)
            r1.l0(r4)
        L1c:
            f1.a1 r4 = (f1.a1) r4
            java.lang.Object r6 = r1.Q()
            if (r6 != r5) goto L2c
            t.c r6 = new t.c
            r6.<init>(r14, r15, r2)
            r1.l0(r6)
        L2c:
            r9 = r6
            t.c r9 = (t.c) r9
            f1.a1 r11 = f1.s.K(r19, r20)
            if (r2 == 0) goto L4e
            boolean r6 = r0 instanceof t.u0
            if (r6 == 0) goto L4e
            r6 = r0
            t.u0 r6 = (t.u0) r6
            java.lang.Object r7 = r6.f15294c
            boolean r7 = fj.l.b(r7, r2)
            if (r7 != 0) goto L4e
            float r0 = r6.f15292a
            float r6 = r6.f15293b
            t.u0 r7 = new t.u0
            r7.<init>(r0, r6, r2)
            goto L4f
        L4e:
            r7 = r0
        L4f:
            f1.a1 r10 = f1.s.K(r7, r1)
            java.lang.Object r0 = r1.Q()
            if (r0 != r5) goto L62
            r0 = -1
            r2 = 6
            sj.c r0 = u6.v.a(r0, r2, r3)
            r1.l0(r0)
        L62:
            r8 = r0
            sj.g r8 = (sj.g) r8
            boolean r0 = r1.h(r8)
            boolean r2 = r1.h(r14)
            r0 = r0 | r2
            java.lang.Object r2 = r1.Q()
            if (r0 != 0) goto L76
            if (r2 != r5) goto L80
        L76:
            c1.s3 r2 = new c1.s3
            r0 = 24
            r2.<init>(r0, r8, r14)
            r1.l0(r2)
        L80:
            ej.a r2 = (ej.a) r2
            f1.s.j(r2, r1)
            boolean r14 = r1.h(r8)
            boolean r0 = r1.h(r9)
            r14 = r14 | r0
            boolean r0 = r1.f(r10)
            r14 = r14 | r0
            boolean r0 = r1.f(r11)
            r14 = r14 | r0
            java.lang.Object r0 = r1.Q()
            if (r14 != 0) goto La0
            if (r0 != r5) goto Lab
        La0:
            androidx.lifecycle.j0 r7 = new androidx.lifecycle.j0
            r12 = 0
            r13 = 3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.l0(r7)
            r0 = r7
        Lab:
            ej.e r0 = (ej.e) r0
            f1.s.f(r0, r1, r8)
            java.lang.Object r14 = r4.getValue()
            f1.q2 r14 = (f1.q2) r14
            if (r14 != 0) goto Lba
            t.k r14 = r9.f15109c
        Lba:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.c(java.lang.Object, t.p1, t.j, java.lang.Float, java.lang.String, ej.c, f1.i0, int, int):f1.q2");
    }
}
