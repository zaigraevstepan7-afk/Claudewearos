package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 extends od.a {
    public static final Parcelable.Creator<d1> CREATOR = new ae.b(4);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3246a;

    public d1(boolean z2) {
        this.f3246a = Boolean.valueOf(z2).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d1) && this.f3246a == ((d1) obj).f3246a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3246a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3246a ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
