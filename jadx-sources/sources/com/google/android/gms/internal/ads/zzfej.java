package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfej implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        int iZ4 = 0;
        int iZ5 = 0;
        int iZ6 = 0;
        String strV = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iZ = v.Z(i10, parcel);
                    break;
                case 2:
                    iZ2 = v.Z(i10, parcel);
                    break;
                case 3:
                    iZ3 = v.Z(i10, parcel);
                    break;
                case 4:
                    iZ4 = v.Z(i10, parcel);
                    break;
                case 5:
                    strV = v.v(i10, parcel);
                    break;
                case 6:
                    iZ5 = v.Z(i10, parcel);
                    break;
                case 7:
                    iZ6 = v.Z(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzfei(iZ, iZ2, iZ3, iZ4, strV, iZ5, iZ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfei[i10];
    }
}
