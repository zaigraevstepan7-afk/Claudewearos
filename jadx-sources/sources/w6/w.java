package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f18869a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f18870b;

    /* renamed from: c, reason: collision with root package name */
    public int f18871c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f18873e;

    /* renamed from: f, reason: collision with root package name */
    public int f18874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, vi.c cVar) {
        super(cVar);
        this.f18873e = yVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18872d = obj;
        this.f18874f |= Integer.MIN_VALUE;
        return this.f18873e.f(null, null, this);
    }
}
