package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends od.a {
    public static final Parcelable.Creator<k0> CREATOR = new x0(23);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f3663a;

    /* renamed from: b, reason: collision with root package name */
    public nd.d[] f3664b;

    /* renamed from: c, reason: collision with root package name */
    public int f3665c;

    /* renamed from: d, reason: collision with root package name */
    public j f3666d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.U(parcel, 1, this.f3663a, false);
        uk.c.f0(parcel, 2, this.f3664b, i10);
        int i11 = this.f3665c;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        uk.c.b0(parcel, 4, this.f3666d, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
