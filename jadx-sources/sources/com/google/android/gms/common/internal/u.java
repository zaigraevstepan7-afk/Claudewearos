package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends od.a {
    public static final Parcelable.Creator<u> CREATOR = new x0(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f3709a;

    /* renamed from: b, reason: collision with root package name */
    public List f3710b;

    public u(int i10, List list) {
        this.f3709a = i10;
        this.f3710b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3709a);
        uk.c.g0(parcel, 2, this.f3710b, false);
        uk.c.j0(iH0, parcel);
    }
}
