package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import nc.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbmp extends zzays implements zzbmq {
    public zzbmp() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbmt zzbmrVar;
        if (i10 == 3) {
            l2 l2VarZzb = zzb();
            parcel2.writeNoException();
            zzayt.zzf(parcel2, l2VarZzb);
            return true;
        }
        if (i10 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            xd.a aVarN = xd.b.n(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbmrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbmrVar = iInterfaceQueryLocalInterface instanceof zzbmt ? (zzbmt) iInterfaceQueryLocalInterface : new zzbmr(strongBinder);
            }
            zzayt.zzc(parcel);
            zzf(aVarN, zzbmrVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
            zzayt.zzc(parcel);
            zze(aVarN2);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        zzbgk zzbgkVarZzc = zzc();
        parcel2.writeNoException();
        zzayt.zzf(parcel2, zzbgkVarZzc);
        return true;
    }
}
