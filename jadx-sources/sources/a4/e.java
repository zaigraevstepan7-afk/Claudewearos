package a4;

import b4.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends d {
    public b[] A0;
    public b[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final b4.b K0;

    /* renamed from: p0, reason: collision with root package name */
    public ArrayList f141p0 = new ArrayList();

    /* renamed from: q0, reason: collision with root package name */
    public final ac.d f142q0 = new ac.d(this);

    /* renamed from: r0, reason: collision with root package name */
    public final b4.e f143r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f144s0;

    /* renamed from: t0, reason: collision with root package name */
    public d4.f f145t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f146u0;

    /* renamed from: v0, reason: collision with root package name */
    public final y3.c f147v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public e() {
        b4.e eVar = new b4.e();
        eVar.f1533b = true;
        eVar.f1534c = true;
        eVar.f1537f = new ArrayList();
        new ArrayList();
        eVar.f1539h = null;
        eVar.f1540i = new b4.b();
        eVar.f1538g = new ArrayList();
        eVar.f1535d = this;
        eVar.f1536e = this;
        this.f143r0 = eVar;
        this.f145t0 = null;
        this.f146u0 = false;
        this.f147v0 = new y3.c();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new b[4];
        this.B0 = new b[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new b4.b();
    }

    public static void Q(d dVar, d4.f fVar, b4.b bVar) {
        int i10;
        int i11;
        if (fVar == null) {
            return;
        }
        int i12 = dVar.f112f0;
        int[] iArr = dVar.f133s;
        if (i12 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f1525e = 0;
            bVar.f1526f = 0;
            return;
        }
        int[] iArr2 = dVar.f129o0;
        bVar.f1521a = iArr2[0];
        bVar.f1522b = iArr2[1];
        bVar.f1523c = dVar.n();
        bVar.f1524d = dVar.k();
        bVar.f1529i = false;
        bVar.j = 0;
        boolean z2 = bVar.f1521a == 3;
        boolean z10 = bVar.f1522b == 3;
        boolean z11 = z2 && dVar.V > 0.0f;
        boolean z12 = z10 && dVar.V > 0.0f;
        if (z2 && dVar.q(0) && dVar.f131q == 0 && !z11) {
            bVar.f1521a = 2;
            if (z10 && dVar.f132r == 0) {
                bVar.f1521a = 1;
            }
            z2 = false;
        }
        if (z10 && dVar.q(1) && dVar.f132r == 0 && !z12) {
            bVar.f1522b = 2;
            if (z2 && dVar.f131q == 0) {
                bVar.f1522b = 1;
            }
            z10 = false;
        }
        if (dVar.x()) {
            bVar.f1521a = 1;
            z2 = false;
        }
        if (dVar.y()) {
            bVar.f1522b = 1;
            z10 = false;
        }
        if (z11) {
            if (iArr[0] == 4) {
                bVar.f1521a = 1;
            } else if (!z10) {
                if (bVar.f1522b == 1) {
                    i11 = bVar.f1524d;
                } else {
                    bVar.f1521a = 2;
                    fVar.b(dVar, bVar);
                    i11 = bVar.f1526f;
                }
                bVar.f1521a = 1;
                bVar.f1523c = (int) (dVar.V * i11);
            }
        }
        if (z12) {
            if (iArr[1] == 4) {
                bVar.f1522b = 1;
            } else if (!z2) {
                if (bVar.f1521a == 1) {
                    i10 = bVar.f1523c;
                } else {
                    bVar.f1522b = 2;
                    fVar.b(dVar, bVar);
                    i10 = bVar.f1525e;
                }
                bVar.f1522b = 1;
                if (dVar.W == -1) {
                    bVar.f1524d = (int) (i10 / dVar.V);
                } else {
                    bVar.f1524d = (int) (dVar.V * i10);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.J(bVar.f1525e);
        dVar.G(bVar.f1526f);
        dVar.D = bVar.f1528h;
        dVar.D(bVar.f1527g);
        bVar.j = 0;
    }

    @Override // a4.d
    public final void C(l lVar) {
        super.C(lVar);
        int size = this.f141p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f141p0.get(i10)).C(lVar);
        }
    }

    @Override // a4.d
    public final void K(boolean z2, boolean z10) {
        super.K(z2, z10);
        int size = this.f141p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f141p0.get(i10)).K(z2, z10);
        }
    }

    public final void M(d dVar, int i10) {
        if (i10 == 0) {
            int i11 = this.y0 + 1;
            b[] bVarArr = this.B0;
            if (i11 >= bVarArr.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.B0;
            int i12 = this.y0;
            bVarArr2[i12] = new b(dVar, 0, this.f146u0);
            this.y0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.z0 + 1;
            b[] bVarArr3 = this.A0;
            if (i13 >= bVarArr3.length) {
                this.A0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.A0;
            int i14 = this.z0;
            bVarArr4[i14] = new b(dVar, 1, this.f146u0);
            this.z0 = i14 + 1;
        }
    }

    public final void N(y3.c cVar) {
        e eVar;
        y3.c cVar2;
        boolean zR = R(64);
        b(cVar, zR);
        int size = this.f141p0.size();
        boolean z2 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) this.f141p0.get(i10);
            boolean[] zArr = dVar.R;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar2 = (d) this.f141p0.get(i11);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i12 = 0; i12 < aVar.f177q0; i12++) {
                        d dVar3 = aVar.f176p0[i12];
                        if (aVar.f73s0 || dVar3.c()) {
                            int i13 = aVar.f72r0;
                            if (i13 == 0 || i13 == 1) {
                                dVar3.R[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                dVar3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar4 = (d) this.f141p0.get(i14);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i15 = 0; i15 < gVar.f177q0; i15++) {
                    if (hashSet.contains(gVar.f176p0[i15])) {
                        gVar.b(cVar, zR);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zR);
                }
                hashSet.clear();
            }
        }
        if (y3.c.f20175p) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                d dVar5 = (d) this.f141p0.get(i16);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f129o0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zR);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i17 = 0; i17 < size; i17++) {
                d dVar7 = (d) eVar.f141p0.get(i17);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f129o0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        dVar7.H(1);
                    }
                    if (i19 == 2) {
                        dVar7.I(1);
                    }
                    dVar7.b(cVar2, zR);
                    if (i18 == 2) {
                        dVar7.H(i18);
                    }
                    if (i19 == 2) {
                        dVar7.I(i19);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zR);
                    }
                }
            }
        }
        if (eVar.y0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.z0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(int i10, boolean z2) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        b4.e eVar = this.f143r0;
        ArrayList arrayList = (ArrayList) eVar.f1537f;
        e eVar2 = (e) eVar.f1535d;
        int iJ = eVar2.j(0);
        int[] iArr = eVar2.f129o0;
        int iJ2 = eVar2.j(1);
        int iO = eVar2.o();
        int iP = eVar2.p();
        if (z2 && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z11 = z2;
                    break;
                }
                Object obj = arrayList.get(i13);
                i13++;
                o oVar = (o) obj;
                if (oVar.f1570f == i10 && !oVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z11 && iJ == 2) {
                    eVar2.H(1);
                    eVar2.J(eVar.e(eVar2, 0));
                    eVar2.f107d.f1569e.d(eVar2.n());
                }
            } else if (z11 && iJ2 == 2) {
                eVar2.I(1);
                eVar2.G(eVar.e(eVar2, 1));
                eVar2.f109e.f1569e.d(eVar2.k());
            }
        }
        if (i10 == 0) {
            i11 = 0;
            int i14 = iArr[0];
            if (i14 == 1 || i14 == 4) {
                int iN = eVar2.n() + iO;
                eVar2.f107d.f1573i.d(iN);
                eVar2.f107d.f1569e.d(iN - iO);
                i12 = 1;
            }
            i12 = i11;
        } else {
            i11 = 0;
            int i15 = iArr[1];
            if (i15 == 1 || i15 == 4) {
                int iK = eVar2.k() + iP;
                eVar2.f109e.f1573i.d(iK);
                eVar2.f109e.f1569e.d(iK - iP);
                i12 = 1;
            }
            i12 = i11;
        }
        eVar.i();
        int size2 = arrayList.size();
        int i16 = i11;
        while (i16 < size2) {
            Object obj2 = arrayList.get(i16);
            i16++;
            o oVar2 = (o) obj2;
            if (oVar2.f1570f == i10 && (oVar2.f1566b != eVar2 || oVar2.f1571g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i17 = i11;
        while (i17 < size3) {
            Object obj3 = arrayList.get(i17);
            i17++;
            o oVar3 = (o) obj3;
            if (oVar3.f1570f == i10 && (i12 != 0 || oVar3.f1566b != eVar2)) {
                if (!oVar3.f1572h.j || !oVar3.f1573i.j || (!(oVar3 instanceof b4.c) && !oVar3.f1569e.j)) {
                    z10 = i11;
                    break;
                }
            }
        }
        z10 = 1;
        eVar2.H(iJ);
        eVar2.I(iJ2);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 2329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.e.P():void");
    }

    public final boolean R(int i10) {
        return (this.C0 & i10) == i10;
    }

    @Override // a4.d
    public final void z() {
        this.f147v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.f141p0.clear();
        super.z();
    }
}
