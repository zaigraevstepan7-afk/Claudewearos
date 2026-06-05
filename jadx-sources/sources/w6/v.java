package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18864a;

    /* renamed from: b, reason: collision with root package name */
    public h f18865b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f18867d;

    /* renamed from: e, reason: collision with root package name */
    public int f18868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, vi.c cVar) {
        super(cVar);
        this.f18867d = yVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18866c = obj;
        this.f18868e |= Integer.MIN_VALUE;
        return this.f18867d.e(false, this);
    }
}
