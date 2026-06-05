package t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f15467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f15468c;

    public /* synthetic */ l(ej.c cVar, ej.c cVar2, int i10) {
        this.f15466a = i10;
        this.f15467b = cVar;
        this.f15468c = cVar2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f15466a) {
            case 0:
                this.f15467b.invoke(obj);
                this.f15468c.invoke(obj);
                break;
            default:
                this.f15467b.invoke(obj);
                this.f15468c.invoke(obj);
                break;
        }
        return pi.o.f13011a;
    }
}
