package nc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k3 extends od.a {
    public static final Parcelable.Creator<k3> CREATOR = new ig.e0(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f12138a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12139b;

    public k3(int i10, int i11) {
        this.f12138a = i10;
        this.f12139b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f12138a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f12139b);
        uk.c.j0(iH0, parcel);
    }
}
