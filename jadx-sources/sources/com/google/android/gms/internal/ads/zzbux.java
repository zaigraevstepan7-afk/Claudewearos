package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbux implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        ArrayList arrayListX = null;
        boolean zU = false;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 2) {
                zU = v.U(i10, parcel);
            } else if (c6 != 3) {
                v.f0(i10, parcel);
            } else {
                arrayListX = v.x(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzbuw(zU, arrayListX);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbuw[i10];
    }
}
