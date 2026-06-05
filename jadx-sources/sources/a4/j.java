package a4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f178a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(a4.e r40, y3.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.j.a(a4.e, y3.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, y3.c cVar, d dVar) {
        dVar.f126n = -1;
        c cVar2 = dVar.L;
        int[] iArr = dVar.f129o0;
        c cVar3 = dVar.K;
        c cVar4 = dVar.I;
        c cVar5 = dVar.J;
        c cVar6 = dVar.H;
        dVar.f128o = -1;
        int[] iArr2 = eVar.f129o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i10 = cVar6.f98g;
            int iN = eVar.n() - cVar5.f98g;
            cVar6.f100i = cVar.k(cVar6);
            cVar5.f100i = cVar.k(cVar5);
            cVar.d(cVar6.f100i, i10);
            cVar.d(cVar5.f100i, iN);
            dVar.f126n = 2;
            dVar.X = i10;
            int i11 = iN - i10;
            dVar.T = i11;
            int i12 = dVar.f102a0;
            if (i11 < i12) {
                dVar.T = i12;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i13 = cVar4.f98g;
        int iK = eVar.k() - cVar3.f98g;
        cVar4.f100i = cVar.k(cVar4);
        cVar3.f100i = cVar.k(cVar3);
        cVar.d(cVar4.f100i, i13);
        cVar.d(cVar3.f100i, iK);
        if (dVar.Z > 0 || dVar.f112f0 == 8) {
            y3.f fVarK = cVar.k(cVar2);
            cVar2.f100i = fVarK;
            cVar.d(fVarK, dVar.Z + i13);
        }
        dVar.f128o = 2;
        dVar.Y = i13;
        int i14 = iK - i13;
        dVar.U = i14;
        int i15 = dVar.f104b0;
        if (i14 < i15) {
            dVar.U = i15;
        }
    }

    public static final boolean c(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
