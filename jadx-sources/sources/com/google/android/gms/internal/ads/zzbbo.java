package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbo extends zzayr implements IInterface {
    public zzbbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbbm zzbbmVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbbmVar);
        Parcel parcelZzda = zzda(3, parcelZza);
        long j = parcelZzda.readLong();
        parcelZzda.recycle();
        return j;
    }

    public final zzbbj zzf(zzbbm zzbbmVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbbmVar);
        Parcel parcelZzda = zzda(1, parcelZza);
        zzbbj zzbbjVar = (zzbbj) zzayt.zza(parcelZzda, zzbbj.CREATOR);
        parcelZzda.recycle();
        return zzbbjVar;
    }

    public final zzbbj zzg(zzbbm zzbbmVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbbmVar);
        Parcel parcelZzda = zzda(2, parcelZza);
        zzbbj zzbbjVar = (zzbbj) zzayt.zza(parcelZzda, zzbbj.CREATOR);
        parcelZzda.recycle();
        return zzbbjVar;
    }
}
