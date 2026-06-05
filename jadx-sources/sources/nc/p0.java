package nc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 extends od.a {
    public static final Parcelable.Creator<p0> CREATOR = new ig.e0(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f12168a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12169b;

    public p0(String str, String str2) {
        this.f12168a = str;
        this.f12169b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f12168a, false);
        uk.c.c0(parcel, 2, this.f12169b, false);
        uk.c.j0(iH0, parcel);
    }
}
