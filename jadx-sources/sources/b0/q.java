package b0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q implements t2.q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q f1397b = new q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q f1398c = new q(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1399a;

    public /* synthetic */ q(int i10) {
        this.f1399a = i10;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        switch (this.f1399a) {
            case 0:
                return s0Var.B(s3.a.j(j), s3.a.i(j), qi.t.f13521a, new ta.n(15));
            default:
                return s0Var.B(s3.a.f(j) ? s3.a.h(j) : 0, s3.a.e(j) ? s3.a.g(j) : 0, qi.t.f13521a, new ta.n(15));
        }
    }
}
