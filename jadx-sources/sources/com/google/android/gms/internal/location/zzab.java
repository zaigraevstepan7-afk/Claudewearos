package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator<zzaa> {
    @Override // android.os.Parcelable.Creator
    public final zzaa createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        Status status = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                v.f0(i10, parcel);
            } else {
                status = (Status) v.u(parcel, i10, Status.CREATOR);
            }
        }
        v.F(iK0, parcel);
        return new zzaa(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa[] newArray(int i10) {
        return new zzaa[i10];
    }
}
