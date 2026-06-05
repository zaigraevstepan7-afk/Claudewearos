package u0;

import g3.n0;
import t.m1;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f16546b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f16547c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.i f16548d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16549e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16550f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16551g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16552h;

    public m(String str, n0 n0Var, k3.i iVar, int i10, boolean z2, int i11, int i12) {
        this.f16546b = str;
        this.f16547c = n0Var;
        this.f16548d = iVar;
        this.f16549e = i10;
        this.f16550f = z2;
        this.f16551g = i11;
        this.f16552h = i12;
    }

    @Override // v2.x0
    public final v1.n d() {
        p pVar = new p();
        pVar.H = this.f16546b;
        pVar.I = this.f16547c;
        pVar.J = this.f16548d;
        pVar.K = this.f16549e;
        pVar.L = this.f16550f;
        pVar.M = this.f16551g;
        pVar.N = this.f16552h;
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return fj.l.b(this.f16546b, mVar.f16546b) && fj.l.b(this.f16547c, mVar.f16547c) && fj.l.b(this.f16548d, mVar.f16548d) && this.f16549e == mVar.f16549e && this.f16550f == mVar.f16550f && this.f16551g == mVar.f16551g && this.f16552h == mVar.f16552h;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // v2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(v1.n r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            u0.p r1 = (u0.p) r1
            r1.getClass()
            g3.n0 r2 = r1.I
            r3 = 0
            r4 = 1
            g3.n0 r5 = r0.f16547c
            if (r5 == r2) goto L1e
            g3.f0 r6 = r5.f7151a
            g3.f0 r2 = r2.f7151a
            boolean r2 = r6.b(r2)
            if (r2 == 0) goto L1c
            goto L21
        L1c:
            r2 = r4
            goto L22
        L1e:
            r5.getClass()
        L21:
            r2 = r3
        L22:
            java.lang.String r6 = r1.H
            java.lang.String r7 = r0.f16546b
            boolean r6 = fj.l.b(r6, r7)
            r8 = 0
            if (r6 == 0) goto L2e
            goto L33
        L2e:
            r1.H = r7
            r1.S = r8
            r3 = r4
        L33:
            g3.n0 r6 = r1.I
            boolean r6 = r6.c(r5)
            r6 = r6 ^ r4
            r1.I = r5
            int r5 = r1.N
            int r7 = r0.f16552h
            if (r5 == r7) goto L45
            r1.N = r7
            r6 = r4
        L45:
            int r5 = r1.M
            int r7 = r0.f16551g
            if (r5 == r7) goto L4e
            r1.M = r7
            r6 = r4
        L4e:
            boolean r5 = r1.L
            boolean r7 = r0.f16550f
            if (r5 == r7) goto L57
            r1.L = r7
            r6 = r4
        L57:
            k3.i r5 = r1.J
            k3.i r7 = r0.f16548d
            boolean r5 = fj.l.b(r5, r7)
            if (r5 != 0) goto L64
            r1.J = r7
            r6 = r4
        L64:
            int r5 = r1.K
            int r7 = r0.f16549e
            if (r5 != r7) goto L6c
            r4 = r6
            goto L6e
        L6c:
            r1.K = r7
        L6e:
            if (r2 != 0) goto L74
            if (r3 != 0) goto L74
            if (r4 == 0) goto L76
        L74:
            r1.Q = r8
        L76:
            if (r3 != 0) goto L7a
            if (r4 == 0) goto L91
        L7a:
            u0.g r9 = r1.q1()
            java.lang.String r10 = r1.H
            g3.n0 r11 = r1.I
            k3.i r12 = r1.J
            int r13 = r1.K
            boolean r14 = r1.L
            int r15 = r1.M
            int r5 = r1.N
            r16 = r5
            r9.f(r10, r11, r12, r13, r14, r15, r16)
        L91:
            boolean r5 = r1.G
            if (r5 != 0) goto L96
            goto Lb0
        L96:
            if (r3 != 0) goto L9e
            if (r2 == 0) goto La1
            u0.n r5 = r1.R
            if (r5 == 0) goto La1
        L9e:
            v2.n.o(r1)
        La1:
            if (r3 != 0) goto La5
            if (r4 == 0) goto Lab
        La5:
            v2.n.n(r1)
            v2.n.m(r1)
        Lab:
            if (r2 == 0) goto Lb0
            v2.n.m(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.m.g(v1.n):void");
    }

    public final int hashCode() {
        return (((gk.b.i(gk.b.g(this.f16549e, (this.f16548d.hashCode() + m1.d(this.f16547c, this.f16546b.hashCode() * 31, 31)) * 31, 31), 31, this.f16550f) + this.f16551g) * 31) + this.f16552h) * 31;
    }
}
