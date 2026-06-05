package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzafs implements Parcelable.Creator<zzaft> {
    @Override // android.os.Parcelable.Creator
    public final zzaft createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 1) {
                strV = v.v(i10, parcel);
            } else if (c6 == 2) {
                strV2 = v.v(i10, parcel);
            } else if (c6 != 3) {
                v.f0(i10, parcel);
            } else {
                strV3 = v.v(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzaft(strV, strV2, strV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaft[] newArray(int i10) {
        return new zzaft[i10];
    }
}
