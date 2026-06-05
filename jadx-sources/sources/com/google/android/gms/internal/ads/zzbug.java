package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbug extends od.a {
    public static final Parcelable.Creator<zzbug> CREATOR = new zzbuh();
    public final View zza;
    public final Map zzb;

    public zzbug(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) xd.b.u(xd.b.n(iBinder));
        this.zzb = (Map) xd.b.u(xd.b.n(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        View view = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.X(parcel, 1, new xd.b(view).asBinder());
        uk.c.X(parcel, 2, new xd.b(this.zzb).asBinder());
        uk.c.j0(iH0, parcel);
    }
}
