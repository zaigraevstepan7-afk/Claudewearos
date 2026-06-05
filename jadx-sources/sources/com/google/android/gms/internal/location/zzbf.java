package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        int iZ = 0;
        short s10 = 0;
        int iZ2 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float fW = 0.0f;
        long jB0 = 0;
        int iZ3 = -1;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strV = v.v(i10, parcel);
                    break;
                case 2:
                    jB0 = v.b0(i10, parcel);
                    break;
                case 3:
                    v.o0(parcel, i10, 4);
                    s10 = (short) parcel.readInt();
                    break;
                case 4:
                    v.o0(parcel, i10, 8);
                    d10 = parcel.readDouble();
                    break;
                case 5:
                    v.o0(parcel, i10, 8);
                    d11 = parcel.readDouble();
                    break;
                case 6:
                    fW = v.W(i10, parcel);
                    break;
                case 7:
                    iZ = v.Z(i10, parcel);
                    break;
                case '\b':
                    iZ2 = v.Z(i10, parcel);
                    break;
                case '\t':
                    iZ3 = v.Z(i10, parcel);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbe(strV, iZ, s10, d10, d11, fW, jB0, iZ2, iZ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i10) {
        return new zzbe[i10];
    }
}
