package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbmb extends od.a {
    public static final Parcelable.Creator<zzbmb> CREATOR = new zzbmc();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzbmb(String str, boolean z2, int i10, String str2) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = i10;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, str, false);
        boolean z2 = this.zzb;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i11 = this.zzc;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        uk.c.c0(parcel, 4, this.zzd, false);
        uk.c.j0(iH0, parcel);
    }
}
