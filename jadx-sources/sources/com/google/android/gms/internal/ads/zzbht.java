package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbht extends zzays implements zzbhu {
    public zzbht() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzbhu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbhu ? (zzbhu) iInterfaceQueryLocalInterface : new zzbhs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbhh zzbhfVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbhfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbhfVar = iInterfaceQueryLocalInterface instanceof zzbhh ? (zzbhh) iInterfaceQueryLocalInterface : new zzbhf(strongBinder);
        }
        zzayt.zzc(parcel);
        zze(zzbhfVar);
        parcel2.writeNoException();
        return true;
    }
}
