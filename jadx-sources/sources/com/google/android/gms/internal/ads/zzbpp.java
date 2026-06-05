package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import nc.k2;
import nc.l2;
import nc.q3;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbpp extends zzayr implements zzbpr {
    public zzbpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzA(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzB(q3 q3Var, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzC(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzD(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzE() {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzF() {
        zzdb(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzG(boolean z2) {
        Parcel parcelZza = zza();
        int i10 = zzayt.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzdb(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzH(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzI() {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzJ(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzK(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzL() {
        zzdb(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzM() {
        Parcel parcelZzda = zzda(22, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzN() {
        Parcel parcelZzda = zzda(13, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpz zzO() {
        zzbpz zzbpzVar;
        Parcel parcelZzda = zzda(15, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbpzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbpzVar = iInterfaceQueryLocalInterface instanceof zzbpz ? (zzbpz) iInterfaceQueryLocalInterface : new zzbpz(strongBinder);
        }
        parcelZzda.recycle();
        return zzbpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbqa zzP() {
        zzbqa zzbqaVar;
        Parcel parcelZzda = zzda(16, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbqaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbqaVar = iInterfaceQueryLocalInterface instanceof zzbqa ? (zzbqa) iInterfaceQueryLocalInterface : new zzbqa(strongBinder);
        }
        parcelZzda.recycle();
        return zzbqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final l2 zzh() {
        Parcel parcelZzda = zzda(26, zza());
        l2 l2VarZzb = k2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return l2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbhh zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpx zzj() {
        zzbpx zzbpvVar;
        Parcel parcelZzda = zzda(36, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbpvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpvVar = iInterfaceQueryLocalInterface instanceof zzbpx ? (zzbpx) iInterfaceQueryLocalInterface : new zzbpv(strongBinder);
        }
        parcelZzda.recycle();
        return zzbpvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbqd zzk() {
        zzbqd zzbqbVar;
        Parcel parcelZzda = zzda(27, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbqbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbqbVar = iInterfaceQueryLocalInterface instanceof zzbqd ? (zzbqd) iInterfaceQueryLocalInterface : new zzbqb(strongBinder);
        }
        parcelZzda.recycle();
        return zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbsc zzl() {
        Parcel parcelZzda = zzda(33, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbsc zzm() {
        Parcel parcelZzda = zzda(34, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final xd.a zzn() {
        return gk.b.r(zzda(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzo() {
        zzdb(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzp(xd.a aVar, q3 q3Var, String str, zzbwl zzbwlVar, String str2) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(null);
        zzayt.zzf(parcelZza, zzbwlVar);
        parcelZza.writeString(str2);
        zzdb(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzq(xd.a aVar, zzbmf zzbmfVar, List list) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbmfVar);
        parcelZza.writeTypedList(list);
        zzdb(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzr(xd.a aVar, zzbwl zzbwlVar, List list) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbwlVar);
        parcelZza.writeStringList(list);
        zzdb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzs(q3 q3Var, String str) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzdb(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzt(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzu(xd.a aVar, s3 s3Var, q3 q3Var, String str, zzbpu zzbpuVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzv(xd.a aVar, s3 s3Var, q3 q3Var, String str, String str2, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, s3Var);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzw(xd.a aVar, s3 s3Var, q3 q3Var, String str, String str2, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, s3Var);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzx(xd.a aVar, q3 q3Var, String str, zzbpu zzbpuVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzy(xd.a aVar, q3 q3Var, String str, String str2, zzbpu zzbpuVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzz(xd.a aVar, q3 q3Var, String str, String str2, zzbpu zzbpuVar, zzbgc zzbgcVar, List list) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, zzbgcVar);
        parcelZza.writeStringList(list);
        zzdb(14, parcelZza);
    }
}
