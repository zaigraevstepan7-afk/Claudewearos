package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11378a;

    /* renamed from: b, reason: collision with root package name */
    public int f11379b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f11380c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f11381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11382e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, int i10, ti.c cVar, int i11) {
        super(2, cVar);
        this.f11378a = i11;
        this.f11381d = zVar;
        this.f11382e = i10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f11378a) {
            case 0:
                u uVar = new u(this.f11381d, this.f11382e, cVar, 0);
                uVar.f11380c = ((Boolean) obj).booleanValue();
                return uVar;
            default:
                u uVar2 = new u(this.f11381d, this.f11382e, cVar, 1);
                uVar2.f11380c = ((Boolean) obj).booleanValue();
                return uVar2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f11378a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ti.c cVar = (ti.c) obj2;
        switch (i10) {
        }
        return ((u) create(bool, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
