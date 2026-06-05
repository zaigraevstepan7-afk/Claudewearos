package bb;

import fj.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public s f1688a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1690c;

    /* renamed from: d, reason: collision with root package name */
    public int f1691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, vi.c cVar) {
        super(cVar);
        this.f1690c = lVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f1689b = obj;
        this.f1691d |= Integer.MIN_VALUE;
        return this.f1690c.v0(0L, this);
    }
}
