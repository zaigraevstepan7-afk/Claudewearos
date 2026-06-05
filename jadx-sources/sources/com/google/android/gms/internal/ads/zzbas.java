package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.a2;
import nc.g2;
import nc.i2;
import nc.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbas extends zzayr implements zzbau {
    public zzbas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final m0 zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final i2 zzf() {
        Parcel parcelZzda = zzda(5, zza());
        i2 i2VarZzb = g2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return i2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final String zzg() {
        Parcel parcelZzda = zzda(8, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzh(boolean z2) {
        Parcel parcelZza = zza();
        int i10 = zzayt.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzi(a2 a2Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, a2Var);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzj(xd.a aVar, zzbbb zzbbbVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbbbVar);
        zzdb(4, parcelZza);
    }
}
