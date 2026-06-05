package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import nc.a2;
import nc.i2;
import nc.i3;
import nc.q3;
import nc.x1;
import nc.y1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbws extends zzays implements zzbwt {
    public zzbws() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwt zzr(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbwt ? (zzbwt) iInterfaceQueryLocalInterface : new zzbwr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbxa zzbwyVar = null;
        zzbxa zzbwyVar2 = null;
        y1 x1Var = null;
        zzbxb zzbxbVar = null;
        zzbww zzbwuVar = null;
        switch (i10) {
            case 1:
                q3 q3Var = (q3) zzayt.zza(parcel, q3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwyVar = iInterfaceQueryLocalInterface instanceof zzbxa ? (zzbxa) iInterfaceQueryLocalInterface : new zzbwy(strongBinder);
                }
                zzayt.zzc(parcel);
                zzg(q3Var, zzbwyVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface2 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface2 : new zzbwu(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzl(zzbwuVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 4:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 5:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzn(aVarN);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbxbVar = iInterfaceQueryLocalInterface3 instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface3 : new zzbxb(strongBinder3);
                }
                zzayt.zzc(parcel);
                zzq(zzbxbVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxh zzbxhVar = (zzbxh) zzayt.zza(parcel, zzbxh.CREATOR);
                zzayt.zzc(parcel);
                zzm(zzbxhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    x1Var = iInterfaceQueryLocalInterface4 instanceof y1 ? (y1) iInterfaceQueryLocalInterface4 : new x1(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                }
                zzayt.zzc(parcel);
                zzj(x1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzb);
                return true;
            case 10:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                boolean zZzg = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzo(aVarN2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwq zzbwqVarZzd = zzd();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwqVarZzd);
                return true;
            case 12:
                i2 i2VarZzc = zzc();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, i2VarZzc);
                return true;
            case 13:
                a2 a2VarN = i3.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzk(a2VarN);
                parcel2.writeNoException();
                return true;
            case 14:
                q3 q3Var2 = (q3) zzayt.zza(parcel, q3.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwyVar2 = iInterfaceQueryLocalInterface5 instanceof zzbxa ? (zzbxa) iInterfaceQueryLocalInterface5 : new zzbwy(strongBinder5);
                }
                zzayt.zzc(parcel);
                zzh(q3Var2, zzbwyVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzi(zZzg2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            default:
                return false;
        }
    }
}
