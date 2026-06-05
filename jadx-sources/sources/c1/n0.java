package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2459a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2460b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2461c;

    static {
        float f10 = 2;
        f2459a = f10;
        f2461c = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r22, f3.a r23, v1.o r24, c1.i0 r25, e2.h r26, e2.h r27, f1.i0 r28, int r29) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.n0.a(boolean, f3.a, v1.o, c1.i0, e2.h, e2.h, f1.i0, int):void");
    }

    public static final void b(f3.a aVar, ej.a aVar2, e2.h hVar, e2.h hVar2, v1.o oVar, boolean z2, i0 i0Var, f1.i0 i0Var2, int i10) {
        int i11;
        i0Var2.c0(-406243761);
        if ((i10 & 6) == 0) {
            i11 = (i0Var2.d(aVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var2.h(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var2.h(hVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var2.h(hVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var2.f(oVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var2.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var2.f(i0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= i0Var2.f(null) ? 8388608 : 4194304;
        }
        if (i0Var2.T(i11 & 1, (4793491 & i11) != 4793490)) {
            i0Var2.Y();
            if ((i10 & 1) != 0 && !i0Var2.C()) {
                i0Var2.W();
            }
            i0Var2.q();
            v1.o oVar2 = v1.l.f17564b;
            v1.o oVarC = aVar2 != null ? i0.c.c(aVar, a5.a(e1.i.f5436d / 2, 4), z2, new d3.j(1), aVar2) : oVar2;
            if (aVar2 != null) {
                t2.m mVar = g2.f2117a;
                oVar2 = v2.f2762b;
            }
            v1.o oVarT = b0.d.t(f2459a, oVar.c(oVar2).c(oVarC));
            int i12 = ((i11 >> 15) & 14) | ((i11 << 3) & 112) | ((i11 >> 9) & 7168);
            int i13 = i11 << 6;
            a(z2, aVar, oVarT, i0Var, hVar, hVar2, i0Var2, i12 | (57344 & i13) | (i13 & 458752));
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b0(aVar, aVar2, hVar, hVar2, oVar, z2, i0Var, i10);
        }
    }

    public static final void c(f3.a aVar, ej.a aVar2, v1.o oVar, boolean z2, i0 i0Var, f1.i0 i0Var2, int i10) {
        v1.o oVar2;
        boolean z10;
        i0Var2.c0(-1608358065);
        int i11 = i10 | (i0Var2.d(aVar.ordinal()) ? 4 : 2) | (i0Var2.h(aVar2) ? 32 : 16) | 3456 | (i0Var2.f(i0Var) ? 16384 : 8192) | 196608;
        if (i0Var2.T(i11 & 1, (74899 & i11) != 74898)) {
            i0Var2.Y();
            if ((i10 & 1) == 0 || i0Var2.C()) {
                oVar2 = v1.l.f17564b;
                z10 = true;
            } else {
                i0Var2.W();
                oVar2 = oVar;
                z10 = z2;
            }
            i0Var2.q();
            float fFloor = (float) Math.floor(((s3.c) i0Var2.j(w2.f1.f18262h)).w0(j0.f2261a));
            b(aVar, aVar2, new e2.h(2, 0, fFloor, 0.0f, 26), new e2.h(0, 0, fFloor, 0.0f, 30), oVar2, z10, i0Var, i0Var2, ((i11 << 6) & 3670016) | (i11 & 126) | 221184 | 12582912);
        } else {
            i0Var2.W();
            oVar2 = oVar;
            z10 = z2;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k0(aVar, aVar2, oVar2, z10, i0Var, i10);
        }
    }
}
