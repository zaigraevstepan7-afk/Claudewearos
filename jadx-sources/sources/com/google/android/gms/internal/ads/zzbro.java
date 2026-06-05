package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbro extends zzayr implements zzbrq {
    public zzbro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zzg(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(3, parcelZza);
    }
}
