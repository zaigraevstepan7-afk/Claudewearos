package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbgw extends zzays implements zzbgx {
    public zzbgw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbgx zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbgx ? (zzbgx) iInterfaceQueryLocalInterface : new zzbgv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            xd.a aVarN = xd.b.n(parcel.readStrongBinder());
            zzayt.zzc(parcel);
            zzc(aVarN);
        } else if (i10 == 2) {
            zzd();
        } else {
            if (i10 != 3) {
                return false;
            }
            xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
            zzayt.zzc(parcel);
            zzb(aVarN2);
        }
        parcel2.writeNoException();
        return true;
    }
}
