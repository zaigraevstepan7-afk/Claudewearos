package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f19674b;

    /* renamed from: c, reason: collision with root package name */
    public int f19675c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r1 r1Var, vi.c cVar) {
        super(cVar);
        this.f19674b = r1Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19673a = obj;
        this.f19675c |= Integer.MIN_VALUE;
        return this.f19674b.r(this);
    }
}
