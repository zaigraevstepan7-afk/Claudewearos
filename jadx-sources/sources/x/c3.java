package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c3 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public pi.c f19476a;

    /* renamed from: b, reason: collision with root package name */
    public ej.a f19477b;

    /* renamed from: c, reason: collision with root package name */
    public float f19478c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d3 f19480e;

    /* renamed from: f, reason: collision with root package name */
    public int f19481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var, vi.c cVar) {
        super(cVar);
        this.f19480e = d3Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19479d = obj;
        this.f19481f |= Integer.MIN_VALUE;
        return this.f19480e.a(null, null, this);
    }
}
