package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final q.b0 f6355a;

    /* renamed from: b, reason: collision with root package name */
    public final q.b0 f6356b;

    /* renamed from: c, reason: collision with root package name */
    public final q.u f6357c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6358d;

    public k(q.b0 b0Var, q.b0 b0Var2, q.u uVar, int i10, Exception exc) {
        super(exc);
        this.f6355a = b0Var;
        this.f6356b = b0Var2;
        this.f6357c = uVar;
        this.f6358d = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return nj.f.u0("\n            |Failed to execute op number " + this.f6358d + ":\n            |" + qi.l.E0(qi.l.N0(50, mj.h.V(new mj.i(new j(this, null)))), "\n", null, null, null, 62) + "\n            ");
    }
}
