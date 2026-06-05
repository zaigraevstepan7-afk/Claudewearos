package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzagv implements Parcelable.Creator<zzags> {
    @Override // android.os.Parcelable.Creator
    public final zzags createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        String strV8 = null;
        String strV9 = null;
        String strV10 = null;
        String strV11 = null;
        String strV12 = null;
        String strV13 = null;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strV = v.v(i10, parcel);
                    break;
                case 3:
                    strV2 = v.v(i10, parcel);
                    break;
                case 4:
                    strV3 = v.v(i10, parcel);
                    break;
                case 5:
                    strV4 = v.v(i10, parcel);
                    break;
                case 6:
                    strV5 = v.v(i10, parcel);
                    break;
                case 7:
                    strV6 = v.v(i10, parcel);
                    break;
                case '\b':
                    strV7 = v.v(i10, parcel);
                    break;
                case '\t':
                    strV8 = v.v(i10, parcel);
                    break;
                case '\n':
                    zU = v.U(i10, parcel);
                    break;
                case 11:
                    zU2 = v.U(i10, parcel);
                    break;
                case '\f':
                    strV9 = v.v(i10, parcel);
                    break;
                case '\r':
                    strV10 = v.v(i10, parcel);
                    break;
                case 14:
                    strV11 = v.v(i10, parcel);
                    break;
                case 15:
                    strV12 = v.v(i10, parcel);
                    break;
                case 16:
                    zU3 = v.U(i10, parcel);
                    break;
                case 17:
                    strV13 = v.v(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzags(strV, strV2, strV3, strV4, strV5, strV6, strV7, strV8, zU, zU2, strV9, strV10, strV11, strV12, zU3, strV13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzags[] newArray(int i10) {
        return new zzags[i10];
    }
}
