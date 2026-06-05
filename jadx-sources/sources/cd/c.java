package cd;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends od.a {
    public static final Parcelable.Creator<c> CREATOR = new ae.b(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f3221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3222b;

    public c(String str, String str2) {
        this.f3221a = str;
        this.f3222b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f3221a, false);
        uk.c.c0(parcel, 2, this.f3222b, false);
        uk.c.j0(iH0, parcel);
    }
}
