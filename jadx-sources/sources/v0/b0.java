package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17358b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f17359c;

    /* renamed from: d, reason: collision with root package name */
    public int f17360d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f17361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j, fj.u uVar, ti.c cVar) {
        super(cVar);
        this.f17359c = j;
        this.f17362f = uVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17358b) {
            case 0:
                b0 b0Var = new b0(this.f17359c, (fj.u) this.f17362f, cVar);
                b0Var.f17361e = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((p2.w) this.f17362f, cVar);
                b0Var2.f17361e = obj;
                return b0Var2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        p2.o0 o0Var = (p2.o0) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17358b) {
        }
        return ((b0) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f17358b
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            ui.a r0 = ui.a.f17085a
            int r1 = r7.f17360d
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            long r3 = r7.f17359c
            java.lang.Object r1 = r7.f17361e
            p2.o0 r1 = (p2.o0) r1
            uk.c.R(r8)
            goto L47
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            uk.c.R(r8)
            java.lang.Object r8 = r7.f17361e
            p2.o0 r8 = (p2.o0) r8
            java.lang.Object r1 = r7.f17362f
            p2.w r1 = (p2.w) r1
            long r3 = r1.f12761b
            w2.h2 r1 = r8.C()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L39:
            r7.f17361e = r1
            r7.f17359c = r3
            r7.f17360d = r2
            r8 = 3
            java.lang.Object r8 = x.v2.b(r1, r7, r8)
            if (r8 != r0) goto L47
            goto L50
        L47:
            p2.w r8 = (p2.w) r8
            long r5 = r8.f12761b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L39
            r0 = r8
        L50:
            return r0
        L51:
            java.lang.Object r0 = r7.f17362f
            fj.u r0 = (fj.u) r0
            ui.a r1 = ui.a.f17085a
            int r2 = r7.f17360d
            r3 = 1
            if (r2 == 0) goto L6e
            if (r2 != r3) goto L66
            java.lang.Object r1 = r7.f17361e
            p2.o0 r1 = (p2.o0) r1
            uk.c.R(r8)
            goto L8a
        L66:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L6e:
            uk.c.R(r8)
            java.lang.Object r8 = r7.f17361e
            p2.o0 r8 = (p2.o0) r8
            long r4 = r7.f17359c
            uj.r r2 = new uj.r
            r6 = 1
            r2.<init>(r0, r6)
            r7.f17361e = r8
            r7.f17360d = r3
            java.lang.Object r2 = x.g0.c(r8, r4, r2, r7)
            if (r2 != r1) goto L88
            goto Lbc
        L88:
            r1 = r8
            r8 = r2
        L8a:
            p2.w r8 = (p2.w) r8
            if (r8 == 0) goto La2
            long r2 = r0.f6806a
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r4
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto La2
            v0.k r1 = v0.k.f17409b
            goto Lbc
        La2:
            p2.p0 r8 = r1.f12752f
            p2.n r8 = r8.L
            java.lang.Object r8 = r8.f12734a
            java.lang.Object r8 = qi.l.z0(r8)
            p2.w r8 = (p2.w) r8
            boolean r0 = p2.v.d(r8)
            if (r0 == 0) goto Lba
            r8.a()
            v0.k r1 = v0.k.f17408a
            goto Lbc
        Lba:
            v0.k r1 = v0.k.f17411d
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p2.w wVar, ti.c cVar) {
        super(cVar);
        this.f17362f = wVar;
    }
}
