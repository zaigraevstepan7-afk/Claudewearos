package ab;

import f1.a1;
import p2.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public int f340b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s3.c f343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.a f344f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f345z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, s3.c cVar, ej.a aVar, a1 a1Var, ti.c cVar2) {
        super(cVar2);
        this.f342d = wVar;
        this.f343e = cVar;
        this.f344f = aVar;
        this.f345z = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        t tVar = new t(this.f342d, this.f343e, this.f344f, this.f345z, cVar);
        tVar.f341c = obj;
        return tVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f341c
            p2.o0 r0 = (p2.o0) r0
            ui.a r1 = ui.a.f17085a
            int r2 = r8.f340b
            r3 = 1
            if (r2 == 0) goto L19
            if (r2 != r3) goto L11
            uk.c.R(r9)
            goto L2a
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            uk.c.R(r9)
            p2.o r9 = p2.o.f12745c
            r8.f341c = r0
            r8.f340b = r3
            r2 = 0
            java.lang.Object r9 = x.v2.a(r0, r2, r9, r8)
            if (r9 != r1) goto L2a
            return r1
        L2a:
            p2.w r9 = (p2.w) r9
            float r1 = ab.v.f352b
            p2.p0 r0 = r0.f12747a
            int r0 = r0.I0(r1)
            r1 = 260(0x104, float:3.64E-43)
            float r1 = (float) r1
            s3.c r2 = r8.f343e
            int r1 = r2.I0(r1)
            f1.a1 r2 = r8.f345z
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L4b
            int r1 = r2.intValue()
        L4b:
            ab.w r2 = r8.f342d
            int r3 = r2.f357b
            int r2 = r2.f356a
            long r4 = r9.f12762c
            r9 = 32
            long r6 = r4 >> r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r7 = (float) r2
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L89
            long r6 = r4 >> r9
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r2 = r2 + r0
            float r0 = (float) r2
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L89
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r9 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r9)
            float r2 = (float) r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L89
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r3 = r3 + r1
            float r0 = (float) r3
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L89
            goto L8e
        L89:
            ej.a r9 = r8.f344f
            r9.a()
        L8e:
            pi.o r9 = pi.o.f13011a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
