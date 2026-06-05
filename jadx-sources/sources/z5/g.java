package z5;

import android.util.LogPrinter;
import android.util.Pair;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import t4.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20388a;

    /* renamed from: d, reason: collision with root package name */
    public p1.l f20391d;

    /* renamed from: f, reason: collision with root package name */
    public p1.l f20393f;

    /* renamed from: h, reason: collision with root package name */
    public p1.l f20395h;
    public int[] j;

    /* renamed from: l, reason: collision with root package name */
    public int[] f20398l;

    /* renamed from: n, reason: collision with root package name */
    public e[] f20400n;

    /* renamed from: p, reason: collision with root package name */
    public int[] f20402p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20404r;

    /* renamed from: t, reason: collision with root package name */
    public int[] f20406t;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GridLayout f20410x;

    /* renamed from: b, reason: collision with root package name */
    public int f20389b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f20390c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20392e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20394g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20396i = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20397k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20399m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20401o = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20403q = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20405s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20407u = true;

    /* renamed from: v, reason: collision with root package name */
    public final k f20408v = new k(0);

    /* renamed from: w, reason: collision with root package name */
    public final k f20409w = new k(-100000);

    public g(GridLayout gridLayout, boolean z2) {
        this.f20410x = gridLayout;
        this.f20388a = z2;
    }

    public static void k(ArrayList arrayList, i iVar, k kVar, boolean z2) {
        if (iVar.a() == 0) {
            return;
        }
        if (z2) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((e) obj).f20383a.equals(iVar)) {
                    return;
                }
            }
        }
        arrayList.add(new e(iVar, kVar));
    }

    public static boolean n(int[] iArr, e eVar) {
        if (!eVar.f20385c) {
            return false;
        }
        i iVar = eVar.f20383a;
        int i10 = iVar.f20414a;
        int i11 = iVar.f20415b;
        int i12 = iArr[i10] + eVar.f20384b.f20430a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final String a(ArrayList arrayList) {
        String str;
        String str2 = this.f20388a ? "x" : "y";
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        boolean z2 = true;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            if (z2) {
                z2 = false;
            } else {
                sb2.append(", ");
            }
            i iVar = eVar.f20383a;
            int i11 = iVar.f20414a;
            int i12 = iVar.f20415b;
            int i13 = eVar.f20384b.f20430a;
            if (i11 < i12) {
                str = str2 + i12 + "-" + str2 + i11 + ">=" + i13;
            } else {
                str = str2 + i11 + "-" + str2 + i12 + "<=" + (-i13);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void b(p1.l lVar, boolean z2) {
        for (k kVar : (k[]) ((Object[]) lVar.f12662d)) {
            kVar.f20430a = Integer.MIN_VALUE;
        }
        h[] hVarArr = (h[]) ((Object[]) g().f12662d);
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            int iD = hVarArr[i10].d(z2);
            k kVar2 = (k) ((Object[]) lVar.f12662d)[((int[]) lVar.f12660b)[i10]];
            int i11 = kVar2.f20430a;
            if (!z2) {
                iD = -iD;
            }
            kVar2.f20430a = Math.max(i11, iD);
        }
    }

    public final void c(boolean z2) {
        int[] iArr = z2 ? this.j : this.f20398l;
        GridLayout gridLayout = this.f20410x;
        int childCount = gridLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = gridLayout.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                j jVar = (j) childAt.getLayoutParams();
                boolean z10 = this.f20388a;
                i iVar = (z10 ? jVar.f20429b : jVar.f20428a).f20433b;
                int i11 = z2 ? iVar.f20414a : iVar.f20415b;
                iArr[i11] = Math.max(iArr[i11], gridLayout.f(childAt, z10, z2));
            }
        }
    }

    public final p1.l d(boolean z2) {
        i iVar;
        f fVar = new f(i.class, k.class);
        l[] lVarArr = (l[]) ((Object[]) g().f12661c);
        int length = lVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z2) {
                iVar = lVarArr[i10].f20433b;
            } else {
                i iVar2 = lVarArr[i10].f20433b;
                iVar = new i(iVar2.f20415b, iVar2.f20414a);
            }
            k kVar = new k();
            kVar.f20430a = Integer.MIN_VALUE;
            fVar.add(Pair.create(iVar, kVar));
        }
        return fVar.b();
    }

    public final e[] e() {
        if (this.f20400n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f20393f == null) {
                this.f20393f = d(true);
            }
            if (!this.f20394g) {
                b(this.f20393f, true);
                this.f20394g = true;
            }
            p1.l lVar = this.f20393f;
            int i10 = 0;
            while (true) {
                i[] iVarArr = (i[]) ((Object[]) lVar.f12661c);
                if (i10 >= iVarArr.length) {
                    break;
                }
                k(arrayList, iVarArr[i10], ((k[]) ((Object[]) lVar.f12662d))[i10], false);
                i10++;
            }
            if (this.f20395h == null) {
                this.f20395h = d(false);
            }
            if (!this.f20396i) {
                b(this.f20395h, false);
                this.f20396i = true;
            }
            p1.l lVar2 = this.f20395h;
            int i11 = 0;
            while (true) {
                i[] iVarArr2 = (i[]) ((Object[]) lVar2.f12661c);
                if (i11 >= iVarArr2.length) {
                    break;
                }
                k(arrayList2, iVarArr2[i11], ((k[]) ((Object[]) lVar2.f12662d))[i11], false);
                i11++;
            }
            if (this.f20407u) {
                int i12 = 0;
                while (i12 < f()) {
                    int i13 = i12 + 1;
                    k(arrayList, new i(i12, i13), new k(0), true);
                    i12 = i13;
                }
            }
            int iF = f();
            k(arrayList, new i(0, iF), this.f20408v, false);
            k(arrayList2, new i(iF, 0), this.f20409w, false);
            e[] eVarArrR = r(arrayList);
            e[] eVarArrR2 = r(arrayList2);
            LogPrinter logPrinter = GridLayout.B;
            Object[] objArr = (Object[]) Array.newInstance(e[].class.getComponentType(), eVarArrR.length + eVarArrR2.length);
            System.arraycopy(eVarArrR, 0, objArr, 0, eVarArrR.length);
            System.arraycopy(eVarArrR2, 0, objArr, eVarArrR.length, eVarArrR2.length);
            this.f20400n = (e[]) objArr;
        }
        if (!this.f20401o) {
            if (this.f20393f == null) {
                this.f20393f = d(true);
            }
            if (!this.f20394g) {
                b(this.f20393f, true);
                this.f20394g = true;
            }
            if (this.f20395h == null) {
                this.f20395h = d(false);
            }
            if (!this.f20396i) {
                b(this.f20395h, false);
                this.f20396i = true;
            }
            this.f20401o = true;
        }
        return this.f20400n;
    }

    public final int f() {
        return Math.max(this.f20389b, i());
    }

    public final p1.l g() {
        int iE;
        int i10;
        p1.l lVar = this.f20391d;
        boolean z2 = this.f20388a;
        GridLayout gridLayout = this.f20410x;
        if (lVar == null) {
            f fVar = new f(l.class, h.class);
            int childCount = gridLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                j jVar = (j) gridLayout.getChildAt(i11).getLayoutParams();
                l lVar2 = z2 ? jVar.f20429b : jVar.f20428a;
                fVar.add(Pair.create(lVar2, lVar2.a(z2).h()));
            }
            this.f20391d = fVar.b();
        }
        if (!this.f20392e) {
            for (h hVar : (h[]) ((Object[]) this.f20391d.f12662d)) {
                hVar.c();
            }
            int childCount2 = gridLayout.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt = gridLayout.getChildAt(i12);
                j jVar2 = (j) childAt.getLayoutParams();
                l lVar3 = z2 ? jVar2.f20429b : jVar2.f20428a;
                if (childAt.getVisibility() == 8) {
                    iE = 0;
                } else {
                    iE = gridLayout.e(childAt, z2, false) + gridLayout.e(childAt, z2, true) + (z2 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (lVar3.f20435d == 0.0f) {
                    i10 = 0;
                } else {
                    if (this.f20406t == null) {
                        this.f20406t = new int[gridLayout.getChildCount()];
                    }
                    i10 = this.f20406t[i12];
                }
                int i13 = iE + i10;
                p1.l lVar4 = this.f20391d;
                h hVar2 = (h) ((Object[]) lVar4.f12662d)[((int[]) lVar4.f12660b)[i12]];
                hVar2.f20413c = ((lVar3.f20434c == GridLayout.J && lVar3.f20435d == 0.0f) ? 0 : 2) & hVar2.f20413c;
                u0.b bVarA = lVar3.a(z2);
                int i14 = m0.f15749a;
                int iG = bVarA.g(childAt, i13, gridLayout.getLayoutMode());
                hVar2.b(iG, i13 - iG);
            }
            this.f20392e = true;
        }
        return this.f20391d;
    }

    public final int[] h() {
        boolean z2;
        if (this.f20402p == null) {
            this.f20402p = new int[f() + 1];
        }
        if (!this.f20403q) {
            int[] iArr = this.f20402p;
            boolean z10 = this.f20405s;
            GridLayout gridLayout = this.f20410x;
            float f10 = 0.0f;
            boolean z11 = this.f20388a;
            if (!z10) {
                int childCount = gridLayout.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z2 = false;
                        break;
                    }
                    View childAt = gridLayout.getChildAt(i10);
                    if (childAt.getVisibility() != 8) {
                        j jVar = (j) childAt.getLayoutParams();
                        if ((z11 ? jVar.f20429b : jVar.f20428a).f20435d != 0.0f) {
                            z2 = true;
                            break;
                        }
                    }
                    i10++;
                }
                this.f20404r = z2;
                this.f20405s = true;
            }
            if (this.f20404r) {
                if (this.f20406t == null) {
                    this.f20406t = new int[gridLayout.getChildCount()];
                }
                Arrays.fill(this.f20406t, 0);
                q(e(), iArr, true);
                int childCount2 = (gridLayout.getChildCount() * this.f20408v.f20430a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        View childAt2 = gridLayout.getChildAt(i11);
                        if (childAt2.getVisibility() != 8) {
                            j jVar2 = (j) childAt2.getLayoutParams();
                            f10 += (z11 ? jVar2.f20429b : jVar2.f20428a).f20435d;
                        }
                    }
                    int i12 = -1;
                    boolean z12 = true;
                    int i13 = 0;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        m();
                        p(f10, i14);
                        boolean zQ = q(e(), iArr, false);
                        if (zQ) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z12 = zQ;
                    }
                    if (i12 > 0 && !z12) {
                        m();
                        p(f10, i12);
                        q(e(), iArr, true);
                    }
                }
            } else {
                q(e(), iArr, true);
            }
            if (!this.f20407u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.f20403q = true;
        }
        return this.f20402p;
    }

    public final int i() {
        if (this.f20390c == Integer.MIN_VALUE) {
            GridLayout gridLayout = this.f20410x;
            int childCount = gridLayout.getChildCount();
            int iMax = -1;
            for (int i10 = 0; i10 < childCount; i10++) {
                j jVar = (j) gridLayout.getChildAt(i10).getLayoutParams();
                i iVar = (this.f20388a ? jVar.f20429b : jVar.f20428a).f20433b;
                iMax = Math.max(Math.max(Math.max(iMax, iVar.f20414a), iVar.f20415b), iVar.a());
            }
            this.f20390c = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
        }
        return this.f20390c;
    }

    public final int j(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        k kVar = this.f20409w;
        k kVar2 = this.f20408v;
        if (mode == Integer.MIN_VALUE) {
            kVar2.f20430a = 0;
            kVar.f20430a = -size;
            this.f20403q = false;
            return h()[f()];
        }
        if (mode == 0) {
            kVar2.f20430a = 0;
            kVar.f20430a = -100000;
            this.f20403q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        kVar2.f20430a = size;
        kVar.f20430a = -size;
        this.f20403q = false;
        return h()[f()];
    }

    public final void l() {
        this.f20390c = Integer.MIN_VALUE;
        this.f20391d = null;
        this.f20393f = null;
        this.f20395h = null;
        this.j = null;
        this.f20398l = null;
        this.f20400n = null;
        this.f20402p = null;
        this.f20406t = null;
        this.f20405s = false;
        m();
    }

    public final void m() {
        this.f20392e = false;
        this.f20394g = false;
        this.f20396i = false;
        this.f20397k = false;
        this.f20399m = false;
        this.f20401o = false;
        this.f20403q = false;
    }

    public final void o(int i10) {
        if (i10 == Integer.MIN_VALUE || i10 >= i()) {
            this.f20389b = i10;
        } else {
            GridLayout.g((this.f20388a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(float f10, int i10) {
        Arrays.fill(this.f20406t, 0);
        GridLayout gridLayout = this.f20410x;
        int childCount = gridLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = gridLayout.getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                j jVar = (j) childAt.getLayoutParams();
                float f11 = (this.f20388a ? jVar.f20429b : jVar.f20428a).f20435d;
                if (f11 != 0.0f) {
                    int iRound = Math.round((i10 * f11) / f10);
                    this.f20406t[i11] = iRound;
                    i10 -= iRound;
                    f10 -= f11;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(z5.e[] r13, int[] r14, boolean r15) {
        /*
            r12 = this;
            boolean r0 = r12.f20388a
            if (r0 == 0) goto L7
            java.lang.String r0 = "horizontal"
            goto L9
        L7:
            java.lang.String r0 = "vertical"
        L9:
            int r1 = r12.f()
            r2 = 1
            int r1 = r1 + r2
            r3 = 0
            r4 = 0
            r5 = r3
        L12:
            int r6 = r13.length
            if (r5 >= r6) goto Lc0
            java.util.Arrays.fill(r14, r3)
            r6 = r3
        L19:
            if (r6 >= r1) goto L82
            int r7 = r13.length
            r8 = r3
            r9 = r8
        L1e:
            if (r8 >= r7) goto L2a
            r10 = r13[r8]
            boolean r10 = n(r14, r10)
            r9 = r9 | r10
            int r8 = r8 + 1
            goto L1e
        L2a:
            if (r9 != 0) goto L7f
            if (r4 == 0) goto Lc0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L38:
            int r1 = r13.length
            if (r3 >= r1) goto L4e
            r1 = r13[r3]
            boolean r5 = r4[r3]
            if (r5 == 0) goto L44
            r14.add(r1)
        L44:
            boolean r5 = r1.f20385c
            if (r5 != 0) goto L4b
            r15.add(r1)
        L4b:
            int r3 = r3 + 1
            goto L38
        L4e:
            androidx.gridlayout.widget.GridLayout r13 = r12.f20410x
            android.util.Printer r13 = r13.A
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " constraints: "
            r1.append(r0)
            java.lang.String r14 = r12.a(r14)
            r1.append(r14)
            java.lang.String r14 = " are inconsistent; permanently removing: "
            r1.append(r14)
            java.lang.String r14 = r12.a(r15)
            r1.append(r14)
            java.lang.String r14 = ". "
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r13.println(r14)
            return r2
        L7f:
            int r6 = r6 + 1
            goto L19
        L82:
            if (r15 != 0) goto L85
            return r3
        L85:
            int r6 = r13.length
            boolean[] r6 = new boolean[r6]
            r7 = r3
        L89:
            if (r7 >= r1) goto La0
            int r8 = r13.length
            r9 = r3
        L8d:
            if (r9 >= r8) goto L9d
            boolean r10 = r6[r9]
            r11 = r13[r9]
            boolean r11 = n(r14, r11)
            r10 = r10 | r11
            r6[r9] = r10
            int r9 = r9 + 1
            goto L8d
        L9d:
            int r7 = r7 + 1
            goto L89
        La0:
            if (r5 != 0) goto La3
            r4 = r6
        La3:
            r7 = r3
        La4:
            int r8 = r13.length
            if (r7 >= r8) goto Lbc
            boolean r8 = r6[r7]
            if (r8 == 0) goto Lb9
            r8 = r13[r7]
            z5.i r9 = r8.f20383a
            int r10 = r9.f20414a
            int r9 = r9.f20415b
            if (r10 >= r9) goto Lb6
            goto Lb9
        Lb6:
            r8.f20385c = r3
            goto Lbc
        Lb9:
            int r7 = r7 + 1
            goto La4
        Lbc:
            int r5 = r5 + 1
            goto L12
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.g.q(z5.e[], int[], boolean):boolean");
    }

    public final e[] r(ArrayList arrayList) {
        pg.a aVar = new pg.a(this, (e[]) arrayList.toArray(new e[arrayList.size()]));
        int length = ((e[][]) aVar.f12884c).length;
        for (int i10 = 0; i10 < length; i10++) {
            aVar.h(i10);
        }
        return (e[]) aVar.f12883b;
    }
}
