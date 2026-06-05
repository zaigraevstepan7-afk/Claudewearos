package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10161a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10163c;

    public /* synthetic */ b3(long j, p1.e eVar, int i10) {
        this.f10162b = j;
        this.f10163c = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10161a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(49);
                q3.j(this.f10162b, (p1.e) this.f10163c, (f1.i0) obj, iO);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO2 = f1.s.O(49);
                u3.c.b((String) this.f10163c, this.f10162b, (f1.i0) obj, iO2);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ b3(String str, long j, int i10) {
        this.f10163c = str;
        this.f10162b = j;
    }
}
