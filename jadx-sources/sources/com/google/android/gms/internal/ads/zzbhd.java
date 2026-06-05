package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbhd extends zzays implements zzbhe {
    public zzbhd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                xd.a aVarZzg = zzg();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzg);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(listZzm);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                zzbgn zzbgnVarZze = zze();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgnVarZze);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                l2 l2VarZzc = zzc();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, l2VarZzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzayt.zza(parcel, Bundle.CREATOR);
                zzayt.zzc(parcel);
                zzo(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzayt.zza(parcel, Bundle.CREATOR);
                zzayt.zzc(parcel);
                boolean zZzq = zzq(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzayt.zza(parcel, Bundle.CREATOR);
                zzayt.zzc(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbgg zzbggVarZzd = zzd();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbggVarZzd);
                return true;
            case 16:
                xd.a aVarZzf = zzf();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzf);
                return true;
            case 17:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
