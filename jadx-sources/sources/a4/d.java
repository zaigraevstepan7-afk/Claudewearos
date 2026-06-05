package a4;

import android.view.View;
import b4.k;
import b4.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class d {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final c H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public d S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f102a0;

    /* renamed from: b, reason: collision with root package name */
    public b4.c f103b;

    /* renamed from: b0, reason: collision with root package name */
    public int f104b0;

    /* renamed from: c, reason: collision with root package name */
    public b4.c f105c;

    /* renamed from: c0, reason: collision with root package name */
    public float f106c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f108d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f110e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f112f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f114g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f116h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f118i0;
    public boolean j;

    /* renamed from: j0, reason: collision with root package name */
    public final float[] f119j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f120k;

    /* renamed from: k0, reason: collision with root package name */
    public final d[] f121k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f122l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f123l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f124m;

    /* renamed from: m0, reason: collision with root package name */
    public int f125m0;

    /* renamed from: n, reason: collision with root package name */
    public int f126n;

    /* renamed from: n0, reason: collision with root package name */
    public int f127n0;

    /* renamed from: o, reason: collision with root package name */
    public int f128o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f129o0;

    /* renamed from: p, reason: collision with root package name */
    public int f130p;

    /* renamed from: q, reason: collision with root package name */
    public int f131q;

    /* renamed from: r, reason: collision with root package name */
    public int f132r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f133s;

    /* renamed from: t, reason: collision with root package name */
    public int f134t;

    /* renamed from: u, reason: collision with root package name */
    public int f135u;

    /* renamed from: v, reason: collision with root package name */
    public float f136v;

    /* renamed from: w, reason: collision with root package name */
    public int f137w;

    /* renamed from: x, reason: collision with root package name */
    public int f138x;

    /* renamed from: y, reason: collision with root package name */
    public float f139y;

    /* renamed from: z, reason: collision with root package name */
    public int f140z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f101a = false;

    /* renamed from: d, reason: collision with root package name */
    public k f107d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f109e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f111f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f113g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f115h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f117i = -1;

    public d() {
        new HashMap();
        this.j = false;
        this.f120k = false;
        this.f122l = false;
        this.f124m = false;
        this.f126n = -1;
        this.f128o = -1;
        this.f130p = 0;
        this.f131q = 0;
        this.f132r = 0;
        this.f133s = new int[2];
        this.f134t = 0;
        this.f135u = 0;
        this.f136v = 1.0f;
        this.f137w = 0;
        this.f138x = 0;
        this.f139y = 1.0f;
        this.f140z = -1;
        this.A = 1.0f;
        this.B = new int[]{com.google.android.gms.common.api.f.API_PRIORITY_OTHER, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        c cVar = new c(this, 2);
        this.H = cVar;
        c cVar2 = new c(this, 3);
        this.I = cVar2;
        c cVar3 = new c(this, 4);
        this.J = cVar3;
        c cVar4 = new c(this, 5);
        this.K = cVar4;
        c cVar5 = new c(this, 6);
        this.L = cVar5;
        c cVar6 = new c(this, 8);
        this.M = cVar6;
        c cVar7 = new c(this, 9);
        this.N = cVar7;
        c cVar8 = new c(this, 7);
        this.O = cVar8;
        this.P = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.f129o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f106c0 = 0.5f;
        this.f108d0 = 0.5f;
        this.f112f0 = 0;
        this.f114g0 = null;
        this.f116h0 = 0;
        this.f118i0 = 0;
        this.f119j0 = new float[]{-1.0f, -1.0f};
        this.f121k0 = new d[]{null, null};
        this.f123l0 = new d[]{null, null};
        this.f125m0 = -1;
        this.f127n0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public final void A() {
        d dVar = this.S;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.f120k = false;
        this.f122l = false;
        this.f124m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f94c = false;
            cVar.f93b = 0;
        }
    }

    public void C(l lVar) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i10) {
        this.Z = i10;
        this.D = i10 > 0;
    }

    public final void E(int i10, int i11) {
        if (this.j) {
            return;
        }
        this.H.l(i10);
        this.J.l(i11);
        this.X = i10;
        this.T = i11 - i10;
        this.j = true;
    }

    public final void F(int i10, int i11) {
        if (this.f120k) {
            return;
        }
        this.I.l(i10);
        this.K.l(i11);
        this.Y = i10;
        this.U = i11 - i10;
        if (this.D) {
            this.L.l(i10 + this.Z);
        }
        this.f120k = true;
    }

    public final void G(int i10) {
        this.U = i10;
        int i11 = this.f104b0;
        if (i10 < i11) {
            this.U = i11;
        }
    }

    public final void H(int i10) {
        this.f129o0[0] = i10;
    }

    public final void I(int i10) {
        this.f129o0[1] = i10;
    }

    public final void J(int i10) {
        this.T = i10;
        int i11 = this.f102a0;
        if (i10 < i11) {
            this.T = i11;
        }
    }

    public void K(boolean z2, boolean z10) {
        int i10;
        int i11;
        k kVar = this.f107d;
        boolean z11 = z2 & kVar.f1571g;
        m mVar = this.f109e;
        boolean z12 = z10 & mVar.f1571g;
        int i12 = kVar.f1572h.f1547g;
        int i13 = mVar.f1572h.f1547g;
        int i14 = kVar.f1573i.f1547g;
        int i15 = mVar.f1573i.f1547g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z11) {
            this.X = i12;
        }
        if (z12) {
            this.Y = i13;
        }
        if (this.f112f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.f129o0;
        if (z11) {
            if (iArr[0] == 1 && i17 < (i11 = this.T)) {
                i17 = i11;
            }
            this.T = i17;
            int i19 = this.f102a0;
            if (i17 < i19) {
                this.T = i19;
            }
        }
        if (z12) {
            if (iArr[1] == 1 && i18 < (i10 = this.U)) {
                i18 = i10;
            }
            this.U = i18;
            int i20 = this.f104b0;
            if (i18 < i20) {
                this.U = i20;
            }
        }
    }

    public void L(y3.c cVar, boolean z2) {
        int i10;
        int i11;
        m mVar;
        k kVar;
        cVar.getClass();
        int iN = y3.c.n(this.H);
        int iN2 = y3.c.n(this.I);
        int iN3 = y3.c.n(this.J);
        int iN4 = y3.c.n(this.K);
        if (z2 && (kVar = this.f107d) != null) {
            b4.f fVar = kVar.f1572h;
            if (fVar.j) {
                b4.f fVar2 = kVar.f1573i;
                if (fVar2.j) {
                    iN = fVar.f1547g;
                    iN3 = fVar2.f1547g;
                }
            }
        }
        if (z2 && (mVar = this.f109e) != null) {
            b4.f fVar3 = mVar.f1572h;
            if (fVar3.j) {
                b4.f fVar4 = mVar.f1573i;
                if (fVar4.j) {
                    iN2 = fVar3.f1547g;
                    iN4 = fVar4.f1547g;
                }
            }
        }
        int i12 = iN4 - iN2;
        if (iN3 - iN < 0 || i12 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i13 = iN3 - iN;
        int i14 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f112f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.f129o0;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.T)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.U)) {
            i14 = i10;
        }
        this.T = i13;
        this.U = i14;
        int i16 = this.f104b0;
        if (i14 < i16) {
            this.U = i16;
        }
        int i17 = this.f102a0;
        if (i13 < i17) {
            this.T = i17;
        }
        int i18 = this.f135u;
        if (i18 > 0 && i15 == 3) {
            this.T = Math.min(this.T, i18);
        }
        int i19 = this.f138x;
        if (i19 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i19);
        }
        int i20 = this.T;
        if (i13 != i20) {
            this.f115h = i20;
        }
        int i21 = this.U;
        if (i14 != i21) {
            this.f117i = i21;
        }
    }

    public final void a(e eVar, y3.c cVar, HashSet hashSet, int i10, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.R(64));
        }
        if (i10 == 0) {
            HashSet hashSet2 = this.H.f92a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f95d.a(eVar, cVar, hashSet, i10, true);
                }
            }
            HashSet hashSet3 = this.J.f92a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f95d.a(eVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.f92a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f95d.a(eVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSet5 = this.K.f92a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f95d.a(eVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSet6 = this.L.f92a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f95d.a(eVar, cVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [a4.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(y3.c r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.b(y3.c, boolean):void");
    }

    public boolean c() {
        return this.f112f0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0493 A[PHI: r3
      0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(y3.c r30, boolean r31, boolean r32, boolean r33, boolean r34, y3.f r35, y3.f r36, int r37, boolean r38, a4.c r39, a4.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.d(y3.c, boolean, boolean, boolean, boolean, y3.f, y3.f, int, boolean, a4.c, a4.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i10, d dVar, int i11, int i12) {
        boolean z2;
        if (i10 == 7) {
            if (i11 != 7) {
                if (i11 == 2 || i11 == 4) {
                    e(2, dVar, i11, 0);
                    e(4, dVar, i11, 0);
                    i(7).a(dVar.i(i11), 0);
                    return;
                } else {
                    if (i11 == 3 || i11 == 5) {
                        e(3, dVar, i11, 0);
                        e(5, dVar, i11, 0);
                        i(7).a(dVar.i(i11), 0);
                        return;
                    }
                    return;
                }
            }
            c cVarI = i(2);
            c cVarI2 = i(4);
            c cVarI3 = i(3);
            c cVarI4 = i(5);
            boolean z10 = true;
            if ((cVarI == null || !cVarI.h()) && (cVarI2 == null || !cVarI2.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((cVarI3 == null || !cVarI3.h()) && (cVarI4 == null || !cVarI4.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z10 = false;
            }
            if (z2 && z10) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z2) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z10) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i10 == 8 && (i11 == 2 || i11 == 4)) {
            c cVarI5 = i(2);
            c cVarI6 = dVar.i(i11);
            c cVarI7 = i(4);
            cVarI5.a(cVarI6, 0);
            cVarI7.a(cVarI6, 0);
            i(8).a(cVarI6, 0);
            return;
        }
        if (i10 == 9 && (i11 == 3 || i11 == 5)) {
            c cVarI8 = dVar.i(i11);
            i(3).a(cVarI8, 0);
            i(5).a(cVarI8, 0);
            i(9).a(cVarI8, 0);
            return;
        }
        if (i10 == 8 && i11 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i11), 0);
            return;
        }
        if (i10 == 9 && i11 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i11), 0);
            return;
        }
        c cVarI9 = i(i10);
        c cVarI10 = dVar.i(i11);
        if (cVarI9.i(cVarI10)) {
            if (i10 == 6) {
                c cVarI11 = i(3);
                c cVarI12 = i(5);
                if (cVarI11 != null) {
                    cVarI11.j();
                }
                if (cVarI12 != null) {
                    cVarI12.j();
                }
            } else if (i10 == 3 || i10 == 5) {
                c cVarI13 = i(6);
                if (cVarI13 != null) {
                    cVarI13.j();
                }
                c cVarI14 = i(7);
                if (cVarI14.f97f != cVarI10) {
                    cVarI14.j();
                }
                c cVarF = i(i10).f();
                c cVarI15 = i(9);
                if (cVarI15.h()) {
                    cVarF.j();
                    cVarI15.j();
                }
            } else if (i10 == 2 || i10 == 4) {
                c cVarI16 = i(7);
                if (cVarI16.f97f != cVarI10) {
                    cVarI16.j();
                }
                c cVarF2 = i(i10).f();
                c cVarI17 = i(8);
                if (cVarI17.h()) {
                    cVarF2.j();
                    cVarI17.j();
                }
            }
            cVarI9.a(cVarI10, i12);
        }
    }

    public final void f(c cVar, c cVar2, int i10) {
        if (cVar.f95d == this) {
            e(cVar.f96e, cVar2.f95d, cVar2.f96e, i10);
        }
    }

    public final void g(y3.c cVar) {
        cVar.k(this.H);
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        if (this.Z > 0) {
            cVar.k(this.L);
        }
    }

    public final void h() {
        if (this.f107d == null) {
            k kVar = new k(this);
            kVar.f1572h.f1545e = 4;
            kVar.f1573i.f1545e = 5;
            kVar.f1570f = 0;
            this.f107d = kVar;
        }
        if (this.f109e == null) {
            m mVar = new m(this);
            b4.f fVar = new b4.f(mVar);
            mVar.f1557k = fVar;
            mVar.f1558l = null;
            mVar.f1572h.f1545e = 6;
            mVar.f1573i.f1545e = 7;
            fVar.f1545e = 8;
            mVar.f1570f = 1;
            this.f109e = mVar;
        }
    }

    public c i(int i10) {
        switch (y3.e.b(i10)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(m6.a.A(i10));
        }
    }

    public final int j(int i10) {
        int[] iArr = this.f129o0;
        if (i10 == 0) {
            return iArr[0];
        }
        if (i10 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f112f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final d l(int i10) {
        c cVar;
        c cVar2;
        if (i10 != 0) {
            if (i10 == 1 && (cVar2 = (cVar = this.K).f97f) != null && cVar2.f97f == cVar) {
                return cVar2.f95d;
            }
            return null;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f97f;
        if (cVar4 == null || cVar4.f97f != cVar3) {
            return null;
        }
        return cVar4.f95d;
    }

    public final d m(int i10) {
        c cVar;
        c cVar2;
        if (i10 != 0) {
            if (i10 == 1 && (cVar2 = (cVar = this.I).f97f) != null && cVar2.f97f == cVar) {
                return cVar2.f95d;
            }
            return null;
        }
        c cVar3 = this.H;
        c cVar4 = cVar3.f97f;
        if (cVar4 == null || cVar4.f97f != cVar3) {
            return null;
        }
        return cVar4.f95d;
    }

    public final int n() {
        if (this.f112f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int o() {
        d dVar = this.S;
        return (dVar == null || !(dVar instanceof e)) ? this.X : ((e) dVar).w0 + this.X;
    }

    public final int p() {
        d dVar = this.S;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).x0 + this.Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            a4.c r5 = r4.H
            a4.c r5 = r5.f97f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            a4.c r3 = r4.J
            a4.c r3 = r3.f97f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            a4.c r5 = r4.I
            a4.c r5 = r5.f97f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            a4.c r3 = r4.K
            a4.c r3 = r3.f97f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            a4.c r3 = r4.L
            a4.c r3 = r3.f97f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.q(int):boolean");
    }

    public final boolean r(int i10, int i11) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i10 == 0) {
            c cVar5 = this.H;
            c cVar6 = cVar5.f97f;
            if (cVar6 == null || !cVar6.f94c || (cVar4 = (cVar3 = this.J).f97f) == null || !cVar4.f94c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f97f.d()) >= i11;
        }
        c cVar7 = this.I;
        c cVar8 = cVar7.f97f;
        if (cVar8 == null || !cVar8.f94c || (cVar2 = (cVar = this.K).f97f) == null || !cVar2.f94c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f97f.d()) >= i11;
    }

    public final void s(int i10, int i11, int i12, int i13, d dVar) {
        i(i10).b(dVar.i(i11), i12, i13, true);
    }

    public final boolean t(int i10) {
        c cVar;
        c cVar2;
        int i11 = i10 * 2;
        c[] cVarArr = this.P;
        c cVar3 = cVarArr[i11];
        c cVar4 = cVar3.f97f;
        return (cVar4 == null || cVar4.f97f == cVar3 || (cVar2 = (cVar = cVarArr[i11 + 1]).f97f) == null || cVar2.f97f != cVar) ? false : true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(this.f114g0 != null ? m6.a.j(new StringBuilder("id: "), this.f114g0, " ") : "");
        sb2.append("(");
        sb2.append(this.X);
        sb2.append(", ");
        sb2.append(this.Y);
        sb2.append(") - (");
        sb2.append(this.T);
        sb2.append(" x ");
        return m6.a.h(sb2, this.U, ")");
    }

    public final boolean u() {
        c cVar = this.H;
        c cVar2 = cVar.f97f;
        if (cVar2 != null && cVar2.f97f == cVar) {
            return true;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f97f;
        return cVar4 != null && cVar4.f97f == cVar3;
    }

    public final boolean v() {
        c cVar = this.I;
        c cVar2 = cVar.f97f;
        if (cVar2 != null && cVar2.f97f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f97f;
        return cVar4 != null && cVar4.f97f == cVar3;
    }

    public final boolean w() {
        return this.f113g && this.f112f0 != 8;
    }

    public boolean x() {
        if (this.j) {
            return true;
        }
        return this.H.f94c && this.J.f94c;
    }

    public boolean y() {
        if (this.f120k) {
            return true;
        }
        return this.I.f94c && this.K.f94c;
    }

    public void z() {
        this.H.j();
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.S = null;
        this.C = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f102a0 = 0;
        this.f104b0 = 0;
        this.f106c0 = 0.5f;
        this.f108d0 = 0.5f;
        int[] iArr = this.f129o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f110e0 = null;
        this.f112f0 = 0;
        this.f116h0 = 0;
        this.f118i0 = 0;
        float[] fArr = this.f119j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f126n = -1;
        this.f128o = -1;
        int[] iArr2 = this.B;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f131q = 0;
        this.f132r = 0;
        this.f136v = 1.0f;
        this.f139y = 1.0f;
        this.f135u = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f138x = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f134t = 0;
        this.f137w = 0;
        this.f140z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f111f;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f113g = true;
        int[] iArr3 = this.f133s;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f115h = -1;
        this.f117i = -1;
    }
}
