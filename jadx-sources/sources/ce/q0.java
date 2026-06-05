package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends od.a {
    public static final Parcelable.Creator<q0> CREATOR = new ae.b(5);

    /* renamed from: a, reason: collision with root package name */
    public final long f3307a;

    public q0(long j) {
        this.f3307a = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q0) && this.f3307a == ((q0) obj).f3307a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3307a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 8);
        parcel.writeLong(this.f3307a);
        uk.c.j0(iH0, parcel);
    }
}
