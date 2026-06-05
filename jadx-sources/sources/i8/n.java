package i8;

import fj.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public v f8391a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f8393c;

    /* renamed from: d, reason: collision with root package name */
    public int f8394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, vi.c cVar) {
        super(cVar);
        this.f8393c = oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f8392b = obj;
        this.f8394d |= Integer.MIN_VALUE;
        return this.f8393c.d(this);
    }
}
