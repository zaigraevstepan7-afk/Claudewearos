package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final zzbc createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        int iZ = 1;
        zzba zzbaVar = null;
        IBinder iBinderX = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderX2 = null;
        IBinder iBinderX3 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iZ = v.Z(i10, parcel);
                    break;
                case 2:
                    zzbaVar = (zzba) v.u(parcel, i10, zzba.CREATOR);
                    break;
                case 3:
                    iBinderX = v.X(i10, parcel);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) v.u(parcel, i10, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderX2 = v.X(i10, parcel);
                    break;
                case 6:
                    iBinderX3 = v.X(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbc(iZ, zzbaVar, iBinderX, pendingIntent, iBinderX2, iBinderX3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i10) {
        return new zzbc[i10];
    }
}
