package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 extends od.a {
    public static final Parcelable.Creator<r0> CREATOR = new ae.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3309a;

    public r0(boolean z2) {
        this.f3309a = Boolean.valueOf(z2).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r0) && this.f3309a == ((r0) obj).f3309a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3309a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3309a ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
