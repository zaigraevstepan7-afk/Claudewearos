package nc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y2 extends od.a {
    public static final Parcelable.Creator<y2> CREATOR = new ig.e0(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f12259a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12260b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12261c;

    public y2(int i10, int i11, String str) {
        this.f12259a = i10;
        this.f12260b = i11;
        this.f12261c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f12259a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f12260b);
        uk.c.c0(parcel, 3, this.f12261c, false);
        uk.c.j0(iH0, parcel);
    }
}
