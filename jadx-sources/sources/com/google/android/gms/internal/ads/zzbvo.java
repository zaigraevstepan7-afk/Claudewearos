package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbvo extends od.a {
    public static final Parcelable.Creator<zzbvo> CREATOR = new zzbvp();
    public final Bundle zza;
    public final rc.a zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfei zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final int zzo;

    public zzbvo(Bundle bundle, rc.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfei zzfeiVar, String str4, boolean z2, boolean z10, Bundle bundle2, Bundle bundle3, int i10) {
        this.zza = bundle;
        this.zzb = aVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfeiVar;
        this.zzj = str4;
        this.zzk = z2;
        this.zzl = z10;
        this.zzm = bundle2;
        this.zzn = bundle3;
        this.zzo = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.U(parcel, 1, bundle, false);
        uk.c.b0(parcel, 2, this.zzb, i10, false);
        uk.c.b0(parcel, 3, this.zzc, i10, false);
        uk.c.c0(parcel, 4, this.zzd, false);
        uk.c.e0(parcel, 5, this.zze);
        uk.c.b0(parcel, 6, this.zzf, i10, false);
        uk.c.c0(parcel, 7, this.zzg, false);
        uk.c.c0(parcel, 9, this.zzh, false);
        uk.c.b0(parcel, 10, this.zzi, i10, false);
        uk.c.c0(parcel, 11, this.zzj, false);
        boolean z2 = this.zzk;
        uk.c.k0(parcel, 12, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.zzl;
        uk.c.k0(parcel, 13, 4);
        parcel.writeInt(z10 ? 1 : 0);
        uk.c.U(parcel, 14, this.zzm, false);
        uk.c.U(parcel, 15, this.zzn, false);
        int i11 = this.zzo;
        uk.c.k0(parcel, 16, 4);
        parcel.writeInt(i11);
        uk.c.j0(iH0, parcel);
    }
}
