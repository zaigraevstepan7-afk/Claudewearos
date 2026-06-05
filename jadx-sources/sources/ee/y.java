package ee;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y extends od.a {
    public static final Parcelable.Creator<y> CREATOR = new dd.d(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f5964a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5965b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5966c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5967d;

    public y(long j, int i10, int i11, long j4) {
        this.f5964a = i10;
        this.f5965b = i11;
        this.f5966c = j;
        this.f5967d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f5964a == yVar.f5964a && this.f5965b == yVar.f5965b && this.f5966c == yVar.f5966c && this.f5967d == yVar.f5967d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5965b), Integer.valueOf(this.f5964a), Long.valueOf(this.f5967d), Long.valueOf(this.f5966c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f5964a + " Cell status: " + this.f5965b + " elapsed time NS: " + this.f5967d + " system time ms: " + this.f5966c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5964a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5965b);
        uk.c.k0(parcel, 3, 8);
        parcel.writeLong(this.f5966c);
        uk.c.k0(parcel, 4, 8);
        parcel.writeLong(this.f5967d);
        uk.c.j0(iH0, parcel);
    }
}
