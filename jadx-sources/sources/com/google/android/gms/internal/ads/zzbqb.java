package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import nc.k2;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbqb extends zzayr implements zzbqd {
    public zzbqb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final boolean zzA() {
        Parcel parcelZzda = zzda(18, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final boolean zzB() {
        Parcel parcelZzda = zzda(17, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final double zze() {
        Parcel parcelZzda = zzda(8, zza());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzf() {
        Parcel parcelZzda = zzda(23, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzg() {
        Parcel parcelZzda = zzda(25, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzh() {
        Parcel parcelZzda = zzda(24, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final Bundle zzi() {
        Parcel parcelZzda = zzda(16, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final l2 zzj() {
        Parcel parcelZzda = zzda(11, zza());
        l2 l2VarZzb = k2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return l2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final zzbgg zzk() {
        Parcel parcelZzda = zzda(12, zza());
        zzbgg zzbggVarZzj = zzbgf.zzj(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbggVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final zzbgn zzl() {
        Parcel parcelZzda = zzda(5, zza());
        zzbgn zzbgnVarZzg = zzbgm.zzg(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbgnVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final xd.a zzm() {
        return gk.b.r(zzda(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final xd.a zzn() {
        return gk.b.r(zzda(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final xd.a zzo() {
        return gk.b.r(zzda(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzp() {
        Parcel parcelZzda = zzda(7, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzq() {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzr() {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzs() {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzt() {
        Parcel parcelZzda = zzda(10, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzu() {
        Parcel parcelZzda = zzda(9, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final List zzv() {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzw(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzx() {
        zzdb(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzy(xd.a aVar, xd.a aVar2, xd.a aVar3) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, aVar2);
        zzayt.zzf(parcelZza, aVar3);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzz(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(22, parcelZza);
    }
}
