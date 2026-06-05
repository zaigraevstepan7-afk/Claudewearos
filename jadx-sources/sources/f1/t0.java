package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f6452b;

    public /* synthetic */ t0(ej.c cVar, int i10) {
        this.f6451a = i10;
        this.f6452b = cVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        long j;
        switch (this.f6451a) {
            case 0:
                return this.f6452b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                t1.k kVar = (t1.k) obj;
                synchronized (t1.m.f15471c) {
                    j = t1.m.f15473e;
                    t1.m.f15473e = 1 + j;
                }
                return new t1.e(j, kVar, this.f6452b);
        }
    }
}
