package sd;

import android.os.Parcel;
import android.os.Parcelable;
import pc.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends od.a {
    public static final Parcelable.Creator<g> CREATOR = new j(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f14988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14989b;

    /* renamed from: c, reason: collision with root package name */
    public final a f14990c;

    public g(a aVar, String str) {
        this.f14988a = 1;
        this.f14989b = str;
        this.f14990c = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14988a);
        uk.c.c0(parcel, 2, this.f14989b, false);
        uk.c.b0(parcel, 3, this.f14990c, i10, false);
        uk.c.j0(iH0, parcel);
    }

    public g(a aVar, String str, int i10) {
        this.f14988a = i10;
        this.f14989b = str;
        this.f14990c = aVar;
    }
}
