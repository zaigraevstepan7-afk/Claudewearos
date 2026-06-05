package ee;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k extends od.a {
    public static final Parcelable.Creator<k> CREATOR = new dd.d(17);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5953a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5954b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5955c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5956d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5957e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5958f;

    public k(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f5953a = z2;
        this.f5954b = z10;
        this.f5955c = z11;
        this.f5956d = z12;
        this.f5957e = z13;
        this.f5958f = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5953a ? 1 : 0);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5954b ? 1 : 0);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f5955c ? 1 : 0);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f5956d ? 1 : 0);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f5957e ? 1 : 0);
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(this.f5958f ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
