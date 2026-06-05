package p2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12730a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f12731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(long j, o0 o0Var, ti.c cVar) {
        super(2, cVar);
        this.f12732c = j;
        this.f12733d = o0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f12730a) {
            case 0:
                return new m0(this.f12732c, (o0) this.f12733d, cVar);
            default:
                return new m0((v3.h) this.f12733d, this.f12732c, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f12730a) {
        }
        return ((m0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f12730a
            switch(r0) {
                case 0: goto L31;
                default: goto L5;
            }
        L5:
            ui.a r0 = ui.a.f17085a
            int r1 = r10.f12731b
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            uk.c.R(r11)
            goto L2e
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            uk.c.R(r11)
            java.lang.Object r11 = r10.f12733d
            v3.h r11 = (v3.h) r11
            o2.d r11 = r11.f17828a
            r10.f12731b = r2
            long r1 = r10.f12732c
            java.lang.Object r11 = r11.b(r1, r10)
            if (r11 != r0) goto L2e
            goto L30
        L2e:
            pi.o r0 = pi.o.f13011a
        L30:
            return r0
        L31:
            ui.a r0 = ui.a.f17085a
            int r1 = r10.f12731b
            r2 = 8
            long r4 = r10.f12732c
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L51
            if (r1 == r7) goto L4d
            if (r1 != r6) goto L45
            uk.c.R(r11)
            goto L68
        L45:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L4d:
            uk.c.R(r11)
            goto L5f
        L51:
            uk.c.R(r11)
            long r8 = r4 - r2
            r10.f12731b = r7
            java.lang.Object r11 = qj.b0.i(r8, r10)
            if (r11 != r0) goto L5f
            goto L7e
        L5f:
            r10.f12731b = r6
            java.lang.Object r11 = qj.b0.i(r2, r10)
            if (r11 != r0) goto L68
            goto L7e
        L68:
            java.lang.Object r11 = r10.f12733d
            p2.o0 r11 = (p2.o0) r11
            qj.l r11 = r11.f12749c
            if (r11 == 0) goto L7c
            p2.p r0 = new p2.p
            r0.<init>(r4)
            pi.j r0 = uk.c.r(r0)
            r11.resumeWith(r0)
        L7c:
            pi.o r0 = pi.o.f13011a
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(v3.h hVar, long j, ti.c cVar) {
        super(2, cVar);
        this.f12733d = hVar;
        this.f12732c = j;
    }
}
