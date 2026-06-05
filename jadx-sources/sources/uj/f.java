package uj;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ti.h f17106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17107b;

    /* renamed from: c, reason: collision with root package name */
    public final sj.a f17108c;

    /* renamed from: d, reason: collision with root package name */
    public final tj.e f17109d;

    public f(tj.e eVar, ti.h hVar, int i10, sj.a aVar) {
        this.f17106a = hVar;
        this.f17107b = i10;
        this.f17108c = aVar;
        this.f17109d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // uj.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tj.e a(ti.h r5, int r6, sj.a r7) {
        /*
            r4 = this;
            ti.h r0 = r4.f17106a
            ti.h r5 = r5.V(r0)
            sj.a r1 = sj.a.f15039a
            sj.a r2 = r4.f17108c
            int r3 = r4.f17107b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = fj.l.b(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            uj.f r5 = r4.b(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.f.a(ti.h, int, sj.a):tj.e");
    }

    public abstract f b(ti.h hVar, int i10, sj.a aVar);

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // tj.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tj.f r5, ti.c r6) {
        /*
            r4 = this;
            int r0 = r4.f17107b
            r1 = -3
            if (r0 != r1) goto L70
            ti.h r0 = r6.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            lb.d r2 = new lb.d
            r3 = 23
            r2.<init>(r3)
            ti.h r3 = r4.f17106a
            java.lang.Object r1 = r3.F(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L25
            ti.h r1 = r0.V(r3)
            goto L2a
        L25:
            r1 = 0
            ti.h r1 = qj.b0.k(r0, r3, r1)
        L2a:
            boolean r2 = fj.l.b(r1, r0)
            if (r2 == 0) goto L39
            java.lang.Object r5 = r4.e(r5, r6)
            ui.a r6 = ui.a.f17085a
            if (r5 != r6) goto L88
            return r5
        L39:
            ti.d r2 = ti.d.f16335a
            ti.f r3 = r1.C(r2)
            ti.f r0 = r0.C(r2)
            boolean r0 = fj.l.b(r3, r0)
            if (r0 == 0) goto L70
            ti.h r0 = r6.getContext()
            boolean r2 = r5 instanceof uj.s
            if (r2 != 0) goto L5c
            boolean r2 = r5 instanceof uj.n
            if (r2 == 0) goto L56
            goto L5c
        L56:
            d1.h r2 = new d1.h
            r2.<init>(r5, r0)
            r5 = r2
        L5c:
            uj.e r0 = new uj.e
            r2 = 0
            r3 = 1
            r0.<init>(r4, r2, r3)
            java.lang.Object r2 = vj.b.m(r1)
            java.lang.Object r5 = uj.c.a(r1, r5, r2, r0, r6)
            ui.a r6 = ui.a.f17085a
            if (r5 != r6) goto L88
            return r5
        L70:
            ab.s r0 = new ab.s
            r1 = 0
            r2 = 24
            r0.<init>(r5, r4, r1, r2)
            java.lang.Object r5 = qj.b0.h(r0, r6)
            ui.a r6 = ui.a.f17085a
            if (r5 != r6) goto L81
            goto L83
        L81:
            pi.o r5 = pi.o.f13011a
        L83:
            ui.a r6 = ui.a.f17085a
            if (r5 != r6) goto L88
            return r5
        L88:
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.f.c(tj.f, ti.c):java.lang.Object");
    }

    public tj.e d() {
        return null;
    }

    public abstract Object e(tj.f fVar, ti.c cVar);

    public final String f() {
        ArrayList arrayList = new ArrayList(4);
        ti.i iVar = ti.i.f16336a;
        ti.h hVar = this.f17106a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i10 = this.f17107b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        sj.a aVar = sj.a.f15039a;
        sj.a aVar2 = this.f17108c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return m6.a.i(sb2, qi.l.E0(arrayList, ", ", null, null, null, 62), ']');
    }

    public final String toString() {
        return this.f17109d + " -> " + f();
    }
}
