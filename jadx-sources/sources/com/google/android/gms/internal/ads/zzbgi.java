package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import nc.k2;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbgi extends zzayr implements zzbgk {
    public zzbgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zze() {
        Parcel parcelZzda = zzda(2, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzf() {
        Parcel parcelZzda = zzda(6, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzg() {
        Parcel parcelZzda = zzda(5, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final l2 zzh() {
        Parcel parcelZzda = zzda(7, zza());
        l2 l2VarZzb = k2.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return l2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final xd.a zzi() {
        return gk.b.r(zzda(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzj(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzk() {
        Parcel parcelZzda = zzda(10, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzl() {
        Parcel parcelZzda = zzda(8, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzm(zzbhv zzbhvVar) {
        throw null;
    }
}
