package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import nc.k2;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbqa extends zzayr implements IInterface {
    public zzbqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel parcelZzda = zzda(13, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    public final l2 zzf() {
        Parcel parcelZzda = zzda(16, zza());
        l2 l2VarZzb = k2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return l2VarZzb;
    }

    public final zzbgg zzg() {
        Parcel parcelZzda = zzda(19, zza());
        zzbgg zzbggVarZzj = zzbgf.zzj(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbggVarZzj;
    }

    public final zzbgn zzh() {
        Parcel parcelZzda = zzda(5, zza());
        zzbgn zzbgnVarZzg = zzbgm.zzg(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbgnVarZzg;
    }

    public final xd.a zzi() {
        return gk.b.r(zzda(15, zza()));
    }

    public final xd.a zzj() {
        return gk.b.r(zzda(20, zza()));
    }

    public final xd.a zzk() {
        return gk.b.r(zzda(21, zza()));
    }

    public final String zzl() {
        Parcel parcelZzda = zzda(7, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzm() {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzn() {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzo() {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final List zzp() {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    public final void zzq(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(9, parcelZza);
    }

    public final void zzr() {
        zzdb(8, zza());
    }

    public final void zzs(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(10, parcelZza);
    }

    public final void zzt(xd.a aVar, xd.a aVar2, xd.a aVar3) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, aVar2);
        zzayt.zzf(parcelZza, aVar3);
        zzdb(22, parcelZza);
    }

    public final void zzu(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(14, parcelZza);
    }

    public final boolean zzv() {
        Parcel parcelZzda = zzda(12, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    public final boolean zzw() {
        Parcel parcelZzda = zzda(11, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
