package nc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t3 extends od.a {
    public static final Parcelable.Creator<t3> CREATOR = new ig.e0(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f12235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12237c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12238d;

    public t3(int i10, int i11, long j, String str) {
        this.f12235a = i10;
        this.f12236b = i11;
        this.f12237c = str;
        this.f12238d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f12235a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f12236b);
        uk.c.c0(parcel, 3, this.f12237c, false);
        uk.c.k0(parcel, 4, 8);
        parcel.writeLong(this.f12238d);
        uk.c.j0(iH0, parcel);
    }
}
