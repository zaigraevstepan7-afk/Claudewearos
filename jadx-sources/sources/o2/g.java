package o2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f12383a;

    /* renamed from: b, reason: collision with root package name */
    public long f12384b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f12386d;

    /* renamed from: e, reason: collision with root package name */
    public int f12387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, vi.c cVar) {
        super(cVar);
        this.f12386d = iVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12385c = obj;
        this.f12387e |= Integer.MIN_VALUE;
        return this.f12386d.Z0(0L, 0L, this);
    }
}
