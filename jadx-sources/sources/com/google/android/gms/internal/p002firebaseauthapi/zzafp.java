package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzafp implements Parcelable.Creator<zzafm> {
    @Override // android.os.Parcelable.Creator
    public final zzafm createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        String strV2 = null;
        Long lC0 = null;
        String strV3 = null;
        Long lC02 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 2) {
                strV = v.v(i10, parcel);
            } else if (c6 == 3) {
                strV2 = v.v(i10, parcel);
            } else if (c6 == 4) {
                lC0 = v.c0(i10, parcel);
            } else if (c6 == 5) {
                strV3 = v.v(i10, parcel);
            } else if (c6 != 6) {
                v.f0(i10, parcel);
            } else {
                lC02 = v.c0(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzafm(strV, strV2, lC0, strV3, lC02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafm[] newArray(int i10) {
        return new zzafm[i10];
    }
}
