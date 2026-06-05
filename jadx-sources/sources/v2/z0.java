package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public v1.n f17800a;

    /* renamed from: b, reason: collision with root package name */
    public int f17801b;

    /* renamed from: c, reason: collision with root package name */
    public g1.e f17802c;

    /* renamed from: d, reason: collision with root package name */
    public g1.e f17803d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f17805f;

    public z0(b1 b1Var, v1.n nVar, int i10, g1.e eVar, g1.e eVar2, boolean z2) {
        this.f17805f = b1Var;
        this.f17800a = nVar;
        this.f17801b = i10;
        this.f17802c = eVar;
        this.f17803d = eVar2;
        this.f17804e = z2;
    }

    public final boolean a(int i10, int i11) {
        g1.e eVar = this.f17802c;
        int i12 = this.f17801b;
        v1.m mVar = (v1.m) eVar.f7024a[i10 + i12];
        v1.m mVar2 = (v1.m) this.f17803d.f7024a[i12 + i11];
        return fj.l.b(mVar, mVar2) || mVar.getClass() == mVar2.getClass();
    }
}
