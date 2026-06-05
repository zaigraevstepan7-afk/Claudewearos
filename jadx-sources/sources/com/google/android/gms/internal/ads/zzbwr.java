package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import nc.a2;
import nc.g2;
import nc.i2;
import nc.q3;
import nc.y1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwr extends zzayr implements zzbwt {
    public zzbwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final Bundle zzb() {
        Parcel parcelZzda = zzda(9, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final i2 zzc() {
        Parcel parcelZzda = zzda(12, zza());
        i2 i2VarZzb = g2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return i2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final zzbwq zzd() {
        zzbwq zzbwoVar;
        Parcel parcelZzda = zzda(11, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbwoVar = iInterfaceQueryLocalInterface instanceof zzbwq ? (zzbwq) iInterfaceQueryLocalInterface : new zzbwo(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zze() {
        Parcel parcelZzda = zzda(16, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzg(q3 q3Var, zzbxa zzbxaVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, zzbxaVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh(q3 q3Var, zzbxa zzbxaVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, zzbxaVar);
        zzdb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzi(boolean z2) {
        Parcel parcelZza = zza();
        int i10 = zzayt.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzdb(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzj(y1 y1Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, y1Var);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(a2 a2Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, a2Var);
        zzdb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(zzbww zzbwwVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwwVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm(zzbxh zzbxhVar) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbxhVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzn(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo(xd.a aVar, boolean z2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzp() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq(zzbxb zzbxbVar) {
        throw null;
    }
}
