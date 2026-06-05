package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        String strV2 = null;
        ArrayList arrayListX = null;
        ArrayList arrayListX2 = null;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        boolean zU4 = false;
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
                    zU = v.U(i10, parcel);
                    break;
                case 5:
                    zU2 = v.U(i10, parcel);
                    break;
                case 6:
                    arrayListX = v.x(i10, parcel);
                    break;
                case 7:
                    zU3 = v.U(i10, parcel);
                    break;
                case '\b':
                    zU4 = v.U(i10, parcel);
                    break;
                case '\t':
                    arrayListX2 = v.x(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbxv(strV, strV2, zU, zU2, arrayListX, zU3, zU4, arrayListX2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbxv[i10];
    }
}
