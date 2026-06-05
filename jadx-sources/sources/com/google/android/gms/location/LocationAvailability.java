package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import dd.d;
import ee.y;
import java.util.Arrays;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new d(11);

    /* renamed from: a, reason: collision with root package name */
    public int f3740a;

    /* renamed from: b, reason: collision with root package name */
    public int f3741b;

    /* renamed from: c, reason: collision with root package name */
    public long f3742c;

    /* renamed from: d, reason: collision with root package name */
    public int f3743d;

    /* renamed from: e, reason: collision with root package name */
    public y[] f3744e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f3740a == locationAvailability.f3740a && this.f3741b == locationAvailability.f3741b && this.f3742c == locationAvailability.f3742c && this.f3743d == locationAvailability.f3743d && Arrays.equals(this.f3744e, locationAvailability.f3744e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3743d), Integer.valueOf(this.f3740a), Integer.valueOf(this.f3741b), Long.valueOf(this.f3742c), this.f3744e});
    }

    public final String toString() {
        boolean z2 = this.f3743d < 1000;
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(z2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        int i11 = this.f3740a;
        c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.f3741b;
        c.k0(parcel, 2, 4);
        parcel.writeInt(i12);
        long j = this.f3742c;
        c.k0(parcel, 3, 8);
        parcel.writeLong(j);
        int i13 = this.f3743d;
        c.k0(parcel, 4, 4);
        parcel.writeInt(i13);
        c.f0(parcel, 5, this.f3744e, i10);
        c.j0(iH0, parcel);
    }
}
