package ra;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z1 implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f14312f;

    public z1(List list, long j, long j4, long j10, long j11, long j12) {
        this.f14307a = list;
        this.f14308b = j;
        this.f14309c = j4;
        this.f14310d = j10;
        this.f14311e = j11;
        this.f14312f = j12;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) throws IOException {
        int i10;
        d0.c cVar = (d0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        f1.i0 i0Var = (f1.i0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (i0Var.f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= i0Var.d(iIntValue) ? 32 : 16;
        }
        if (i0Var.T(i10 & 1, (i10 & 147) != 146)) {
            p1 p1Var = (p1) this.f14307a.get(iIntValue);
            i0Var.b0(-863827118);
            a2.a(p1Var, this.f14308b, this.f14309c, this.f14310d, this.f14311e, this.f14312f, i0Var, 224688);
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
