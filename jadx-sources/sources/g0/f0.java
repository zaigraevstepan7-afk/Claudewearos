package g0;

import x.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6872a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f6874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f6876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.j f6877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, int i10, float f10, t.j jVar, ti.c cVar) {
        super(2, cVar);
        this.f6874c = h0Var;
        this.f6875d = i10;
        this.f6876e = f10;
        this.f6877f = jVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        f0 f0Var = new f0(this.f6874c, this.f6875d, this.f6876e, this.f6877f, cVar);
        f0Var.f6873b = obj;
        return f0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((s1) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
