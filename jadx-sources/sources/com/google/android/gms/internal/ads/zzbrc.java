package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbrc extends zzayr implements zzbre {
    public zzbrc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void zzf(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void zzg() {
        zzdb(2, zza());
    }
}
