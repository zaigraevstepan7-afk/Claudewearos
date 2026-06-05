package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfsc extends zzayr implements zzfse {
    public zzfsc(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final void zze(Bundle bundle, zzfsg zzfsgVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzf(parcelZza, zzfsgVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final void zzf(String str, Bundle bundle, zzfsg zzfsgVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzf(parcelZza, zzfsgVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final void zzg(Bundle bundle, zzfsg zzfsgVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzf(parcelZza, zzfsgVar);
        zzdc(3, parcelZza);
    }
}
