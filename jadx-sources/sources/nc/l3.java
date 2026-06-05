package nc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l3 extends od.a {
    public static final Parcelable.Creator<l3> CREATOR = new ig.e0(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f12144a;

    public l3(String str) {
        this.f12144a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 15, this.f12144a, false);
        uk.c.j0(iH0, parcel);
    }
}
