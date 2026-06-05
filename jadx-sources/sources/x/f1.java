package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj.g f19527b;

    public /* synthetic */ f1(sj.g gVar, int i10) {
        this.f19526a = i10;
        this.f19527b = gVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f19526a) {
            case 0:
                Object objA = this.f19527b.a();
                if (objA instanceof sj.i) {
                    objA = null;
                }
                return (g1) objA;
            default:
                Object objA2 = this.f19527b.a();
                if (objA2 instanceof sj.i) {
                    objA2 = null;
                }
                return (y2) objA2;
        }
    }
}
