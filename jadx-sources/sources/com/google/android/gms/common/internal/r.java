package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends od.a {
    public static final Parcelable.Creator<r> CREATOR = new x0(19);
    public final int A;
    public final int B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3696c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3697d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3698e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3699f;

    /* renamed from: z, reason: collision with root package name */
    public final String f3700z;

    public r(int i10, int i11, int i12, long j, long j4, String str, String str2, int i13, int i14) {
        this.f3694a = i10;
        this.f3695b = i11;
        this.f3696c = i12;
        this.f3697d = j;
        this.f3698e = j4;
        this.f3699f = str;
        this.f3700z = str2;
        this.A = i13;
        this.B = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3694a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f3695b);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f3696c);
        uk.c.k0(parcel, 4, 8);
        parcel.writeLong(this.f3697d);
        uk.c.k0(parcel, 5, 8);
        parcel.writeLong(this.f3698e);
        uk.c.c0(parcel, 6, this.f3699f, false);
        uk.c.c0(parcel, 7, this.f3700z, false);
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(this.A);
        uk.c.k0(parcel, 9, 4);
        parcel.writeInt(this.B);
        uk.c.j0(iH0, parcel);
    }
}
