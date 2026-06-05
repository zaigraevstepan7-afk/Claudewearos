package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        int i11 = this.zza;
        c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        c.c0(parcel, 2, this.zzb, false);
        c.j0(iH0, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }
}
