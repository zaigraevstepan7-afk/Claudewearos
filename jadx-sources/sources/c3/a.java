package c3;

import s3.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3066a;

    /* renamed from: b, reason: collision with root package name */
    public k f3067b;

    /* renamed from: c, reason: collision with root package name */
    public int f3068c;

    /* renamed from: d, reason: collision with root package name */
    public int f3069d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3071f;

    /* renamed from: z, reason: collision with root package name */
    public int f3072z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, vi.c cVar2) {
        super(cVar2);
        this.f3071f = cVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f3070e = obj;
        this.f3072z |= Integer.MIN_VALUE;
        return c.a(this.f3071f, null, null, this);
    }
}
