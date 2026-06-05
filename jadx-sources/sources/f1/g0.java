package f1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends p {

    /* renamed from: a, reason: collision with root package name */
    public final long f6301a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6302b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6303c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f6304d;

    /* renamed from: e, reason: collision with root package name */
    public final q.h0 f6305e;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f6306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f6307g;

    public g0(i0 i0Var, long j, boolean z2, boolean z10, ld.i iVar) {
        this.f6307g = i0Var;
        this.f6301a = j;
        this.f6302b = z2;
        this.f6303c = z10;
        q.h0 h0Var = q.o0.f13110a;
        this.f6305e = new q.h0();
        this.f6306f = new j1(p1.i.f12646d, f.f6291e);
    }

    @Override // f1.p
    public final void a(r rVar, ej.e eVar) {
        this.f6307g.f6314b.a(rVar, eVar);
    }

    @Override // f1.p
    public final q.h0 b(r rVar, h2 h2Var, ej.e eVar) {
        return this.f6307g.f6314b.b(rVar, h2Var, eVar);
    }

    @Override // f1.p
    public final void c() {
        i0 i0Var = this.f6307g;
        i0Var.A--;
    }

    @Override // f1.p
    public final boolean d() {
        return this.f6307g.f6314b.d();
    }

    @Override // f1.p
    public final boolean e() {
        return this.f6302b;
    }

    @Override // f1.p
    public final boolean f() {
        return this.f6303c;
    }

    @Override // f1.p
    public final long g() {
        return this.f6301a;
    }

    @Override // f1.p
    public final o h() {
        return this.f6307g.f6320h;
    }

    @Override // f1.p
    public final n1 i() {
        return (n1) this.f6306f.getValue();
    }

    @Override // f1.p
    public final ti.h j() {
        return this.f6307g.f6314b.j();
    }

    @Override // f1.p
    public final boolean k() {
        return this.f6307g.f6314b.k();
    }

    @Override // f1.p
    public final void l(r rVar) {
        i0 i0Var = this.f6307g;
        i0Var.f6314b.l(i0Var.f6320h);
        i0Var.f6314b.l(rVar);
    }

    @Override // f1.p
    public final u0 m(v0 v0Var) {
        return this.f6307g.f6314b.m(v0Var);
    }

    @Override // f1.p
    public final q.h0 n(r rVar, h2 h2Var, q.h0 h0Var) {
        return this.f6307g.f6314b.n(rVar, h2Var, h0Var);
    }

    @Override // f1.p
    public final void o(Set set) {
        HashSet hashSet = this.f6304d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f6304d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // f1.p
    public final void p(i0 i0Var) {
        this.f6305e.a(i0Var);
    }

    @Override // f1.p
    public final void q(t1 t1Var) {
        this.f6307g.f6314b.q(t1Var);
    }

    @Override // f1.p
    public final void r(r rVar) {
        this.f6307g.f6314b.r(rVar);
    }

    @Override // f1.p
    public final g s(a2.f0 f0Var) {
        return this.f6307g.f6314b.s(f0Var);
    }

    @Override // f1.p
    public final void t() {
        this.f6307g.A++;
    }

    @Override // f1.p
    public final void u(i0 i0Var) {
        HashSet hashSet = this.f6304d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                fj.l.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer");
                set.remove(i0Var.z());
            }
        }
        if (i0Var != null) {
            this.f6305e.l(i0Var);
        }
    }

    @Override // f1.p
    public final void v(r rVar) {
        this.f6307g.f6314b.v(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r17 = this;
            r0 = r17
            q.h0 r1 = r0.f6305e
            boolean r2 = r1.h()
            if (r2 == 0) goto L6a
            java.util.HashSet r2 = r0.f6304d
            if (r2 == 0) goto L67
            java.lang.Object[] r3 = r1.f13082b
            long[] r4 = r1.f13081a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L67
            r7 = 0
        L18:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L32:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            f1.i0 r13 = (f1.i0) r13
            java.util.Iterator r14 = r2.iterator()
        L48:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L5c
            java.lang.Object r15 = r14.next()
            java.util.Set r15 = (java.util.Set) r15
            u1.e r6 = r13.z()
            r15.remove(r6)
            goto L48
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r5) goto L67
            int r7 = r7 + 1
            goto L18
        L67:
            r1.b()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g0.w():void");
    }
}
