package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1.g f16423b;

    /* renamed from: c, reason: collision with root package name */
    public int f16424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b1.g gVar, ti.c cVar) {
        super(cVar);
        this.f16423b = gVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16422a = obj;
        this.f16424c |= Integer.MIN_VALUE;
        return this.f16423b.b(null, this);
    }
}
