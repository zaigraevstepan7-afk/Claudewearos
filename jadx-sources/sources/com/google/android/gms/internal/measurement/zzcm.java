package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        long jB0 = 0;
        long jB02 = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        Bundle bundleQ = null;
        String strV4 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    jB0 = v.b0(i10, parcel);
                    break;
                case 2:
                    jB02 = v.b0(i10, parcel);
                    break;
                case 3:
                    zU = v.U(i10, parcel);
                    break;
                case 4:
                    strV = v.v(i10, parcel);
                    break;
                case 5:
                    strV2 = v.v(i10, parcel);
                    break;
                case 6:
                    strV3 = v.v(i10, parcel);
                    break;
                case 7:
                    bundleQ = v.q(i10, parcel);
                    break;
                case '\b':
                    strV4 = v.v(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzcl(jB0, jB02, zU, strV, strV2, strV3, bundleQ, strV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcl[i10];
    }
}
