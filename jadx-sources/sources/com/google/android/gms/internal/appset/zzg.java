package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import cd.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(c cVar, zzf zzfVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, cVar);
        zzc.zzc(parcelZza, zzfVar);
        zzb(1, parcelZza);
    }
}
