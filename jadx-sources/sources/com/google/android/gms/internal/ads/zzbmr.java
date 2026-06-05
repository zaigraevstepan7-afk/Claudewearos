package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbmr extends zzayr implements zzbmt {
    public zzbmr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zze(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzf() {
        zzdb(1, zza());
    }
}
