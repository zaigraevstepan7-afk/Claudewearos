package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ee.q;
import ee.s;
import ee.u;
import ee.v;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbc extends a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final v zzc;
    final PendingIntent zzd;
    final s zze;
    final zzai zzf;

    public zzbc(int i10, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.zza = i10;
        this.zzb = zzbaVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : u.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : q.zzb(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, ee.v] */
    public static zzbc zza(v vVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, vVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, ee.s] */
    public static zzbc zzc(s sVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, sVar, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        int i11 = this.zza;
        c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        c.b0(parcel, 2, this.zzb, i10, false);
        v vVar = this.zzc;
        c.X(parcel, 3, vVar == null ? null : vVar.asBinder());
        c.b0(parcel, 4, this.zzd, i10, false);
        s sVar = this.zze;
        c.X(parcel, 5, sVar == null ? null : sVar.asBinder());
        zzai zzaiVar = this.zzf;
        c.X(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null);
        c.j0(iH0, parcel);
    }
}
