package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbgp extends zzayr implements zzbgr {
    public zzbgp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final xd.a zzb(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return gk.b.r(zzda(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzc() {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzd(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdA(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdB(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdx(String str, xd.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, aVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdy(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdz(zzbgk zzbgkVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbgkVar);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zze(xd.a aVar, int i10) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeInt(i10);
        zzdb(5, parcelZza);
    }
}
