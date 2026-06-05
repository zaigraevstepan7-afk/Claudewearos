package nc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n3 extends od.a {
    public static final Parcelable.Creator<n3> CREATOR = new ig.e0(20);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12151a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12152b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12153c;

    public n3(fc.x xVar) {
        this(xVar.f6717a, xVar.f6718b, xVar.f6719c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f12151a ? 1 : 0);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f12152b ? 1 : 0);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f12153c ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }

    public n3(boolean z2, boolean z10, boolean z11) {
        this.f12151a = z2;
        this.f12152b = z10;
        this.f12153c = z11;
    }
}
