package jg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaft;
import ig.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8871a;

    public /* synthetic */ c(int i10) {
        this.f8871a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8871a) {
            case 0:
                int iK0 = u6.v.k0(parcel);
                l lVar = null;
                ArrayList arrayListZ = null;
                zzafm zzafmVar = null;
                y yVar = null;
                String strV = null;
                String strV2 = null;
                ArrayList arrayListZ2 = null;
                ArrayList arrayListX = null;
                String strV3 = null;
                Boolean boolValueOf = null;
                e eVar = null;
                boolean zU = false;
                f0 f0Var = null;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    ArrayList arrayList = arrayListZ;
                    switch ((char) i10) {
                        case 1:
                            zzafmVar = (zzafm) u6.v.u(parcel, i10, zzafm.CREATOR);
                            break;
                        case 2:
                            yVar = (y) u6.v.u(parcel, i10, y.CREATOR);
                            break;
                        case 3:
                            strV = u6.v.v(i10, parcel);
                            break;
                        case 4:
                            strV2 = u6.v.v(i10, parcel);
                            break;
                        case 5:
                            arrayListZ2 = u6.v.z(parcel, i10, y.CREATOR);
                            break;
                        case 6:
                            arrayListX = u6.v.x(i10, parcel);
                            break;
                        case 7:
                            strV3 = u6.v.v(i10, parcel);
                            break;
                        case '\b':
                            int iD0 = u6.v.d0(i10, parcel);
                            if (iD0 != 0) {
                                u6.v.n0(parcel, iD0, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        case '\t':
                            eVar = (e) u6.v.u(parcel, i10, e.CREATOR);
                            break;
                        case '\n':
                            zU = u6.v.U(i10, parcel);
                            break;
                        case 11:
                            f0Var = (f0) u6.v.u(parcel, i10, f0.CREATOR);
                            break;
                        case '\f':
                            lVar = (l) u6.v.u(parcel, i10, l.CREATOR);
                            break;
                        case '\r':
                            arrayListZ = u6.v.z(parcel, i10, zzaft.CREATOR);
                            continue;
                        default:
                            u6.v.f0(i10, parcel);
                            break;
                    }
                    arrayListZ = arrayList;
                }
                u6.v.F(iK0, parcel);
                d dVar = new d();
                dVar.f8872a = zzafmVar;
                dVar.f8873b = yVar;
                dVar.f8874c = strV;
                dVar.f8875d = strV2;
                dVar.f8876e = arrayListZ2;
                dVar.f8877f = arrayListX;
                dVar.f8878z = strV3;
                dVar.A = boolValueOf;
                dVar.B = eVar;
                dVar.C = zU;
                dVar.D = f0Var;
                dVar.E = lVar;
                dVar.F = arrayListZ;
                return dVar;
            case 1:
                int iK02 = u6.v.k0(parcel);
                long jB0 = 0;
                long jB02 = 0;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        jB0 = u6.v.b0(i11, parcel);
                    } else if (c6 != 2) {
                        u6.v.f0(i11, parcel);
                    } else {
                        jB02 = u6.v.b0(i11, parcel);
                    }
                }
                u6.v.F(iK02, parcel);
                return new e(jB0, jB02);
            case 2:
                int iK03 = u6.v.k0(parcel);
                String strV4 = null;
                String strV5 = null;
                ArrayList arrayListZ3 = null;
                ArrayList arrayListZ4 = null;
                d dVar2 = null;
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        strV4 = u6.v.v(i12, parcel);
                    } else if (c10 == 2) {
                        strV5 = u6.v.v(i12, parcel);
                    } else if (c10 == 3) {
                        arrayListZ3 = u6.v.z(parcel, i12, ig.v.CREATOR);
                    } else if (c10 == 4) {
                        arrayListZ4 = u6.v.z(parcel, i12, ig.y.CREATOR);
                    } else if (c10 != 5) {
                        u6.v.f0(i12, parcel);
                    } else {
                        dVar2 = (d) u6.v.u(parcel, i12, d.CREATOR);
                    }
                }
                u6.v.F(iK03, parcel);
                f fVar = new f();
                fVar.f8881a = strV4;
                fVar.f8882b = strV5;
                fVar.f8883c = arrayListZ3;
                fVar.f8884d = arrayListZ4;
                fVar.f8885e = dVar2;
                return fVar;
            case 3:
                int iK04 = u6.v.k0(parcel);
                ArrayList arrayListZ5 = null;
                ArrayList arrayListZ6 = null;
                while (parcel.dataPosition() < iK04) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        arrayListZ5 = u6.v.z(parcel, i13, ig.v.CREATOR);
                    } else if (c11 != 2) {
                        u6.v.f0(i13, parcel);
                    } else {
                        arrayListZ6 = u6.v.z(parcel, i13, ig.y.CREATOR);
                    }
                }
                u6.v.F(iK04, parcel);
                return new l(arrayListZ5, arrayListZ6);
            case 4:
                int iK05 = u6.v.k0(parcel);
                String strV6 = null;
                boolean zU2 = false;
                String strV7 = null;
                while (parcel.dataPosition() < iK05) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        strV6 = u6.v.v(i14, parcel);
                    } else if (c12 == 2) {
                        strV7 = u6.v.v(i14, parcel);
                    } else if (c12 != 3) {
                        u6.v.f0(i14, parcel);
                    } else {
                        zU2 = u6.v.U(i14, parcel);
                    }
                }
                u6.v.F(iK05, parcel);
                return new w(strV6, strV7, zU2);
            case 5:
                int iK06 = u6.v.k0(parcel);
                d dVar3 = null;
                w wVar = null;
                f0 f0Var2 = null;
                while (parcel.dataPosition() < iK06) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        dVar3 = (d) u6.v.u(parcel, i15, d.CREATOR);
                    } else if (c13 == 2) {
                        wVar = (w) u6.v.u(parcel, i15, w.CREATOR);
                    } else if (c13 != 3) {
                        u6.v.f0(i15, parcel);
                    } else {
                        f0Var2 = (f0) u6.v.u(parcel, i15, f0.CREATOR);
                    }
                }
                u6.v.F(iK06, parcel);
                x xVar = new x();
                xVar.f8917a = dVar3;
                xVar.f8918b = wVar;
                xVar.f8919c = f0Var2;
                return xVar;
            default:
                int iK07 = u6.v.k0(parcel);
                String strV8 = null;
                String strV9 = null;
                String strV10 = null;
                String strV11 = null;
                String strV12 = null;
                String strV13 = null;
                String strV14 = null;
                boolean zU3 = false;
                while (parcel.dataPosition() < iK07) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strV8 = u6.v.v(i16, parcel);
                            break;
                        case 2:
                            strV9 = u6.v.v(i16, parcel);
                            break;
                        case 3:
                            strV12 = u6.v.v(i16, parcel);
                            break;
                        case 4:
                            strV11 = u6.v.v(i16, parcel);
                            break;
                        case 5:
                            strV10 = u6.v.v(i16, parcel);
                            break;
                        case 6:
                            strV13 = u6.v.v(i16, parcel);
                            break;
                        case 7:
                            zU3 = u6.v.U(i16, parcel);
                            break;
                        case '\b':
                            strV14 = u6.v.v(i16, parcel);
                            break;
                        default:
                            u6.v.f0(i16, parcel);
                            break;
                    }
                }
                u6.v.F(iK07, parcel);
                return new y(strV8, strV9, strV10, strV11, strV12, strV13, zU3, strV14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f8871a) {
            case 0:
                return new d[i10];
            case 1:
                return new e[i10];
            case 2:
                return new f[i10];
            case 3:
                return new l[i10];
            case 4:
                return new w[i10];
            case 5:
                return new x[i10];
            default:
                return new y[i10];
        }
    }
}
