package k8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public yj.i f9494a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9496c;

    /* renamed from: d, reason: collision with root package name */
    public int f9497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e eVar, vi.c cVar) {
        super(cVar);
        this.f9496c = eVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f9495b = obj;
        this.f9497d |= Integer.MIN_VALUE;
        return this.f9496c.a(this);
    }
}
