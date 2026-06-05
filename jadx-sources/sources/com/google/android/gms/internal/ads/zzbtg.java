package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbtg extends zzays implements zzbth {
    public zzbtg() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbth zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbth ? (zzbth) iInterfaceQueryLocalInterface : new zzbtf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Intent intent = (Intent) zzayt.zza(parcel, Intent.CREATOR);
                zzayt.zzc(parcel);
                zze(intent);
                break;
            case 2:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzi(aVarN, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzg(aVarN2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzf(strArrCreateStringArray, iArrCreateIntArray, aVarN3);
                break;
            case 6:
                xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                oc.a aVar = (oc.a) zzayt.zza(parcel, oc.a.CREATOR);
                zzayt.zzc(parcel);
                zzj(aVarN4, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
