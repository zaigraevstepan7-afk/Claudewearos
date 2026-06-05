package d1;

import c1.g2;
import c1.o8;
import c1.p8;
import c1.q7;
import f1.t1;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4485a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4486b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final float f4487c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final float f4488d = 24;

    /* renamed from: e, reason: collision with root package name */
    public static final float f4489e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f4490f;

    static {
        float f10 = 16;
        f4485a = f10;
        f4489e = f10;
        f4490f = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x040f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final d1.e1 r47, final java.lang.CharSequence r48, final ej.e r49, final c1.q7 r50, final ej.f r51, final ej.e r52, final boolean r53, final boolean r54, final boolean r55, final z.k r56, final b0.i1 r57, final c1.g7 r58, final ej.e r59, f1.i0 r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.d1.a(d1.e1, java.lang.CharSequence, ej.e, c1.q7, ej.f, ej.e, boolean, boolean, boolean, z.k, b0.i1, c1.g7, ej.e, f1.i0, int, int):void");
    }

    public static final void b(long j, g3.n0 n0Var, ej.e eVar, f1.i0 i0Var, int i10) {
        long j4;
        g3.n0 n0Var2;
        ej.e eVar2;
        f1.i0 i0Var2;
        i0Var.c0(396611577);
        int i11 = (i0Var.e(j) ? 4 : 2) | i10 | (i0Var.f(n0Var) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(eVar) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            i0Var2 = i0Var;
            i.b(j, n0Var, eVar, i0Var2, i11 & 1022);
            j4 = j;
            n0Var2 = n0Var;
            eVar2 = eVar;
        } else {
            j4 = j;
            n0Var2 = n0Var;
            eVar2 = eVar;
            i0Var2 = i0Var;
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new t0(j4, n0Var2, eVar2, i10, 1);
        }
    }

    public static final v1.e c(q7 q7Var) {
        if (q7Var instanceof q7) {
            return q7Var.f2616a;
        }
        throw new IllegalArgumentException("Unknown position: " + q7Var);
    }

    public static final float d(f1.i0 i0Var) {
        long j = ((o8) i0Var.j(p8.f2587a)).f2552l.f7152b.f7178c;
        long j4 = e1.j0.f5475l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j4;
        }
        return ((s3.c) i0Var.j(f1.f18262h)).N(j) / 2;
    }

    public static final float e(f1.i0 i0Var) {
        float f10 = ((s3.f) i0Var.j(g2.f2119c)).f14742a;
        if (Float.isNaN(f10)) {
            f10 = 0;
        }
        float f11 = (f10 - e1.f0.f5402d) / 2;
        float f12 = 0;
        return f11 < f12 ? f12 : f11;
    }
}
