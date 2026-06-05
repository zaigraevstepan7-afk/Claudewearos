package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbmn extends od.a {
    public static final Parcelable.Creator<zzbmn> CREATOR = new zzbmo();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbmn(int i10, int i11, String str, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzb;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        uk.c.c0(parcel, 2, this.zzc, false);
        int i12 = this.zzd;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.zza;
        uk.c.k0(parcel, zzbch.zzq.zzf, 4);
        parcel.writeInt(i13);
        uk.c.j0(iH0, parcel);
    }
}
