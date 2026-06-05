package eb;

import pi.o;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f5865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f5866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5868f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f5869z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z2, t.c cVar, float f10, float f11, int i10, float f12, ti.c cVar2) {
        super(2, cVar2);
        this.f5864b = z2;
        this.f5865c = cVar;
        this.f5866d = f10;
        this.f5867e = f11;
        this.f5868f = i10;
        this.f5869z = f12;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new d(this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, this.f5869z, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r12 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        if (r12 == r0) goto L18;
     */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r11.f5863a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            uk.c.R(r12)
            goto La4
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            uk.c.R(r12)
            r6 = r11
            goto L4b
        L1e:
            uk.c.R(r12)
            boolean r12 = r11.f5864b
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L4e
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            float r12 = r11.f5867e
            r1 = 1064011039(0x3f6b851f, float:0.92)
            float r12 = r12 * r1
            r1 = 4
            float r2 = r11.f5866d
            r4 = 0
            t.u0 r6 = t.d.s(r2, r12, r4, r1)
            r11.f5863a = r3
            t.c r4 = r11.f5865c
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r12 = t.c.d(r4, r5, r6, r7, r8, r9, r10)
            r6 = r9
            if (r12 != r0) goto L4b
            goto La3
        L4b:
            t.h r12 = (t.h) r12
            goto La6
        L4e:
            r6 = r11
            r12 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            t.k0 r3 = new t.k0
            t.j0 r4 = new t.j0
            r4.<init>()
            int r5 = r6.f5868f
            r4.f15198a = r5
            r7 = 1062333317(0x3f51eb85, float:0.82)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8 = 125(0x7d, float:1.75E-43)
            float r8 = (float) r8
            float r9 = r6.f5869z
            float r8 = r8 / r9
            int r8 = (int) r8
            t.i0 r7 = r4.a(r7, r8)
            t.s r8 = eb.i.f5899b
            r7.f15190b = r8
            r7 = 1065479045(0x3f81eb85, float:1.015)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r10 = 250(0xfa, float:3.5E-43)
            float r10 = (float) r10
            float r10 = r10 / r9
            int r9 = (int) r10
            t.i0 r7 = r4.a(r7, r9)
            r7.f15190b = r8
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            t.i0 r1 = r4.a(r1, r5)
            r1.f15190b = r8
            r3.<init>(r4)
            r6.f5863a = r12
            t.c r1 = r6.f5865c
            r4 = 0
            r5 = 0
            r7 = 12
            java.lang.Object r12 = t.c.d(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto La4
        La3:
            return r0
        La4:
            t.h r12 = (t.h) r12
        La6:
            pi.o r12 = pi.o.f13011a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
