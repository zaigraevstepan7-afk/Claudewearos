package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import nc.a2;
import nc.i2;
import nc.i3;
import nc.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbat extends zzays implements zzbau {
    public zzbat() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbau zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbau ? (zzbau) iInterfaceQueryLocalInterface : new zzbas(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbbb zzbazVar;
        switch (i10) {
            case 2:
                m0 m0VarZze = zze();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m0VarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbazVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbazVar = iInterfaceQueryLocalInterface instanceof zzbbb ? (zzbbb) iInterfaceQueryLocalInterface : new zzbaz(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzj(aVarN, zzbazVar);
                parcel2.writeNoException();
                return true;
            case 5:
                i2 i2VarZzf = zzf();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, i2VarZzf);
                return true;
            case 6:
                boolean zZzg = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzh(zZzg);
                parcel2.writeNoException();
                return true;
            case 7:
                a2 a2VarN = i3.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzi(a2VarN);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            default:
                return false;
        }
    }
}
