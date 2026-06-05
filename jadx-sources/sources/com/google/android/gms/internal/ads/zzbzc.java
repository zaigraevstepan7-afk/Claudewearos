package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import nc.q3;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbzc extends od.a {
    public static final Parcelable.Creator<zzbzc> CREATOR = new zzbzd();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final s3 zzc;
    public final q3 zzd;
    public final int zze;
    public final String zzf;

    public zzbzc(String str, String str2, s3 s3Var, q3 q3Var, int i10, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = s3Var;
        this.zzd = q3Var;
        this.zze = i10;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, str, false);
        uk.c.c0(parcel, 2, this.zzb, false);
        uk.c.b0(parcel, 3, this.zzc, i10, false);
        uk.c.b0(parcel, 4, this.zzd, i10, false);
        int i11 = this.zze;
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(i11);
        uk.c.c0(parcel, 6, this.zzf, false);
        uk.c.j0(iH0, parcel);
    }
}
