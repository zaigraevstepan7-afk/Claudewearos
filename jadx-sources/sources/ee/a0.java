package ee;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a0 extends od.a {
    public static final Parcelable.Creator<a0> CREATOR = new dd.d(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f5924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5927d;

    public a0(int i10, int i11, int i12, int i13) {
        e0.k("Start hour must be in range [0, 23].", i10 >= 0 && i10 <= 23);
        e0.k("Start minute must be in range [0, 59].", i11 >= 0 && i11 <= 59);
        e0.k("End hour must be in range [0, 23].", i12 >= 0 && i12 <= 23);
        e0.k("End minute must be in range [0, 59].", i13 >= 0 && i13 <= 59);
        e0.k("Parameters can't be all 0.", ((i10 + i11) + i12) + i13 > 0);
        this.f5924a = i10;
        this.f5925b = i11;
        this.f5926c = i12;
        this.f5927d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f5924a == a0Var.f5924a && this.f5925b == a0Var.f5925b && this.f5926c == a0Var.f5926c && this.f5927d == a0Var.f5927d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5924a), Integer.valueOf(this.f5925b), Integer.valueOf(this.f5926c), Integer.valueOf(this.f5927d)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(this.f5924a);
        sb2.append(", startMinute=");
        sb2.append(this.f5925b);
        sb2.append(", endHour=");
        sb2.append(this.f5926c);
        sb2.append(", endMinute=");
        sb2.append(this.f5927d);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.i(parcel);
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5924a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5925b);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f5926c);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f5927d);
        uk.c.j0(iH0, parcel);
    }
}
