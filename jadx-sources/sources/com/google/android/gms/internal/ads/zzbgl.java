package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbgl extends zzayr implements zzbgn {
    public zzbgl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final double zzb() {
        Parcel parcelZzda = zzda(3, zza());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final int zzc() {
        Parcel parcelZzda = zzda(5, zza());
        int i10 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final int zzd() {
        Parcel parcelZzda = zzda(4, zza());
        int i10 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final Uri zze() {
        Parcel parcelZzda = zzda(2, zza());
        Uri uri = (Uri) zzayt.zza(parcelZzda, Uri.CREATOR);
        parcelZzda.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final xd.a zzf() {
        return gk.b.r(zzda(1, zza()));
    }
}
