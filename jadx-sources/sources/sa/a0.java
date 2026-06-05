package sa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f14800c;

    public /* synthetic */ a0(float f10, float f11, int i10) {
        this.f14798a = i10;
        this.f14799b = f10;
        this.f14800c = f11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        s3.c cVar = (s3.c) obj;
        switch (this.f14798a) {
            case 0:
                fj.l.f(cVar, "$this$offset");
                return new s3.j((0 << 32) | (hj.a.H(this.f14799b + this.f14800c) & 4294967295L));
            case 1:
                fj.l.f(cVar, "$this$offset");
                return new s3.j((((int) this.f14799b) << 32) | (((int) this.f14800c) & 4294967295L));
            default:
                fj.l.f(cVar, "$this$offset");
                return new s3.j((((int) this.f14799b) << 32) | (((int) this.f14800c) & 4294967295L));
        }
    }
}
