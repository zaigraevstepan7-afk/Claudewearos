package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import nc.a2;
import nc.g2;
import nc.i2;
import nc.k2;
import nc.l2;
import nc.p1;
import nc.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbif extends zzayr implements zzbih {
    public zzbif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzA() {
        zzdb(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzB(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzdb(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzC(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzdb(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzD() {
        zzdb(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzE(p1 p1Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, p1Var);
        zzdb(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzF(a2 a2Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, a2Var);
        zzdb(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzG(zzbie zzbieVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbieVar);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzH() {
        Parcel parcelZzda = zzda(30, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzI() {
        Parcel parcelZzda = zzda(24, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzJ(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        Parcel parcelZzda = zzda(16, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final double zze() {
        Parcel parcelZzda = zzda(8, zza());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final Bundle zzf() {
        Parcel parcelZzda = zzda(20, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final i2 zzg() {
        Parcel parcelZzda = zzda(31, zza());
        i2 i2VarZzb = g2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return i2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final l2 zzh() {
        Parcel parcelZzda = zzda(11, zza());
        l2 l2VarZzb = k2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return l2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgg zzi() {
        zzbgg zzbgeVar;
        Parcel parcelZzda = zzda(14, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbgeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbgeVar = iInterfaceQueryLocalInterface instanceof zzbgg ? (zzbgg) iInterfaceQueryLocalInterface : new zzbge(strongBinder);
        }
        parcelZzda.recycle();
        return zzbgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgk zzj() {
        zzbgk zzbgiVar;
        Parcel parcelZzda = zzda(29, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbgiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbgiVar = iInterfaceQueryLocalInterface instanceof zzbgk ? (zzbgk) iInterfaceQueryLocalInterface : new zzbgi(strongBinder);
        }
        parcelZzda.recycle();
        return zzbgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgn zzk() {
        zzbgn zzbglVar;
        Parcel parcelZzda = zzda(5, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbglVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbglVar = iInterfaceQueryLocalInterface instanceof zzbgn ? (zzbgn) iInterfaceQueryLocalInterface : new zzbgl(strongBinder);
        }
        parcelZzda.recycle();
        return zzbglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final xd.a zzl() {
        return gk.b.r(zzda(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final xd.a zzm() {
        return gk.b.r(zzda(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzn() {
        Parcel parcelZzda = zzda(7, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzo() {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzp() {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzq() {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzs() {
        Parcel parcelZzda = zzda(10, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzt() {
        Parcel parcelZzda = zzda(9, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzu() {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzv() {
        Parcel parcelZzda = zzda(23, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzw() {
        zzdb(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzx() {
        zzdb(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzy(s1 s1Var) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, s1Var);
        zzdb(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzz(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzdb(15, parcelZza);
    }
}
