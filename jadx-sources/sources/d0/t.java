package d0;

import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public f1 f4434a;

    /* renamed from: b, reason: collision with root package name */
    public vi.i f4435b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f4437d;

    /* renamed from: e, reason: collision with root package name */
    public int f4438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, vi.c cVar) {
        super(cVar);
        this.f4437d = uVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f4436c = obj;
        this.f4438e |= Integer.MIN_VALUE;
        return this.f4437d.b(null, null, this);
    }
}
