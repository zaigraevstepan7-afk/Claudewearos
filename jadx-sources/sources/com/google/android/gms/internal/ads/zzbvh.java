package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import qc.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbvh extends zzayr implements IInterface {
    public zzbvh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(r rVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, rVar);
        zzdb(2, parcelZza);
    }

    public final void zzf(String str, zzbuy zzbuyVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzd(parcelZza, zzbuyVar);
        zzdb(1, parcelZza);
    }
}
