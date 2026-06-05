package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        long jB0 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) v.u(parcel, i10, ParcelFileDescriptor.CREATOR);
            } else if (c6 == 3) {
                zU = v.U(i10, parcel);
            } else if (c6 == 4) {
                zU2 = v.U(i10, parcel);
            } else if (c6 == 5) {
                jB0 = v.b0(i10, parcel);
            } else if (c6 != 6) {
                v.f0(i10, parcel);
            } else {
                zU3 = v.U(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzbbj(parcelFileDescriptor, zU, zU2, jB0, zU3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbbj[i10];
    }
}
