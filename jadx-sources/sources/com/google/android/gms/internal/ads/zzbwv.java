package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbwv extends zzays implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbwq zzbwoVar;
        switch (i10) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbwoVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbwoVar = iInterfaceQueryLocalInterface instanceof zzbwq ? (zzbwq) iInterfaceQueryLocalInterface : new zzbwo(strongBinder);
                }
                zzayt.zzc(parcel);
                zzk(zzbwoVar);
                break;
            case 4:
                int i12 = parcel.readInt();
                zzayt.zzc(parcel);
                zzh(i12);
                break;
            case 5:
                h2 h2Var = (h2) zzayt.zza(parcel, h2.CREATOR);
                zzayt.zzc(parcel);
                zzi(h2Var);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
