package bb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f1664b;

    public /* synthetic */ d(t.c cVar, int i10) {
        this.f1663a = i10;
        this.f1664b = cVar;
    }

    @Override // ej.a
    public final Object a() {
        float fFloatValue;
        switch (this.f1663a) {
            case 0:
                fFloatValue = ((Number) this.f1664b.e()).floatValue();
                break;
            case 1:
                fFloatValue = ((Number) this.f1664b.e()).floatValue();
                break;
            default:
                fFloatValue = ((Number) this.f1664b.e()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
