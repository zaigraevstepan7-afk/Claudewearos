package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends od.a {
    public static final Parcelable.Creator<j> CREATOR = new x0(24);

    /* renamed from: a, reason: collision with root package name */
    public final t f3649a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3650b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3651c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f3652d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3653e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3654f;

    public j(t tVar, boolean z2, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f3649a = tVar;
        this.f3650b = z2;
        this.f3651c = z10;
        this.f3652d = iArr;
        this.f3653e = i10;
        this.f3654f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f3649a, i10, false);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f3650b ? 1 : 0);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f3651c ? 1 : 0);
        uk.c.Y(parcel, 4, this.f3652d, false);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f3653e);
        uk.c.Y(parcel, 6, this.f3654f, false);
        uk.c.j0(iH0, parcel);
    }
}
