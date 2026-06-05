package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzblr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        long jB0 = 0;
        boolean zU = false;
        int iZ = 0;
        boolean zU2 = false;
        String strV = null;
        byte[] bArrR = null;
        String[] strArrW = null;
        String[] strArrW2 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    zU = v.U(i10, parcel);
                    break;
                case 2:
                    strV = v.v(i10, parcel);
                    break;
                case 3:
                    iZ = v.Z(i10, parcel);
                    break;
                case 4:
                    bArrR = v.r(i10, parcel);
                    break;
                case 5:
                    strArrW = v.w(i10, parcel);
                    break;
                case 6:
                    strArrW2 = v.w(i10, parcel);
                    break;
                case 7:
                    zU2 = v.U(i10, parcel);
                    break;
                case '\b':
                    jB0 = v.b0(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzblq(zU, strV, iZ, bArrR, strArrW, strArrW2, zU2, jB0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzblq[i10];
    }
}
