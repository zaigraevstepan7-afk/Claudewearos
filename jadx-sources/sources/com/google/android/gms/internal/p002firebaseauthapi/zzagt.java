package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzagt implements Parcelable.Creator<zzagq> {
    @Override // android.os.Parcelable.Creator
    public final zzagq createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        while (parcel.dataPosition() < iK0) {
            v.f0(parcel.readInt(), parcel);
        }
        v.F(iK0, parcel);
        return new zzagq();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagq[] newArray(int i10) {
        return new zzagq[i10];
    }
}
