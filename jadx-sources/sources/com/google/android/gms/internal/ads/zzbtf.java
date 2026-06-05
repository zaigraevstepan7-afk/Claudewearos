package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbtf extends zzayr implements zzbth {
    public zzbtf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zze(Intent intent) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, intent);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzf(String[] strArr, int[] iArr, xd.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzayt.zzf(parcelZza, aVar);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzg(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzh() {
        zzdb(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzi(xd.a aVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzj(xd.a aVar, oc.a aVar2) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, aVar2);
        zzdb(6, parcelZza);
    }
}
