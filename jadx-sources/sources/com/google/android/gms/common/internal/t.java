package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends od.a {
    public static final Parcelable.Creator<t> CREATOR = new x0(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3705b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3707d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3708e;

    public t(int i10, int i11, int i12, boolean z2, boolean z10) {
        this.f3704a = i10;
        this.f3705b = z2;
        this.f3706c = z10;
        this.f3707d = i11;
        this.f3708e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3704a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f3705b ? 1 : 0);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f3706c ? 1 : 0);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f3707d);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f3708e);
        uk.c.j0(iH0, parcel);
    }
}
