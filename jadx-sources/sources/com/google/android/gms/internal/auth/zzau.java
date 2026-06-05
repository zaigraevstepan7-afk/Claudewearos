package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzau extends zza implements IInterface {
    public zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    public final void zzd(zzat zzatVar, zzaq zzaqVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzaqVar);
        zzc(7, parcelZza);
    }

    public final void zze(zzat zzatVar, zzbb zzbbVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzbbVar);
        zzc(8, parcelZza);
    }

    public final void zzf(zzat zzatVar, zzav zzavVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzavVar);
        zzc(9, parcelZza);
    }

    public final void zzg(zzat zzatVar, zzax zzaxVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzaxVar);
        zzc(6, parcelZza);
    }

    public final void zzh(zzat zzatVar, zzaz zzazVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzazVar);
        zzc(5, parcelZza);
    }
}
