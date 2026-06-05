package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpq extends od.a {
    public static final Parcelable.Creator<zzfpq> CREATOR = new zzfpr();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzfpq(int i10, byte[] bArr, int i11) {
        this.zza = i10;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        uk.c.V(parcel, 2, this.zzb, false);
        int i12 = this.zzc;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i12);
        uk.c.j0(iH0, parcel);
    }

    public zzfpq(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
