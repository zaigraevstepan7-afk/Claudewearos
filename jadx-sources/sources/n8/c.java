package n8;

import fj.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ f B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public r8.g f11922a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11923b;

    /* renamed from: c, reason: collision with root package name */
    public h8.f f11924c;

    /* renamed from: d, reason: collision with root package name */
    public v f11925d;

    /* renamed from: e, reason: collision with root package name */
    public v f11926e;

    /* renamed from: f, reason: collision with root package name */
    public v f11927f;

    /* renamed from: z, reason: collision with root package name */
    public v f11928z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, vi.c cVar) {
        super(cVar);
        this.B = fVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return f.b(this.B, null, null, null, null, this);
    }
}
