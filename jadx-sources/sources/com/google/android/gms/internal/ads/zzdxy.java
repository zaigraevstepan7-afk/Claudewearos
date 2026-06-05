package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import qc.q;
import qc.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdxy extends zzbvf {
    final /* synthetic */ zzdya zza;

    public zzdxy(zzdya zzdyaVar) {
        this.zza = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(r rVar) {
        zzcai zzcaiVar = this.zza.zza;
        rVar.getClass();
        zzcaiVar.zzd(new q(rVar.f13443a, rVar.f13444b));
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdya zzdyaVar = this.zza;
        zzdyaVar.zza.zzc(new zzdyq(autoCloseInputStream, zzdyaVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvo zzbvoVar) {
        this.zza.zza.zzc(new zzdyq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvoVar));
    }
}
