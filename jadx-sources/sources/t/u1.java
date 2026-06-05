package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f15295a;

    /* renamed from: b, reason: collision with root package name */
    public p f15296b;

    /* renamed from: c, reason: collision with root package name */
    public p f15297c;

    /* renamed from: d, reason: collision with root package name */
    public p f15298d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15299e;

    public u1(b0 b0Var) {
        this.f15295a = b0Var;
        this.f15299e = b0Var.c();
    }

    public final p a(long j, p pVar, p pVar2) {
        if (this.f15297c == null) {
            this.f15297c = pVar.c();
        }
        p pVar3 = this.f15297c;
        if (pVar3 == null) {
            fj.l.l("velocityVector");
            throw null;
        }
        int iB = pVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            p pVar4 = this.f15297c;
            if (pVar4 == null) {
                fj.l.l("velocityVector");
                throw null;
            }
            pVar.getClass();
            pVar4.e(this.f15295a.q(j, pVar2.a(i10)), i10);
        }
        p pVar5 = this.f15297c;
        if (pVar5 != null) {
            return pVar5;
        }
        fj.l.l("velocityVector");
        throw null;
    }
}
