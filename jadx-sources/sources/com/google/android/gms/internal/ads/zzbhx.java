package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import nc.l0;
import nc.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbhx extends zzays implements zzbhy {
    public zzbhx() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbhy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbhy ? (zzbhy) iInterfaceQueryLocalInterface : new zzbhw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        m0 m0VarZzad = l0.zzad(parcel.readStrongBinder());
        xd.a aVarN = xd.b.n(parcel.readStrongBinder());
        zzayt.zzc(parcel);
        zze(m0VarZzad, aVarN);
        parcel2.writeNoException();
        return true;
    }
}
