package fb;

import pi.o;
import qj.z;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f6674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.c f6676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f6677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.c f6678f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f6679z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t.c cVar, long j, t.c cVar2, float f10, t.c cVar3, float f11, ti.c cVar4) {
        super(2, cVar4);
        this.f6674b = cVar;
        this.f6675c = j;
        this.f6676d = cVar2;
        this.f6677e = f10;
        this.f6678f = cVar3;
        this.f6679z = f11;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new g(this.f6674b, this.f6675c, this.f6676d, this.f6677e, this.f6678f, this.f6679z, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r7.f6678f.f(r8, r7) != r0) goto L21;
     */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r7.f6673a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            uk.c.R(r8)
            goto L5c
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            uk.c.R(r8)
            goto L4a
        L1f:
            uk.c.R(r8)
            goto L38
        L23:
            uk.c.R(r8)
            b2.b r8 = new b2.b
            long r5 = r7.f6675c
            r8.<init>(r5)
            r7.f6673a = r4
            t.c r1 = r7.f6674b
            java.lang.Object r8 = r1.f(r8, r7)
            if (r8 != r0) goto L38
            goto L5b
        L38:
            java.lang.Float r8 = new java.lang.Float
            float r1 = r7.f6677e
            r8.<init>(r1)
            r7.f6673a = r3
            t.c r1 = r7.f6676d
            java.lang.Object r8 = r1.f(r8, r7)
            if (r8 != r0) goto L4a
            goto L5b
        L4a:
            java.lang.Float r8 = new java.lang.Float
            float r1 = r7.f6679z
            r8.<init>(r1)
            r7.f6673a = r2
            t.c r1 = r7.f6678f
            java.lang.Object r8 = r1.f(r8, r7)
            if (r8 != r0) goto L5c
        L5b:
            return r0
        L5c:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
