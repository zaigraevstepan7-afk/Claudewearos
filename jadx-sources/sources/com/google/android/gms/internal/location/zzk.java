package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.g;
import ee.b0;
import java.util.List;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        b0 b0Var = zzj.zzb;
        List<g> listZ = zzj.zza;
        String strV = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 == 1) {
                b0Var = (b0) v.u(parcel, i10, b0.CREATOR);
            } else if (c6 == 2) {
                listZ = v.z(parcel, i10, g.CREATOR);
            } else if (c6 != 3) {
                v.f0(i10, parcel);
            } else {
                strV = v.v(i10, parcel);
            }
        }
        v.F(iK0, parcel);
        return new zzj(b0Var, listZ, strV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i10) {
        return new zzj[i10];
    }
}
