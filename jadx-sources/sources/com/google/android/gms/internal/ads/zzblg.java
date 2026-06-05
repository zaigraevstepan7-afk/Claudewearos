package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzblg extends zzayr implements zzbli {
    public zzblg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbli
    public final zzblf zze(xd.a aVar, zzbpo zzbpoVar, int i10, zzblc zzblcVar) {
        zzblf zzbldVar;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayt.zzf(parcelZza, zzblcVar);
        Parcel parcelZzda = zzda(1, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbldVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbldVar = iInterfaceQueryLocalInterface instanceof zzblf ? (zzblf) iInterfaceQueryLocalInterface : new zzbld(strongBinder);
        }
        parcelZzda.recycle();
        return zzbldVar;
    }
}
