package m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class c extends qi.e implements k1.d {

    /* renamed from: c, reason: collision with root package name */
    public static final c f11225c = new c(m.f11248e, 0);

    /* renamed from: a, reason: collision with root package name */
    public final m f11226a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11227b;

    public c(m mVar, int i10) {
        this.f11226a = mVar;
        this.f11227b = i10;
    }

    @Override // k1.d
    /* renamed from: a */
    public e builder() {
        return new e(this);
    }

    public final c b(Object obj, n1.a aVar) {
        k4.d dVarU = this.f11226a.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return dVarU == null ? this : new c((m) dVarU.f9421b, this.f11227b + dVarU.f9420a);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f11226a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f11226a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
