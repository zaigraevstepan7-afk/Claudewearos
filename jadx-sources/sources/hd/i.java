package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends od.a {
    public static final Parcelable.Creator<i> CREATOR = new gd.g(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f7865a;

    public i(int i10) {
        this.f7865a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return e0.l(Integer.valueOf(this.f7865a), Integer.valueOf(((i) obj).f7865a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7865a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f7865a);
        uk.c.j0(iH0, parcel);
    }
}
