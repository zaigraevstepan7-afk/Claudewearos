package p2;

import qj.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public s1 f12724a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f12726c;

    /* renamed from: d, reason: collision with root package name */
    public int f12727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, vi.a aVar) {
        super(aVar);
        this.f12726c = o0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12725b = obj;
        this.f12727d |= Integer.MIN_VALUE;
        return this.f12726c.D(0L, null, this);
    }
}
