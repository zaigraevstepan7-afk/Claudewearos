package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbyx extends zzays implements zzbyy {
    public zzbyx() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbyy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbyy ? (zzbyy) iInterfaceQueryLocalInterface : new zzbyw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbyv zzbytVar = null;
        switch (i10) {
            case 1:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzbzc zzbzcVar = (zzbzc) zzayt.zza(parcel, zzbzc.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbytVar = iInterfaceQueryLocalInterface instanceof zzbyv ? (zzbyv) iInterfaceQueryLocalInterface : new zzbyt(strongBinder);
                }
                zzayt.zzc(parcel);
                zzf(aVarN, zzbzcVar, zzbytVar);
                parcel2.writeNoException();
                return true;
            case 2:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzk(aVarN2);
                parcel2.writeNoException();
                return true;
            case 3:
                xd.b.n(parcel.readStrongBinder());
                xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 4:
                xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                zzbud zzbudVarZzb = zzbuc.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzm(arrayListCreateTypedArrayList, aVarN3, zzbudVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                zzbud zzbudVarZzb2 = zzbuc.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzl(arrayListCreateTypedArrayList2, aVarN4, zzbudVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbug zzbugVar = (zzbug) zzayt.zza(parcel, zzbug.CREATOR);
                zzayt.zzc(parcel);
                zzg(zzbugVar);
                parcel2.writeNoException();
                return true;
            case 8:
                xd.a aVarN5 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzj(aVarN5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                xd.a aVarN6 = xd.b.n(parcel.readStrongBinder());
                zzbud zzbudVarZzb3 = zzbuc.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzi(arrayListCreateTypedArrayList3, aVarN6, zzbudVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                xd.a aVarN7 = xd.b.n(parcel.readStrongBinder());
                zzbud zzbudVarZzb4 = zzbuc.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzh(arrayListCreateTypedArrayList4, aVarN7, zzbudVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                xd.a aVarN8 = xd.b.n(parcel.readStrongBinder());
                xd.a aVarN9 = xd.b.n(parcel.readStrongBinder());
                String string = parcel.readString();
                xd.a aVarN10 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                xd.a aVarZze = zze(aVarN8, aVarN9, string, aVarN10);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZze);
                return true;
            default:
                return false;
        }
    }
}
