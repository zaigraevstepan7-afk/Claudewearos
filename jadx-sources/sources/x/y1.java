package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta.n f19761a = new ta.n(27);

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f19762b = new v1();

    /* renamed from: c, reason: collision with root package name */
    public static final u1 f19763c = new u1();

    /* renamed from: d, reason: collision with root package name */
    public static final w1 f19764d = new w1();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x.l2 r11, long r12, vi.c r14) {
        /*
            boolean r0 = r14 instanceof x.x1
            if (r0 == 0) goto L13
            r0 = r14
            x.x1 r0 = (x.x1) r0
            int r1 = r0.f19754d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19754d = r1
            goto L18
        L13:
            x.x1 r0 = new x.x1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f19753c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19754d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            fj.s r11 = r0.f19752b
            x.l2 r12 = r0.f19751a
            uk.c.R(r14)
            r8 = r11
            r11 = r12
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            uk.c.R(r14)
            fj.s r8 = new fj.s
            r8.<init>()
            v.f1 r14 = v.f1.f17189a
            k0.j1 r4 = new k0.j1
            r9 = 0
            r10 = 4
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6, r8, r9, r10)
            r0.f19751a = r5
            r0.f19752b = r8
            r0.f19754d = r3
            java.lang.Object r11 = r5.f(r14, r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            float r12 = r8.f6804a
            long r11 = r11.h(r12)
            b2.b r13 = new b2.b
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x.y1.a(x.l2, long, vi.c):java.lang.Object");
    }

    public static v1.o b(k0.o1 o1Var, o1 o1Var2, boolean z2, boolean z10, z.k kVar) {
        return new t1(o1Var, o1Var2, z2, z10, kVar);
    }
}
