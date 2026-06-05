package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v6 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2775a = e1.e0.f5391n;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2776b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2777c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2778d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2779e;

    /* renamed from: f, reason: collision with root package name */
    public static final t2.s1 f2780f;

    static {
        float f10 = e1.e0.f5389l;
        f2776b = f10;
        float f11 = e1.e0.j;
        f2777c = x8.a.c(f10, f11);
        x8.a.c(f11, f10);
        f2778d = e1.e0.f5379a;
        f2779e = 2;
        f2780f = new t2.s1(m6.A);
    }

    public static final void a(final float f10, final ej.c cVar, final v1.o oVar, final boolean z2, a6 a6Var, final z.k kVar, final p1.e eVar, final p1.e eVar2, final kj.d dVar, f1.i0 i0Var, final int i10, final int i11) {
        int i12;
        a6 a6Var2;
        p1.e eVar3;
        int i13;
        i0Var.c0(985901935);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.c(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.h(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= i0Var.f(oVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= i0Var.g(z2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= i0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            a6Var2 = a6Var;
            i12 |= i0Var.f(a6Var2) ? 131072 : 65536;
        } else {
            a6Var2 = a6Var;
        }
        if ((1572864 & i10) == 0) {
            i12 |= i0Var.f(kVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= i0Var.d(0) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= i0Var.h(eVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            eVar3 = eVar2;
            i12 |= i0Var.h(eVar3) ? 536870912 : 268435456;
        } else {
            eVar3 = eVar2;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (i0Var.f(dVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if (i0Var.T(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
            i0Var.Y();
            if ((i10 & 1) != 0 && !i0Var.C()) {
                i0Var.W();
            }
            i0Var.q();
            boolean z10 = ((29360128 & i12) == 8388608) | ((((i13 & 14) ^ 6) > 4 && i0Var.f(dVar)) || (i13 & 6) == 4);
            Object objQ = i0Var.Q();
            if (z10 || objQ == f1.m.f6385a) {
                objQ = new x6(f10, dVar);
                i0Var.l0(objQ);
            }
            x6 x6Var = (x6) objQ;
            x6Var.getClass();
            x6Var.f2872c = cVar;
            x6Var.d(f10);
            int i14 = ((i12 >> 3) & 1008) | ((i12 >> 6) & 57344);
            int i15 = i12 >> 9;
            c(x6Var, oVar, z2, null, kVar, eVar, eVar3, i0Var, i14 | (458752 & i15) | (i15 & 3670016));
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            final a6 a6Var3 = a6Var2;
            t1VarU.f6456d = new ej.e() { // from class: c1.j6
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v6.a(f10, cVar, oVar, z2, a6Var3, kVar, eVar, eVar2, dVar, (f1.i0) obj, f1.s.O(i10 | 1), f1.s.O(i11));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(final float f10, final ej.c cVar, v1.o oVar, boolean z2, final kj.d dVar, a6 a6Var, z.k kVar, f1.i0 i0Var, final int i10) {
        float f11;
        int i11;
        ej.c cVar2;
        final v1.o oVar2;
        final boolean z10;
        final a6 a6Var2;
        final z.k kVar2;
        int i12;
        v1.o oVar3;
        a6 a6Var3;
        boolean z11;
        z.k kVar3;
        i0Var.c0(-202044027);
        if ((i10 & 6) == 0) {
            f11 = f10;
            i11 = (i0Var.c(f11) ? 4 : 2) | i10;
        } else {
            f11 = f10;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            cVar2 = cVar;
            i11 |= i0Var.h(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        int i13 = i11 | 3456;
        if ((i10 & 24576) == 0) {
            i13 |= i0Var.f(dVar) ? 16384 : 8192;
        }
        int i14 = 1769472 | i13;
        if ((12582912 & i10) == 0) {
            i14 = 5963776 | i13;
        }
        int i15 = 100663296 | i14;
        if (i0Var.T(i15 & 1, (38347923 & i15) != 38347922)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                h6 h6Var = h6.f2196a;
                a6 a6VarD = h6.d(i0Var);
                i12 = i15 & (-29360129);
                Object objQ = i0Var.Q();
                if (objQ == f1.m.f6385a) {
                    objQ = t.m1.p(i0Var);
                }
                z.k kVar4 = (z.k) objQ;
                oVar3 = v1.l.f17564b;
                a6Var3 = a6VarD;
                z11 = true;
                kVar3 = kVar4;
            } else {
                i0Var.W();
                i12 = i15 & (-29360129);
                oVar3 = oVar;
                z11 = z2;
                a6Var3 = a6Var;
                kVar3 = kVar;
            }
            i0Var.q();
            int i16 = i12 >> 6;
            int i17 = (i12 & 14) | 905969664 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i16) | (i16 & 3670016) | (29360128 & (i12 << 6));
            int i18 = (i12 >> 12) & 14;
            ej.c cVar3 = cVar2;
            v1.o oVar4 = oVar3;
            a(f11, cVar3, oVar4, z11, a6Var3, kVar3, p1.j.d(308249025, new n6(kVar3, a6Var3, z11), i0Var), p1.j.d(-1843234110, new o6(a6Var3, z11), i0Var), dVar, i0Var, i17, i18);
            a6Var2 = a6Var3;
            kVar2 = kVar3;
            z10 = z11;
            oVar2 = oVar4;
        } else {
            i0Var.W();
            oVar2 = oVar;
            z10 = z2;
            a6Var2 = a6Var;
            kVar2 = kVar;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.i6
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v6.b(f10, cVar, oVar2, z10, dVar, a6Var2, kVar2, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(x6 x6Var, v1.o oVar, boolean z2, a6 a6Var, z.k kVar, p1.e eVar, p1.e eVar2, f1.i0 i0Var, int i10) {
        int i11;
        a6 a6Var2;
        int i12;
        a6 a6VarD;
        i0Var.c0(409861960);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(x6Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.g(z2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.f(kVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.h(eVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var.h(eVar2) ? 1048576 : 524288;
        }
        if (i0Var.T(i11 & 1, (599187 & i11) != 599186)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                h6 h6Var = h6.f2196a;
                i12 = i11 & (-7169);
                a6VarD = h6.d(i0Var);
            } else {
                i0Var.W();
                i12 = i11 & (-7169);
                a6VarD = a6Var;
            }
            i0Var.q();
            int i13 = i12 >> 3;
            d(oVar, x6Var, z2, kVar, eVar, eVar2, i0Var, (i12 & 896) | (i13 & 14) | ((i12 << 3) & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752));
            a6Var2 = a6VarD;
        } else {
            i0Var.W();
            a6Var2 = a6Var;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b0(x6Var, oVar, z2, a6Var2, kVar, eVar, eVar2, i10, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(v1.o r28, c1.x6 r29, boolean r30, z.k r31, p1.e r32, p1.e r33, f1.i0 r34, int r35) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.v6.d(v1.o, c1.x6, boolean, z.k, p1.e, p1.e, f1.i0, int):void");
    }

    public static final float e(float f10, float[] fArr, float f11, float f12) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f13 = fArr[0];
            int i10 = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f13);
            } else {
                float fAbs = Math.abs(u3.c.l(f11, f12, f13) - f10);
                if (1 <= length) {
                    while (true) {
                        float f14 = fArr[i10];
                        float fAbs2 = Math.abs(u3.c.l(f11, f12, f14) - f10);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f13 = f14;
                            fAbs = fAbs2;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                fValueOf = Float.valueOf(f13);
            }
        }
        return fValueOf != null ? u3.c.l(f11, f12, fValueOf.floatValue()) : f10;
    }
}
