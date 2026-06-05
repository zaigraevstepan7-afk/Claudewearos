package ig;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b0 extends od.a {
    public static final Parcelable.Creator<b0> CREATOR = new gd.g(27);

    /* renamed from: a, reason: collision with root package name */
    public String f8519a;

    /* renamed from: b, reason: collision with root package name */
    public String f8520b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8521c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8522d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f8523e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, this.f8519a, false);
        uk.c.c0(parcel, 3, this.f8520b, false);
        boolean z2 = this.f8521c;
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.f8522d;
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
