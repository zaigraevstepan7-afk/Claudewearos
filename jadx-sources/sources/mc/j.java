package mc;

import android.os.Parcel;
import android.os.Parcelable;
import ig.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends od.a {
    public static final Parcelable.Creator<j> CREATOR = new e0(11);
    public final boolean A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11560a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11561b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11562c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11563d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11564e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11565f;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f11566z;

    public j(boolean z2, boolean z10, String str, boolean z11, float f10, int i10, boolean z12, boolean z13, boolean z14) {
        this.f11560a = z2;
        this.f11561b = z10;
        this.f11562c = str;
        this.f11563d = z11;
        this.f11564e = f10;
        this.f11565f = i10;
        this.f11566z = z12;
        this.A = z13;
        this.B = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f11560a ? 1 : 0);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f11561b ? 1 : 0);
        uk.c.c0(parcel, 4, this.f11562c, false);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f11563d ? 1 : 0);
        uk.c.k0(parcel, 6, 4);
        parcel.writeFloat(this.f11564e);
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(this.f11565f);
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(this.f11566z ? 1 : 0);
        uk.c.k0(parcel, 9, 4);
        parcel.writeInt(this.A ? 1 : 0);
        uk.c.k0(parcel, 10, 4);
        parcel.writeInt(this.B ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }

    public j(boolean z2, boolean z10, boolean z11, float f10, boolean z12, boolean z13, boolean z14) {
        this(z2, z10, null, z11, f10, -1, z12, z13, z14);
    }
}
