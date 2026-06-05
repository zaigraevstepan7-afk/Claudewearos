package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbhw extends zzayr implements zzbhy {
    public zzbhw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zze(m0 m0Var, xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, m0Var);
        zzayt.zzf(parcelZza, aVar);
        zzdb(1, parcelZza);
    }
}
