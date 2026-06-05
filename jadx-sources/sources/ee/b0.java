package ee;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b0 extends od.a {
    public static final Parcelable.Creator<b0> CREATOR = new dd.d(24);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5930a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5931b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5932c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5933d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5934e;

    public b0(boolean z2, long j, float f10, long j4, int i10) {
        this.f5930a = z2;
        this.f5931b = j;
        this.f5932c = f10;
        this.f5933d = j4;
        this.f5934e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f5930a == b0Var.f5930a && this.f5931b == b0Var.f5931b && Float.compare(this.f5932c, b0Var.f5932c) == 0 && this.f5933d == b0Var.f5933d && this.f5934e == b0Var.f5934e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5930a), Long.valueOf(this.f5931b), Float.valueOf(this.f5932c), Long.valueOf(this.f5933d), Integer.valueOf(this.f5934e)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f5930a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f5931b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f5932c);
        long j = this.f5933d;
        if (j != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j - jElapsedRealtime);
            sb2.append("ms");
        }
        int i10 = this.f5934e;
        if (i10 != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(i10);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5930a ? 1 : 0);
        uk.c.k0(parcel, 2, 8);
        parcel.writeLong(this.f5931b);
        uk.c.k0(parcel, 3, 4);
        parcel.writeFloat(this.f5932c);
        uk.c.k0(parcel, 4, 8);
        parcel.writeLong(this.f5933d);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f5934e);
        uk.c.j0(iH0, parcel);
    }
}
