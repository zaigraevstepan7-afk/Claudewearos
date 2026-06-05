package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2467a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2468b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ float f2469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(x5 x5Var, float f10, ti.c cVar) {
        super(2, cVar);
        this.f2470d = x5Var;
        this.f2469c = f10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f2467a) {
            case 0:
                return new n3((x5) this.f2470d, this.f2469c, cVar);
            default:
                n3 n3Var = new n3((c3.c) this.f2470d, cVar);
                n3Var.f2469c = ((Number) obj).floatValue();
                return n3Var;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2467a) {
            case 0:
                return ((n3) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((n3) create(Float.valueOf(((Number) obj).floatValue()), (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.n3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(c3.c cVar, ti.c cVar2) {
        super(2, cVar2);
        this.f2470d = cVar;
    }
}
