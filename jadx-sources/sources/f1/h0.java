package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6311b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f6310a = i10;
        this.f6311b = obj;
    }

    public final void a() {
        switch (this.f6310a) {
            case 0:
                i0 i0Var = (i0) this.f6311b;
                i0Var.A--;
                break;
            default:
                t1.u uVar = (t1.u) this.f6311b;
                uVar.f15501k--;
                break;
        }
    }

    public final void b() {
        switch (this.f6310a) {
            case 0:
                ((i0) this.f6311b).A++;
                break;
            default:
                ((t1.u) this.f6311b).f15501k++;
                break;
        }
    }
}
