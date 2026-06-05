package ig;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import java.util.ArrayList;
import nc.h2;
import nc.j3;
import nc.k3;
import nc.l3;
import nc.n3;
import nc.o2;
import nc.p0;
import nc.q3;
import nc.s3;
import nc.t3;
import nc.u3;
import nc.v3;
import nc.y2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8538a;

    public /* synthetic */ e0(int i10) {
        this.f8538a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8538a) {
            case 0:
                int iK0 = u6.v.k0(parcel);
                String strV = null;
                String strV2 = null;
                String strV3 = null;
                zzags zzagsVar = null;
                String strV4 = null;
                String strV5 = null;
                String strV6 = null;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            strV = u6.v.v(i10, parcel);
                            break;
                        case 2:
                            strV2 = u6.v.v(i10, parcel);
                            break;
                        case 3:
                            strV3 = u6.v.v(i10, parcel);
                            break;
                        case 4:
                            zzagsVar = (zzags) u6.v.u(parcel, i10, zzags.CREATOR);
                            break;
                        case 5:
                            strV4 = u6.v.v(i10, parcel);
                            break;
                        case 6:
                            strV5 = u6.v.v(i10, parcel);
                            break;
                        case 7:
                            strV6 = u6.v.v(i10, parcel);
                            break;
                        default:
                            u6.v.f0(i10, parcel);
                            break;
                    }
                }
                u6.v.F(iK0, parcel);
                return new f0(strV, strV2, strV3, zzagsVar, strV4, strV5, strV6);
            case 1:
                int iK02 = u6.v.k0(parcel);
                String strV7 = null;
                String strV8 = null;
                String strV9 = null;
                String strV10 = null;
                boolean zU = false;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        strV7 = u6.v.v(i11, parcel);
                    } else if (c6 == 2) {
                        strV8 = u6.v.v(i11, parcel);
                    } else if (c6 == 3) {
                        strV9 = u6.v.v(i11, parcel);
                    } else if (c6 == 4) {
                        strV10 = u6.v.v(i11, parcel);
                    } else if (c6 != 5) {
                        u6.v.f0(i11, parcel);
                    } else {
                        zU = u6.v.U(i11, parcel);
                    }
                }
                u6.v.F(iK02, parcel);
                return new d(strV7, strV8, strV9, strV10, zU);
            case 2:
                int iK03 = u6.v.k0(parcel);
                String strV11 = null;
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        u6.v.f0(i12, parcel);
                    } else {
                        strV11 = u6.v.v(i12, parcel);
                    }
                }
                u6.v.F(iK03, parcel);
                return new e(strV11);
            case 3:
                int iK04 = u6.v.k0(parcel);
                String strV12 = null;
                byte[] bArrR = null;
                Bundle bundleQ = null;
                long jB0 = 0;
                int iZ = 0;
                int iZ2 = 0;
                while (parcel.dataPosition() < iK04) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        strV12 = u6.v.v(i13, parcel);
                    } else if (c10 == 2) {
                        iZ2 = u6.v.Z(i13, parcel);
                    } else if (c10 == 3) {
                        jB0 = u6.v.b0(i13, parcel);
                    } else if (c10 == 4) {
                        bArrR = u6.v.r(i13, parcel);
                    } else if (c10 == 5) {
                        bundleQ = u6.v.q(i13, parcel);
                    } else if (c10 != '\u03e8') {
                        u6.v.f0(i13, parcel);
                    } else {
                        iZ = u6.v.Z(i13, parcel);
                    }
                }
                u6.v.F(iK04, parcel);
                return new jd.a(iZ, strV12, iZ2, jB0, bArrR, bundleQ);
            case 4:
                int iK05 = u6.v.k0(parcel);
                PendingIntent pendingIntent = null;
                Bundle bundleQ2 = null;
                byte[] bArrR2 = null;
                int iZ3 = 0;
                int iZ4 = 0;
                int iZ5 = 0;
                while (parcel.dataPosition() < iK05) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iZ4 = u6.v.Z(i14, parcel);
                    } else if (c11 == 2) {
                        pendingIntent = (PendingIntent) u6.v.u(parcel, i14, PendingIntent.CREATOR);
                    } else if (c11 == 3) {
                        iZ5 = u6.v.Z(i14, parcel);
                    } else if (c11 == 4) {
                        bundleQ2 = u6.v.q(i14, parcel);
                    } else if (c11 == 5) {
                        bArrR2 = u6.v.r(i14, parcel);
                    } else if (c11 != '\u03e8') {
                        u6.v.f0(i14, parcel);
                    } else {
                        iZ3 = u6.v.Z(i14, parcel);
                    }
                }
                u6.v.F(iK05, parcel);
                return new jd.b(iZ3, iZ4, pendingIntent, iZ5, bundleQ2, bArrR2);
            case 5:
                int iK06 = u6.v.k0(parcel);
                Intent intent = null;
                int iZ6 = 0;
                int iZ7 = 0;
                while (parcel.dataPosition() < iK06) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        iZ6 = u6.v.Z(i15, parcel);
                    } else if (c12 == 2) {
                        iZ7 = u6.v.Z(i15, parcel);
                    } else if (c12 != 3) {
                        u6.v.f0(i15, parcel);
                    } else {
                        intent = (Intent) u6.v.u(parcel, i15, Intent.CREATOR);
                    }
                }
                u6.v.F(iK06, parcel);
                return new je.b(iZ6, iZ7, intent);
            case 6:
                int iK07 = u6.v.k0(parcel);
                ArrayList arrayListX = null;
                String strV13 = null;
                while (parcel.dataPosition() < iK07) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        arrayListX = u6.v.x(i16, parcel);
                    } else if (c13 != 2) {
                        u6.v.f0(i16, parcel);
                    } else {
                        strV13 = u6.v.v(i16, parcel);
                    }
                }
                u6.v.F(iK07, parcel);
                return new je.e(strV13, arrayListX);
            case 7:
                int iK08 = u6.v.k0(parcel);
                com.google.android.gms.common.internal.z zVar = null;
                int iZ8 = 0;
                while (parcel.dataPosition() < iK08) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        iZ8 = u6.v.Z(i17, parcel);
                    } else if (c14 != 2) {
                        u6.v.f0(i17, parcel);
                    } else {
                        zVar = (com.google.android.gms.common.internal.z) u6.v.u(parcel, i17, com.google.android.gms.common.internal.z.CREATOR);
                    }
                }
                u6.v.F(iK08, parcel);
                return new je.f(iZ8, zVar);
            case 8:
                int iK09 = u6.v.k0(parcel);
                nd.b bVar = null;
                int iZ9 = 0;
                com.google.android.gms.common.internal.a0 a0Var = null;
                while (parcel.dataPosition() < iK09) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iZ9 = u6.v.Z(i18, parcel);
                    } else if (c15 == 2) {
                        bVar = (nd.b) u6.v.u(parcel, i18, nd.b.CREATOR);
                    } else if (c15 != 3) {
                        u6.v.f0(i18, parcel);
                    } else {
                        a0Var = (com.google.android.gms.common.internal.a0) u6.v.u(parcel, i18, com.google.android.gms.common.internal.a0.CREATOR);
                    }
                }
                u6.v.F(iK09, parcel);
                return new je.g(iZ9, bVar, a0Var);
            case 9:
                int iK010 = u6.v.k0(parcel);
                Bundle bundleQ3 = null;
                int iZ10 = 0;
                int iZ11 = 0;
                while (parcel.dataPosition() < iK010) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iZ10 = u6.v.Z(i19, parcel);
                    } else if (c16 == 2) {
                        iZ11 = u6.v.Z(i19, parcel);
                    } else if (c16 != 3) {
                        u6.v.f0(i19, parcel);
                    } else {
                        bundleQ3 = u6.v.q(i19, parcel);
                    }
                }
                u6.v.F(iK010, parcel);
                return new ld.a(iZ10, iZ11, bundleQ3);
            case 10:
                int iK011 = u6.v.k0(parcel);
                String strV14 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iK011) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 2) {
                        strV14 = u6.v.v(i20, parcel);
                    } else if (c17 != 5) {
                        u6.v.f0(i20, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) u6.v.u(parcel, i20, GoogleSignInOptions.CREATOR);
                    }
                }
                u6.v.F(iK011, parcel);
                return new SignInConfiguration(strV14, googleSignInOptions);
            case 11:
                int iK012 = u6.v.k0(parcel);
                boolean zU2 = false;
                boolean zU3 = false;
                boolean zU4 = false;
                int iZ12 = 0;
                boolean zU5 = false;
                boolean zU6 = false;
                boolean zU7 = false;
                float fW = 0.0f;
                String strV15 = null;
                while (parcel.dataPosition() < iK012) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            zU2 = u6.v.U(i21, parcel);
                            break;
                        case 3:
                            zU3 = u6.v.U(i21, parcel);
                            break;
                        case 4:
                            strV15 = u6.v.v(i21, parcel);
                            break;
                        case 5:
                            zU4 = u6.v.U(i21, parcel);
                            break;
                        case 6:
                            fW = u6.v.W(i21, parcel);
                            break;
                        case 7:
                            iZ12 = u6.v.Z(i21, parcel);
                            break;
                        case '\b':
                            zU5 = u6.v.U(i21, parcel);
                            break;
                        case '\t':
                            zU6 = u6.v.U(i21, parcel);
                            break;
                        case '\n':
                            zU7 = u6.v.U(i21, parcel);
                            break;
                        default:
                            u6.v.f0(i21, parcel);
                            break;
                    }
                }
                u6.v.F(iK012, parcel);
                return new mc.j(zU2, zU3, strV15, zU4, fW, iZ12, zU5, zU6, zU7);
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                int iK013 = u6.v.k0(parcel);
                String strV16 = null;
                String strV17 = null;
                while (parcel.dataPosition() < iK013) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        strV16 = u6.v.v(i22, parcel);
                    } else if (c18 != 2) {
                        u6.v.f0(i22, parcel);
                    } else {
                        strV17 = u6.v.v(i22, parcel);
                    }
                }
                u6.v.F(iK013, parcel);
                return new p0(strV16, strV17);
            case 14:
                int iK014 = u6.v.k0(parcel);
                int iZ13 = 0;
                while (parcel.dataPosition() < iK014) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 2) {
                        u6.v.f0(i23, parcel);
                    } else {
                        iZ13 = u6.v.Z(i23, parcel);
                    }
                }
                u6.v.F(iK014, parcel);
                return new o2(iZ13);
            case 15:
                int iK015 = u6.v.k0(parcel);
                String strV18 = null;
                String strV19 = null;
                h2 h2Var = null;
                IBinder iBinderX = null;
                int iZ14 = 0;
                while (parcel.dataPosition() < iK015) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        iZ14 = u6.v.Z(i24, parcel);
                    } else if (c19 == 2) {
                        strV18 = u6.v.v(i24, parcel);
                    } else if (c19 == 3) {
                        strV19 = u6.v.v(i24, parcel);
                    } else if (c19 == 4) {
                        h2Var = (h2) u6.v.u(parcel, i24, h2.CREATOR);
                    } else if (c19 != 5) {
                        u6.v.f0(i24, parcel);
                    } else {
                        iBinderX = u6.v.X(i24, parcel);
                    }
                }
                u6.v.F(iK015, parcel);
                return new h2(iZ14, strV18, strV19, h2Var, iBinderX);
            case 16:
                int iK016 = u6.v.k0(parcel);
                String strV20 = null;
                int iZ15 = 0;
                int iZ16 = 0;
                while (parcel.dataPosition() < iK016) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        iZ15 = u6.v.Z(i25, parcel);
                    } else if (c20 == 2) {
                        iZ16 = u6.v.Z(i25, parcel);
                    } else if (c20 != 3) {
                        u6.v.f0(i25, parcel);
                    } else {
                        strV20 = u6.v.v(i25, parcel);
                    }
                }
                u6.v.F(iK016, parcel);
                return new y2(iZ15, iZ16, strV20);
            case 17:
                int iK017 = u6.v.k0(parcel);
                int iZ17 = 0;
                String strV21 = null;
                q3 q3Var = null;
                int iZ18 = 0;
                while (parcel.dataPosition() < iK017) {
                    int i26 = parcel.readInt();
                    char c21 = (char) i26;
                    if (c21 == 1) {
                        strV21 = u6.v.v(i26, parcel);
                    } else if (c21 == 2) {
                        iZ17 = u6.v.Z(i26, parcel);
                    } else if (c21 == 3) {
                        q3Var = (q3) u6.v.u(parcel, i26, q3.CREATOR);
                    } else if (c21 != 4) {
                        u6.v.f0(i26, parcel);
                    } else {
                        iZ18 = u6.v.Z(i26, parcel);
                    }
                }
                u6.v.F(iK017, parcel);
                return new j3(strV21, iZ17, q3Var, iZ18);
            case 18:
                int iK018 = u6.v.k0(parcel);
                int iZ19 = 0;
                int iZ20 = 0;
                while (parcel.dataPosition() < iK018) {
                    int i27 = parcel.readInt();
                    char c22 = (char) i27;
                    if (c22 == 1) {
                        iZ19 = u6.v.Z(i27, parcel);
                    } else if (c22 != 2) {
                        u6.v.f0(i27, parcel);
                    } else {
                        iZ20 = u6.v.Z(i27, parcel);
                    }
                }
                u6.v.F(iK018, parcel);
                return new k3(iZ19, iZ20);
            case 19:
                int iK019 = u6.v.k0(parcel);
                String strV22 = null;
                while (parcel.dataPosition() < iK019) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 15) {
                        u6.v.f0(i28, parcel);
                    } else {
                        strV22 = u6.v.v(i28, parcel);
                    }
                }
                u6.v.F(iK019, parcel);
                return new l3(strV22);
            case 20:
                int iK020 = u6.v.k0(parcel);
                boolean zU8 = false;
                boolean zU9 = false;
                boolean zU10 = false;
                while (parcel.dataPosition() < iK020) {
                    int i29 = parcel.readInt();
                    char c23 = (char) i29;
                    if (c23 == 2) {
                        zU8 = u6.v.U(i29, parcel);
                    } else if (c23 == 3) {
                        zU9 = u6.v.U(i29, parcel);
                    } else if (c23 != 4) {
                        u6.v.f0(i29, parcel);
                    } else {
                        zU10 = u6.v.U(i29, parcel);
                    }
                }
                u6.v.F(iK020, parcel);
                return new n3(zU8, zU9, zU10);
            case zzbch.zzt.zzm /* 21 */:
                int iK021 = u6.v.k0(parcel);
                long jB02 = 0;
                long jB03 = 0;
                int iZ21 = 0;
                int iZ22 = 0;
                boolean zU11 = false;
                int iZ23 = 0;
                boolean zU12 = false;
                boolean zU13 = false;
                int iZ24 = 0;
                int iZ25 = 0;
                int iZ26 = 0;
                Bundle bundleQ4 = null;
                ArrayList arrayListX2 = null;
                String strV23 = null;
                l3 l3Var = null;
                Location location = null;
                String strV24 = null;
                Bundle bundleQ5 = null;
                Bundle bundleQ6 = null;
                ArrayList arrayListX3 = null;
                String strV25 = null;
                String strV26 = null;
                p0 p0Var = null;
                String strV27 = null;
                ArrayList arrayListX4 = null;
                String strV28 = null;
                while (parcel.dataPosition() < iK021) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            iZ21 = u6.v.Z(i30, parcel);
                            break;
                        case 2:
                            jB02 = u6.v.b0(i30, parcel);
                            break;
                        case 3:
                            bundleQ4 = u6.v.q(i30, parcel);
                            break;
                        case 4:
                            iZ22 = u6.v.Z(i30, parcel);
                            break;
                        case 5:
                            arrayListX2 = u6.v.x(i30, parcel);
                            break;
                        case 6:
                            zU11 = u6.v.U(i30, parcel);
                            break;
                        case 7:
                            iZ23 = u6.v.Z(i30, parcel);
                            break;
                        case '\b':
                            zU12 = u6.v.U(i30, parcel);
                            break;
                        case '\t':
                            strV23 = u6.v.v(i30, parcel);
                            break;
                        case '\n':
                            l3Var = (l3) u6.v.u(parcel, i30, l3.CREATOR);
                            break;
                        case 11:
                            location = (Location) u6.v.u(parcel, i30, Location.CREATOR);
                            break;
                        case '\f':
                            strV24 = u6.v.v(i30, parcel);
                            break;
                        case '\r':
                            bundleQ5 = u6.v.q(i30, parcel);
                            break;
                        case 14:
                            bundleQ6 = u6.v.q(i30, parcel);
                            break;
                        case 15:
                            arrayListX3 = u6.v.x(i30, parcel);
                            break;
                        case 16:
                            strV25 = u6.v.v(i30, parcel);
                            break;
                        case 17:
                            strV26 = u6.v.v(i30, parcel);
                            break;
                        case 18:
                            zU13 = u6.v.U(i30, parcel);
                            break;
                        case 19:
                            p0Var = (p0) u6.v.u(parcel, i30, p0.CREATOR);
                            break;
                        case 20:
                            iZ24 = u6.v.Z(i30, parcel);
                            break;
                        case zzbch.zzt.zzm /* 21 */:
                            strV27 = u6.v.v(i30, parcel);
                            break;
                        case 22:
                            arrayListX4 = u6.v.x(i30, parcel);
                            break;
                        case 23:
                            iZ25 = u6.v.Z(i30, parcel);
                            break;
                        case 24:
                            strV28 = u6.v.v(i30, parcel);
                            break;
                        case 25:
                            iZ26 = u6.v.Z(i30, parcel);
                            break;
                        case 26:
                            jB03 = u6.v.b0(i30, parcel);
                            break;
                        default:
                            u6.v.f0(i30, parcel);
                            break;
                    }
                }
                u6.v.F(iK021, parcel);
                return new q3(iZ21, jB02, bundleQ4, iZ22, arrayListX2, zU11, iZ23, zU12, strV23, l3Var, location, strV24, bundleQ5, bundleQ6, arrayListX3, strV25, strV26, zU13, p0Var, iZ24, strV27, arrayListX4, iZ25, strV28, iZ26, jB03);
            case 22:
                int iK022 = u6.v.k0(parcel);
                int iZ27 = 0;
                int iZ28 = 0;
                boolean zU14 = false;
                int iZ29 = 0;
                int iZ30 = 0;
                boolean zU15 = false;
                boolean zU16 = false;
                boolean zU17 = false;
                boolean zU18 = false;
                boolean zU19 = false;
                boolean zU20 = false;
                boolean zU21 = false;
                boolean zU22 = false;
                String strV29 = null;
                s3[] s3VarArr = null;
                while (parcel.dataPosition() < iK022) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 2:
                            strV29 = u6.v.v(i31, parcel);
                            break;
                        case 3:
                            iZ27 = u6.v.Z(i31, parcel);
                            break;
                        case 4:
                            iZ28 = u6.v.Z(i31, parcel);
                            break;
                        case 5:
                            zU14 = u6.v.U(i31, parcel);
                            break;
                        case 6:
                            iZ29 = u6.v.Z(i31, parcel);
                            break;
                        case 7:
                            iZ30 = u6.v.Z(i31, parcel);
                            break;
                        case '\b':
                            s3VarArr = (s3[]) u6.v.y(parcel, i31, s3.CREATOR);
                            break;
                        case '\t':
                            zU15 = u6.v.U(i31, parcel);
                            break;
                        case '\n':
                            zU16 = u6.v.U(i31, parcel);
                            break;
                        case 11:
                            zU17 = u6.v.U(i31, parcel);
                            break;
                        case '\f':
                            zU18 = u6.v.U(i31, parcel);
                            break;
                        case '\r':
                            zU19 = u6.v.U(i31, parcel);
                            break;
                        case 14:
                            zU20 = u6.v.U(i31, parcel);
                            break;
                        case 15:
                            zU21 = u6.v.U(i31, parcel);
                            break;
                        case 16:
                            zU22 = u6.v.U(i31, parcel);
                            break;
                        default:
                            u6.v.f0(i31, parcel);
                            break;
                    }
                }
                u6.v.F(iK022, parcel);
                return new s3(strV29, iZ27, iZ28, zU14, iZ29, iZ30, s3VarArr, zU15, zU16, zU17, zU18, zU19, zU20, zU21, zU22);
            case 23:
                int iK023 = u6.v.k0(parcel);
                long jB04 = 0;
                String strV30 = null;
                int iZ31 = 0;
                int iZ32 = 0;
                while (parcel.dataPosition() < iK023) {
                    int i32 = parcel.readInt();
                    char c24 = (char) i32;
                    if (c24 == 1) {
                        iZ31 = u6.v.Z(i32, parcel);
                    } else if (c24 == 2) {
                        iZ32 = u6.v.Z(i32, parcel);
                    } else if (c24 == 3) {
                        strV30 = u6.v.v(i32, parcel);
                    } else if (c24 != 4) {
                        u6.v.f0(i32, parcel);
                    } else {
                        jB04 = u6.v.b0(i32, parcel);
                    }
                }
                u6.v.F(iK023, parcel);
                return new t3(iZ31, iZ32, jB04, strV30);
            case 24:
                int iK024 = u6.v.k0(parcel);
                String strV31 = null;
                h2 h2Var2 = null;
                Bundle bundleQ7 = null;
                String strV32 = null;
                String strV33 = null;
                String strV34 = null;
                String strV35 = null;
                long jB05 = 0;
                while (parcel.dataPosition() < iK024) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            strV31 = u6.v.v(i33, parcel);
                            break;
                        case 2:
                            jB05 = u6.v.b0(i33, parcel);
                            break;
                        case 3:
                            h2Var2 = (h2) u6.v.u(parcel, i33, h2.CREATOR);
                            break;
                        case 4:
                            bundleQ7 = u6.v.q(i33, parcel);
                            break;
                        case 5:
                            strV32 = u6.v.v(i33, parcel);
                            break;
                        case 6:
                            strV33 = u6.v.v(i33, parcel);
                            break;
                        case 7:
                            strV34 = u6.v.v(i33, parcel);
                            break;
                        case '\b':
                            strV35 = u6.v.v(i33, parcel);
                            break;
                        default:
                            u6.v.f0(i33, parcel);
                            break;
                    }
                }
                u6.v.F(iK024, parcel);
                return new u3(strV31, jB05, h2Var2, bundleQ7, strV32, strV33, strV34, strV35);
            case 25:
                int iK025 = u6.v.k0(parcel);
                int iZ33 = 0;
                while (parcel.dataPosition() < iK025) {
                    int i34 = parcel.readInt();
                    if (((char) i34) != 2) {
                        u6.v.f0(i34, parcel);
                    } else {
                        iZ33 = u6.v.Z(i34, parcel);
                    }
                }
                u6.v.F(iK025, parcel);
                return new v3(iZ33);
            case 26:
                int iK026 = u6.v.k0(parcel);
                PendingIntent pendingIntent2 = null;
                int iZ34 = 0;
                int iZ35 = 0;
                String strV36 = null;
                while (parcel.dataPosition() < iK026) {
                    int i35 = parcel.readInt();
                    char c25 = (char) i35;
                    if (c25 == 1) {
                        iZ34 = u6.v.Z(i35, parcel);
                    } else if (c25 == 2) {
                        iZ35 = u6.v.Z(i35, parcel);
                    } else if (c25 == 3) {
                        pendingIntent2 = (PendingIntent) u6.v.u(parcel, i35, PendingIntent.CREATOR);
                    } else if (c25 != 4) {
                        u6.v.f0(i35, parcel);
                    } else {
                        strV36 = u6.v.v(i35, parcel);
                    }
                }
                u6.v.F(iK026, parcel);
                return new nd.b(iZ34, iZ35, pendingIntent2, strV36);
            case 27:
                int iK027 = u6.v.k0(parcel);
                long jB06 = -1;
                int iZ36 = 0;
                String strV37 = null;
                while (parcel.dataPosition() < iK027) {
                    int i36 = parcel.readInt();
                    char c26 = (char) i36;
                    if (c26 == 1) {
                        strV37 = u6.v.v(i36, parcel);
                    } else if (c26 == 2) {
                        iZ36 = u6.v.Z(i36, parcel);
                    } else if (c26 != 3) {
                        u6.v.f0(i36, parcel);
                    } else {
                        jB06 = u6.v.b0(i36, parcel);
                    }
                }
                u6.v.F(iK027, parcel);
                return new nd.d(iZ36, jB06, strV37);
            case 28:
                int iK028 = u6.v.k0(parcel);
                String strV38 = null;
                String strV39 = null;
                String strV40 = null;
                while (parcel.dataPosition() < iK028) {
                    int i37 = parcel.readInt();
                    char c27 = (char) i37;
                    if (c27 == 1) {
                        strV38 = u6.v.v(i37, parcel);
                    } else if (c27 == 2) {
                        strV39 = u6.v.v(i37, parcel);
                    } else if (c27 != 3) {
                        u6.v.f0(i37, parcel);
                    } else {
                        strV40 = u6.v.v(i37, parcel);
                    }
                }
                u6.v.F(iK028, parcel);
                return new oc.a(strV38, strV39, strV40);
            default:
                int iK029 = u6.v.k0(parcel);
                boolean zU23 = false;
                String strV41 = null;
                String strV42 = null;
                String strV43 = null;
                String strV44 = null;
                String strV45 = null;
                String strV46 = null;
                String strV47 = null;
                Intent intent2 = null;
                IBinder iBinderX2 = null;
                while (parcel.dataPosition() < iK029) {
                    int i38 = parcel.readInt();
                    switch ((char) i38) {
                        case 2:
                            strV41 = u6.v.v(i38, parcel);
                            break;
                        case 3:
                            strV42 = u6.v.v(i38, parcel);
                            break;
                        case 4:
                            strV43 = u6.v.v(i38, parcel);
                            break;
                        case 5:
                            strV44 = u6.v.v(i38, parcel);
                            break;
                        case 6:
                            strV45 = u6.v.v(i38, parcel);
                            break;
                        case 7:
                            strV46 = u6.v.v(i38, parcel);
                            break;
                        case '\b':
                            strV47 = u6.v.v(i38, parcel);
                            break;
                        case '\t':
                            intent2 = (Intent) u6.v.u(parcel, i38, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderX2 = u6.v.X(i38, parcel);
                            break;
                        case 11:
                            zU23 = u6.v.U(i38, parcel);
                            break;
                        default:
                            u6.v.f0(i38, parcel);
                            break;
                    }
                }
                u6.v.F(iK029, parcel);
                return new pc.e(strV41, strV42, strV43, strV44, strV45, strV46, strV47, intent2, iBinderX2, zU23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f8538a) {
            case 0:
                return new f0[i10];
            case 1:
                return new d[i10];
            case 2:
                return new e[i10];
            case 3:
                return new jd.a[i10];
            case 4:
                return new jd.b[i10];
            case 5:
                return new je.b[i10];
            case 6:
                return new je.e[i10];
            case 7:
                return new je.f[i10];
            case 8:
                return new je.g[i10];
            case 9:
                return new ld.a[i10];
            case 10:
                return new SignInConfiguration[i10];
            case 11:
                return new mc.j[i10];
            case 12:
                return new ParcelImpl[i10];
            case 13:
                return new p0[i10];
            case 14:
                return new o2[i10];
            case 15:
                return new h2[i10];
            case 16:
                return new y2[i10];
            case 17:
                return new j3[i10];
            case 18:
                return new k3[i10];
            case 19:
                return new l3[i10];
            case 20:
                return new n3[i10];
            case zzbch.zzt.zzm /* 21 */:
                return new q3[i10];
            case 22:
                return new s3[i10];
            case 23:
                return new t3[i10];
            case 24:
                return new u3[i10];
            case 25:
                return new v3[i10];
            case 26:
                return new nd.b[i10];
            case 27:
                return new nd.d[i10];
            case 28:
                return new oc.a[i10];
            default:
                return new pc.e[i10];
        }
    }
}
