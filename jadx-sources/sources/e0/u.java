package e0;

import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public f1 f5321a;

    /* renamed from: b, reason: collision with root package name */
    public vi.i f5322b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f5324d;

    /* renamed from: e, reason: collision with root package name */
    public int f5325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, vi.c cVar) {
        super(cVar);
        this.f5324d = vVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f5323c = obj;
        this.f5325e |= Integer.MIN_VALUE;
        return this.f5324d.b(null, null, this);
    }
}
