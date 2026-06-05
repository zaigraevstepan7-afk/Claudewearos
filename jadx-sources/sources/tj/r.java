package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public d1.h f16432a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16433b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1.h f16435d;

    /* renamed from: e, reason: collision with root package name */
    public int f16436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(d1.h hVar, ti.c cVar) {
        super(cVar);
        this.f16435d = hVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16434c = obj;
        this.f16436e |= Integer.MIN_VALUE;
        return this.f16435d.b(null, this);
    }
}
