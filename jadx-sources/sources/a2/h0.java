package a2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f26b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f27c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f29e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(e0 e0Var, e0 e0Var2, Object obj, int i10, n nVar, int i11) {
        super(1);
        this.f25a = i11;
        this.f26b = e0Var;
        this.f27c = e0Var2;
        this.f30f = obj;
        this.f28d = i10;
        this.f29e = nVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f25a) {
            case 0:
                t2.e eVar = (t2.e) obj;
                e0 e0Var = this.f27c;
                if (this.f26b != ((q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zB = d.B(e0Var, (e0) this.f30f, this.f28d, this.f29e);
                Boolean boolValueOf = Boolean.valueOf(zB);
                if (zB || !eVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                t2.e eVar2 = (t2.e) obj;
                e0 e0Var2 = this.f27c;
                if (this.f26b != ((q) ((w2.t) v2.n.z(e0Var2)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zA = d.A(this.f28d, this.f29e, e0Var2, (b2.c) this.f30f);
                Boolean boolValueOf2 = Boolean.valueOf(zA);
                if (zA || !eVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
