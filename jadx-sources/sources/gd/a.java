package gd;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f7363a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7364b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7365c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7366d;

    public a(int i10, boolean z2, long j, boolean z10) {
        this.f7363a = i10;
        this.f7364b = z2;
        this.f7365c = j;
        this.f7366d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f7363a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f7364b ? 1 : 0);
        uk.c.k0(parcel, 3, 8);
        parcel.writeLong(this.f7365c);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f7366d ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
