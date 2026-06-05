package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static final g4 f2127a = new g4();

    /* renamed from: b, reason: collision with root package name */
    public static final float f2128b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2129c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2130d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2131e = 2;

    /* JADX WARN: Removed duplicated region for block: B:106:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final boolean r27, final boolean r28, final z.k r29, v1.o r30, final c1.g7 r31, final c2.w0 r32, float r33, float r34, f1.i0 r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.g4.a(boolean, boolean, z.k, v1.o, c1.g7, c2.w0, float, float, f1.i0, int, int):void");
    }

    public final void b(final String str, final ej.e eVar, final boolean z2, final boolean z10, b0.b bVar, final z.k kVar, final boolean z11, final ej.e eVar2, final g7 g7Var, b0.i1 i1Var, final p1.e eVar3, f1.i0 i0Var, final int i10) {
        int i11;
        boolean z12;
        b0.b bVar2;
        final b0.i1 i1Var2;
        int i12;
        b0.i1 i1Var3;
        p1.e eVar4;
        i0Var.c0(-1732281618);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z12 = z2;
            i11 |= i0Var.g(z12) ? 256 : 128;
        } else {
            z12 = z2;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            bVar2 = bVar;
            i11 |= i0Var.f(bVar2) ? 16384 : 8192;
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 196608) == 0) {
            i11 |= i0Var.f(kVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= i0Var.g(z11) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= i0Var.h(eVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= i0Var.h(null) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= i0Var.h(null) ? 536870912 : 268435456;
        }
        int i13 = 14155776 | (i0Var.h(null) ? 4 : 2) | (i0Var.h(null) ? 32 : 16) | (i0Var.h(null) ? 256 : 128) | (i0Var.h(null) ? 2048 : 1024) | (i0Var.f(g7Var) ? 16384 : 8192) | 65536;
        if (i0Var.T(i11 & 1, ((i11 & 306783379) == 306783378 && (4793491 & i13) == 4793490) ? false : true)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                float f10 = d1.d1.f4485a;
                b0.k1 k1Var = new b0.k1(f10, f10, f10, f10);
                i12 = i13 & (-458753);
                i1Var3 = k1Var;
            } else {
                i0Var.W();
                i12 = i13 & (-458753);
                i1Var3 = i1Var;
            }
            i0Var.q();
            boolean z13 = ((i11 & 14) == 4) | ((i11 & 57344) == 16384);
            Object objQ = i0Var.Q();
            if (z13 || objQ == f1.m.f6385a) {
                g3.f fVar = new g3.f(str);
                bVar2.getClass();
                objQ = new l3.a0(fVar, l3.m.f9922a);
                i0Var.l0(objQ);
            }
            String str2 = ((l3.a0) objQ).f9881a.f7081b;
            d1.e1 e1Var = d1.e1.f4499b;
            q7 q7Var = new q7();
            if (eVar2 == null) {
                i0Var.b0(1927058812);
                i0Var.p(false);
                eVar4 = null;
            } else {
                i0Var.b0(1927058813);
                p1.e eVarD = p1.j.d(-1459717586, new f4(eVar2, 0), i0Var);
                i0Var.p(false);
                eVar4 = eVarD;
            }
            int i14 = i11 >> 9;
            int i15 = i12 << 21;
            d1.d1.a(e1Var, str2, eVar, q7Var, eVar4, null, z10, z12, z11, kVar, i1Var3, g7Var, eVar3, i0Var, ((i11 << 3) & 896) | 6 | (i14 & 458752) | (i14 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192), (i14 & 7168) | (i11 & 896) | ((i12 >> 9) & 14) | ((i11 >> 6) & 112) | ((i11 >> 3) & 57344) | ((i12 << 6) & 3670016) | 12582912);
            i1Var2 = i1Var3;
        } else {
            i0Var.W();
            i1Var2 = i1Var;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            final b0.b bVar3 = bVar2;
            t1VarU.f6456d = new ej.e() { // from class: c1.d4
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f2008a.b(str, eVar, z2, z10, bVar3, kVar, z11, eVar2, g7Var, i1Var2, eVar3, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }
}
