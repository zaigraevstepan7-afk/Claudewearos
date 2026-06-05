package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbhz extends zzayr implements zzbib {
    public zzbhz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final void zze(zzbih zzbihVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbihVar);
        zzdb(1, parcelZza);
    }
}
