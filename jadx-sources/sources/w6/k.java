package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public String f18820a;

    /* renamed from: b, reason: collision with root package name */
    public ej.c f18821b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f18823d;

    /* renamed from: e, reason: collision with root package name */
    public int f18824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, vi.c cVar) {
        super(cVar);
        this.f18823d = mVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18822c = obj;
        this.f18824e |= Integer.MIN_VALUE;
        return this.f18823d.b(null, null, this);
    }
}
