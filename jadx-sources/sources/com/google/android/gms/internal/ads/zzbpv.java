package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbpv extends zzayr implements zzbpx {
    public zzbpv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final xd.a zze() {
        return gk.b.r(zzda(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final boolean zzf() {
        Parcel parcelZzda = zzda(2, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
