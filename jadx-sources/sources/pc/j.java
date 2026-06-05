package pc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import qc.r;
import t6.a1;
import t6.s;
import t6.z0;
import u6.v;
import w5.e0;
import w5.j0;
import w5.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12848a;

    public /* synthetic */ j(int i10) {
        this.f12848a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12848a) {
            case 0:
                int iK0 = v.k0(parcel);
                long jB0 = 0;
                boolean zU = false;
                int iZ = 0;
                int iZ2 = 0;
                boolean zU2 = false;
                e eVar = null;
                IBinder iBinderX = null;
                IBinder iBinderX2 = null;
                IBinder iBinderX3 = null;
                IBinder iBinderX4 = null;
                String strV = null;
                String strV2 = null;
                IBinder iBinderX5 = null;
                String strV3 = null;
                rc.a aVar = null;
                String strV4 = null;
                mc.j jVar = null;
                IBinder iBinderX6 = null;
                String strV5 = null;
                String strV6 = null;
                String strV7 = null;
                IBinder iBinderX7 = null;
                IBinder iBinderX8 = null;
                IBinder iBinderX9 = null;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            eVar = (e) v.u(parcel, i10, e.CREATOR);
                            break;
                        case 3:
                            iBinderX = v.X(i10, parcel);
                            break;
                        case 4:
                            iBinderX2 = v.X(i10, parcel);
                            break;
                        case 5:
                            iBinderX3 = v.X(i10, parcel);
                            break;
                        case 6:
                            iBinderX4 = v.X(i10, parcel);
                            break;
                        case 7:
                            strV = v.v(i10, parcel);
                            break;
                        case '\b':
                            zU = v.U(i10, parcel);
                            break;
                        case '\t':
                            strV2 = v.v(i10, parcel);
                            break;
                        case '\n':
                            iBinderX5 = v.X(i10, parcel);
                            break;
                        case 11:
                            iZ = v.Z(i10, parcel);
                            break;
                        case '\f':
                            iZ2 = v.Z(i10, parcel);
                            break;
                        case '\r':
                            strV3 = v.v(i10, parcel);
                            break;
                        case 14:
                            aVar = (rc.a) v.u(parcel, i10, rc.a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case zzbch.zzt.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            v.f0(i10, parcel);
                            break;
                        case 16:
                            strV4 = v.v(i10, parcel);
                            break;
                        case 17:
                            jVar = (mc.j) v.u(parcel, i10, mc.j.CREATOR);
                            break;
                        case 18:
                            iBinderX6 = v.X(i10, parcel);
                            break;
                        case 19:
                            strV5 = v.v(i10, parcel);
                            break;
                        case 24:
                            strV6 = v.v(i10, parcel);
                            break;
                        case 25:
                            strV7 = v.v(i10, parcel);
                            break;
                        case 26:
                            iBinderX7 = v.X(i10, parcel);
                            break;
                        case 27:
                            iBinderX8 = v.X(i10, parcel);
                            break;
                        case 28:
                            iBinderX9 = v.X(i10, parcel);
                            break;
                        case 29:
                            zU2 = v.U(i10, parcel);
                            break;
                        case 30:
                            jB0 = v.b0(i10, parcel);
                            break;
                    }
                }
                v.F(iK0, parcel);
                return new AdOverlayInfoParcel(eVar, iBinderX, iBinderX2, iBinderX3, iBinderX4, strV, zU, strV2, iBinderX5, iZ, iZ2, strV3, aVar, strV4, jVar, iBinderX6, strV5, strV6, strV7, iBinderX7, iBinderX8, iBinderX9, zU2, jB0);
            case 1:
                int iK02 = v.k0(parcel);
                int iZ3 = 0;
                String strV8 = null;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        strV8 = v.v(i11, parcel);
                    } else if (c6 != 2) {
                        v.f0(i11, parcel);
                    } else {
                        iZ3 = v.Z(i11, parcel);
                    }
                }
                v.F(iK02, parcel);
                return new r(strV8, iZ3);
            case 2:
                int iK03 = v.k0(parcel);
                int iZ4 = 0;
                int iZ5 = 0;
                boolean zU3 = false;
                boolean zU4 = false;
                String strV9 = null;
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 2) {
                        strV9 = v.v(i12, parcel);
                    } else if (c10 == 3) {
                        iZ4 = v.Z(i12, parcel);
                    } else if (c10 == 4) {
                        iZ5 = v.Z(i12, parcel);
                    } else if (c10 == 5) {
                        zU3 = v.U(i12, parcel);
                    } else if (c10 != 6) {
                        v.f0(i12, parcel);
                    } else {
                        zU4 = v.U(i12, parcel);
                    }
                }
                v.F(iK03, parcel);
                return new rc.a(strV9, iZ4, iZ5, zU3, zU4);
            case 3:
                int iK04 = v.k0(parcel);
                rd.a aVar2 = null;
                int iZ6 = 0;
                while (parcel.dataPosition() < iK04) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iZ6 = v.Z(i13, parcel);
                    } else if (c11 != 2) {
                        v.f0(i13, parcel);
                    } else {
                        aVar2 = (rd.a) v.u(parcel, i13, rd.a.CREATOR);
                    }
                }
                v.F(iK04, parcel);
                return new rd.b(iZ6, aVar2);
            case 4:
                int iK05 = v.k0(parcel);
                ArrayList arrayListZ = null;
                int iZ7 = 0;
                while (parcel.dataPosition() < iK05) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iZ7 = v.Z(i14, parcel);
                    } else if (c12 != 2) {
                        v.f0(i14, parcel);
                    } else {
                        arrayListZ = v.z(parcel, i14, rd.c.CREATOR);
                    }
                }
                v.F(iK05, parcel);
                return new rd.a(arrayListZ, iZ7);
            case 5:
                int iK06 = v.k0(parcel);
                int iZ8 = 0;
                String strV10 = null;
                int iZ9 = 0;
                while (parcel.dataPosition() < iK06) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        iZ8 = v.Z(i15, parcel);
                    } else if (c13 == 2) {
                        strV10 = v.v(i15, parcel);
                    } else if (c13 != 3) {
                        v.f0(i15, parcel);
                    } else {
                        iZ9 = v.Z(i15, parcel);
                    }
                }
                v.F(iK06, parcel);
                return new rd.c(iZ8, strV10, iZ9);
            case 6:
                int iK07 = v.k0(parcel);
                String strV11 = null;
                int iZ10 = 0;
                sd.a aVar3 = null;
                while (parcel.dataPosition() < iK07) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        iZ10 = v.Z(i16, parcel);
                    } else if (c14 == 2) {
                        strV11 = v.v(i16, parcel);
                    } else if (c14 != 3) {
                        v.f0(i16, parcel);
                    } else {
                        aVar3 = (sd.a) v.u(parcel, i16, sd.a.CREATOR);
                    }
                }
                v.F(iK07, parcel);
                return new sd.g(aVar3, strV11, iZ10);
            case 7:
                int iK08 = v.k0(parcel);
                ArrayList arrayListZ2 = null;
                int iZ11 = 0;
                String strV12 = null;
                while (parcel.dataPosition() < iK08) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        iZ11 = v.Z(i17, parcel);
                    } else if (c15 == 2) {
                        arrayListZ2 = v.z(parcel, i17, sd.f.CREATOR);
                    } else if (c15 != 3) {
                        v.f0(i17, parcel);
                    } else {
                        strV12 = v.v(i17, parcel);
                    }
                }
                v.F(iK08, parcel);
                return new sd.h(iZ11, strV12, arrayListZ2);
            case 8:
                int iK09 = v.k0(parcel);
                String strV13 = null;
                int iZ12 = 0;
                ArrayList arrayListZ3 = null;
                while (parcel.dataPosition() < iK09) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 1) {
                        iZ12 = v.Z(i18, parcel);
                    } else if (c16 == 2) {
                        strV13 = v.v(i18, parcel);
                    } else if (c16 != 3) {
                        v.f0(i18, parcel);
                    } else {
                        arrayListZ3 = v.z(parcel, i18, sd.g.CREATOR);
                    }
                }
                v.F(iK09, parcel);
                return new sd.f(iZ12, strV13, arrayListZ3);
            case 9:
                int iK010 = v.k0(parcel);
                int iZ13 = 0;
                Parcel parcel2 = null;
                sd.h hVar = null;
                while (parcel.dataPosition() < iK010) {
                    int i19 = parcel.readInt();
                    char c17 = (char) i19;
                    if (c17 == 1) {
                        iZ13 = v.Z(i19, parcel);
                    } else if (c17 == 2) {
                        int iD0 = v.d0(i19, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iD0 == 0) {
                            parcel2 = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(parcel, iDataPosition, iD0);
                            parcel.setDataPosition(iDataPosition + iD0);
                            parcel2 = parcelObtain;
                        }
                    } else if (c17 != 3) {
                        v.f0(i19, parcel);
                    } else {
                        hVar = (sd.h) v.u(parcel, i19, sd.h.CREATOR);
                    }
                }
                v.F(iK010, parcel);
                return new sd.d(iZ13, parcel2, hVar);
            case 10:
                s sVar = new s();
                sVar.f16020a = parcel.readInt();
                sVar.f16021b = parcel.readInt();
                sVar.f16022c = parcel.readInt() == 1;
                return sVar;
            case 11:
                z0 z0Var = new z0();
                z0Var.f16087a = parcel.readInt();
                z0Var.f16088b = parcel.readInt();
                z0Var.f16090d = parcel.readInt() == 1;
                int i20 = parcel.readInt();
                if (i20 > 0) {
                    int[] iArr = new int[i20];
                    z0Var.f16089c = iArr;
                    parcel.readIntArray(iArr);
                }
                return z0Var;
            case 12:
                a1 a1Var = new a1();
                a1Var.f15822a = parcel.readInt();
                a1Var.f15823b = parcel.readInt();
                int i21 = parcel.readInt();
                a1Var.f15824c = i21;
                if (i21 > 0) {
                    int[] iArr2 = new int[i21];
                    a1Var.f15825d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i22 = parcel.readInt();
                a1Var.f15826e = i22;
                if (i22 > 0) {
                    int[] iArr3 = new int[i22];
                    a1Var.f15827f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                a1Var.A = parcel.readInt() == 1;
                a1Var.B = parcel.readInt() == 1;
                a1Var.C = parcel.readInt() == 1;
                a1Var.f15828z = parcel.readArrayList(z0.class.getClassLoader());
                return a1Var;
            case 13:
                return new w5.b(parcel);
            case 14:
                return new w5.c(parcel);
            case 15:
                e0 e0Var = new e0();
                e0Var.f18625a = parcel.readString();
                e0Var.f18626b = parcel.readInt();
                return e0Var;
            case 16:
                j0 j0Var = new j0();
                j0Var.f18671e = null;
                j0Var.f18672f = new ArrayList();
                j0Var.f18673z = new ArrayList();
                j0Var.f18667a = parcel.createStringArrayList();
                j0Var.f18668b = parcel.createStringArrayList();
                j0Var.f18669c = (w5.b[]) parcel.createTypedArray(w5.b.CREATOR);
                j0Var.f18670d = parcel.readInt();
                j0Var.f18671e = parcel.readString();
                j0Var.f18672f = parcel.createStringArrayList();
                j0Var.f18673z = parcel.createTypedArrayList(w5.c.CREATOR);
                j0Var.A = parcel.createTypedArrayList(e0.CREATOR);
                return j0Var;
            case 17:
                return new m0(parcel);
            case 18:
                int iK011 = v.k0(parcel);
                Bundle bundleQ = null;
                while (parcel.dataPosition() < iK011) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 2) {
                        v.f0(i23, parcel);
                    } else {
                        bundleQ = v.q(i23, parcel);
                    }
                }
                v.F(iK011, parcel);
                return new wh.r(bundleQ);
            default:
                y4.f fVar = new y4.f(parcel);
                fVar.f20219a = parcel.readInt();
                return fVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f12848a) {
            case 0:
                return new AdOverlayInfoParcel[i10];
            case 1:
                return new r[i10];
            case 2:
                return new rc.a[i10];
            case 3:
                return new rd.b[i10];
            case 4:
                return new rd.a[i10];
            case 5:
                return new rd.c[i10];
            case 6:
                return new sd.g[i10];
            case 7:
                return new sd.h[i10];
            case 8:
                return new sd.f[i10];
            case 9:
                return new sd.d[i10];
            case 10:
                return new s[i10];
            case 11:
                return new z0[i10];
            case 12:
                return new a1[i10];
            case 13:
                return new w5.b[i10];
            case 14:
                return new w5.c[i10];
            case 15:
                return new e0[i10];
            case 16:
                return new j0[i10];
            case 17:
                return new m0[i10];
            case 18:
                return new wh.r[i10];
            default:
                return new y4.f[i10];
        }
    }
}
