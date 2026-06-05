package w6;

import u6.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public e0 f18859a;

    /* renamed from: b, reason: collision with root package name */
    public h f18860b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f18862d;

    /* renamed from: e, reason: collision with root package name */
    public int f18863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, vi.c cVar) {
        super(cVar);
        this.f18862d = yVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18861c = obj;
        this.f18863e |= Integer.MIN_VALUE;
        return this.f18862d.d(null, this);
    }
}
