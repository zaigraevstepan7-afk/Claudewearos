package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import nc.q3;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        q3 q3Var = null;
        String strV = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 2) {
                q3Var = (q3) v.u(parcel, i10, q3.CREATOR);
            } else if (c6 != 3) {
                v.f0(i10, parcel);
            } else {
                strV = v.v(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzbwh(q3Var, strV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbwh[i10];
    }
}
