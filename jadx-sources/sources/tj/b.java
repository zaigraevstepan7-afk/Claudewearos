package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16344b;

    /* renamed from: c, reason: collision with root package name */
    public int f16345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ti.c cVar2) {
        super(cVar2);
        this.f16344b = cVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16343a = obj;
        this.f16345c |= Integer.MIN_VALUE;
        return this.f16344b.b(null, this);
    }
}
