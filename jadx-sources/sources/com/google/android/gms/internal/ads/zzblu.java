package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzblu extends zzayr implements IInterface {
    public zzblu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzblo zzbloVar, zzblt zzbltVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbloVar);
        zzayt.zzf(parcelZza, zzbltVar);
        zzdc(2, parcelZza);
    }
}
