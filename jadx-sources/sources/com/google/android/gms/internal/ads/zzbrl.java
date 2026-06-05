package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import nc.k2;
import nc.l2;
import nc.q3;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbrl extends zzayr implements zzbrn {
    public zzbrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final l2 zze() {
        Parcel parcelZzda = zzda(5, zza());
        l2 l2VarZzb = k2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return l2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzf() {
        Parcel parcelZzda = zzda(2, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzg() {
        Parcel parcelZzda = zzda(3, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzh(xd.a aVar, String str, Bundle bundle, Bundle bundle2, s3 s3Var, zzbrq zzbrqVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzd(parcelZza, bundle2);
        zzayt.zzd(parcelZza, s3Var);
        zzayt.zzf(parcelZza, zzbrqVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzi(String str, String str2, q3 q3Var, xd.a aVar, zzbqy zzbqyVar, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbqyVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzj(String str, String str2, q3 q3Var, xd.a aVar, zzbrb zzbrbVar, zzbpu zzbpuVar, s3 s3Var) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbrbVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, s3Var);
        zzdb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzk(String str, String str2, q3 q3Var, xd.a aVar, zzbrb zzbrbVar, zzbpu zzbpuVar, s3 s3Var) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbrbVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, s3Var);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzl(String str, String str2, q3 q3Var, xd.a aVar, zzbre zzbreVar, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbreVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzm(String str, String str2, q3 q3Var, xd.a aVar, zzbrh zzbrhVar, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbrhVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzn(String str, String str2, q3 q3Var, xd.a aVar, zzbrh zzbrhVar, zzbpu zzbpuVar, zzbgc zzbgcVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbrhVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, zzbgcVar);
        zzdb(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzo(String str, String str2, q3 q3Var, xd.a aVar, zzbrk zzbrkVar, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbrkVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzp(String str, String str2, q3 q3Var, xd.a aVar, zzbrk zzbrkVar, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, q3Var);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbrkVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzq(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzr(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        Parcel parcelZzda = zzda(24, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzs(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        Parcel parcelZzda = zzda(15, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzt(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        Parcel parcelZzda = zzda(17, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
