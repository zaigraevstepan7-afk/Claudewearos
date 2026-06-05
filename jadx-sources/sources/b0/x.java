package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f1453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1456f;

    public /* synthetic */ x(Object obj, int i10, f0.l0 l0Var, p1.e eVar, int i11) {
        this.f1451a = 2;
        this.f1452b = obj;
        this.f1454d = i10;
        this.f1456f = l0Var;
        this.f1453c = eVar;
        this.f1455e = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1451a) {
            case 0:
                ((Integer) obj2).getClass();
                d.a((v1.o) this.f1452b, (v1.c) this.f1456f, this.f1453c, (f1.i0) obj, f1.s.O(this.f1454d | 1), this.f1455e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                u6.v.f((v1.o) this.f1452b, (ej.c) this.f1456f, this.f1453c, (f1.i0) obj, f1.s.O(this.f1454d | 1), this.f1455e);
                break;
            default:
                ((Integer) obj2).getClass();
                f0.o.b(this.f1452b, this.f1454d, (f0.l0) this.f1456f, this.f1453c, (f1.i0) obj, f1.s.O(this.f1455e | 1));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ x(v1.o oVar, Object obj, p1.e eVar, int i10, int i11, int i12) {
        this.f1451a = i12;
        this.f1452b = oVar;
        this.f1456f = obj;
        this.f1453c = eVar;
        this.f1454d = i10;
        this.f1455e = i11;
    }
}
