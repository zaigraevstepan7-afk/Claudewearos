package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f18370b;

    /* renamed from: c, reason: collision with root package name */
    public int f18371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, vi.c cVar) {
        super(cVar);
        this.f18370b = tVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18369a = obj;
        this.f18371c |= Integer.MIN_VALUE;
        this.f18370b.N(null, this);
        return ui.a.f17085a;
    }
}
