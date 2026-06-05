package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwj extends zzayr implements zzbwl {
    public zzbwj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zze(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzf(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzg(xd.a aVar, int i10) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeInt(i10);
        zzdb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzh(xd.a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzi(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzj(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzk(xd.a aVar, int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzl(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzm(xd.a aVar, zzbwm zzbwmVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, zzbwmVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzn(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzo(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzp(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(5, parcelZza);
    }
}
