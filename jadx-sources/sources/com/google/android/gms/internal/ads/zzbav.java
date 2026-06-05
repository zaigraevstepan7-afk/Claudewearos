package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbav extends zzayr implements zzbax {
    public zzbav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzb(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzc(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzd(zzbau zzbauVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbauVar);
        zzdb(1, parcelZza);
    }
}
