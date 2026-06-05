package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 extends od.a {
    public static final Parcelable.Creator<y0> CREATOR = new x0(1);

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f3345b;

    public y0(zzgx zzgxVar, zzgx zzgxVar2) {
        this.f3344a = zzgxVar;
        this.f3345b = zzgxVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3344a, y0Var.f3344a) && com.google.android.gms.common.internal.e0.l(this.f3345b, y0Var.f3345b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3344a, this.f3345b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        zzgx zzgxVar = this.f3344a;
        uk.c.V(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f3345b;
        uk.c.V(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        uk.c.j0(iH0, parcel);
    }
}
