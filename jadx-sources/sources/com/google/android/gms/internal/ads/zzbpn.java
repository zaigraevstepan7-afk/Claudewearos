package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbpn extends zzays implements zzbpo {
    public zzbpn() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbpo zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbpo ? (zzbpo) iInterfaceQueryLocalInterface : new zzbpm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            zzayt.zzc(parcel);
            zzbpr zzbprVarZzb = zzb(string);
            parcel2.writeNoException();
            zzayt.zzf(parcel2, zzbprVarZzb);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            zzayt.zzc(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i10 == 3) {
            String string3 = parcel.readString();
            zzayt.zzc(parcel);
            zzbrn zzbrnVarZzc = zzc(string3);
            parcel2.writeNoException();
            zzayt.zzf(parcel2, zzbrnVarZzc);
        } else {
            if (i10 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzayt.zzc(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
