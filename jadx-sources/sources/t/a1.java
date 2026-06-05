package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f15098b;

    public /* synthetic */ a1(int i10, ej.e eVar) {
        this.f15097a = i10;
        this.f15098b = eVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f15097a) {
            case 0:
                p1 p1Var = d.j;
                i iVar = (i) obj;
                this.f15098b.invoke(iVar.f15184e.getValue(), p1Var.f15250b.invoke(iVar.f15185f));
                break;
            default:
                p2.w wVar = (p2.w) obj;
                this.f15098b.invoke(wVar, Float.valueOf(Float.intBitsToFloat((int) (p2.v.h(wVar, false) & 4294967295L))));
                wVar.a();
                break;
        }
        return pi.o.f13011a;
    }
}
