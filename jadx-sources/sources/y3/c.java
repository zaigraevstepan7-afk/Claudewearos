package y3;

import java.util.Arrays;
import p1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f20175p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f20176q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final d f20179c;

    /* renamed from: f, reason: collision with root package name */
    public b[] f20182f;

    /* renamed from: l, reason: collision with root package name */
    public final l f20187l;

    /* renamed from: o, reason: collision with root package name */
    public b f20190o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20177a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f20178b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f20180d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f20181e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20183g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f20184h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f20185i = 1;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f20186k = 32;

    /* renamed from: m, reason: collision with root package name */
    public f[] f20188m = new f[f20176q];

    /* renamed from: n, reason: collision with root package name */
    public int f20189n = 0;

    public c() {
        this.f20182f = null;
        this.f20182f = new b[32];
        s();
        l lVar = new l(21, false);
        lVar.f12660b = new s4.b();
        lVar.f12661c = new s4.b();
        lVar.f12662d = new f[32];
        this.f20187l = lVar;
        d dVar = new d(lVar);
        dVar.f20191f = new f[128];
        dVar.f20192g = new f[128];
        dVar.f20193h = 0;
        dVar.f20194i = new qh.c(dVar, 19);
        this.f20179c = dVar;
        this.f20190o = new b(lVar);
    }

    public static int n(Object obj) {
        f fVar = ((a4.c) obj).f100i;
        if (fVar != null) {
            return (int) (fVar.f20200e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i10) {
        s4.b bVar = (s4.b) this.f20187l.f12661c;
        int i11 = bVar.f14762b;
        f fVar = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            ?? r32 = bVar.f14761a;
            ?? r42 = r32[i12];
            r32[i12] = 0;
            bVar.f14762b = i12;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i10);
            fVar2.E = i10;
        } else {
            fVar2.e();
            fVar2.E = i10;
        }
        int i13 = this.f20189n;
        int i14 = f20176q;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            f20176q = i15;
            this.f20188m = (f[]) Arrays.copyOf(this.f20188m, i15);
        }
        f[] fVarArr = this.f20188m;
        int i16 = this.f20189n;
        this.f20189n = i16 + 1;
        fVarArr[i16] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i10, float f10, f fVar3, f fVar4, int i11, int i12) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f20173d.g(fVar, 1.0f);
            bVarL.f20173d.g(fVar4, 1.0f);
            bVarL.f20173d.g(fVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f20173d.g(fVar, 1.0f);
            bVarL.f20173d.g(fVar2, -1.0f);
            bVarL.f20173d.g(fVar3, -1.0f);
            bVarL.f20173d.g(fVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                bVarL.f20171b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f20173d.g(fVar, -1.0f);
            bVarL.f20173d.g(fVar2, 1.0f);
            bVarL.f20171b = i10;
        } else if (f10 >= 1.0f) {
            bVarL.f20173d.g(fVar4, -1.0f);
            bVarL.f20173d.g(fVar3, 1.0f);
            bVarL.f20171b = -i11;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f20173d.g(fVar, f11 * 1.0f);
            bVarL.f20173d.g(fVar2, f11 * (-1.0f));
            bVarL.f20173d.g(fVar3, (-1.0f) * f10);
            bVarL.f20173d.g(fVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                bVarL.f20171b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            bVarL.a(this, i12);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(y3.b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.c.c(y3.b):void");
    }

    public final void d(f fVar, int i10) {
        int i11 = fVar.f20198c;
        if (i11 == -1) {
            fVar.f(this, i10);
            for (int i12 = 0; i12 < this.f20178b + 1; i12++) {
                f fVar2 = ((f[]) this.f20187l.f12662d)[i12];
            }
            return;
        }
        if (i11 == -1) {
            b bVarL = l();
            bVarL.f20170a = fVar;
            float f10 = i10;
            fVar.f20200e = f10;
            bVarL.f20171b = f10;
            bVarL.f20174e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f20182f[i11];
        if (bVar.f20174e) {
            bVar.f20171b = i10;
            return;
        }
        if (bVar.f20173d.d() == 0) {
            bVar.f20174e = true;
            bVar.f20171b = i10;
            return;
        }
        b bVarL2 = l();
        if (i10 < 0) {
            bVarL2.f20171b = i10 * (-1);
            bVarL2.f20173d.g(fVar, 1.0f);
        } else {
            bVarL2.f20171b = i10;
            bVarL2.f20173d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i10, int i11) {
        if (i11 == 8 && fVar2.f20201f && fVar.f20198c == -1) {
            fVar.f(this, fVar2.f20200e + i10);
            return;
        }
        b bVarL = l();
        boolean z2 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z2 = true;
            }
            bVarL.f20171b = i10;
        }
        if (z2) {
            bVarL.f20173d.g(fVar, 1.0f);
            bVarL.f20173d.g(fVar2, -1.0f);
        } else {
            bVarL.f20173d.g(fVar, -1.0f);
            bVarL.f20173d.g(fVar2, 1.0f);
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f20199d = 0;
        bVarL.b(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f20173d.g(j(i11), (int) (bVarL.f20173d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f20199d = 0;
        bVarL.c(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f20173d.g(j(i11), (int) (bVarL.f20173d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f20174e) {
            bVar.f20170a.f(this, bVar.f20171b);
        } else {
            b[] bVarArr = this.f20182f;
            int i11 = this.j;
            bVarArr[i11] = bVar;
            f fVar = bVar.f20170a;
            fVar.f20198c = i11;
            this.j = i11 + 1;
            fVar.i(this, bVar);
        }
        if (this.f20177a) {
            int i12 = 0;
            while (i12 < this.j) {
                if (this.f20182f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f20182f[i12];
                if (bVar2 != null && bVar2.f20174e) {
                    bVar2.f20170a.f(this, bVar2.f20171b);
                    ((s4.b) this.f20187l.f12660b).b(bVar2);
                    this.f20182f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f20182f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        f fVar2 = bVar3.f20170a;
                        if (fVar2.f20198c == i13) {
                            fVar2.f20198c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f20182f[i14] = null;
                    }
                    this.j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f20177a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.j; i10++) {
            b bVar = this.f20182f[i10];
            bVar.f20170a.f20200e = bVar.f20171b;
        }
    }

    public final f j(int i10) {
        if (this.f20185i + 1 >= this.f20181e) {
            o();
        }
        f fVarA = a(4);
        float[] fArr = fVarA.A;
        int i11 = this.f20178b + 1;
        this.f20178b = i11;
        this.f20185i++;
        fVarA.f20197b = i11;
        fVarA.f20199d = i10;
        ((f[]) this.f20187l.f12662d)[i11] = fVarA;
        d dVar = this.f20179c;
        dVar.f20194i.f13507b = fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f20199d] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f20185i + 1 >= this.f20181e) {
            o();
        }
        if (!(obj instanceof a4.c)) {
            return null;
        }
        a4.c cVar = (a4.c) obj;
        f fVar = cVar.f100i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.f100i;
        }
        int i10 = fVar.f20197b;
        l lVar = this.f20187l;
        if (i10 != -1 && i10 <= this.f20178b && ((f[]) lVar.f12662d)[i10] != null) {
            return fVar;
        }
        if (i10 != -1) {
            fVar.e();
        }
        int i11 = this.f20178b + 1;
        this.f20178b = i11;
        this.f20185i++;
        fVar.f20197b = i11;
        fVar.E = 1;
        ((f[]) lVar.f12662d)[i11] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        l lVar = this.f20187l;
        s4.b bVar = (s4.b) lVar.f12660b;
        int i10 = bVar.f14762b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = bVar.f14761a;
            obj = objArr[i11];
            objArr[i11] = null;
            bVar.f14762b = i11;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(lVar);
        }
        bVar2.f20170a = null;
        bVar2.f20173d.b();
        bVar2.f20171b = 0.0f;
        bVar2.f20174e = false;
        return bVar2;
    }

    public final f m() {
        if (this.f20185i + 1 >= this.f20181e) {
            o();
        }
        f fVarA = a(3);
        int i10 = this.f20178b + 1;
        this.f20178b = i10;
        this.f20185i++;
        fVarA.f20197b = i10;
        ((f[]) this.f20187l.f12662d)[i10] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i10 = this.f20180d * 2;
        this.f20180d = i10;
        this.f20182f = (b[]) Arrays.copyOf(this.f20182f, i10);
        l lVar = this.f20187l;
        lVar.f12662d = (f[]) Arrays.copyOf((f[]) lVar.f12662d, this.f20180d);
        int i11 = this.f20180d;
        this.f20184h = new boolean[i11];
        this.f20181e = i11;
        this.f20186k = i11;
    }

    public final void p() {
        d dVar = this.f20179c;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f20183g) {
            q(dVar);
            return;
        }
        for (int i10 = 0; i10 < this.j; i10++) {
            if (!this.f20182f[i10].f20174e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.j) {
                break;
            }
            b bVar = this.f20182f[i10];
            int i11 = 1;
            if (bVar.f20170a.E != 1) {
                float f10 = 0.0f;
                if (bVar.f20171b < 0.0f) {
                    boolean z2 = false;
                    int i12 = 0;
                    while (!z2) {
                        i12 += i11;
                        float f11 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.j) {
                            b bVar2 = this.f20182f[i15];
                            if (bVar2.f20170a.E != i11 && !bVar2.f20174e && bVar2.f20171b < f10) {
                                int iD = bVar2.f20173d.d();
                                int i17 = 0;
                                while (i17 < iD) {
                                    f fVarE = bVar2.f20173d.e(i17);
                                    float fC = bVar2.f20173d.c(fVarE);
                                    if (fC > f10) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = fVarE.f20202z[i18] / fC;
                                            if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = fVarE.f20197b;
                                                i13 = i15;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i17++;
                                    f10 = 0.0f;
                                }
                            }
                            i15++;
                            f10 = 0.0f;
                            i11 = 1;
                        }
                        if (i13 != -1) {
                            b bVar3 = this.f20182f[i13];
                            bVar3.f20170a.f20198c = -1;
                            bVar3.g(((f[]) this.f20187l.f12662d)[i14]);
                            f fVar = bVar3.f20170a;
                            fVar.f20198c = i13;
                            fVar.i(this, bVar3);
                        } else {
                            z2 = true;
                        }
                        if (i12 > this.f20185i / 2) {
                            z2 = true;
                        }
                        f10 = 0.0f;
                        i11 = 1;
                    }
                }
            }
            i10++;
        }
        r(dVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(y3.b r17) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.c.r(y3.b):void");
    }

    public final void s() {
        for (int i10 = 0; i10 < this.j; i10++) {
            b bVar = this.f20182f[i10];
            if (bVar != null) {
                ((s4.b) this.f20187l.f12660b).b(bVar);
            }
            this.f20182f[i10] = null;
        }
    }

    public final void t() {
        l lVar;
        int i10 = 0;
        while (true) {
            lVar = this.f20187l;
            f[] fVarArr = (f[]) lVar.f12662d;
            if (i10 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i10];
            if (fVar != null) {
                fVar.e();
            }
            i10++;
        }
        s4.b bVar = (s4.b) lVar.f12661c;
        f[] fVarArr2 = this.f20188m;
        int length = this.f20189n;
        bVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            f fVar2 = fVarArr2[i11];
            int i12 = bVar.f14762b;
            Object[] objArr = bVar.f14761a;
            if (i12 < objArr.length) {
                objArr[i12] = fVar2;
                bVar.f14762b = i12 + 1;
            }
        }
        this.f20189n = 0;
        Arrays.fill((f[]) lVar.f12662d, (Object) null);
        this.f20178b = 0;
        d dVar = this.f20179c;
        dVar.f20193h = 0;
        dVar.f20171b = 0.0f;
        this.f20185i = 1;
        for (int i13 = 0; i13 < this.j; i13++) {
            b bVar2 = this.f20182f[i13];
        }
        s();
        this.j = 0;
        this.f20190o = new b(lVar);
    }
}
