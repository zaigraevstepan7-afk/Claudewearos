package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbch;
import nc.i2;
import nc.o0;
import nc.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbwc extends zzays implements zzbwd {
    public zzbwc() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzbwh zzbwhVar = (zzbwh) zzayt.zza(parcel, zzbwh.CREATOR);
            zzayt.zzc(parcel);
            zzg(zzbwhVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            zzq();
            parcel2.writeNoException();
            return true;
        }
        zzbwg zzbweVar = null;
        zzbwb zzbwbVar = null;
        q0 o0Var = null;
        if (i10 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                zzbweVar = iInterfaceQueryLocalInterface instanceof zzbwg ? (zzbwg) iInterfaceQueryLocalInterface : new zzbwe(strongBinder);
            }
            zzayt.zzc(parcel);
            zzo(zzbweVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 34) {
            boolean zZzg = zzayt.zzg(parcel);
            zzayt.zzc(parcel);
            zzn(zZzg);
            parcel2.writeNoException();
            return true;
        }
        switch (i10) {
            case 5:
                boolean zZzs = zzs();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzs ? 1 : 0);
                break;
            case 6:
                zzh();
                parcel2.writeNoException();
                break;
            case 7:
                zzj();
                parcel2.writeNoException();
                break;
            case 8:
                zze();
                parcel2.writeNoException();
                break;
            case 9:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzi(aVarN);
                parcel2.writeNoException();
                break;
            case 10:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzk(aVarN2);
                parcel2.writeNoException();
                break;
            case 11:
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzf(aVarN3);
                parcel2.writeNoException();
                break;
            case 12:
                String strZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeString(strZzd);
                break;
            case 13:
                String string = parcel.readString();
                zzayt.zzc(parcel);
                zzp(string);
                parcel2.writeNoException();
                break;
            case 14:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    o0Var = iInterfaceQueryLocalInterface2 instanceof q0 ? (q0) iInterfaceQueryLocalInterface2 : new o0(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzl(o0Var);
                parcel2.writeNoException();
                break;
            case 15:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzb);
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    zzbwbVar = iInterfaceQueryLocalInterface3 instanceof zzbwb ? (zzbwb) iInterfaceQueryLocalInterface3 : new zzbwb(strongBinder3);
                }
                zzayt.zzc(parcel);
                zzu(zzbwbVar);
                parcel2.writeNoException();
                break;
            case 17:
                parcel.readString();
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                break;
            case 18:
                xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzr(aVarN4);
                parcel2.writeNoException();
                break;
            case 19:
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzm(string2);
                parcel2.writeNoException();
                break;
            case 20:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i13 = zzayt.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                break;
            case zzbch.zzt.zzm /* 21 */:
                i2 i2VarZzc = zzc();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, i2VarZzc);
                break;
        }
        return true;
    }
}
