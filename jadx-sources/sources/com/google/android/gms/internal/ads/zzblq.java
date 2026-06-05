package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzblq extends od.a {
    public static final Parcelable.Creator<zzblq> CREATOR = new zzblr();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public zzblq(boolean z2, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z10, long j) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z10;
        this.zzh = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z2 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uk.c.c0(parcel, 2, this.zzb, false);
        int i11 = this.zzc;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        uk.c.V(parcel, 4, this.zzd, false);
        uk.c.d0(parcel, 5, this.zze, false);
        uk.c.d0(parcel, 6, this.zzf, false);
        boolean z10 = this.zzg;
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        long j = this.zzh;
        uk.c.k0(parcel, 8, 8);
        parcel.writeLong(j);
        uk.c.j0(iH0, parcel);
    }
}
