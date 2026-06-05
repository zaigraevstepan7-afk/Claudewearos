package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbla extends zzayr implements zzblc {
    public zzbla(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzb(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(1, parcelZza);
    }
}
