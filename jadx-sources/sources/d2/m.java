package d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f4673b;

    public /* synthetic */ m(q qVar, int i10) {
        this.f4672a = i10;
        this.f4673b = qVar;
    }

    @Override // d2.i
    public final double b(double d10) {
        switch (this.f4672a) {
            case 0:
                return cg.b.n(this.f4673b.f4687k.b(d10), r10.f4682e, r10.f4683f);
            default:
                return this.f4673b.f4690n.b(cg.b.n(d10, r0.f4682e, r0.f4683f));
        }
    }
}
