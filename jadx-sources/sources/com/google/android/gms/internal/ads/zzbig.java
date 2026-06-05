package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbch;
import java.util.List;
import nc.a2;
import nc.i2;
import nc.i3;
import nc.l2;
import nc.o1;
import nc.p1;
import nc.s1;
import nc.x2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbig extends zzays implements zzbih {
    public zzbig() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbie zzbicVar = null;
        p1 o1Var = null;
        switch (i10) {
            case 2:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                zzbgn zzbgnVarZzk = zzk();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgnVarZzk);
                return true;
            case 6:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                l2 l2VarZzh = zzh();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, l2VarZzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbgg zzbggVarZzi = zzi();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbggVarZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzayt.zza(parcel, Bundle.CREATOR);
                zzayt.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzayt.zza(parcel, Bundle.CREATOR);
                zzayt.zzc(parcel);
                boolean zZzJ = zzJ(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzJ ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzayt.zza(parcel, Bundle.CREATOR);
                zzayt.zzc(parcel);
                zzC(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                xd.a aVarZzm = zzm();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzm);
                return true;
            case 19:
                xd.a aVarZzl = zzl();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzf);
                return true;
            case zzbch.zzt.zzm /* 21 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbicVar = iInterfaceQueryLocalInterface instanceof zzbie ? (zzbie) iInterfaceQueryLocalInterface : new zzbic(strongBinder);
                }
                zzayt.zzc(parcel);
                zzG(zzbicVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zZzI = zzI();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzI ? 1 : 0);
                return true;
            case 25:
                s1 s1VarN = x2.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzy(s1VarN);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    o1Var = iInterfaceQueryLocalInterface2 instanceof p1 ? (p1) iInterfaceQueryLocalInterface2 : new o1(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                }
                zzayt.zzc(parcel);
                zzE(o1Var);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbgk zzbgkVarZzj = zzj();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgkVarZzj);
                return true;
            case 30:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                int i13 = zzayt.zza;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 31:
                i2 i2VarZzg = zzg();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, i2VarZzg);
                return true;
            case 32:
                a2 a2VarN = i3.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzF(a2VarN);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzayt.zza(parcel, Bundle.CREATOR);
                zzayt.zzc(parcel);
                zzB(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
