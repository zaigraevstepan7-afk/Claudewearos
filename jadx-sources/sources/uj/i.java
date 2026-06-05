package uj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public bb.m f17115a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17116b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17117c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb.m f17118d;

    /* renamed from: e, reason: collision with root package name */
    public int f17119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bb.m mVar, ti.c cVar) {
        super(cVar);
        this.f17118d = mVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f17117c = obj;
        this.f17119e |= Integer.MIN_VALUE;
        return this.f17118d.b(null, this);
    }
}
