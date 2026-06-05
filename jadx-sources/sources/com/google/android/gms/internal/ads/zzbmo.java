package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbmo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        int iZ = 0;
        int iZ2 = 0;
        String strV = null;
        int iZ3 = 0;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 1) {
                iZ3 = v.Z(i10, parcel);
            } else if (c6 == 2) {
                strV = v.v(i10, parcel);
            } else if (c6 == 3) {
                iZ2 = v.Z(i10, parcel);
            } else if (c6 != '\u03e8') {
                v.f0(i10, parcel);
            } else {
                iZ = v.Z(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzbmn(iZ, iZ3, strV, iZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbmn[i10];
    }
}
