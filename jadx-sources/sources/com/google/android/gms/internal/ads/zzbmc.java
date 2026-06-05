package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbmc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        boolean zU = false;
        int iZ = 0;
        String strV2 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 1) {
                strV = v.v(i10, parcel);
            } else if (c6 == 2) {
                zU = v.U(i10, parcel);
            } else if (c6 == 3) {
                iZ = v.Z(i10, parcel);
            } else if (c6 != 4) {
                v.f0(i10, parcel);
            } else {
                strV2 = v.v(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzbmb(strV, zU, iZ, strV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbmb[i10];
    }
}
