package cd;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends od.a {
    public static final Parcelable.Creator<d> CREATOR = new ae.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f3223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3224b;

    public d(String str, int i10) {
        this.f3223a = str;
        this.f3224b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f3223a, false);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f3224b);
        uk.c.j0(iH0, parcel);
    }
}
