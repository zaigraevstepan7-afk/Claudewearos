package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends t1.b0 implements q2 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.a f6487b;

    /* renamed from: c, reason: collision with root package name */
    public final n2 f6488c;

    /* renamed from: d, reason: collision with root package name */
    public x f6489d = new x(t1.m.j().g());

    public y(ej.a aVar, n2 n2Var) {
        this.f6487b = aVar;
        this.f6488c = n2Var;
    }

    @Override // t1.a0
    public final t1.c0 b() {
        return this.f6489d;
    }

    @Override // t1.a0
    public final void e(t1.c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f6489d = (x) c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.x g(f1.x r22, t1.g r23, boolean r24, ej.a r25) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y.g(f1.x, t1.g, boolean, ej.a):f1.x");
    }

    @Override // f1.q2
    public final Object getValue() {
        ej.c cVarE = t1.m.j().e();
        if (cVarE != null) {
            cVarE.invoke(this);
        }
        t1.g gVarJ = t1.m.j();
        return g((x) t1.m.i(this.f6489d, gVarJ), gVarJ, true, this.f6487b).f6482f;
    }

    public final x h() {
        t1.g gVarJ = t1.m.j();
        return g((x) t1.m.i(this.f6489d, gVarJ), gVarJ, false, this.f6487b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        x xVar = (x) t1.m.h(this.f6489d);
        sb2.append(xVar.c(this, t1.m.j()) ? String.valueOf(xVar.f6482f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
