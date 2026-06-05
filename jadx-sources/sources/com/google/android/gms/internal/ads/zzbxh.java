package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxh extends od.a {
    public static final Parcelable.Creator<zzbxh> CREATOR = new zzbxi();
    public final String zza;
    public final String zzb;

    public zzbxh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, str, false);
        uk.c.c0(parcel, 2, this.zzb, false);
        uk.c.j0(iH0, parcel);
    }

    public zzbxh(ad.e eVar) {
        throw null;
    }
}
