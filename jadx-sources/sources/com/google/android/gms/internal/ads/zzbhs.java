package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbhs extends zzayr implements zzbhu {
    public zzbhs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhu
    public final void zze(zzbhh zzbhhVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbhhVar);
        zzdb(1, parcelZza);
    }
}
