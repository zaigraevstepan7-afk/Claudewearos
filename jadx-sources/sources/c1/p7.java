package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p7 {
    public static final void a(final String str, final ej.c cVar, final v1.o oVar, boolean z2, g3.n0 n0Var, final ej.e eVar, b0.b bVar, k0.s0 s0Var, k0.r0 r0Var, final boolean z10, int i10, int i11, final c2.w0 w0Var, final g7 g7Var, f1.i0 i0Var, final int i12) {
        f1.i0 i0Var2;
        final boolean z11;
        final g3.n0 n0Var2;
        final b0.b bVar2;
        final k0.s0 s0Var2;
        final k0.r0 r0Var2;
        final int i13;
        final int i14;
        g3.n0 n0Var3;
        k0.s0 s0Var3;
        k0.r0 r0Var3;
        b0.b bVar3;
        int i15;
        int i16;
        boolean z12;
        i0Var.c0(-154966360);
        int i17 = i12 | (i0Var.f(str) ? 4 : 2) | (i0Var.h(cVar) ? 32 : 16) | 907635712;
        if (i0Var.T(i17 & 1, ((306783379 & i17) == 306783378 && (((6 | (i0Var.f(w0Var) ? ' ' : (char) 16)) | (i0Var.f(g7Var) ? 256 : 128)) & 147) == 146) ? false : true)) {
            i0Var.Y();
            if ((i12 & 1) == 0 || i0Var.C()) {
                n0Var3 = (g3.n0) i0Var.j(v7.f2781a);
                int i18 = z10 ? 1 : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                b0.b bVar4 = l3.b0.f9890a;
                s0Var3 = k0.s0.f9253a;
                r0Var3 = k0.r0.f9244a;
                bVar3 = bVar4;
                i15 = 1;
                i16 = i18;
                z12 = true;
            } else {
                i0Var.W();
                z12 = z2;
                n0Var3 = n0Var;
                bVar3 = bVar;
                s0Var3 = s0Var;
                r0Var3 = r0Var;
                i16 = i10;
                i15 = i11;
            }
            i0Var.q();
            i0Var.b0(488210003);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = t.m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            i0Var.p(false);
            i0Var.b0(1401227490);
            long jB = n0Var3.b();
            if (jB == 16) {
                jB = !z12 ? g7Var.f2148c : ((Boolean) u1.b.j(kVar, i0Var, 0).getValue()).booleanValue() ? g7Var.f2146a : g7Var.f2147b;
            }
            long j = jB;
            i0Var.p(false);
            k0.r0 r0Var4 = r0Var3;
            int i19 = i16;
            i0Var2 = i0Var;
            f1.s.a(v0.b1.f17363a.a(g7Var.f2155k), p1.j.d(1459735400, new o7(oVar, g7Var, str, cVar, z12, n0Var3.d(new g3.n0(j, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214)), s0Var3, r0Var4, z10, i19, i15, bVar3, kVar, eVar, w0Var), i0Var2), i0Var2, 56);
            z11 = z12;
            r0Var2 = r0Var4;
            n0Var2 = n0Var3;
            s0Var2 = s0Var3;
            bVar2 = bVar3;
            i14 = i15;
            i13 = i19;
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
            z11 = z2;
            n0Var2 = n0Var;
            bVar2 = bVar;
            s0Var2 = s0Var;
            r0Var2 = r0Var;
            i13 = i10;
            i14 = i11;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(str, cVar, oVar, z11, n0Var2, eVar, bVar2, s0Var2, r0Var2, z10, i13, i14, w0Var, g7Var, i12) { // from class: c1.l7
                public final /* synthetic */ k0.s0 A;
                public final /* synthetic */ k0.r0 B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ int D;
                public final /* synthetic */ int E;
                public final /* synthetic */ c2.w0 F;
                public final /* synthetic */ g7 G;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f2391a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ej.c f2392b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v1.o f2393c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f2394d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ g3.n0 f2395e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ej.e f2396f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ b0.b f2397z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(12583297);
                    p7.a(this.f2391a, this.f2392b, this.f2393c, this.f2394d, this.f2395e, this.f2396f, this.f2397z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x063f  */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ej.e r41, ej.e r42, ej.f r43, final ej.e r44, final ej.e r45, final ej.e r46, final ej.e r47, final boolean r48, final c1.q7 r49, final d1.c1 r50, final p1.e r51, ej.e r52, b0.i1 r53, f1.i0 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.p7.b(ej.e, ej.e, ej.f, ej.e, ej.e, ej.e, ej.e, boolean, c1.q7, d1.c1, p1.e, ej.e, b0.i1, f1.i0, int, int):void");
    }
}
