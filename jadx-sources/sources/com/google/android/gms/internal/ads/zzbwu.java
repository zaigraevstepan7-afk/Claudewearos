package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwu extends zzayr implements zzbww {
    public zzbwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze() {
        zzdb(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf() {
        zzdb(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        zzdb(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzh(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzi(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzj() {
        zzdb(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzk(zzbwq zzbwqVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwqVar);
        zzdb(3, parcelZza);
    }
}
