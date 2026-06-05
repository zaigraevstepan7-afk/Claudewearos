package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f14645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(ej.c cVar, int i10) {
        super(1);
        this.f14644a = i10;
        this.f14645b = cVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14644a) {
            case 0:
                return new s3.j((((Number) this.f14645b.invoke(Integer.valueOf((int) (((s3.l) obj).f14751a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            default:
                return new s3.j((((Number) this.f14645b.invoke(Integer.valueOf((int) (((s3.l) obj).f14751a >> 32)))).intValue() << 32) | (0 & 4294967295L));
        }
    }
}
