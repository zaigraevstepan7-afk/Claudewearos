package f0;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final q.g0 f6206a;

    /* renamed from: b, reason: collision with root package name */
    public ak.x f6207b;

    /* renamed from: c, reason: collision with root package name */
    public final q.h0 f6208c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6209d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6210e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6211f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6212g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6213h;

    /* renamed from: i, reason: collision with root package name */
    public final v1.o f6214i;

    public y() {
        long[] jArr = q.n0.f13108a;
        this.f6206a = new q.g0();
        q.h0 h0Var = q.o0.f13110a;
        this.f6208c = new q.h0();
        this.f6209d = new ArrayList();
        this.f6210e = new ArrayList();
        this.f6211f = new ArrayList();
        this.f6212g = new ArrayList();
        this.f6213h = new ArrayList();
        this.f6214i = new v(this);
    }

    public static int e(int[] iArr, h0 h0Var) {
        int iJ = h0Var.j();
        int iD = h0Var.d() + iJ;
        int iMax = 0;
        while (iJ < iD) {
            int iC = h0Var.c() + iArr[iJ];
            iArr[iJ] = iC;
            iMax = Math.max(iMax, iC);
            iJ++;
        }
        return iMax;
    }

    public final void a(int i10, Object obj) {
        m6.a.q(this.f6206a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f6213h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        m6.a.q(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r27, int r28, java.util.ArrayList r29, ak.x r30, f0.i0 r31, boolean r32, int r33, boolean r34, int r35, int r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.y.c(int, int, java.util.ArrayList, ak.x, f0.i0, boolean, int, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r15 = this;
            q.g0 r0 = r15.f6206a
            boolean r1 = r0.j()
            if (r1 == 0) goto L50
            java.lang.Object[] r1 = r0.f13075c
            long[] r2 = r0.f13073a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4d
            r4 = 0
            r5 = r4
        L13:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L48
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L46
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3c
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L3c:
            int r0 = r5 << 3
            int r0 = r0 + r10
            r0 = r1[r0]
            m6.a.q(r0)
            r0 = 0
            throw r0
        L46:
            if (r8 != r9) goto L4d
        L48:
            if (r5 == r3) goto L4d
            int r5 = r5 + 1
            goto L13
        L4d:
            r0.a()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.y.d():void");
    }
}
