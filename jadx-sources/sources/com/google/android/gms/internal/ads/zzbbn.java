package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        boolean zU = false;
        int iZ = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        Bundle bundleQ = null;
        String strV5 = null;
        long jB0 = 0;
        long jB02 = 0;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strV = v.v(i10, parcel);
                    break;
                case 3:
                    jB0 = v.b0(i10, parcel);
                    break;
                case 4:
                    strV2 = v.v(i10, parcel);
                    break;
                case 5:
                    strV3 = v.v(i10, parcel);
                    break;
                case 6:
                    strV4 = v.v(i10, parcel);
                    break;
                case 7:
                    bundleQ = v.q(i10, parcel);
                    break;
                case '\b':
                    zU = v.U(i10, parcel);
                    break;
                case '\t':
                    jB02 = v.b0(i10, parcel);
                    break;
                case '\n':
                    strV5 = v.v(i10, parcel);
                    break;
                case 11:
                    iZ = v.Z(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbbm(strV, jB0, strV2, strV3, strV4, bundleQ, zU, jB02, strV5, iZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbbm[i10];
    }
}
