package rd;

import android.os.Parcel;
import android.os.Parcelable;
import pc.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends od.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f14364a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14365b;

    public b(int i10, a aVar) {
        this.f14364a = i10;
        this.f14365b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14364a);
        uk.c.b0(parcel, 2, this.f14365b, i10, false);
        uk.c.j0(iH0, parcel);
    }

    public b(a aVar) {
        this.f14364a = 1;
        this.f14365b = aVar;
    }
}
