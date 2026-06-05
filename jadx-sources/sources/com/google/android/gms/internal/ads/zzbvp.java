package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbvp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        boolean zU = false;
        boolean zU2 = false;
        int iZ = 0;
        Bundle bundleQ = null;
        rc.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String strV = null;
        ArrayList arrayListX = null;
        PackageInfo packageInfo = null;
        String strV2 = null;
        String strV3 = null;
        zzfei zzfeiVar = null;
        String strV4 = null;
        Bundle bundleQ2 = null;
        Bundle bundleQ3 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    bundleQ = v.q(i10, parcel);
                    break;
                case 2:
                    aVar = (rc.a) v.u(parcel, i10, rc.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) v.u(parcel, i10, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strV = v.v(i10, parcel);
                    break;
                case 5:
                    arrayListX = v.x(i10, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) v.u(parcel, i10, PackageInfo.CREATOR);
                    break;
                case 7:
                    strV2 = v.v(i10, parcel);
                    break;
                case '\b':
                default:
                    v.f0(i10, parcel);
                    break;
                case '\t':
                    strV3 = v.v(i10, parcel);
                    break;
                case '\n':
                    zzfeiVar = (zzfei) v.u(parcel, i10, zzfei.CREATOR);
                    break;
                case 11:
                    strV4 = v.v(i10, parcel);
                    break;
                case '\f':
                    zU = v.U(i10, parcel);
                    break;
                case '\r':
                    zU2 = v.U(i10, parcel);
                    break;
                case 14:
                    bundleQ2 = v.q(i10, parcel);
                    break;
                case 15:
                    bundleQ3 = v.q(i10, parcel);
                    break;
                case 16:
                    iZ = v.Z(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbvo(bundleQ, aVar, applicationInfo, strV, arrayListX, packageInfo, strV2, strV3, zzfeiVar, strV4, zU, zU2, bundleQ2, bundleQ3, iZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbvo[i10];
    }
}
