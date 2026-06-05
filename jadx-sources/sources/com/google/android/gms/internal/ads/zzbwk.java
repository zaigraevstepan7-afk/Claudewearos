package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbwk extends zzays implements zzbwl {
    public zzbwk() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbwl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzbwl ? (zzbwl) iInterfaceQueryLocalInterface : new zzbwj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzl(aVarN);
                break;
            case 2:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzayt.zzc(parcel);
                zzk(aVarN2, i12);
                break;
            case 3:
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzi(aVarN3);
                break;
            case 4:
                xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzj(aVarN4);
                break;
            case 5:
                xd.a aVarN5 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzp(aVarN5);
                break;
            case 6:
                xd.a aVarN6 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzf(aVarN6);
                break;
            case 7:
                xd.a aVarN7 = xd.b.n(parcel.readStrongBinder());
                zzbwm zzbwmVar = (zzbwm) zzayt.zza(parcel, zzbwm.CREATOR);
                zzayt.zzc(parcel);
                zzm(aVarN7, zzbwmVar);
                break;
            case 8:
                xd.a aVarN8 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zze(aVarN8);
                break;
            case 9:
                xd.a aVarN9 = xd.b.n(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzayt.zzc(parcel);
                zzg(aVarN9, i13);
                break;
            case 10:
                xd.a aVarN10 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzh(aVarN10);
                break;
            case 11:
                xd.a aVarN11 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzo(aVarN11);
                break;
            case 12:
                zzayt.zzc(parcel);
                break;
            case 13:
                xd.a aVarN12 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzn(aVarN12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
