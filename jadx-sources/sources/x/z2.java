package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z2 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f19779b;

    /* renamed from: c, reason: collision with root package name */
    public int f19780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var, vi.c cVar) {
        super(cVar);
        this.f19779b = a3Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19778a = obj;
        this.f19780c |= Integer.MIN_VALUE;
        return a3.c(this.f19779b, null, null, this);
    }
}
