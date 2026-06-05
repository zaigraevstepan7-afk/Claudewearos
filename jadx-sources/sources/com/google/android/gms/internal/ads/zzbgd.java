package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import nc.n3;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbgd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        int iZ = 0;
        boolean zU = false;
        int iZ2 = 0;
        boolean zU2 = false;
        int iZ3 = 0;
        boolean zU3 = false;
        int iZ4 = 0;
        int iZ5 = 0;
        boolean zU4 = false;
        int iZ6 = 0;
        n3 n3Var = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iZ = v.Z(i10, parcel);
                    break;
                case 2:
                    zU = v.U(i10, parcel);
                    break;
                case 3:
                    iZ2 = v.Z(i10, parcel);
                    break;
                case 4:
                    zU2 = v.U(i10, parcel);
                    break;
                case 5:
                    iZ3 = v.Z(i10, parcel);
                    break;
                case 6:
                    n3Var = (n3) v.u(parcel, i10, n3.CREATOR);
                    break;
                case 7:
                    zU3 = v.U(i10, parcel);
                    break;
                case '\b':
                    iZ4 = v.Z(i10, parcel);
                    break;
                case '\t':
                    iZ5 = v.Z(i10, parcel);
                    break;
                case '\n':
                    zU4 = v.U(i10, parcel);
                    break;
                case 11:
                    iZ6 = v.Z(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbgc(iZ, zU, iZ2, zU2, iZ3, n3Var, zU3, iZ4, iZ5, zU4, iZ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbgc[i10];
    }
}
