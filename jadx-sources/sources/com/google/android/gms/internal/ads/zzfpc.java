package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpc extends od.a {
    public static final Parcelable.Creator<zzfpc> CREATOR = new zzfpd();
    public final int zza;
    public final byte[] zzb;

    public zzfpc(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        uk.c.V(parcel, 2, this.zzb, false);
        uk.c.j0(iH0, parcel);
    }

    public zzfpc(byte[] bArr) {
        this(1, bArr);
    }
}
