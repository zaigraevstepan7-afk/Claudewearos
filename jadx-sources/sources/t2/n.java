package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o[] f15608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o[] oVarArr, int i10) {
        super(2);
        this.f15607a = i10;
        this.f15608b = oVarArr;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15607a) {
            case 0:
                return Float.valueOf(z.d((e1) obj, true, this.f15608b, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(z.d((e1) obj, false, this.f15608b, ((Number) obj2).floatValue()));
        }
    }
}
