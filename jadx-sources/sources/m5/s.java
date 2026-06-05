package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public int f11369a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f11371c;

    /* renamed from: d, reason: collision with root package name */
    public int f11372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, vi.c cVar) {
        super(cVar);
        this.f11371c = zVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11370b = obj;
        this.f11372d |= Integer.MIN_VALUE;
        return z.d(this.f11371c, this);
    }
}
