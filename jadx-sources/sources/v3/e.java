package v3;

import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f17820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z2, h hVar, long j, ti.c cVar) {
        super(2, cVar);
        this.f17819b = z2;
        this.f17820c = hVar;
        this.f17821d = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new e(this.f17819b, this.f17820c, this.f17821d, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r10.f17818a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            uk.c.R(r11)
            goto L4d
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            uk.c.R(r11)
            r6 = r10
            goto L37
        L1d:
            uk.c.R(r11)
            boolean r11 = r10.f17819b
            v3.h r1 = r10.f17820c
            if (r11 != 0) goto L3d
            o2.d r4 = r1.f17828a
            r10.f17818a = r3
            r5 = 0
            long r7 = r10.f17821d
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L37
            goto L4c
        L37:
            s3.q r11 = (s3.q) r11
            r11.getClass()
            goto L52
        L3d:
            r6 = r10
            o2.d r1 = r1.f17828a
            r6.f17818a = r2
            long r2 = r6.f17821d
            r4 = 0
            java.lang.Object r11 = r1.a(r2, r4, r6)
            if (r11 != r0) goto L4d
        L4c:
            return r0
        L4d:
            s3.q r11 = (s3.q) r11
            r11.getClass()
        L52:
            pi.o r11 = pi.o.f13011a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
