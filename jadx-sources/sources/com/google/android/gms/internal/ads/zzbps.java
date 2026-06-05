package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbps extends zzayr implements zzbpu {
    public zzbps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zze() {
        zzdb(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzf() {
        zzdb(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzg(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzh(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzi(int i10, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        zzdb(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzj(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzk(h2 h2Var) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, h2Var);
        zzdb(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzl(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzm() {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzn() {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzo() {
        zzdb(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzp() {
        zzdb(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(zzbhh zzbhhVar, String str) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbhhVar);
        parcelZza.writeString(str);
        zzdb(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzs(zzbwm zzbwmVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzt(zzbwq zzbwqVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwqVar);
        zzdb(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzu() {
        zzdb(25, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzv() {
        zzdb(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzw() {
        zzdb(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzx() {
        zzdb(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzy() {
        zzdb(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzz() {
        zzdb(13, zza());
    }
}
