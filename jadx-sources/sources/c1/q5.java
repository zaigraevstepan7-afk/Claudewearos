package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q5 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2613c;

    public /* synthetic */ q5(Object obj, float f10, int i10) {
        this.f2611a = i10;
        this.f2612b = obj;
        this.f2613c = f10;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f2611a) {
            case 0:
                return Float.valueOf(((s3.c) this.f2612b).w0(this.f2613c));
            case 1:
                return Float.valueOf(((s3.c) this.f2612b).w0(this.f2613c));
            default:
                ((ej.c) this.f2612b).invoke(Float.valueOf(this.f2613c));
                return pi.o.f13011a;
        }
    }
}
