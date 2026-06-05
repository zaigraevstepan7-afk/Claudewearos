package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.a f10690d;

    public /* synthetic */ u0(String str, boolean z2, ej.a aVar, int i10, int i11) {
        this.f10687a = i11;
        this.f10688b = str;
        this.f10689c = z2;
        this.f10690d = aVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10687a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                q3.c(this.f10688b, this.f10689c, this.f10690d, i0Var, f1.s.O(391));
                break;
            default:
                nb.v.a(this.f10688b, this.f10689c, this.f10690d, i0Var, f1.s.O(1));
                break;
        }
        return pi.o.f13011a;
    }
}
