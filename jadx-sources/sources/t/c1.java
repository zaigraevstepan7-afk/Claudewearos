package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c1 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f15119a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f15120b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15121c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15122d;

    /* renamed from: e, reason: collision with root package name */
    public final p f15123e;

    /* renamed from: f, reason: collision with root package name */
    public final p f15124f;

    /* renamed from: g, reason: collision with root package name */
    public final p f15125g;

    /* renamed from: h, reason: collision with root package name */
    public long f15126h;

    /* renamed from: i, reason: collision with root package name */
    public p f15127i;

    public c1(j jVar, p1 p1Var, Object obj, Object obj2, p pVar) {
        this.f15119a = jVar.a(p1Var);
        this.f15120b = p1Var;
        this.f15121c = obj2;
        this.f15122d = obj;
        this.f15123e = (p) p1Var.f15249a.invoke(obj);
        ej.c cVar = p1Var.f15249a;
        this.f15124f = (p) cVar.invoke(obj2);
        this.f15125g = pVar != null ? d.j(pVar) : ((p) cVar.invoke(obj)).c();
        this.f15126h = -1L;
    }

    @Override // t.f
    public final boolean a() {
        return this.f15119a.a();
    }

    @Override // t.f
    public final long b() {
        if (this.f15126h < 0) {
            this.f15126h = this.f15119a.b(this.f15123e, this.f15124f, this.f15125g);
        }
        return this.f15126h;
    }

    @Override // t.f
    public final p1 c() {
        return this.f15120b;
    }

    @Override // t.f
    public final p d(long j) {
        if (!e(j)) {
            return this.f15119a.k(j, this.f15123e, this.f15124f, this.f15125g);
        }
        p pVar = this.f15127i;
        if (pVar != null) {
            return pVar;
        }
        p pVarJ = this.f15119a.j(this.f15123e, this.f15124f, this.f15125g);
        this.f15127i = pVarJ;
        return pVarJ;
    }

    @Override // t.f
    public final Object f(long j) {
        if (e(j)) {
            return this.f15121c;
        }
        p pVarD = this.f15119a.d(j, this.f15123e, this.f15124f, this.f15125g);
        int iB = pVarD.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(pVarD.a(i10))) {
                q0.b("AnimationVector cannot contain a NaN. " + pVarD + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f15120b.f15250b.invoke(pVarD);
    }

    @Override // t.f
    public final Object g() {
        return this.f15121c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f15122d + " -> " + this.f15121c + ",initial velocity: " + this.f15125g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f15119a;
    }
}
