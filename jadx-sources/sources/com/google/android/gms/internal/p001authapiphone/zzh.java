package com.google.android.gms.internal.p001authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zzeVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzeVar);
        zzb(4, parcelZza);
    }

    public final void zzd(String str, zzg zzgVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzc(parcelZza, zzgVar);
        zzb(5, parcelZza);
    }

    public final void zze(j jVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, jVar);
        zzb(3, parcelZza);
    }

    public final void zzf(j jVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, jVar);
        zzb(6, parcelZza);
    }

    public final void zzg(zzj zzjVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzjVar);
        zzb(1, parcelZza);
    }

    public final void zzh(String str, zzj zzjVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzc(parcelZza, zzjVar);
        zzb(2, parcelZza);
    }
}
