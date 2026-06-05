package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbch;
import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbpt extends zzays implements zzbpu {
    public zzbpt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface : new zzbps(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i12 = parcel.readInt();
                zzayt.zzc(parcel);
                zzg(i12);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzayt.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                zzbhg.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzayt.zzc(parcel);
                break;
            case 11:
                zzw();
                break;
            case 12:
                parcel.readString();
                zzayt.zzc(parcel);
                break;
            case 13:
                zzz();
                break;
            case 14:
                zzbwm zzbwmVar = (zzbwm) zzayt.zza(parcel, zzbwm.CREATOR);
                zzayt.zzc(parcel);
                zzs(zzbwmVar);
                break;
            case 15:
                zzx();
                break;
            case 16:
                zzbwq zzbwqVarZzb = zzbwp.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzt(zzbwqVarZzb);
                break;
            case 17:
                int i13 = parcel.readInt();
                zzayt.zzc(parcel);
                zzj(i13);
                break;
            case 18:
                zzv();
                break;
            case 19:
                zzayt.zzc(parcel);
                break;
            case 20:
                zzy();
                break;
            case zzbch.zzt.zzm /* 21 */:
                String string3 = parcel.readString();
                zzayt.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i14 = parcel.readInt();
                String string4 = parcel.readString();
                zzayt.zzc(parcel);
                zzi(i14, string4);
                break;
            case 23:
                h2 h2Var = (h2) zzayt.zza(parcel, h2.CREATOR);
                zzayt.zzc(parcel);
                zzh(h2Var);
                break;
            case 24:
                h2 h2Var2 = (h2) zzayt.zza(parcel, h2.CREATOR);
                zzayt.zzc(parcel);
                zzk(h2Var2);
                break;
            case 25:
                zzu();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
