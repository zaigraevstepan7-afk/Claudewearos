package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 implements ej.e {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2051a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.e f2052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2056f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2057z;

    public /* synthetic */ e5(int i10, ej.e eVar, p1.e eVar2, ej.e eVar3, ej.e eVar4, b0.d2 d2Var, ej.e eVar5, int i11) {
        this.f2053c = i10;
        this.f2054d = eVar;
        this.f2052b = eVar2;
        this.f2055e = eVar3;
        this.f2056f = eVar4;
        this.A = d2Var;
        this.f2057z = eVar5;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2051a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(1);
                i5.b(this.f2053c, (ej.e) this.f2054d, this.f2052b, (ej.e) this.f2055e, (ej.e) this.f2056f, (b0.d2) this.A, (ej.e) this.f2057z, (f1.i0) obj, iO);
                break;
            default:
                ((Integer) obj2).getClass();
                this.f2052b.h(this.f2054d, (Boolean) this.f2055e, this.f2056f, this.f2057z, this.A, (f1.i0) obj, f1.s.O(this.f2053c) | 1);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ e5(p1.e eVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2052b = eVar;
        this.f2054d = obj;
        this.f2055e = bool;
        this.f2056f = obj2;
        this.f2057z = obj3;
        this.A = obj4;
        this.f2053c = i10;
    }
}
