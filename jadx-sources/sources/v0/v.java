package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final v f17511b = new v(0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f17512c = new v(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l7.n f17513d = new l7.n(24);

    /* renamed from: e, reason: collision with root package name */
    public static final l7.n f17514e = new l7.n(25);

    /* renamed from: f, reason: collision with root package name */
    public static final l7.n f17515f = new l7.n(26);

    /* renamed from: g, reason: collision with root package name */
    public static final l7.n f17516g = new l7.n(27);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17517a;

    public /* synthetic */ v(int i10) {
        this.f17517a = i10;
    }

    @Override // v0.h
    public long a(int i10, androidx.datastore.preferences.protobuf.k kVar) {
        switch (this.f17517a) {
            case 0:
                String str = ((g3.k0) kVar.f957e).f7128a.f7117a.f7081b;
                return g3.e0.b(k0.s.r(str, i10), k0.s.q(str, i10));
            default:
                return ((g3.k0) kVar.f957e).i(i10);
        }
    }
}
