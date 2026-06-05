package ee;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends od.a {
    public static final Parcelable.Creator<b> CREATOR = new dd.d(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f5928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5929b;

    public b(int i10, int i11) {
        this.f5928a = i10;
        this.f5929b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5928a == bVar.f5928a && this.f5929b == bVar.f5929b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5928a), Integer.valueOf(this.f5929b)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(this.f5928a);
        sb2.append(", mTransitionType=");
        sb2.append(this.f5929b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.i(parcel);
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5928a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5929b);
        uk.c.j0(iH0, parcel);
    }
}
