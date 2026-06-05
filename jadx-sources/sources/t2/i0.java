package t2;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends v2.c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f15576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.e f15577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m0 m0Var, ej.e eVar, String str) {
        super(str);
        this.f15576b = m0Var;
        this.f15577c = eVar;
    }

    @Override // t2.q0
    public final r0 a(s0 s0Var, List list, long j) {
        m0 m0Var = this.f15576b;
        g0 g0Var = m0Var.A;
        g0Var.f15556a = s0Var.getLayoutDirection();
        g0Var.f15557b = s0Var.e();
        g0Var.f15558c = s0Var.r0();
        boolean zT0 = s0Var.t0();
        ej.e eVar = this.f15577c;
        if (zT0 || m0Var.f15600a.A == null) {
            m0Var.f15603d = 0;
            r0 r0Var = (r0) eVar.invoke(g0Var, new s3.a(j));
            return new h0(r0Var, m0Var, m0Var.f15603d, r0Var, 1);
        }
        m0Var.f15604e = 0;
        r0 r0Var2 = (r0) eVar.invoke(m0Var.B, new s3.a(j));
        return new h0(r0Var2, m0Var, m0Var.f15604e, r0Var2, 0);
    }
}
