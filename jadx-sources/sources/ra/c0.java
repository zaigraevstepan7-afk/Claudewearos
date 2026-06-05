package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public int f13954b;

    /* renamed from: c, reason: collision with root package name */
    public int f13955c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej.c f13957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ej.c cVar, ti.c cVar2) {
        super(cVar2);
        this.f13957e = cVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        c0 c0Var = new c0(this.f13957e, cVar);
        c0Var.f13956d = obj;
        return c0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        ((c0) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        return ui.a.f17085a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:14:0x0035, B:17:0x003d], limit reached: 32 */
    /* JADX WARN: Path cross not found for [B:17:0x003d, B:14:0x0035], limit reached: 32 */
    /* JADX WARN: Path cross not found for [B:17:0x003d, B:16:0x003b], limit reached: 32 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13956d
            p2.o0 r0 = (p2.o0) r0
            ui.a r1 = ui.a.f17085a
            int r2 = r6.f13955c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L14
            int r2 = r6.f13954b
            uk.c.R(r7)
            goto L2f
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            uk.c.R(r7)
            r2 = r3
        L20:
            p2.o r7 = p2.o.f12743a
            r6.f13956d = r0
            r6.f13954b = r2
            r6.f13955c = r4
            java.lang.Object r7 = r0.l(r7, r6)
            if (r7 != r1) goto L2f
            return r1
        L2f:
            p2.n r7 = (p2.n) r7
            java.lang.Object r7 = r7.f12734a
            if (r7 == 0) goto L3d
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L3d
        L3b:
            r7 = r3
            goto L52
        L3d:
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r7.next()
            p2.w r5 = (p2.w) r5
            boolean r5 = r5.f12763d
            if (r5 == 0) goto L41
            r7 = r4
        L52:
            if (r7 == r2) goto L20
            ib.b r2 = new ib.b
            if (r7 == 0) goto L5b
            ib.o0 r5 = ib.o0.f8445d
            goto L5d
        L5b:
            ib.n0 r5 = ib.n0.f8443d
        L5d:
            r2.<init>(r5)
            ej.c r5 = r6.f13957e
            r5.invoke(r2)
            r2 = r7
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
