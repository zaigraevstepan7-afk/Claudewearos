package eb;

import f1.a1;
import pi.o;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.i implements ej.e {
    public final /* synthetic */ ej.a A;
    public final /* synthetic */ int B;
    public final /* synthetic */ float C;
    public final /* synthetic */ a1 D;

    /* renamed from: a, reason: collision with root package name */
    public int f5856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f5858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f5859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.c f5861f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f5862z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z2, t.c cVar, float f10, float f11, ej.c cVar2, k kVar, ej.a aVar, int i10, float f12, a1 a1Var, ti.c cVar3) {
        super(2, cVar3);
        this.f5857b = z2;
        this.f5858c = cVar;
        this.f5859d = f10;
        this.f5860e = f11;
        this.f5861f = cVar2;
        this.f5862z = kVar;
        this.A = aVar;
        this.B = i10;
        this.C = f12;
        this.D = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new c(this.f5857b, this.f5858c, this.f5859d, this.f5860e, this.f5861f, this.f5862z, this.A, this.B, this.C, this.D, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r12 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
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
            int r1 = r11.f5856a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            uk.c.R(r12)
            r6 = r11
            goto La1
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            uk.c.R(r12)
            r6 = r11
            goto L48
        L1f:
            uk.c.R(r12)
            boolean r12 = r11.f5857b
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L4b
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            float r12 = r11.f5860e
            r1 = 4
            float r2 = r11.f5859d
            r4 = 0
            t.u0 r6 = t.d.s(r2, r12, r4, r1)
            r11.f5856a = r3
            t.c r4 = r11.f5858c
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r12 = t.c.d(r4, r5, r6, r7, r8, r9, r10)
            r6 = r9
            if (r12 != r0) goto L48
            goto La0
        L48:
            t.h r12 = (t.h) r12
            goto La3
        L4b:
            r6 = r11
            r12 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            t.k0 r3 = new t.k0
            t.j0 r4 = new t.j0
            r4.<init>()
            int r5 = r6.B
            r4.f15198a = r5
            r7 = 1060655596(0x3f3851ec, float:0.72)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8 = 115(0x73, float:1.61E-43)
            float r8 = (float) r8
            float r9 = r6.C
            float r8 = r8 / r9
            int r8 = (int) r8
            t.i0 r7 = r4.a(r7, r8)
            t.s r8 = eb.i.f5898a
            r7.f15190b = r8
            r7 = 1065562931(0x3f833333, float:1.025)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r10 = 245(0xf5, float:3.43E-43)
            float r10 = (float) r10
            float r10 = r10 / r9
            int r9 = (int) r10
            t.i0 r7 = r4.a(r7, r9)
            r7.f15190b = r8
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            t.i0 r1 = r4.a(r1, r5)
            r1.f15190b = r8
            r3.<init>(r4)
            r6.f5856a = r12
            t.c r1 = r6.f5858c
            r4 = 0
            r5 = 0
            r7 = 12
            java.lang.Object r12 = t.c.d(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto La1
        La0:
            return r0
        La1:
            t.h r12 = (t.h) r12
        La3:
            t.s r12 = eb.i.f5898a
            f1.a1 r12 = r6.D
            java.lang.Object r0 = r12.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lc6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12.setValue(r0)
            eb.k r12 = r6.f5862z
            java.lang.String r12 = r12.f5907d
            ej.c r0 = r6.f5861f
            r0.invoke(r12)
            ej.a r12 = r6.A
            r12.a()
        Lc6:
            pi.o r12 = pi.o.f13011a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
