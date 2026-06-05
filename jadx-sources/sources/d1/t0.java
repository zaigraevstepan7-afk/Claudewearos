package d1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3.n0 f4575c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f4576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4577e;

    public /* synthetic */ t0(long j, g3.n0 n0Var, ej.e eVar, int i10, int i11) {
        this.f4573a = i11;
        this.f4574b = j;
        this.f4575c = n0Var;
        this.f4576d = eVar;
        this.f4577e = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4573a) {
            case 0:
                ((Integer) obj2).intValue();
                i.b(this.f4574b, this.f4575c, this.f4576d, (f1.i0) obj, f1.s.O(this.f4577e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                d1.b(this.f4574b, this.f4575c, this.f4576d, (f1.i0) obj, f1.s.O(this.f4577e | 1));
                break;
        }
        return pi.o.f13011a;
    }
}
