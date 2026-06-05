package ld;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ig.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new e0(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f10898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10899b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f10900c;

    public a(int i10, int i11, Bundle bundle) {
        this.f10898a = i10;
        this.f10899b = i11;
        this.f10900c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f10898a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f10899b);
        uk.c.U(parcel, 3, this.f10900c, false);
        uk.c.j0(iH0, parcel);
    }
}
