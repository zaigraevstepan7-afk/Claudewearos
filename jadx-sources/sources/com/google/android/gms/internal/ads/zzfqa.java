package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfqa extends zzayr implements zzfqc {
    public zzfqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zze(xd.a aVar, String str, String str2) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzf() {
        zzdb(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzg(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzh(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzi(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzj(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzdb(5, parcelZza);
    }
}
