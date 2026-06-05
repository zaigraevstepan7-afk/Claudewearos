package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbpm extends zzayr implements zzbpo {
    public zzbpm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbpr zzb(String str) {
        zzbpr zzbppVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(1, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbppVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbppVar = iInterfaceQueryLocalInterface instanceof zzbpr ? (zzbpr) iInterfaceQueryLocalInterface : new zzbpp(strongBinder);
        }
        parcelZzda.recycle();
        return zzbppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final zzbrn zzc(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(3, parcelZza);
        zzbrn zzbrnVarZzb = zzbrm.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbrnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean zzd(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(4, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpo
    public final boolean zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
