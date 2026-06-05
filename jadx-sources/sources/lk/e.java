package lk;

import java.io.IOException;
import kk.c0;
import kk.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends l {

    /* renamed from: b, reason: collision with root package name */
    public final long f11009b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11010c;

    /* renamed from: d, reason: collision with root package name */
    public long f11011d;

    public e(c0 c0Var, long j, boolean z2) {
        super(c0Var);
        this.f11009b = j;
        this.f11010c = z2;
    }

    @Override // kk.l, kk.c0
    public final long A(long j, kk.f fVar) throws IOException {
        fj.l.f(fVar, "sink");
        long j4 = this.f11011d;
        long j10 = this.f11009b;
        if (j4 > j10) {
            j = 0;
        } else if (this.f11010c) {
            long j11 = j10 - j4;
            if (j11 == 0) {
                return -1L;
            }
            j = Math.min(j, j11);
        }
        long jA = super.A(j, fVar);
        if (jA != -1) {
            this.f11011d += jA;
        }
        long j12 = this.f11011d;
        if ((j12 >= j10 || jA != -1) && j12 <= j10) {
            return jA;
        }
        if (jA > 0 && j12 > j10) {
            long j13 = fVar.f9695b - (j12 - j10);
            kk.f fVar2 = new kk.f();
            fVar2.V(fVar);
            fVar.Y(j13, fVar2);
            fVar2.skip(fVar2.f9695b);
        }
        StringBuilder sbL = m1.l("expected ", " bytes but got ", j10);
        sbL.append(this.f11011d);
        throw new IOException(sbL.toString());
    }
}
