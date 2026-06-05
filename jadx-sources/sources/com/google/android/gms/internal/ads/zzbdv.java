package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbdv extends zzayr implements zzbdx {
    public zzbdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final void zze(zzbdu zzbduVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbduVar);
        zzdb(1, parcelZza);
    }
}
