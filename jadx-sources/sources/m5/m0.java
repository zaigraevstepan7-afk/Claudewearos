package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f11338a;

    /* renamed from: b, reason: collision with root package name */
    public yj.c f11339b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f11341d;

    /* renamed from: e, reason: collision with root package name */
    public int f11342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, vi.c cVar) {
        super(cVar);
        this.f11341d = o0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11340c = obj;
        this.f11342e |= Integer.MIN_VALUE;
        return this.f11341d.b(null, this);
    }
}
