package ee;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l extends od.a {
    public static final Parcelable.Creator<l> CREATOR = new dd.d(20);

    /* renamed from: a, reason: collision with root package name */
    public final List f5959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5960b;

    public l(ArrayList arrayList, int i10) {
        this.f5959a = arrayList;
        this.f5960b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return e0.l(this.f5959a, lVar.f5959a) && this.f5960b == lVar.f5960b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5959a, Integer.valueOf(this.f5960b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.i(parcel);
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.g0(parcel, 1, this.f5959a, false);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5960b);
        uk.c.j0(iH0, parcel);
    }
}
