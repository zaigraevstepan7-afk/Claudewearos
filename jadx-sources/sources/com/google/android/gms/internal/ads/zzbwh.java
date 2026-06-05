package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import nc.q3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwh extends od.a {
    public static final Parcelable.Creator<zzbwh> CREATOR = new zzbwi();
    public final q3 zza;
    public final String zzb;

    public zzbwh(q3 q3Var, String str) {
        this.zza = q3Var;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        q3 q3Var = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, q3Var, i10, false);
        uk.c.c0(parcel, 3, this.zzb, false);
        uk.c.j0(iH0, parcel);
    }
}
