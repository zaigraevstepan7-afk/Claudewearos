package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends od.a {
    public static final Parcelable.Creator<m0> CREATOR = new ae.b(24);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3294a;

    public m0(boolean z2) {
        this.f3294a = z2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.f3294a == ((m0) obj).f3294a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3294a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3294a ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
