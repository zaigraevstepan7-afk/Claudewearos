package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ee.n;
import ee.o;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final o zzc;
    final zzai zzd;

    public zzl(int i10, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i10;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : n.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        int i11 = this.zza;
        c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        c.b0(parcel, 2, this.zzb, i10, false);
        o oVar = this.zzc;
        c.X(parcel, 3, oVar == null ? null : oVar.asBinder());
        zzai zzaiVar = this.zzd;
        c.X(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null);
        c.j0(iH0, parcel);
    }
}
