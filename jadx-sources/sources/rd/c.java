package rd;

import android.os.Parcel;
import android.os.Parcelable;
import pc.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends od.a {
    public static final Parcelable.Creator<c> CREATOR = new j(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f14366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14368c;

    public c(int i10, String str, int i11) {
        this.f14366a = i10;
        this.f14367b = str;
        this.f14368c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14366a);
        uk.c.c0(parcel, 2, this.f14367b, false);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f14368c);
        uk.c.j0(iH0, parcel);
    }

    public c(String str, int i10) {
        this.f14366a = 1;
        this.f14367b = str;
        this.f14368c = i10;
    }
}
