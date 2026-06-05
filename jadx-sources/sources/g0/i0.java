package g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6925a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6927c;

    public /* synthetic */ i0(int i10, androidx.datastore.preferences.protobuf.k kVar) {
        this.f6927c = kVar;
        this.f6926b = i10;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f6925a) {
            case 0:
                return new d(0.0f, this.f6926b, (ej.a) this.f6927c);
            default:
                return Integer.valueOf(((g3.k0) ((androidx.datastore.preferences.protobuf.k) this.f6927c).f957e).f7129b.d(this.f6926b));
        }
    }

    public /* synthetic */ i0(int i10, ej.a aVar) {
        this.f6926b = i10;
        this.f6927c = aVar;
    }
}
