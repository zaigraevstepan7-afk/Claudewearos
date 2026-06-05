package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbva extends zzayr implements zzbvc {
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(zzbvo zzbvoVar, zzbvg zzbvgVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbvoVar);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(zzbvo zzbvoVar, zzbvg zzbvgVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbvoVar);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(zzbvo zzbvoVar, zzbvg zzbvgVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbvoVar);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzh(String str, zzbvg zzbvgVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzi(zzbuy zzbuyVar, zzbvh zzbvhVar) {
        throw null;
    }
}
