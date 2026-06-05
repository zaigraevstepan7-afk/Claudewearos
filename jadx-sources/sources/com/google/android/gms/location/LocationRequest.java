package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import dd.d;
import java.util.Arrays;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new d(12);
    public long A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public int f3745a;

    /* renamed from: b, reason: collision with root package name */
    public long f3746b;

    /* renamed from: c, reason: collision with root package name */
    public long f3747c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3748d;

    /* renamed from: e, reason: collision with root package name */
    public long f3749e;

    /* renamed from: f, reason: collision with root package name */
    public int f3750f;

    /* renamed from: z, reason: collision with root package name */
    public float f3751z;

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f3745a != locationRequest.f3745a) {
            return false;
        }
        long j = this.f3746b;
        long j4 = locationRequest.f3746b;
        if (j != j4 || this.f3747c != locationRequest.f3747c || this.f3748d != locationRequest.f3748d || this.f3749e != locationRequest.f3749e || this.f3750f != locationRequest.f3750f || this.f3751z != locationRequest.f3751z) {
            return false;
        }
        long j10 = this.A;
        if (j10 >= j) {
            j = j10;
        }
        long j11 = locationRequest.A;
        if (j11 >= j4) {
            j4 = j11;
        }
        return j == j4 && this.B == locationRequest.B;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3745a), Long.valueOf(this.f3746b), Float.valueOf(this.f3751z), Long.valueOf(this.A)});
    }

    public final String toString() {
        int i10 = this.f3750f;
        float f10 = this.f3751z;
        long j = this.A;
        long j4 = this.f3746b;
        StringBuilder sb2 = new StringBuilder("Request[");
        int i11 = this.f3745a;
        sb2.append(i11 != 100 ? i11 != 102 ? i11 != 104 ? i11 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i11 != 105) {
            sb2.append(" requested=");
            sb2.append(j4);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f3747c);
        sb2.append("ms");
        if (j > j4) {
            sb2.append(" maxWait=");
            sb2.append(j);
            sb2.append("ms");
        }
        if (f10 > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(f10);
            sb2.append("m");
        }
        long j10 = this.f3749e;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (i10 != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(i10);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        int i11 = this.f3745a;
        c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        long j = this.f3746b;
        c.k0(parcel, 2, 8);
        parcel.writeLong(j);
        long j4 = this.f3747c;
        c.k0(parcel, 3, 8);
        parcel.writeLong(j4);
        boolean z2 = this.f3748d;
        c.k0(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j10 = this.f3749e;
        c.k0(parcel, 5, 8);
        parcel.writeLong(j10);
        int i12 = this.f3750f;
        c.k0(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f3751z;
        c.k0(parcel, 7, 4);
        parcel.writeFloat(f10);
        long j11 = this.A;
        c.k0(parcel, 8, 8);
        parcel.writeLong(j11);
        boolean z10 = this.B;
        c.k0(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c.j0(iH0, parcel);
    }
}
