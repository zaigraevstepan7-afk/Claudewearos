package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1.o f1876a = b0.t1.k(e1.f0.f5402d, v1.l.f17564b);

    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final h2.b r16, final java.lang.String r17, final v1.o r18, final long r19, f1.i0 r21, final int r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.a2.a(h2.b, java.lang.String, v1.o, long, f1.i0, int):void");
    }

    public static final void b(final i2.f fVar, String str, v1.o oVar, long j, f1.i0 i0Var, final int i10, final int i11) {
        int i12;
        String str2;
        f1.i0 i0Var2;
        final long j4;
        final v1.o oVar2;
        i0Var.c0(-126890956);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.f(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.f(str) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= i0Var.f(oVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= ((i11 & 8) == 0 && i0Var.e(j)) ? 2048 : 1024;
        }
        if (i0Var.T(i12 & 1, (i12 & 1171) != 1170)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                if (i13 != 0) {
                    oVar = v1.l.f17564b;
                }
                if ((i11 & 8) != 0) {
                    j = ((c2.w) i0Var.j(g1.f2116a)).f3060a;
                    i12 &= -7169;
                }
                v1.o oVar3 = oVar;
                long j10 = j;
                i0Var.q();
                str2 = str;
                i0Var2 = i0Var;
                a(i2.b.d(fVar, i0Var), str2, oVar3, j10, i0Var2, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168));
                oVar2 = oVar3;
                j4 = j10;
            } else {
                i0Var.W();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                v1.o oVar32 = oVar;
                long j102 = j;
                i0Var.q();
                str2 = str;
                i0Var2 = i0Var;
                a(i2.b.d(fVar, i0Var), str2, oVar32, j102, i0Var2, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168));
                oVar2 = oVar32;
                j4 = j102;
            }
        } else {
            str2 = str;
            i0Var2 = i0Var;
            i0Var2.W();
            j4 = j;
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            final String str3 = str2;
            t1VarU.f6456d = new ej.e() { // from class: c1.y1
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a2.b(fVar, str3, oVar2, j4, (f1.i0) obj, f1.s.O(i10 | 1), i11);
                    return pi.o.f13011a;
                }
            };
        }
    }
}
