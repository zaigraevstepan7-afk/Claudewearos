package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzcl extends a {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzcl(long j, long j4, boolean z2, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j;
        this.zzb = j4;
        this.zzc = z2;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        long j = this.zza;
        c.k0(parcel, 1, 8);
        parcel.writeLong(j);
        long j4 = this.zzb;
        c.k0(parcel, 2, 8);
        parcel.writeLong(j4);
        boolean z2 = this.zzc;
        c.k0(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        c.c0(parcel, 4, this.zzd, false);
        c.c0(parcel, 5, this.zze, false);
        c.c0(parcel, 6, this.zzf, false);
        c.U(parcel, 7, this.zzg, false);
        c.c0(parcel, 8, this.zzh, false);
        c.j0(iH0, parcel);
    }
}
