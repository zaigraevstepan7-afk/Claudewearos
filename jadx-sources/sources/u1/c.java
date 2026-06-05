package u1;

import com.google.android.gms.common.api.internal.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f16564a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f16565b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f16566c;

    public c(int i10, i0 i0Var, Integer num) {
        this.f16564a = i10;
        this.f16565b = i0Var;
        this.f16566c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16564a == cVar.f16564a && fj.l.b(this.f16565b, cVar.f16565b) && fj.l.b(this.f16566c, cVar.f16566c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16564a) * 31;
        i0 i0Var = this.f16565b;
        int iHashCode2 = (iHashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        Integer num = this.f16566c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f16564a + ", sourceInfo=" + this.f16565b + ", groupOffset=" + this.f16566c + ')';
    }
}
