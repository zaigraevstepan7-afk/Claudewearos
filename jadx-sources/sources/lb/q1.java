package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10587c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f10588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.c f10590f;

    public /* synthetic */ q1(float f10, mi.p pVar, ej.c cVar, ej.a aVar, v1.o oVar, int i10) {
        this.f10585a = 2;
        this.f10588d = f10;
        this.f10586b = pVar;
        this.f10590f = cVar;
        this.f10587c = aVar;
        this.f10589e = oVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10585a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(7);
                q3.m((String) this.f10586b, (String) this.f10587c, this.f10588d, (kj.d) this.f10589e, this.f10590f, (f1.i0) obj, iO);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iO2 = f1.s.O(7);
                c.d((String) this.f10586b, (String) this.f10587c, this.f10588d, (kj.d) this.f10589e, this.f10590f, (f1.i0) obj, iO2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO3 = f1.s.O(1);
                va.m.e(this.f10588d, (mi.p) this.f10586b, this.f10590f, (ej.a) this.f10587c, (v1.o) this.f10589e, (f1.i0) obj, iO3);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ q1(String str, String str2, float f10, kj.d dVar, ej.c cVar, int i10, int i11) {
        this.f10585a = i11;
        this.f10586b = str;
        this.f10587c = str2;
        this.f10588d = f10;
        this.f10589e = dVar;
        this.f10590f = cVar;
    }
}
