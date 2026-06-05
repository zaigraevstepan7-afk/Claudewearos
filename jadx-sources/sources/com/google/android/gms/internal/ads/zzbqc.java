package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbch;
import java.util.List;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbqc extends zzays implements zzbqd {
    public zzbqc() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbqd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbqd ? (zzbqd) iInterfaceQueryLocalInterface : new zzbqb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                zzbgn zzbgnVarZzl = zzl();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgnVarZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                l2 l2VarZzj = zzj();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, l2VarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 13:
                xd.a aVarZzm = zzm();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzm);
                return true;
            case 14:
                xd.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzn);
                return true;
            case 15:
                xd.a aVarZzo = zzo();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i13 = zzayt.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzw(aVarN);
                parcel2.writeNoException();
                return true;
            case zzbch.zzt.zzm /* 21 */:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzy(aVarN2, aVarN3, aVarN4);
                parcel2.writeNoException();
                return true;
            case 22:
                xd.a aVarN5 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzz(aVarN5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
