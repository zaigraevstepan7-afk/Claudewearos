package va;

import p2.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17951b;

    /* renamed from: c, reason: collision with root package name */
    public int f17952c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, ti.c cVar) {
        super(cVar);
        this.f17951b = i10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17951b) {
            case 0:
                k kVar = new k(0, cVar);
                kVar.f17953d = obj;
                return kVar;
            default:
                k kVar2 = new k(1, cVar);
                kVar2.f17953d = obj;
                return kVar2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17951b) {
            case 0:
                ((k) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
                break;
            default:
                ((k) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
                break;
        }
        return ui.a.f17085a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[LOOP:1: B:29:0x0077->B:31:0x007d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002b -> B:14:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006c -> B:28:0x006f). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f17951b
            switch(r0) {
                case 0: goto L46;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f17953d
            p2.o0 r0 = (p2.o0) r0
            ui.a r1 = ui.a.f17085a
            int r2 = r4.f17952c
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L16
            uk.c.R(r5)
            goto L2e
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1e:
            uk.c.R(r5)
        L21:
            r4.f17953d = r0
            r4.f17952c = r3
            p2.o r5 = p2.o.f12744b
            java.lang.Object r5 = r0.l(r5, r4)
            if (r5 != r1) goto L2e
            return r1
        L2e:
            p2.n r5 = (p2.n) r5
            java.lang.Object r5 = r5.f12734a
            java.util.Iterator r5 = r5.iterator()
        L36:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r5.next()
            p2.w r2 = (p2.w) r2
            r2.a()
            goto L36
        L46:
            java.lang.Object r0 = r4.f17953d
            p2.o0 r0 = (p2.o0) r0
            ui.a r1 = ui.a.f17085a
            int r2 = r4.f17952c
            r3 = 1
            if (r2 == 0) goto L5f
            if (r2 != r3) goto L57
            uk.c.R(r5)
            goto L6f
        L57:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L5f:
            uk.c.R(r5)
        L62:
            r4.f17953d = r0
            r4.f17952c = r3
            p2.o r5 = p2.o.f12744b
            java.lang.Object r5 = r0.l(r5, r4)
            if (r5 != r1) goto L6f
            return r1
        L6f:
            p2.n r5 = (p2.n) r5
            java.lang.Object r5 = r5.f12734a
            java.util.Iterator r5 = r5.iterator()
        L77:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r5.next()
            p2.w r2 = (p2.w) r2
            r2.a()
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: va.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
