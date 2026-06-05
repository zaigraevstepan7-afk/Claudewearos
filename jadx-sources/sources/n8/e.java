package n8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public i f11936a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f11938c;

    /* renamed from: d, reason: collision with root package name */
    public int f11939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, vi.c cVar) {
        super(cVar);
        this.f11938c = fVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11937b = obj;
        this.f11939d |= Integer.MIN_VALUE;
        return this.f11938c.d(null, this);
    }
}
