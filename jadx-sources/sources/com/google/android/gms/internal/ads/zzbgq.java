package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbgq extends zzays implements zzbgr {
    public zzbgq() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbgr zzdC(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbgr ? (zzbgr) iInterfaceQueryLocalInterface : new zzbgp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbgk zzbgiVar;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzdx(string, aVarN);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                xd.a aVarZzb = zzb(string2);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzb);
                return true;
            case 3:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzdB(aVarN2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                xd.b.n(parcel.readStrongBinder());
                parcel.readInt();
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzdy(aVarN3);
                parcel2.writeNoException();
                return true;
            case 7:
                xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzd(aVarN4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbgiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbgiVar = iInterfaceQueryLocalInterface instanceof zzbgk ? (zzbgk) iInterfaceQueryLocalInterface : new zzbgi(strongBinder);
                }
                zzayt.zzc(parcel);
                zzdz(zzbgiVar);
                parcel2.writeNoException();
                return true;
            case 9:
                xd.a aVarN5 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzdA(aVarN5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
