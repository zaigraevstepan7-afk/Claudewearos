package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbvn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                v.f0(i10, parcel);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) v.u(parcel, i10, ParcelFileDescriptor.CREATOR);
            }
        }
        v.F(iK0, parcel);
        return new zzbvm(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbvm[i10];
    }
}
