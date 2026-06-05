package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17428a;

    /* renamed from: b, reason: collision with root package name */
    public int f17429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f17430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(u0 u0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17428a = i10;
        this.f17430c = u0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17428a) {
            case 0:
                m0 m0Var = new m0(this.f17430c, cVar, 0);
                long j = ((b2.b) obj).f1500a;
                return m0Var;
            case 1:
                return new m0(this.f17430c, cVar, 1);
            default:
                return new m0(this.f17430c, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17428a) {
            case 0:
                long j = ((b2.b) obj).f1500a;
                break;
        }
        return ((m0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c5, code lost:
    
        if (r2 == r1) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
