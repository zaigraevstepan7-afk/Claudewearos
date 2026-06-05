package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzblp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        String[] strArrW = null;
        String[] strArrW2 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 1) {
                strV = v.v(i10, parcel);
            } else if (c6 == 2) {
                strArrW = v.w(i10, parcel);
            } else if (c6 != 3) {
                v.f0(i10, parcel);
            } else {
                strArrW2 = v.w(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzblo(strV, strArrW, strArrW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzblo[i10];
    }
}
