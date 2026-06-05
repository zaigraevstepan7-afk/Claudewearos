package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public r f6453a;

    /* renamed from: b, reason: collision with root package name */
    public int f6454b;

    /* renamed from: c, reason: collision with root package name */
    public i1.b f6455c;

    /* renamed from: d, reason: collision with root package name */
    public ej.e f6456d;

    /* renamed from: e, reason: collision with root package name */
    public int f6457e;

    /* renamed from: f, reason: collision with root package name */
    public q.a0 f6458f;

    /* renamed from: g, reason: collision with root package name */
    public q.g0 f6459g;

    public t1(r rVar) {
        this.f6453a = rVar;
    }

    public static boolean a(y yVar, q.g0 g0Var) {
        fj.l.d(yVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        n2 n2Var = yVar.f6488c;
        if (n2Var == null) {
            n2Var = f.f6293z;
        }
        return !n2Var.a(yVar.h().f6482f, g0Var.g(yVar));
    }

    public final boolean b() {
        if (this.f6453a != null) {
            i1.b bVar = this.f6455c;
            if (bVar != null ? bVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final p0 c(Object obj) {
        p0 p0VarS;
        r rVar = this.f6453a;
        return (rVar == null || (p0VarS = rVar.s(this, obj)) == null) ? p0.f6407a : p0VarS;
    }

    public final void d() {
        r rVar = this.f6453a;
        if (rVar != null) {
            rVar.H = true;
            rVar.M.y();
        }
        this.f6453a = null;
        this.f6458f = null;
        this.f6459g = null;
        this.f6456d = null;
    }

    public final void e(boolean z2) {
        int i10 = this.f6454b;
        this.f6454b = z2 ? i10 | 32 : i10 & (-33);
    }

    public final void f() {
        this.f6454b |= 1;
    }

    public final void g(ej.e eVar) {
        this.f6456d = eVar;
    }
}
