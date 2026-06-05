package v;

import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i1 extends vi.i implements ej.e {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17227a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f17228b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17229c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17230d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17231e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f17232f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17233z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(t.c cVar, t.c cVar2, f1.a1 a1Var, f1.a1 a1Var2, f1.f1 f1Var, f1.f1 f1Var2, f1.a1 a1Var3, q2 q2Var, f1.a1 a1Var4, ti.c cVar3) {
        super(2, cVar3);
        this.f17229c = cVar;
        this.f17230d = cVar2;
        this.f17231e = a1Var;
        this.f17232f = a1Var2;
        this.f17233z = f1Var;
        this.A = f1Var2;
        this.B = a1Var3;
        this.C = q2Var;
        this.D = a1Var4;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ej.e, vi.i] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17227a) {
            case 0:
                i1 i1Var = new i1((f1) this.C, (j1) this.B, (vi.i) this.D, this.f17233z, cVar);
                i1Var.f17232f = obj;
                return i1Var;
            default:
                return new i1((t.c) this.f17229c, (t.c) this.f17230d, (f1.a1) this.f17231e, (f1.a1) this.f17232f, (f1.f1) this.f17233z, (f1.f1) this.A, (f1.a1) this.B, (q2) this.C, (f1.a1) this.D, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17227a) {
        }
        return ((i1) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8, types: [yj.a] */
    /* JADX WARN: Type inference failed for: r5v5, types: [yj.a] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ej.e] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(f1 f1Var, j1 j1Var, ej.e eVar, Object obj, ti.c cVar) {
        super(2, cVar);
        this.C = f1Var;
        this.B = j1Var;
        this.D = (vi.i) eVar;
        this.f17233z = obj;
    }
}
