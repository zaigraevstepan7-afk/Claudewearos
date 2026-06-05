package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbtm extends zzayr implements zzbto {
    public zzbtm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final boolean zzH() {
        Parcel parcelZzda = zzda(11, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzh(int i10, int i11, Intent intent) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeInt(i11);
        zzayt.zzd(parcelZza, intent);
        zzdb(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzi() {
        zzdb(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzk(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzl(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzm() {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzo() {
        zzdb(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzdb(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzq() {
        zzdb(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzr() {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzs(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        Parcel parcelZzda = zzda(6, parcelZza);
        if (parcelZzda.readInt() != 0) {
            bundle.readFromParcel(parcelZzda);
        }
        parcelZzda.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzt() {
        zzdb(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzu() {
        zzdb(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzv() {
        zzdb(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzx() {
        zzdb(9, zza());
    }
}
