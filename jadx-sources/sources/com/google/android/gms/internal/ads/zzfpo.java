package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpo extends od.a {
    public static final Parcelable.Creator<zzfpo> CREATOR = new zzfpp();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzfpo(int i10, int i11, int i12, String str, String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.zzb;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(i12);
        uk.c.c0(parcel, 3, this.zzc, false);
        uk.c.c0(parcel, 4, this.zzd, false);
        int i13 = this.zze;
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(i13);
        uk.c.j0(iH0, parcel);
    }

    public zzfpo(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }
}
