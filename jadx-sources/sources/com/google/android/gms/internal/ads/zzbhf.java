package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbhf extends zzayr implements zzbhh {
    public zzbhf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final l2 zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgk zzf() {
        zzbgk zzbgiVar;
        Parcel parcelZzda = zzda(16, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgn zzg(String str) {
        zzbgn zzbglVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZza);
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

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final xd.a zzh() {
        return gk.b.r(zzda(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzi() {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzj(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(1, parcelZza);
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final List zzk() {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzda.createStringArrayList();
        parcelZzda.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzl() {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzm() {
        zzdb(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzn(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzo() {
        zzdb(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzp(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzq() {
        Parcel parcelZzda = zzda(12, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzr(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        Parcel parcelZzda = zzda(17, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzs(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        Parcel parcelZzda = zzda(10, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzt() {
        Parcel parcelZzda = zzda(13, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
