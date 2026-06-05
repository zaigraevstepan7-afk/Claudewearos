package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzw extends zza implements IInterface {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzv zzvVar, RegisterRequestParams registerRequestParams) {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzvVar);
        zzc.zzd(parcelZza, registerRequestParams);
        zzb(1, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzv zzvVar, SignRequestParams signRequestParams) {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeStrongBinder(zzvVar);
        zzc.zzd(parcelZza, signRequestParams);
        zzb(2, parcelZza);
    }
}
