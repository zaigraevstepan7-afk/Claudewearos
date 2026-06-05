package n8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public f f11951a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11953c;

    /* renamed from: d, reason: collision with root package name */
    public int f11954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, vi.c cVar) {
        super(cVar);
        this.f11953c = iVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11952b = obj;
        this.f11954d |= Integer.MIN_VALUE;
        return this.f11953c.a(this);
    }
}
