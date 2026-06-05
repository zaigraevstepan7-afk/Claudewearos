package ce;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.fido.zzgx;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3336a;

    public /* synthetic */ x0(int i10) {
        this.f3336a = i10;
    }

    public static void a(com.google.android.gms.common.internal.k kVar, Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        int i11 = kVar.f3656a;
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = kVar.f3657b;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = kVar.f3658c;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i13);
        uk.c.c0(parcel, 4, kVar.f3659d, false);
        uk.c.X(parcel, 5, kVar.f3660e);
        uk.c.f0(parcel, 6, kVar.f3661f, i10);
        uk.c.U(parcel, 7, kVar.f3662z, false);
        uk.c.b0(parcel, 8, kVar.A, i10, false);
        uk.c.f0(parcel, 10, kVar.B, i10);
        uk.c.f0(parcel, 11, kVar.C, i10);
        boolean z2 = kVar.D;
        uk.c.k0(parcel, 12, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i14 = kVar.E;
        uk.c.k0(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z10 = kVar.F;
        uk.c.k0(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        uk.c.c0(parcel, 15, kVar.G, false);
        uk.c.j0(iH0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3336a) {
            case 0:
                int iK0 = u6.v.k0(parcel);
                boolean zU = false;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        u6.v.f0(i10, parcel);
                    } else {
                        zU = u6.v.U(i10, parcel);
                    }
                }
                u6.v.F(iK0, parcel);
                return new h(zU);
            case 1:
                int iK02 = u6.v.k0(parcel);
                byte[] bArrR = null;
                byte[] bArrR2 = null;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        bArrR = u6.v.r(i11, parcel);
                    } else if (c6 != 2) {
                        u6.v.f0(i11, parcel);
                    } else {
                        bArrR2 = u6.v.r(i11, parcel);
                    }
                }
                u6.v.F(iK02, parcel);
                return new y0(bArrR == null ? null : zzgx.zzl(bArrR, 0, bArrR.length), bArrR2 != null ? zzgx.zzl(bArrR2, 0, bArrR2.length) : null);
            case 2:
                int iK03 = u6.v.k0(parcel);
                byte[] bArrR3 = null;
                boolean zU2 = false;
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        zU2 = u6.v.U(i12, parcel);
                    } else if (c10 != 2) {
                        u6.v.f0(i12, parcel);
                    } else {
                        bArrR3 = u6.v.r(i12, parcel);
                    }
                }
                u6.v.F(iK03, parcel);
                return new z0(zU2, bArrR3 != null ? zzgx.zzl(bArrR3, 0, bArrR3.length) : null);
            case 3:
                int iK04 = u6.v.k0(parcel);
                byte[] bArrR4 = null;
                byte[] bArrR5 = null;
                byte[] bArrR6 = null;
                byte[] bArrR7 = null;
                byte[] bArrR8 = null;
                while (parcel.dataPosition() < iK04) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        bArrR4 = u6.v.r(i13, parcel);
                    } else if (c11 == 3) {
                        bArrR5 = u6.v.r(i13, parcel);
                    } else if (c11 == 4) {
                        bArrR6 = u6.v.r(i13, parcel);
                    } else if (c11 == 5) {
                        bArrR7 = u6.v.r(i13, parcel);
                    } else if (c11 != 6) {
                        u6.v.f0(i13, parcel);
                    } else {
                        bArrR8 = u6.v.r(i13, parcel);
                    }
                }
                u6.v.F(iK04, parcel);
                return new i(bArrR4, bArrR5, bArrR6, bArrR7, bArrR8);
            case 4:
                int iK05 = u6.v.k0(parcel);
                byte[] bArrR9 = null;
                byte[] bArrR10 = null;
                byte[] bArrR11 = null;
                String[] strArrW = null;
                while (parcel.dataPosition() < iK05) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        bArrR9 = u6.v.r(i14, parcel);
                    } else if (c12 == 3) {
                        bArrR10 = u6.v.r(i14, parcel);
                    } else if (c12 == 4) {
                        bArrR11 = u6.v.r(i14, parcel);
                    } else if (c12 != 5) {
                        u6.v.f0(i14, parcel);
                    } else {
                        strArrW = u6.v.w(i14, parcel);
                    }
                }
                u6.v.F(iK05, parcel);
                return new j(bArrR9, bArrR10, bArrR11, strArrW);
            case 5:
                int iK06 = u6.v.k0(parcel);
                int iZ = 0;
                String strV = null;
                int iZ2 = 0;
                while (parcel.dataPosition() < iK06) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 2) {
                        iZ = u6.v.Z(i15, parcel);
                    } else if (c13 == 3) {
                        strV = u6.v.v(i15, parcel);
                    } else if (c13 != 4) {
                        u6.v.f0(i15, parcel);
                    } else {
                        iZ2 = u6.v.Z(i15, parcel);
                    }
                }
                u6.v.F(iK06, parcel);
                return new k(iZ, strV, iZ2);
            case 6:
                int iK07 = u6.v.k0(parcel);
                String strV2 = null;
                Boolean boolValueOf = null;
                String strV3 = null;
                String strV4 = null;
                while (parcel.dataPosition() < iK07) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 2) {
                        strV2 = u6.v.v(i16, parcel);
                    } else if (c14 == 3) {
                        int iD0 = u6.v.d0(i16, parcel);
                        if (iD0 == 0) {
                            boolValueOf = null;
                        } else {
                            u6.v.n0(parcel, iD0, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c14 == 4) {
                        strV3 = u6.v.v(i16, parcel);
                    } else if (c14 != 5) {
                        u6.v.f0(i16, parcel);
                    } else {
                        strV4 = u6.v.v(i16, parcel);
                    }
                }
                u6.v.F(iK07, parcel);
                return new m(strV2, boolValueOf, strV3, strV4);
            case 7:
                int iK08 = u6.v.k0(parcel);
                y yVar = null;
                Uri uri = null;
                byte[] bArrR12 = null;
                while (parcel.dataPosition() < iK08) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 2) {
                        yVar = (y) u6.v.u(parcel, i17, y.CREATOR);
                    } else if (c15 == 3) {
                        uri = (Uri) u6.v.u(parcel, i17, Uri.CREATOR);
                    } else if (c15 != 4) {
                        u6.v.f0(i17, parcel);
                    } else {
                        bArrR12 = u6.v.r(i17, parcel);
                    }
                }
                u6.v.F(iK08, parcel);
                return new n(yVar, uri, bArrR12);
            case 8:
                int iK09 = u6.v.k0(parcel);
                b0 b0Var = null;
                Uri uri2 = null;
                byte[] bArrR13 = null;
                while (parcel.dataPosition() < iK09) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 2) {
                        b0Var = (b0) u6.v.u(parcel, i18, b0.CREATOR);
                    } else if (c16 == 3) {
                        uri2 = (Uri) u6.v.u(parcel, i18, Uri.CREATOR);
                    } else if (c16 != 4) {
                        u6.v.f0(i18, parcel);
                    } else {
                        bArrR13 = u6.v.r(i18, parcel);
                    }
                }
                u6.v.F(iK09, parcel);
                return new o(b0Var, uri2, bArrR13);
            case 9:
                try {
                    return r.a(parcel.readInt());
                } catch (q e10) {
                    throw new RuntimeException(e10);
                }
            case 10:
                int iK010 = u6.v.k0(parcel);
                byte[] bArrR14 = null;
                byte[] bArrR15 = null;
                byte[] bArrR16 = null;
                long jB0 = 0;
                while (parcel.dataPosition() < iK010) {
                    int i19 = parcel.readInt();
                    char c17 = (char) i19;
                    if (c17 == 1) {
                        jB0 = u6.v.b0(i19, parcel);
                    } else if (c17 == 2) {
                        bArrR14 = u6.v.r(i19, parcel);
                    } else if (c17 == 3) {
                        bArrR15 = u6.v.r(i19, parcel);
                    } else if (c17 != 4) {
                        u6.v.f0(i19, parcel);
                    } else {
                        bArrR16 = u6.v.r(i19, parcel);
                    }
                }
                u6.v.F(iK010, parcel);
                return new a1(jB0, bArrR14, bArrR15, bArrR16);
            case 11:
                int iK011 = u6.v.k0(parcel);
                ArrayList arrayListZ = null;
                while (parcel.dataPosition() < iK011) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        u6.v.f0(i20, parcel);
                    } else {
                        arrayListZ = u6.v.z(parcel, i20, a1.CREATOR);
                    }
                }
                u6.v.F(iK011, parcel);
                return new b1(arrayListZ);
            case 12:
                int iK012 = u6.v.k0(parcel);
                while (parcel.dataPosition() < iK012) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        u6.v.f0(i21, parcel);
                    } else {
                        u6.v.U(i21, parcel);
                    }
                }
                u6.v.F(iK012, parcel);
                return new c1();
            case 13:
                try {
                    return u.a(parcel.readInt());
                } catch (t e11) {
                    throw new IllegalArgumentException(e11);
                }
            case 14:
                int iK013 = u6.v.k0(parcel);
                String strV5 = null;
                while (parcel.dataPosition() < iK013) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        u6.v.f0(i22, parcel);
                    } else {
                        strV5 = u6.v.v(i22, parcel);
                    }
                }
                u6.v.F(iK013, parcel);
                return new v(strV5);
            case 15:
                int iK014 = u6.v.k0(parcel);
                String strV6 = null;
                int iZ3 = 0;
                while (parcel.dataPosition() < iK014) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        iZ3 = u6.v.Z(i23, parcel);
                    } else if (c18 != 2) {
                        u6.v.f0(i23, parcel);
                    } else {
                        strV6 = u6.v.v(i23, parcel);
                    }
                }
                u6.v.F(iK014, parcel);
                return new Scope(iZ3, strV6);
            case 16:
                int iK015 = u6.v.k0(parcel);
                String strV7 = null;
                nd.b bVar = null;
                int iZ4 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iK015) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        iZ4 = u6.v.Z(i24, parcel);
                    } else if (c19 == 2) {
                        strV7 = u6.v.v(i24, parcel);
                    } else if (c19 == 3) {
                        pendingIntent = (PendingIntent) u6.v.u(parcel, i24, PendingIntent.CREATOR);
                    } else if (c19 != 4) {
                        u6.v.f0(i24, parcel);
                    } else {
                        bVar = (nd.b) u6.v.u(parcel, i24, nd.b.CREATOR);
                    }
                }
                u6.v.F(iK015, parcel);
                return new Status(iZ4, strV7, pendingIntent, bVar);
            case 17:
                int iK016 = u6.v.k0(parcel);
                String strV8 = null;
                int iZ5 = 0;
                while (parcel.dataPosition() < iK016) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        iZ5 = u6.v.Z(i25, parcel);
                    } else if (c20 != 2) {
                        u6.v.f0(i25, parcel);
                    } else {
                        strV8 = u6.v.v(i25, parcel);
                    }
                }
                u6.v.F(iK016, parcel);
                return new com.google.android.gms.common.internal.g(iZ5, strV8);
            case 18:
                int iK017 = u6.v.k0(parcel);
                ArrayList arrayListZ2 = null;
                int iZ6 = 0;
                while (parcel.dataPosition() < iK017) {
                    int i26 = parcel.readInt();
                    char c21 = (char) i26;
                    if (c21 == 1) {
                        iZ6 = u6.v.Z(i26, parcel);
                    } else if (c21 != 2) {
                        u6.v.f0(i26, parcel);
                    } else {
                        arrayListZ2 = u6.v.z(parcel, i26, com.google.android.gms.common.internal.r.CREATOR);
                    }
                }
                u6.v.F(iK017, parcel);
                return new com.google.android.gms.common.internal.u(iZ6, arrayListZ2);
            case 19:
                int iK018 = u6.v.k0(parcel);
                int iZ7 = -1;
                int iZ8 = 0;
                int iZ9 = 0;
                int iZ10 = 0;
                int iZ11 = 0;
                String strV9 = null;
                String strV10 = null;
                long jB02 = 0;
                long jB03 = 0;
                while (parcel.dataPosition() < iK018) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            iZ8 = u6.v.Z(i27, parcel);
                            break;
                        case 2:
                            iZ9 = u6.v.Z(i27, parcel);
                            break;
                        case 3:
                            iZ10 = u6.v.Z(i27, parcel);
                            break;
                        case 4:
                            jB02 = u6.v.b0(i27, parcel);
                            break;
                        case 5:
                            jB03 = u6.v.b0(i27, parcel);
                            break;
                        case 6:
                            strV9 = u6.v.v(i27, parcel);
                            break;
                        case 7:
                            strV10 = u6.v.v(i27, parcel);
                            break;
                        case '\b':
                            iZ11 = u6.v.Z(i27, parcel);
                            break;
                        case '\t':
                            iZ7 = u6.v.Z(i27, parcel);
                            break;
                        default:
                            u6.v.f0(i27, parcel);
                            break;
                    }
                }
                u6.v.F(iK018, parcel);
                return new com.google.android.gms.common.internal.r(iZ8, iZ9, iZ10, jB02, jB03, strV9, strV10, iZ11, iZ7);
            case 20:
                int iK019 = u6.v.k0(parcel);
                Account account = null;
                int iZ12 = 0;
                int iZ13 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iK019) {
                    int i28 = parcel.readInt();
                    char c22 = (char) i28;
                    if (c22 == 1) {
                        iZ12 = u6.v.Z(i28, parcel);
                    } else if (c22 == 2) {
                        account = (Account) u6.v.u(parcel, i28, Account.CREATOR);
                    } else if (c22 == 3) {
                        iZ13 = u6.v.Z(i28, parcel);
                    } else if (c22 != 4) {
                        u6.v.f0(i28, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) u6.v.u(parcel, i28, GoogleSignInAccount.CREATOR);
                    }
                }
                u6.v.F(iK019, parcel);
                return new com.google.android.gms.common.internal.z(iZ12, account, iZ13, googleSignInAccount);
            case zzbch.zzt.zzm /* 21 */:
                int iK020 = u6.v.k0(parcel);
                int iZ14 = 0;
                boolean zU3 = false;
                boolean zU4 = false;
                IBinder iBinderX = null;
                nd.b bVar2 = null;
                while (parcel.dataPosition() < iK020) {
                    int i29 = parcel.readInt();
                    char c23 = (char) i29;
                    if (c23 == 1) {
                        iZ14 = u6.v.Z(i29, parcel);
                    } else if (c23 == 2) {
                        iBinderX = u6.v.X(i29, parcel);
                    } else if (c23 == 3) {
                        bVar2 = (nd.b) u6.v.u(parcel, i29, nd.b.CREATOR);
                    } else if (c23 == 4) {
                        zU3 = u6.v.U(i29, parcel);
                    } else if (c23 != 5) {
                        u6.v.f0(i29, parcel);
                    } else {
                        zU4 = u6.v.U(i29, parcel);
                    }
                }
                u6.v.F(iK020, parcel);
                return new com.google.android.gms.common.internal.a0(iZ14, iBinderX, bVar2, zU3, zU4);
            case 22:
                int iK021 = u6.v.k0(parcel);
                int iZ15 = 0;
                int iZ16 = 0;
                int iZ17 = 0;
                boolean zU5 = false;
                boolean zU6 = false;
                while (parcel.dataPosition() < iK021) {
                    int i30 = parcel.readInt();
                    char c24 = (char) i30;
                    if (c24 == 1) {
                        iZ15 = u6.v.Z(i30, parcel);
                    } else if (c24 == 2) {
                        zU5 = u6.v.U(i30, parcel);
                    } else if (c24 == 3) {
                        zU6 = u6.v.U(i30, parcel);
                    } else if (c24 == 4) {
                        iZ16 = u6.v.Z(i30, parcel);
                    } else if (c24 != 5) {
                        u6.v.f0(i30, parcel);
                    } else {
                        iZ17 = u6.v.Z(i30, parcel);
                    }
                }
                u6.v.F(iK021, parcel);
                return new com.google.android.gms.common.internal.t(iZ15, iZ16, iZ17, zU5, zU6);
            case 23:
                int iK022 = u6.v.k0(parcel);
                Bundle bundleQ = null;
                com.google.android.gms.common.internal.j jVar = null;
                int iZ18 = 0;
                nd.d[] dVarArr = null;
                while (parcel.dataPosition() < iK022) {
                    int i31 = parcel.readInt();
                    char c25 = (char) i31;
                    if (c25 == 1) {
                        bundleQ = u6.v.q(i31, parcel);
                    } else if (c25 == 2) {
                        dVarArr = (nd.d[]) u6.v.y(parcel, i31, nd.d.CREATOR);
                    } else if (c25 == 3) {
                        iZ18 = u6.v.Z(i31, parcel);
                    } else if (c25 != 4) {
                        u6.v.f0(i31, parcel);
                    } else {
                        jVar = (com.google.android.gms.common.internal.j) u6.v.u(parcel, i31, com.google.android.gms.common.internal.j.CREATOR);
                    }
                }
                u6.v.F(iK022, parcel);
                com.google.android.gms.common.internal.k0 k0Var = new com.google.android.gms.common.internal.k0();
                k0Var.f3663a = bundleQ;
                k0Var.f3664b = dVarArr;
                k0Var.f3665c = iZ18;
                k0Var.f3666d = jVar;
                return k0Var;
            case 24:
                int iK023 = u6.v.k0(parcel);
                com.google.android.gms.common.internal.t tVar = null;
                int[] iArrS = null;
                int[] iArrS2 = null;
                boolean zU7 = false;
                boolean zU8 = false;
                int iZ19 = 0;
                while (parcel.dataPosition() < iK023) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 1:
                            tVar = (com.google.android.gms.common.internal.t) u6.v.u(parcel, i32, com.google.android.gms.common.internal.t.CREATOR);
                            break;
                        case 2:
                            zU7 = u6.v.U(i32, parcel);
                            break;
                        case 3:
                            zU8 = u6.v.U(i32, parcel);
                            break;
                        case 4:
                            iArrS = u6.v.s(i32, parcel);
                            break;
                        case 5:
                            iZ19 = u6.v.Z(i32, parcel);
                            break;
                        case 6:
                            iArrS2 = u6.v.s(i32, parcel);
                            break;
                        default:
                            u6.v.f0(i32, parcel);
                            break;
                    }
                }
                u6.v.F(iK023, parcel);
                return new com.google.android.gms.common.internal.j(tVar, zU7, zU8, iArrS, iZ19, iArrS2);
            case 25:
                int iK024 = u6.v.k0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = com.google.android.gms.common.internal.k.H;
                String strV11 = null;
                IBinder iBinderX2 = null;
                Account account2 = null;
                String strV12 = null;
                int iZ20 = 0;
                int iZ21 = 0;
                int iZ22 = 0;
                boolean zU9 = false;
                int iZ23 = 0;
                boolean zU10 = false;
                nd.d[] dVarArr2 = com.google.android.gms.common.internal.k.I;
                nd.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < iK024) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            iZ20 = u6.v.Z(i33, parcel);
                            break;
                        case 2:
                            iZ21 = u6.v.Z(i33, parcel);
                            break;
                        case 3:
                            iZ22 = u6.v.Z(i33, parcel);
                            break;
                        case 4:
                            strV11 = u6.v.v(i33, parcel);
                            break;
                        case 5:
                            iBinderX2 = u6.v.X(i33, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) u6.v.y(parcel, i33, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = u6.v.q(i33, parcel);
                            break;
                        case '\b':
                            account2 = (Account) u6.v.u(parcel, i33, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            u6.v.f0(i33, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (nd.d[]) u6.v.y(parcel, i33, nd.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (nd.d[]) u6.v.y(parcel, i33, nd.d.CREATOR);
                            break;
                        case '\f':
                            zU9 = u6.v.U(i33, parcel);
                            break;
                        case '\r':
                            iZ23 = u6.v.Z(i33, parcel);
                            break;
                        case 14:
                            zU10 = u6.v.U(i33, parcel);
                            break;
                        case 15:
                            strV12 = u6.v.v(i33, parcel);
                            break;
                    }
                }
                u6.v.F(iK024, parcel);
                return new com.google.android.gms.common.internal.k(iZ20, iZ21, iZ22, strV11, iBinderX2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zU9, iZ23, zU10, strV12);
            case 26:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), parcel.readInt());
            case 27:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 28:
                return com.google.android.material.datepicker.r.a(parcel.readInt(), parcel.readInt());
            default:
                int iK025 = u6.v.k0(parcel);
                String strV13 = null;
                String strV14 = null;
                int iZ24 = 0;
                int iZ25 = 0;
                int iZ26 = 0;
                long jB04 = 0;
                while (parcel.dataPosition() < iK025) {
                    int i34 = parcel.readInt();
                    switch ((char) i34) {
                        case 1:
                            iZ24 = u6.v.Z(i34, parcel);
                            break;
                        case 2:
                            jB04 = u6.v.b0(i34, parcel);
                            break;
                        case 3:
                            strV13 = u6.v.v(i34, parcel);
                            break;
                        case 4:
                            iZ25 = u6.v.Z(i34, parcel);
                            break;
                        case 5:
                            iZ26 = u6.v.Z(i34, parcel);
                            break;
                        case 6:
                            strV14 = u6.v.v(i34, parcel);
                            break;
                        default:
                            u6.v.f0(i34, parcel);
                            break;
                    }
                }
                u6.v.F(iK025, parcel);
                return new dd.a(iZ24, jB04, strV13, iZ25, iZ26, strV14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f3336a) {
            case 0:
                return new h[i10];
            case 1:
                return new y0[i10];
            case 2:
                return new z0[i10];
            case 3:
                return new i[i10];
            case 4:
                return new j[i10];
            case 5:
                return new k[i10];
            case 6:
                return new m[i10];
            case 7:
                return new n[i10];
            case 8:
                return new o[i10];
            case 9:
                return new r[i10];
            case 10:
                return new a1[i10];
            case 11:
                return new b1[i10];
            case 12:
                return new c1[i10];
            case 13:
                return new u[i10];
            case 14:
                return new v[i10];
            case 15:
                return new Scope[i10];
            case 16:
                return new Status[i10];
            case 17:
                return new com.google.android.gms.common.internal.g[i10];
            case 18:
                return new com.google.android.gms.common.internal.u[i10];
            case 19:
                return new com.google.android.gms.common.internal.r[i10];
            case 20:
                return new com.google.android.gms.common.internal.z[i10];
            case zzbch.zzt.zzm /* 21 */:
                return new com.google.android.gms.common.internal.a0[i10];
            case 22:
                return new com.google.android.gms.common.internal.t[i10];
            case 23:
                return new com.google.android.gms.common.internal.k0[i10];
            case 24:
                return new com.google.android.gms.common.internal.j[i10];
            case 25:
                return new com.google.android.gms.common.internal.k[i10];
            case 26:
                return new com.google.android.material.datepicker.b[i10];
            case 27:
                return new com.google.android.material.datepicker.d[i10];
            case 28:
                return new com.google.android.material.datepicker.r[i10];
            default:
                return new dd.a[i10];
        }
    }
}
