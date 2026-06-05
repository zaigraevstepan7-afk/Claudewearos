package x1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public sj.b f19784a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f19786c;

    /* renamed from: d, reason: collision with root package name */
    public int f19787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, vi.c cVar) {
        super(cVar);
        this.f19786c = eVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19785b = obj;
        this.f19787d |= Integer.MIN_VALUE;
        return this.f19786c.a(this);
    }
}
