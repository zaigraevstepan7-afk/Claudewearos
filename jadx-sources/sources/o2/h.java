package o2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f12388a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f12390c;

    /* renamed from: d, reason: collision with root package name */
    public int f12391d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, vi.c cVar) {
        super(cVar);
        this.f12390c = iVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12389b = obj;
        this.f12391d |= Integer.MIN_VALUE;
        return this.f12390c.v0(0L, this);
    }
}
