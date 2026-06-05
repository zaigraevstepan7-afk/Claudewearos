package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9312c;

    public /* synthetic */ w(boolean z2, Object obj, int i10) {
        this.f9310a = i10;
        this.f9311b = z2;
        this.f9312c = obj;
    }

    @Override // ej.a
    public final Object a() {
        tj.a0 a0VarI;
        switch (this.f9310a) {
            case 0:
                t0.a aVar = (t0.a) this.f9312c;
                boolean z2 = this.f9311b;
                pi.o oVar = pi.o.f13011a;
                if (z2 && (a0VarI = aVar.i()) != null) {
                    ((tj.h0) a0VarI).q(oVar);
                }
                return oVar;
            default:
                ej.a aVar2 = (ej.a) this.f9312c;
                if (this.f9311b) {
                    aVar2.a();
                }
                return pi.o.f13011a;
        }
    }
}
