package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import nc.o2;
import nc.q3;
import nc.s3;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbuv implements Parcelable.Creator {
    public static final zzbuu zza(Parcel parcel) {
        int iK0 = v.k0(parcel);
        float fW = 0.0f;
        float fW2 = 0.0f;
        long jB0 = 0;
        long jB02 = 0;
        int iZ = 0;
        Bundle bundleQ = null;
        q3 q3Var = null;
        s3 s3Var = null;
        String strV = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        rc.a aVar = null;
        Bundle bundleQ2 = null;
        int iZ2 = 0;
        ArrayList arrayListX = null;
        Bundle bundleQ3 = null;
        boolean zU = false;
        int iZ3 = 0;
        int iZ4 = 0;
        String strV5 = null;
        String strV6 = null;
        ArrayList arrayListX2 = null;
        String strV7 = null;
        zzbgc zzbgcVar = null;
        ArrayList arrayListX3 = null;
        String strV8 = null;
        boolean zU2 = false;
        int iZ5 = 0;
        int iZ6 = 0;
        boolean zU3 = false;
        String strV9 = null;
        String strV10 = null;
        boolean zU4 = false;
        int iZ7 = 0;
        Bundle bundleQ4 = null;
        String strV11 = null;
        o2 o2Var = null;
        boolean zU5 = false;
        Bundle bundleQ5 = null;
        String strV12 = null;
        String strV13 = null;
        String strV14 = null;
        boolean zU6 = false;
        ArrayList arrayList = null;
        String strV15 = null;
        ArrayList arrayListX4 = null;
        int iZ8 = 0;
        boolean zU7 = false;
        boolean zU8 = false;
        boolean zU9 = false;
        ArrayList arrayListX5 = null;
        String strV16 = null;
        zzbmn zzbmnVar = null;
        String strV17 = null;
        Bundle bundleQ6 = null;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iZ = v.Z(i10, parcel);
                    break;
                case 2:
                    bundleQ = v.q(i10, parcel);
                    break;
                case 3:
                    q3Var = (q3) v.u(parcel, i10, q3.CREATOR);
                    break;
                case 4:
                    s3Var = (s3) v.u(parcel, i10, s3.CREATOR);
                    break;
                case 5:
                    strV = v.v(i10, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) v.u(parcel, i10, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) v.u(parcel, i10, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strV2 = v.v(i10, parcel);
                    break;
                case '\t':
                    strV3 = v.v(i10, parcel);
                    break;
                case '\n':
                    strV4 = v.v(i10, parcel);
                    break;
                case 11:
                    aVar = (rc.a) v.u(parcel, i10, rc.a.CREATOR);
                    break;
                case '\f':
                    bundleQ2 = v.q(i10, parcel);
                    break;
                case '\r':
                    iZ2 = v.Z(i10, parcel);
                    break;
                case 14:
                    arrayListX = v.x(i10, parcel);
                    break;
                case 15:
                    bundleQ3 = v.q(i10, parcel);
                    break;
                case 16:
                    zU = v.U(i10, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    v.f0(i10, parcel);
                    break;
                case 18:
                    iZ3 = v.Z(i10, parcel);
                    break;
                case 19:
                    iZ4 = v.Z(i10, parcel);
                    break;
                case 20:
                    fW = v.W(i10, parcel);
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    strV5 = v.v(i10, parcel);
                    break;
                case 25:
                    jB0 = v.b0(i10, parcel);
                    break;
                case 26:
                    strV6 = v.v(i10, parcel);
                    break;
                case 27:
                    arrayListX2 = v.x(i10, parcel);
                    break;
                case 28:
                    strV7 = v.v(i10, parcel);
                    break;
                case 29:
                    zzbgcVar = (zzbgc) v.u(parcel, i10, zzbgc.CREATOR);
                    break;
                case 30:
                    arrayListX3 = v.x(i10, parcel);
                    break;
                case 31:
                    jB02 = v.b0(i10, parcel);
                    break;
                case '!':
                    strV8 = v.v(i10, parcel);
                    break;
                case '\"':
                    fW2 = v.W(i10, parcel);
                    break;
                case '#':
                    iZ5 = v.Z(i10, parcel);
                    break;
                case '$':
                    iZ6 = v.Z(i10, parcel);
                    break;
                case '%':
                    zU3 = v.U(i10, parcel);
                    break;
                case '\'':
                    strV9 = v.v(i10, parcel);
                    break;
                case '(':
                    zU2 = v.U(i10, parcel);
                    break;
                case ')':
                    strV10 = v.v(i10, parcel);
                    break;
                case '*':
                    zU4 = v.U(i10, parcel);
                    break;
                case '+':
                    iZ7 = v.Z(i10, parcel);
                    break;
                case ',':
                    bundleQ4 = v.q(i10, parcel);
                    break;
                case '-':
                    strV11 = v.v(i10, parcel);
                    break;
                case '.':
                    o2Var = (o2) v.u(parcel, i10, o2.CREATOR);
                    break;
                case '/':
                    zU5 = v.U(i10, parcel);
                    break;
                case '0':
                    bundleQ5 = v.q(i10, parcel);
                    break;
                case '1':
                    strV12 = v.v(i10, parcel);
                    break;
                case '2':
                    strV13 = v.v(i10, parcel);
                    break;
                case '3':
                    strV14 = v.v(i10, parcel);
                    break;
                case '4':
                    zU6 = v.U(i10, parcel);
                    break;
                case '5':
                    int iD0 = v.d0(i10, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iD0 == 0) {
                        arrayList = null;
                        break;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = parcel.readInt();
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList2.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(iDataPosition + iD0);
                        arrayList = arrayList2;
                        break;
                    }
                case '6':
                    strV15 = v.v(i10, parcel);
                    break;
                case '7':
                    arrayListX4 = v.x(i10, parcel);
                    break;
                case '8':
                    iZ8 = v.Z(i10, parcel);
                    break;
                case '9':
                    zU7 = v.U(i10, parcel);
                    break;
                case ':':
                    zU8 = v.U(i10, parcel);
                    break;
                case ';':
                    zU9 = v.U(i10, parcel);
                    break;
                case '<':
                    arrayListX5 = v.x(i10, parcel);
                    break;
                case '=':
                    strV16 = v.v(i10, parcel);
                    break;
                case '?':
                    zzbmnVar = (zzbmn) v.u(parcel, i10, zzbmn.CREATOR);
                    break;
                case '@':
                    strV17 = v.v(i10, parcel);
                    break;
                case 'A':
                    bundleQ6 = v.q(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new zzbuu(iZ, bundleQ, q3Var, s3Var, strV, applicationInfo, packageInfo, strV2, strV3, strV4, aVar, bundleQ2, iZ2, arrayListX, bundleQ3, zU, iZ3, iZ4, fW, strV5, jB0, strV6, arrayListX2, strV7, zzbgcVar, arrayListX3, jB02, strV8, fW2, zU2, iZ5, iZ6, zU3, strV9, strV10, zU4, iZ7, bundleQ4, strV11, o2Var, zU5, bundleQ5, strV12, strV13, strV14, zU6, arrayList, strV15, arrayListX4, iZ8, zU7, zU8, zU9, arrayListX5, strV16, zzbmnVar, strV17, bundleQ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbuu[i10];
    }
}
