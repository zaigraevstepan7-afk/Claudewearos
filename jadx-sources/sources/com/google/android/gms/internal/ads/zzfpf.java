package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpf extends od.a {
    public static final Parcelable.Creator<zzfpf> CREATOR = new zzfpg();
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zzfpf(int i10, String str, String str2) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        uk.c.c0(parcel, 2, this.zzb, false);
        uk.c.c0(parcel, 3, this.zzc, false);
        uk.c.j0(iH0, parcel);
    }

    public zzfpf(String str, String str2) {
        this(1, str, str2);
    }
}
