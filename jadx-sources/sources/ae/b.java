package ae;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import cd.c;
import cd.d;
import ce.a0;
import ce.b0;
import ce.b1;
import ce.c0;
import ce.c1;
import ce.d0;
import ce.d1;
import ce.e;
import ce.e0;
import ce.f;
import ce.f0;
import ce.g;
import ce.h;
import ce.h0;
import ce.i;
import ce.i0;
import ce.j;
import ce.j0;
import ce.k;
import ce.k0;
import ce.l0;
import ce.m;
import ce.m0;
import ce.n0;
import ce.o0;
import ce.p0;
import ce.q0;
import ce.r0;
import ce.s0;
import ce.t0;
import ce.u0;
import ce.v0;
import ce.w;
import ce.w0;
import ce.x;
import ce.y;
import ce.y0;
import ce.z;
import ce.z0;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.fido.zzgx;
import java.util.ArrayList;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f423a;

    public /* synthetic */ b(int i10) {
        this.f423a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f423a) {
            case 0:
                try {
                    return Transport.a(parcel.readString());
                } catch (a e10) {
                    throw new RuntimeException(e10);
                }
            case 1:
                int iK0 = v.k0(parcel);
                String strV = null;
                String strV2 = null;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        strV = v.v(i10, parcel);
                    } else if (c6 != 2) {
                        v.f0(i10, parcel);
                    } else {
                        strV2 = v.v(i10, parcel);
                    }
                }
                v.F(iK0, parcel);
                return new c(strV, strV2);
            case 2:
                int iK02 = v.k0(parcel);
                String strV3 = null;
                int iZ = 0;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        strV3 = v.v(i11, parcel);
                    } else if (c10 != 2) {
                        v.f0(i11, parcel);
                    } else {
                        iZ = v.Z(i11, parcel);
                    }
                }
                v.F(iK02, parcel);
                return new d(strV3, iZ);
            case 3:
                try {
                    return ce.c.a(parcel.readString());
                } catch (ce.b e11) {
                    throw new RuntimeException(e11);
                }
            case 4:
                int iK03 = v.k0(parcel);
                boolean zU = false;
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        v.f0(i12, parcel);
                    } else {
                        zU = v.U(i12, parcel);
                    }
                }
                v.F(iK03, parcel);
                return new d1(zU);
            case 5:
                int iK04 = v.k0(parcel);
                long jB0 = 0;
                while (parcel.dataPosition() < iK04) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        v.f0(i13, parcel);
                    } else {
                        jB0 = v.b0(i13, parcel);
                    }
                }
                v.F(iK04, parcel);
                return new q0(jB0);
            case 6:
                int iK05 = v.k0(parcel);
                boolean zU2 = false;
                while (parcel.dataPosition() < iK05) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        v.f0(i14, parcel);
                    } else {
                        zU2 = v.U(i14, parcel);
                    }
                }
                v.F(iK05, parcel);
                return new r0(zU2);
            case 7:
                int iK06 = v.k0(parcel);
                boolean zU3 = false;
                while (parcel.dataPosition() < iK06) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        v.f0(i15, parcel);
                    } else {
                        zU3 = v.U(i15, parcel);
                    }
                }
                v.F(iK06, parcel);
                return new w(zU3);
            case 8:
                int iK07 = v.k0(parcel);
                String strV4 = null;
                while (parcel.dataPosition() < iK07) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        v.f0(i16, parcel);
                    } else {
                        strV4 = v.v(i16, parcel);
                    }
                }
                v.F(iK07, parcel);
                return new s0(strV4);
            case 9:
                int iK08 = v.k0(parcel);
                int iZ2 = 0;
                byte[] bArrR = null;
                byte[] bArrR2 = null;
                byte[] bArrR3 = null;
                while (parcel.dataPosition() < iK08) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        bArrR = v.r(i17, parcel);
                    } else if (c11 == 2) {
                        bArrR2 = v.r(i17, parcel);
                    } else if (c11 == 3) {
                        bArrR3 = v.r(i17, parcel);
                    } else if (c11 != 4) {
                        v.f0(i17, parcel);
                    } else {
                        iZ2 = v.Z(i17, parcel);
                    }
                }
                v.F(iK08, parcel);
                return new t0(bArrR == null ? null : zzgx.zzl(bArrR, 0, bArrR.length), bArrR2 == null ? null : zzgx.zzl(bArrR2, 0, bArrR2.length), bArrR3 != null ? zzgx.zzl(bArrR3, 0, bArrR3.length) : null, iZ2);
            case 10:
                int iK09 = v.k0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (parcel.dataPosition() < iK09) {
                        int i18 = parcel.readInt();
                        if (((char) i18) != 1) {
                            v.f0(i18, parcel);
                        } else {
                            int iD0 = v.d0(i18, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iD0 == 0) {
                                break;
                            }
                            int i19 = parcel.readInt();
                            byte[][] bArr2 = new byte[i19][];
                            for (int i20 = 0; i20 < i19; i20++) {
                                bArr2[i20] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iD0);
                            bArr = bArr2;
                        }
                    }
                    v.F(iK09, parcel);
                    return new u0(bArr);
                    break;
                }
            case 11:
                int iK010 = v.k0(parcel);
                c0 c0Var = null;
                f0 f0Var = null;
                byte[] bArrR4 = null;
                ArrayList arrayListZ = null;
                Double dV = null;
                ArrayList arrayListZ2 = null;
                m mVar = null;
                Integer numA0 = null;
                l0 l0Var = null;
                String strV5 = null;
                f fVar = null;
                String strV6 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iK010) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            c0Var = (c0) v.u(parcel, i21, c0.CREATOR);
                            break;
                        case 3:
                            f0Var = (f0) v.u(parcel, i21, f0.CREATOR);
                            break;
                        case 4:
                            bArrR4 = v.r(i21, parcel);
                            break;
                        case 5:
                            arrayListZ = v.z(parcel, i21, a0.CREATOR);
                            break;
                        case 6:
                            dV = v.V(i21, parcel);
                            break;
                        case 7:
                            arrayListZ2 = v.z(parcel, i21, z.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) v.u(parcel, i21, m.CREATOR);
                            break;
                        case '\t':
                            numA0 = v.a0(i21, parcel);
                            break;
                        case '\n':
                            l0Var = (l0) v.u(parcel, i21, l0.CREATOR);
                            break;
                        case 11:
                            strV5 = v.v(i21, parcel);
                            break;
                        case '\f':
                            fVar = (f) v.u(parcel, i21, f.CREATOR);
                            break;
                        case '\r':
                            strV6 = v.v(i21, parcel);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) v.u(parcel, i21, ResultReceiver.CREATOR);
                            break;
                        default:
                            v.f0(i21, parcel);
                            break;
                    }
                }
                v.F(iK010, parcel);
                return new y(c0Var, f0Var, bArrR4, arrayListZ, dV, arrayListZ2, mVar, numA0, l0Var, strV5, fVar, strV6, resultReceiver);
            case 12:
                int iK011 = v.k0(parcel);
                String strV7 = null;
                String strV8 = null;
                byte[] bArrR5 = null;
                j jVar = null;
                i iVar = null;
                k kVar = null;
                g gVar = null;
                String strV9 = null;
                while (parcel.dataPosition() < iK011) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            strV7 = v.v(i22, parcel);
                            break;
                        case 2:
                            strV8 = v.v(i22, parcel);
                            break;
                        case 3:
                            bArrR5 = v.r(i22, parcel);
                            break;
                        case 4:
                            jVar = (j) v.u(parcel, i22, j.CREATOR);
                            break;
                        case 5:
                            iVar = (i) v.u(parcel, i22, i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) v.u(parcel, i22, k.CREATOR);
                            break;
                        case 7:
                            gVar = (g) v.u(parcel, i22, g.CREATOR);
                            break;
                        case '\b':
                            strV9 = v.v(i22, parcel);
                            break;
                        case '\t':
                            v.v(i22, parcel);
                            break;
                        default:
                            v.f0(i22, parcel);
                            break;
                    }
                }
                v.F(iK011, parcel);
                return new x(strV7, strV8, bArrR5, jVar, iVar, kVar, gVar, strV9);
            case 13:
                int iK012 = v.k0(parcel);
                String strV10 = null;
                byte[] bArrR6 = null;
                ArrayList arrayListZ3 = null;
                while (parcel.dataPosition() < iK012) {
                    int i23 = parcel.readInt();
                    char c12 = (char) i23;
                    if (c12 == 2) {
                        strV10 = v.v(i23, parcel);
                    } else if (c12 == 3) {
                        bArrR6 = v.r(i23, parcel);
                    } else if (c12 != 4) {
                        v.f0(i23, parcel);
                    } else {
                        arrayListZ3 = v.z(parcel, i23, Transport.CREATOR);
                    }
                }
                v.F(iK012, parcel);
                return new z(strV10, bArrR6, arrayListZ3);
            case 14:
                int iK013 = v.k0(parcel);
                String strV11 = null;
                Integer numA02 = null;
                while (parcel.dataPosition() < iK013) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 2) {
                        strV11 = v.v(i24, parcel);
                    } else if (c13 != 3) {
                        v.f0(i24, parcel);
                    } else {
                        numA02 = v.a0(i24, parcel);
                    }
                }
                v.F(iK013, parcel);
                return new a0(strV11, numA02.intValue());
            case 15:
                int iK014 = v.k0(parcel);
                byte[] bArrR7 = null;
                Double dV2 = null;
                String strV12 = null;
                ArrayList arrayListZ4 = null;
                Integer numA03 = null;
                l0 l0Var2 = null;
                String strV13 = null;
                f fVar2 = null;
                Long lC0 = null;
                String strV14 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < iK014) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            bArrR7 = v.r(i25, parcel);
                            break;
                        case 3:
                            dV2 = v.V(i25, parcel);
                            break;
                        case 4:
                            strV12 = v.v(i25, parcel);
                            break;
                        case 5:
                            arrayListZ4 = v.z(parcel, i25, z.CREATOR);
                            break;
                        case 6:
                            numA03 = v.a0(i25, parcel);
                            break;
                        case 7:
                            l0Var2 = (l0) v.u(parcel, i25, l0.CREATOR);
                            break;
                        case '\b':
                            strV13 = v.v(i25, parcel);
                            break;
                        case '\t':
                            fVar2 = (f) v.u(parcel, i25, f.CREATOR);
                            break;
                        case '\n':
                            lC0 = v.c0(i25, parcel);
                            break;
                        case 11:
                            strV14 = v.v(i25, parcel);
                            break;
                        case '\f':
                            resultReceiver2 = (ResultReceiver) v.u(parcel, i25, ResultReceiver.CREATOR);
                            break;
                        default:
                            v.f0(i25, parcel);
                            break;
                    }
                }
                v.F(iK014, parcel);
                return new b0(bArrR7, dV2, strV12, arrayListZ4, numA03, l0Var2, strV13, fVar2, lC0, strV14, resultReceiver2);
            case 16:
                int iK015 = v.k0(parcel);
                String strV15 = null;
                String strV16 = null;
                String strV17 = null;
                while (parcel.dataPosition() < iK015) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 2) {
                        strV15 = v.v(i26, parcel);
                    } else if (c14 == 3) {
                        strV16 = v.v(i26, parcel);
                    } else if (c14 != 4) {
                        v.f0(i26, parcel);
                    } else {
                        strV17 = v.v(i26, parcel);
                    }
                }
                v.F(iK015, parcel);
                return new c0(strV15, strV16, strV17);
            case 17:
                try {
                    return e0.a(parcel.readString());
                } catch (d0 e12) {
                    throw new RuntimeException(e12);
                }
            case 18:
                int iK016 = v.k0(parcel);
                byte[] bArrR8 = null;
                String strV18 = null;
                String strV19 = null;
                String strV20 = null;
                while (parcel.dataPosition() < iK016) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 2) {
                        bArrR8 = v.r(i27, parcel);
                    } else if (c15 == 3) {
                        strV18 = v.v(i27, parcel);
                    } else if (c15 == 4) {
                        strV19 = v.v(i27, parcel);
                    } else if (c15 != 5) {
                        v.f0(i27, parcel);
                    } else {
                        strV20 = v.v(i27, parcel);
                    }
                }
                v.F(iK016, parcel);
                return new f0(strV18, strV19, strV20, bArrR8);
            case 19:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return i0.a(string);
                } catch (h0 e13) {
                    throw new RuntimeException(e13);
                }
            case 20:
                int iK017 = v.k0(parcel);
                String strV21 = null;
                while (parcel.dataPosition() < iK017) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        v.f0(i28, parcel);
                    } else {
                        strV21 = v.v(i28, parcel);
                    }
                }
                v.F(iK017, parcel);
                return new v0(strV21);
            case zzbch.zzt.zzm /* 21 */:
                try {
                    return j0.a(parcel.readString());
                } catch (k0 e14) {
                    throw new RuntimeException(e14);
                }
            case 22:
                int iK018 = v.k0(parcel);
                String strV22 = null;
                String strV23 = null;
                while (parcel.dataPosition() < iK018) {
                    int i29 = parcel.readInt();
                    char c16 = (char) i29;
                    if (c16 == 2) {
                        strV22 = v.v(i29, parcel);
                    } else if (c16 != 3) {
                        v.f0(i29, parcel);
                    } else {
                        strV23 = v.v(i29, parcel);
                    }
                }
                v.F(iK018, parcel);
                return new l0(strV22, strV23);
            case 23:
                try {
                    return e.a(parcel.readString());
                } catch (ce.d e15) {
                    throw new RuntimeException(e15);
                }
            case 24:
                int iK019 = v.k0(parcel);
                boolean zU4 = false;
                while (parcel.dataPosition() < iK019) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 1) {
                        v.f0(i30, parcel);
                    } else {
                        zU4 = v.U(i30, parcel);
                    }
                }
                v.F(iK019, parcel);
                return new m0(zU4);
            case 25:
                try {
                    return n0.a(parcel.readString());
                } catch (w0 e16) {
                    throw new RuntimeException(e16);
                }
            case 26:
                int iK020 = v.k0(parcel);
                ArrayList arrayListZ5 = null;
                while (parcel.dataPosition() < iK020) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        v.f0(i31, parcel);
                    } else {
                        arrayListZ5 = v.z(parcel, i31, p0.CREATOR);
                    }
                }
                v.F(iK020, parcel);
                return new o0(arrayListZ5);
            case 27:
                int iK021 = v.k0(parcel);
                int iZ3 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < iK021) {
                    int i32 = parcel.readInt();
                    char c17 = (char) i32;
                    if (c17 == 1) {
                        iZ3 = v.Z(i32, parcel);
                    } else if (c17 == 2) {
                        v.o0(parcel, i32, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c17 != 3) {
                        v.f0(i32, parcel);
                    } else {
                        v.o0(parcel, i32, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                v.F(iK021, parcel);
                return new p0(iZ3, s10, s11);
            case 28:
                int iK022 = v.k0(parcel);
                o0 o0Var = null;
                y0 y0Var = null;
                h hVar = null;
                z0 z0Var = null;
                String strV24 = null;
                while (parcel.dataPosition() < iK022) {
                    int i33 = parcel.readInt();
                    char c18 = (char) i33;
                    if (c18 == 1) {
                        o0Var = (o0) v.u(parcel, i33, o0.CREATOR);
                    } else if (c18 == 2) {
                        y0Var = (y0) v.u(parcel, i33, y0.CREATOR);
                    } else if (c18 == 3) {
                        hVar = (h) v.u(parcel, i33, h.CREATOR);
                    } else if (c18 == 4) {
                        z0Var = (z0) v.u(parcel, i33, z0.CREATOR);
                    } else if (c18 != 5) {
                        v.f0(i33, parcel);
                    } else {
                        strV24 = v.v(i33, parcel);
                    }
                }
                v.F(iK022, parcel);
                return new g(o0Var, y0Var, hVar, z0Var, strV24);
            default:
                int iK023 = v.k0(parcel);
                ce.v vVar = null;
                b1 b1Var = null;
                m0 m0Var = null;
                d1 d1Var = null;
                q0 q0Var = null;
                r0 r0Var = null;
                c1 c1Var = null;
                s0 s0Var = null;
                w wVar = null;
                u0 u0Var = null;
                v0 v0Var = null;
                t0 t0Var = null;
                while (parcel.dataPosition() < iK023) {
                    int i34 = parcel.readInt();
                    switch ((char) i34) {
                        case 2:
                            vVar = (ce.v) v.u(parcel, i34, ce.v.CREATOR);
                            break;
                        case 3:
                            b1Var = (b1) v.u(parcel, i34, b1.CREATOR);
                            break;
                        case 4:
                            m0Var = (m0) v.u(parcel, i34, m0.CREATOR);
                            break;
                        case 5:
                            d1Var = (d1) v.u(parcel, i34, d1.CREATOR);
                            break;
                        case 6:
                            q0Var = (q0) v.u(parcel, i34, q0.CREATOR);
                            break;
                        case 7:
                            r0Var = (r0) v.u(parcel, i34, r0.CREATOR);
                            break;
                        case '\b':
                            c1Var = (c1) v.u(parcel, i34, c1.CREATOR);
                            break;
                        case '\t':
                            s0Var = (s0) v.u(parcel, i34, s0.CREATOR);
                            break;
                        case '\n':
                            wVar = (w) v.u(parcel, i34, w.CREATOR);
                            break;
                        case 11:
                            u0Var = (u0) v.u(parcel, i34, u0.CREATOR);
                            break;
                        case '\f':
                            v0Var = (v0) v.u(parcel, i34, v0.CREATOR);
                            break;
                        case '\r':
                            t0Var = (t0) v.u(parcel, i34, t0.CREATOR);
                            break;
                        default:
                            v.f0(i34, parcel);
                            break;
                    }
                }
                v.F(iK023, parcel);
                return new f(vVar, b1Var, m0Var, d1Var, q0Var, r0Var, c1Var, s0Var, wVar, u0Var, v0Var, t0Var);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f423a) {
            case 0:
                return new Transport[i10];
            case 1:
                return new c[i10];
            case 2:
                return new d[i10];
            case 3:
                return new ce.c[i10];
            case 4:
                return new d1[i10];
            case 5:
                return new q0[i10];
            case 6:
                return new r0[i10];
            case 7:
                return new w[i10];
            case 8:
                return new s0[i10];
            case 9:
                return new t0[i10];
            case 10:
                return new u0[i10];
            case 11:
                return new y[i10];
            case 12:
                return new x[i10];
            case 13:
                return new z[i10];
            case 14:
                return new a0[i10];
            case 15:
                return new b0[i10];
            case 16:
                return new c0[i10];
            case 17:
                return new e0[i10];
            case 18:
                return new f0[i10];
            case 19:
                return new i0[i10];
            case 20:
                return new v0[i10];
            case zzbch.zzt.zzm /* 21 */:
                return new j0[i10];
            case 22:
                return new l0[i10];
            case 23:
                return new e[i10];
            case 24:
                return new m0[i10];
            case 25:
                return new n0[i10];
            case 26:
                return new o0[i10];
            case 27:
                return new p0[i10];
            case 28:
                return new g[i10];
            default:
                return new f[i10];
        }
    }
}
