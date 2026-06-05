package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements ej.e {
    public final /* synthetic */ pi.c A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10250a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10255f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10256z;

    public /* synthetic */ e2(String str, String str2, boolean z2, boolean z10, ej.c cVar, int i10, int i11) {
        this.f10251b = str;
        this.f10256z = str2;
        this.f10252c = z2;
        this.f10253d = z10;
        this.A = cVar;
        this.f10254e = i10;
        this.f10255f = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10250a) {
            case 0:
                ((Integer) obj2).getClass();
                q3.n(this.f10251b, (String) this.f10256z, this.f10252c, this.f10253d, (ej.c) this.A, (f1.i0) obj, f1.s.O(this.f10254e | 1), this.f10255f);
                break;
            default:
                ((Integer) obj2).getClass();
                mb.a.d(this.f10251b, this.f10252c, (i2.f) this.f10256z, (ej.a) this.A, this.f10253d, (f1.i0) obj, f1.s.O(this.f10254e | 1), this.f10255f);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ e2(String str, boolean z2, i2.f fVar, ej.a aVar, boolean z10, int i10, int i11) {
        this.f10251b = str;
        this.f10252c = z2;
        this.f10256z = fVar;
        this.A = aVar;
        this.f10253d = z10;
        this.f10254e = i10;
        this.f10255f = i11;
    }
}
