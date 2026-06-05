package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbhg extends zzays implements zzbhh {
    public zzbhg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbhh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbhh ? (zzbhh) iInterfaceQueryLocalInterface : new zzbhf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                String string = parcel.readString();
                zzayt.zzc(parcel);
                String strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzbgn zzbgnVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgnVarZzg);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzayt.zzc(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                l2 l2VarZze = zze();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, l2VarZze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                xd.a aVarZzh = zzh();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzh);
                return true;
            case 10:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                boolean zZzs = zzs(aVarN);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i13 = zzayt.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzp(aVarN2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbgk zzbgkVarZzf = zzf();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgkVarZzf);
                return true;
            case 17:
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                boolean zZzr = zzr(aVarN3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
