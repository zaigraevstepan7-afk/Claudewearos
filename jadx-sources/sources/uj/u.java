package uj;

import tj.h0;
import tj.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u extends h0 implements p0 {
    @Override // tj.p0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.A;
            fj.l.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.B + ((int) ((o() + this.D) - this.B))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i10) {
        synchronized (this) {
            Object[] objArr = this.A;
            fj.l.c(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.B + ((int) ((o() + this.D) - this.B))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
