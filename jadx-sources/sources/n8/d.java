package n8;

import r8.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends vi.c {
    public final /* synthetic */ f A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public h8.d f11929a;

    /* renamed from: b, reason: collision with root package name */
    public r8.g f11930b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11931c;

    /* renamed from: d, reason: collision with root package name */
    public n f11932d;

    /* renamed from: e, reason: collision with root package name */
    public h8.f f11933e;

    /* renamed from: f, reason: collision with root package name */
    public int f11934f;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f11935z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, vi.c cVar) {
        super(cVar);
        this.A = fVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11935z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, null, null, null, this);
    }
}
