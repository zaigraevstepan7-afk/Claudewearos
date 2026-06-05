package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpj extends zzayr implements IInterface {
    public zzfpj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfph zze(zzfpf zzfpfVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzfpfVar);
        Parcel parcelZzda = zzda(1, parcelZza);
        zzfph zzfphVar = (zzfph) zzayt.zza(parcelZzda, zzfph.CREATOR);
        parcelZzda.recycle();
        return zzfphVar;
    }

    public final zzfpq zzf(zzfpo zzfpoVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzfpoVar);
        Parcel parcelZzda = zzda(3, parcelZza);
        zzfpq zzfpqVar = (zzfpq) zzayt.zza(parcelZzda, zzfpq.CREATOR);
        parcelZzda.recycle();
        return zzfpqVar;
    }

    public final void zzg(zzfpc zzfpcVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzfpcVar);
        zzdb(2, parcelZza);
    }
}
