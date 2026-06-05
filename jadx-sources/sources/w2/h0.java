package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f18289b;

    /* renamed from: c, reason: collision with root package name */
    public int f18290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, vi.c cVar) {
        super(cVar);
        this.f18289b = i0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18288a = obj;
        this.f18290c |= Integer.MIN_VALUE;
        this.f18289b.a(null, this);
        return ui.a.f17085a;
    }
}
