package nb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public Context f12012a;

    /* renamed from: b, reason: collision with root package name */
    public ig.l f12013b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f12015d;

    /* renamed from: e, reason: collision with root package name */
    public int f12016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, vi.c cVar) {
        super(cVar);
        this.f12015d = oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12014c = obj;
        this.f12016e |= Integer.MIN_VALUE;
        return this.f12015d.h(null, null, this);
    }
}
