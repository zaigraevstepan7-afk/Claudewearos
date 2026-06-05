package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f18825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f18827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, ej.c cVar, ti.c cVar2) {
        super(1, cVar2);
        this.f18825a = mVar;
        this.f18826b = str;
        this.f18827c = cVar;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        return new l(this.f18825a, this.f18826b, this.f18827c, cVar);
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        return ((l) create((ti.c) obj)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Exception {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        e7.c cVarD0 = this.f18825a.f18829b.d0(this.f18826b);
        try {
            Object objInvoke = this.f18827c.invoke(cVarD0);
            uk.c.q(cVarD0, null);
            return objInvoke;
        } finally {
        }
    }
}
