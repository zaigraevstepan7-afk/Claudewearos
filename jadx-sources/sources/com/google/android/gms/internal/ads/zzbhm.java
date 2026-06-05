package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbhm extends zzayr implements zzbho {
    public zzbhm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbho
    public final void zze(zzbhe zzbheVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbheVar);
        zzdb(1, parcelZza);
    }
}
