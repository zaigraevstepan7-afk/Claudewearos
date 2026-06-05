package d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f4679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(1);
        this.f4678a = i10;
        this.f4679b = qVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f4678a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f4679b.f4690n.b(cg.b.n(dDoubleValue, r10.f4682e, r10.f4683f)));
            default:
                return Double.valueOf(cg.b.n(this.f4679b.f4687k.b(((Number) obj).doubleValue()), r10.f4682e, r10.f4683f));
        }
    }
}
