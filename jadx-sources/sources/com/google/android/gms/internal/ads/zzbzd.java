package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import nc.q3;
import nc.s3;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        String strV2 = null;
        s3 s3Var = null;
        q3 q3Var = null;
        String strV3 = null;
        int iZ = 0;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strV = v.v(i10, parcel);
                    break;
                case 2:
                    strV2 = v.v(i10, parcel);
                    break;
                case 3:
                    s3Var = (s3) v.u(parcel, i10, s3.CREATOR);
                    break;
                case 4:
                    q3Var = (q3) v.u(parcel, i10, q3.CREATOR);
                    break;
                case 5:
                    iZ = v.Z(i10, parcel);
                    break;
                case 6:
                    strV3 = v.v(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbzc(strV, strV2, s3Var, q3Var, iZ, strV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbzc[i10];
    }
}
