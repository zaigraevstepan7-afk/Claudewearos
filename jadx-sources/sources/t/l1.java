package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f15228b;

    public /* synthetic */ l1(j1 j1Var, int i10) {
        this.f15227a = i10;
        this.f15228b = j1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f15227a) {
            case 0:
                return new n1(this.f15228b, 0);
            default:
                return new n1(this.f15228b, 1);
        }
    }
}
