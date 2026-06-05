package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwe extends zzayr implements zzbwg {
    public zzbwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zze(zzbwa zzbwaVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwaVar);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzf() {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzg(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzh() {
        zzdb(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzi() {
        zzdb(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzj() {
        zzdb(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzk() {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzl() {
        zzdb(3, zza());
    }
}
