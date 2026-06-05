package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import qc.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbvf extends zzays implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayt.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzayt.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else if (i10 == 2) {
            r rVar = (r) zzayt.zza(parcel, r.CREATOR);
            zzayt.zzc(parcel);
            zze(rVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzayt.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbvo zzbvoVar = (zzbvo) zzayt.zza(parcel, zzbvo.CREATOR);
            zzayt.zzc(parcel);
            zzg(parcelFileDescriptor2, zzbvoVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
