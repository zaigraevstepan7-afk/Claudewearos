package nb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f12017a;

    /* renamed from: b, reason: collision with root package name */
    public o f12018b;

    /* renamed from: c, reason: collision with root package name */
    public int f12019c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f12021e;

    /* renamed from: f, reason: collision with root package name */
    public int f12022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, vi.c cVar) {
        super(cVar);
        this.f12021e = oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12020d = obj;
        this.f12022f |= Integer.MIN_VALUE;
        Object objI = this.f12021e.i(null, this);
        return objI == ui.a.f17085a ? objI : new pi.k(objI);
    }
}
