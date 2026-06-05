package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbyw extends zzayr implements zzbyy {
    public zzbyw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final xd.a zze(xd.a aVar, xd.a aVar2, String str, xd.a aVar3) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, aVar2);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, aVar3);
        return gk.b.r(zzda(11, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzf(xd.a aVar, zzbzc zzbzcVar, zzbyv zzbyvVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, zzbzcVar);
        zzayt.zzf(parcelZza, zzbyvVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzg(zzbug zzbugVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzh(List list, xd.a aVar, zzbud zzbudVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzi(List list, xd.a aVar, zzbud zzbudVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzj(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzk(xd.a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzl(List list, xd.a aVar, zzbud zzbudVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzm(List list, xd.a aVar, zzbud zzbudVar) {
        throw null;
    }
}
