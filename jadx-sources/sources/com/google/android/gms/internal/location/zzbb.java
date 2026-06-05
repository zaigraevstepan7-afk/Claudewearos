package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final zzba createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        List<g> listZ = zzba.zza;
        LocationRequest locationRequest = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        boolean zU4 = false;
        boolean zU5 = false;
        long jB0 = Long.MAX_VALUE;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            char c6 = (char) i10;
            if (c6 != 1) {
                switch (c6) {
                    case 5:
                        listZ = v.z(parcel, i10, g.CREATOR);
                        break;
                    case 6:
                        strV = v.v(i10, parcel);
                        break;
                    case 7:
                        zU = v.U(i10, parcel);
                        break;
                    case '\b':
                        zU2 = v.U(i10, parcel);
                        break;
                    case '\t':
                        zU3 = v.U(i10, parcel);
                        break;
                    case '\n':
                        strV2 = v.v(i10, parcel);
                        break;
                    case 11:
                        zU4 = v.U(i10, parcel);
                        break;
                    case '\f':
                        zU5 = v.U(i10, parcel);
                        break;
                    case '\r':
                        strV3 = v.v(i10, parcel);
                        break;
                    case 14:
                        jB0 = v.b0(i10, parcel);
                        break;
                    default:
                        v.f0(i10, parcel);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) v.u(parcel, i10, LocationRequest.CREATOR);
            }
        }
        v.F(iK0, parcel);
        return new zzba(locationRequest, listZ, strV, zU, zU2, zU3, strV2, zU4, zU5, strV3, jB0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i10) {
        return new zzba[i10];
    }
}
