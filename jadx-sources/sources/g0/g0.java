package g0;

import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public h0 f6882a;

    /* renamed from: b, reason: collision with root package name */
    public f1 f6883b;

    /* renamed from: c, reason: collision with root package name */
    public vi.i f6884c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f6886e;

    /* renamed from: f, reason: collision with root package name */
    public int f6887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, vi.c cVar) {
        super(cVar);
        this.f6886e = h0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f6885d = obj;
        this.f6887f |= Integer.MIN_VALUE;
        return h0.r(this.f6886e, null, null, this);
    }
}
