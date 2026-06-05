package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final zzl createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        zzj zzjVar = null;
        int iZ = 1;
        IBinder iBinderX = null;
        IBinder iBinderX2 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 1) {
                iZ = v.Z(i10, parcel);
            } else if (c6 == 2) {
                zzjVar = (zzj) v.u(parcel, i10, zzj.CREATOR);
            } else if (c6 == 3) {
                iBinderX = v.X(i10, parcel);
            } else if (c6 != 4) {
                v.f0(i10, parcel);
            } else {
                iBinderX2 = v.X(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzl(iZ, zzjVar, iBinderX, iBinderX2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
