package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m2 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej.e f2414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f2415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f2416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f2417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej.e f2418e;

    public m2(p1.e eVar, p1.e eVar2, p1.e eVar3, p1.e eVar4, p1.e eVar5) {
        this.f2414a = eVar;
        this.f2415b = eVar2;
        this.f2416c = eVar3;
        this.f2417d = eVar4;
        this.f2418e = eVar5;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            o2.b(this.f2414a, this.f2415b, this.f2416c, this.f2417d, this.f2418e, i0Var, 384);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
