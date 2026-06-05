package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbaz extends zzayr implements zzbbb {
    public zzbaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbbb
    public final void zzb() {
        zzdb(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbb
    public final void zzc() {
        zzdb(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbb
    public final void zzd(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbb
    public final void zze() {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbb
    public final void zzf() {
        zzdb(1, zza());
    }
}
