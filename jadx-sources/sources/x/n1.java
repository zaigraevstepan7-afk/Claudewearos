package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final l2 f19651a;

    /* renamed from: b, reason: collision with root package name */
    public final fj.a f19652b;

    /* renamed from: c, reason: collision with root package name */
    public s3.c f19653c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19654d;

    /* renamed from: e, reason: collision with root package name */
    public final qh.c f19655e = new qh.c(18);

    /* JADX WARN: Multi-variable type inference failed */
    public n1(l2 l2Var, ej.e eVar, s3.c cVar) {
        this.f19651a = l2Var;
        this.f19652b = (fj.a) eVar;
        this.f19653c = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static void a(p2.n nVar) {
        ?? r32 = nVar.f12734a;
        int size = r32.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p2.w) r32.get(i10)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ej.e r6, vi.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof x.m1
            if (r0 == 0) goto L13
            r0 = r7
            x.m1 r0 = (x.m1) r0
            int r1 = r0.f19631c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19631c = r1
            goto L18
        L13:
            x.m1 r0 = new x.m1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f19629a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19631c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r7)
            goto L4e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            uk.c.R(r7)
            r5.f19654d = r3
            t0.f r7 = new t0.f
            r2 = 0
            r4 = 20
            r7.<init>(r5, r6, r2, r4)
            r0.f19631c = r3
            qj.t1 r6 = new qj.t1
            ti.h r2 = r0.getContext()
            r6.<init>(r0, r2)
            java.lang.Object r6 = u0.l.o(r6, r3, r6, r7)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = 0
            r5.f19654d = r6
            pi.o r6 = pi.o.f13011a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.n1.b(ej.e, vi.c):java.lang.Object");
    }
}
