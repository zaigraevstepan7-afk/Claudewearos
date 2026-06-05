package bb;

import fj.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public s f1713a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f1715c;

    /* renamed from: d, reason: collision with root package name */
    public int f1716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, vi.c cVar) {
        super(cVar);
        this.f1715c = pVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f1714b = obj;
        this.f1716d |= Integer.MIN_VALUE;
        return this.f1715c.v0(0L, this);
    }
}
