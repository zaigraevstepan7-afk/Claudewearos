package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.f1 f1407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1408c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1409d;

    public /* synthetic */ r0(int i10, int i11, t2.f1 f1Var) {
        this.f1406a = 2;
        this.f1408c = i10;
        this.f1407b = f1Var;
        this.f1409d = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f1406a) {
            case 0:
                ((t2.e1) obj).z(this.f1407b, this.f1408c, this.f1409d, 0.0f);
                break;
            case 1:
                ((t2.e1) obj).z(this.f1407b, this.f1408c, this.f1409d, 0.0f);
                break;
            default:
                ((t2.e1) obj).z(this.f1407b, hj.a.H((this.f1408c - r0.f15550a) / 2.0f), hj.a.H((this.f1409d - r0.f15551b) / 2.0f), 0.0f);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ r0(t2.f1 f1Var, int i10, int i11, int i12) {
        this.f1406a = i12;
        this.f1407b = f1Var;
        this.f1408c = i10;
        this.f1409d = i11;
    }
}
