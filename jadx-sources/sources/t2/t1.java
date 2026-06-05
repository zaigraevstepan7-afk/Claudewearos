package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t1 extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o[] f15642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(o[] oVarArr, int i10) {
        super(2);
        this.f15641a = i10;
        this.f15642b = oVarArr;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15641a) {
            case 0:
                return Float.valueOf(z.d((e1) obj, true, this.f15642b, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(z.d((e1) obj, false, this.f15642b, ((Number) obj2).floatValue()));
        }
    }
}
