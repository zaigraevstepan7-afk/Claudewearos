package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f14077b;

    public /* synthetic */ m(f1.f1 f1Var, int i10) {
        this.f14076a = i10;
        this.f14077b = f1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14076a) {
            case 0:
                t2.w wVar = (t2.w) obj;
                fj.l.f(wVar, "coordinates");
                this.f14077b.h(Float.intBitsToFloat((int) (wVar.q0(0L) & 4294967295L)));
                return pi.o.f13011a;
            case 1:
                this.f14077b.h(((Float) obj).floatValue());
                return pi.o.f13011a;
            case 2:
                this.f14077b.h(((Float) obj).floatValue());
                return pi.o.f13011a;
            case 3:
                this.f14077b.h((int) (((s3.l) obj).f14751a & 4294967295L));
                return pi.o.f13011a;
            case 4:
                fj.l.f((s3.c) obj, "$this$offset");
                return new s3.j((0 << 32) | (hj.a.H(this.f14077b.g()) & 4294967295L));
            case 5:
                this.f14077b.h(((Float) obj).floatValue());
                return pi.o.f13011a;
            default:
                fj.l.f((s3.c) obj, "$this$offset");
                return new s3.j((0 << 32) | (hj.a.H(this.f14077b.g()) & 4294967295L));
        }
    }
}
