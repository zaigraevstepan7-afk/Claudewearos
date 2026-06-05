package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwo extends zzayr implements zzbwq {
    public zzbwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final int zze() {
        Parcel parcelZzda = zzda(2, zza());
        int i10 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final String zzf() {
        Parcel parcelZzda = zzda(1, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }
}
