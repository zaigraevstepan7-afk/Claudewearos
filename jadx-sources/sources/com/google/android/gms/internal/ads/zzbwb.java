package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwb extends zzayr implements IInterface {
    public zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwa zzbwaVar, String str, String str2) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwaVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdb(2, parcelZza);
    }
}
