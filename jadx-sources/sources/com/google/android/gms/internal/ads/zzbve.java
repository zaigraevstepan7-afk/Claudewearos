package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import qc.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbve extends zzayr implements zzbvg {
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(r rVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, rVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, parcelFileDescriptor);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvo zzbvoVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, parcelFileDescriptor);
        zzayt.zzd(parcelZza, zzbvoVar);
        zzdb(3, parcelZza);
    }
}
