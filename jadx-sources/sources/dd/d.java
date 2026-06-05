package dd;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import de.f;
import de.g;
import de.h;
import ee.a0;
import ee.b0;
import ee.i;
import ee.j;
import ee.k;
import ee.l;
import ee.x;
import ee.y;
import ee.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5086a;

    public /* synthetic */ d(int i10) {
        this.f5086a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5086a) {
            case 0:
                int iK0 = v.k0(parcel);
                String strV = null;
                int iZ = 0;
                int iZ2 = 0;
                Account account = null;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iZ = v.Z(i10, parcel);
                    } else if (c6 == 2) {
                        iZ2 = v.Z(i10, parcel);
                    } else if (c6 == 3) {
                        strV = v.v(i10, parcel);
                    } else if (c6 != 4) {
                        v.f0(i10, parcel);
                    } else {
                        account = (Account) v.u(parcel, i10, Account.CREATOR);
                    }
                }
                v.F(iK0, parcel);
                return new b(iZ, iZ2, strV, account);
            case 1:
                int iK02 = v.k0(parcel);
                ArrayList arrayListZ = null;
                int iZ3 = 0;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iZ3 = v.Z(i11, parcel);
                    } else if (c10 != 2) {
                        v.f0(i11, parcel);
                    } else {
                        arrayListZ = v.z(parcel, i11, a.CREATOR);
                    }
                }
                v.F(iK02, parcel);
                return new c(arrayListZ, iZ3);
            case 2:
                try {
                    return de.c.b(parcel.readInt());
                } catch (de.b e10) {
                    throw new RuntimeException(e10);
                }
            case 3:
                int iK03 = v.k0(parcel);
                String strV2 = null;
                int iZ4 = 0;
                String strV3 = null;
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 2) {
                        iZ4 = v.Z(i12, parcel);
                    } else if (c11 == 3) {
                        strV2 = v.v(i12, parcel);
                    } else if (c11 != 4) {
                        v.f0(i12, parcel);
                    } else {
                        strV3 = v.v(i12, parcel);
                    }
                }
                v.F(iK03, parcel);
                return new de.c(iZ4, strV2, strV3);
            case 4:
                int iK04 = v.k0(parcel);
                byte[] bArrR = null;
                ArrayList arrayListZ2 = null;
                int iZ5 = 0;
                String strV4 = null;
                while (parcel.dataPosition() < iK04) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        iZ5 = v.Z(i13, parcel);
                    } else if (c12 == 2) {
                        bArrR = v.r(i13, parcel);
                    } else if (c12 == 3) {
                        strV4 = v.v(i13, parcel);
                    } else if (c12 != 4) {
                        v.f0(i13, parcel);
                    } else {
                        arrayListZ2 = v.z(parcel, i13, Transport.CREATOR);
                    }
                }
                v.F(iK04, parcel);
                return new de.d(iZ5, bArrR, strV4, arrayListZ2);
            case 5:
                try {
                    return f.a(parcel.readString());
                } catch (de.e e11) {
                    throw new RuntimeException(e11);
                }
            case 6:
                int iK05 = v.k0(parcel);
                String strV5 = null;
                String strV6 = null;
                int iZ6 = 0;
                byte[] bArrR2 = null;
                while (parcel.dataPosition() < iK05) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        iZ6 = v.Z(i14, parcel);
                    } else if (c13 == 2) {
                        strV5 = v.v(i14, parcel);
                    } else if (c13 == 3) {
                        bArrR2 = v.r(i14, parcel);
                    } else if (c13 != 4) {
                        v.f0(i14, parcel);
                    } else {
                        strV6 = v.v(i14, parcel);
                    }
                }
                v.F(iK05, parcel);
                return new g(strV5, strV6, iZ6, bArrR2);
            case 7:
                int iK06 = v.k0(parcel);
                Integer numA0 = null;
                Double dV = null;
                Uri uri = null;
                ArrayList arrayListZ3 = null;
                ArrayList arrayListZ4 = null;
                de.c cVar = null;
                String strV7 = null;
                while (parcel.dataPosition() < iK06) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            numA0 = v.a0(i15, parcel);
                            break;
                        case 3:
                            dV = v.V(i15, parcel);
                            break;
                        case 4:
                            uri = (Uri) v.u(parcel, i15, Uri.CREATOR);
                            break;
                        case 5:
                            arrayListZ3 = v.z(parcel, i15, g.CREATOR);
                            break;
                        case 6:
                            arrayListZ4 = v.z(parcel, i15, h.CREATOR);
                            break;
                        case 7:
                            cVar = (de.c) v.u(parcel, i15, de.c.CREATOR);
                            break;
                        case '\b':
                            strV7 = v.v(i15, parcel);
                            break;
                        default:
                            v.f0(i15, parcel);
                            break;
                    }
                }
                v.F(iK06, parcel);
                return new RegisterRequestParams(numA0, dV, uri, arrayListZ3, arrayListZ4, cVar, strV7);
            case 8:
                int iK07 = v.k0(parcel);
                de.d dVar = null;
                String strV8 = null;
                String strV9 = null;
                while (parcel.dataPosition() < iK07) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 2) {
                        dVar = (de.d) v.u(parcel, i16, de.d.CREATOR);
                    } else if (c14 == 3) {
                        strV8 = v.v(i16, parcel);
                    } else if (c14 != 4) {
                        v.f0(i16, parcel);
                    } else {
                        strV9 = v.v(i16, parcel);
                    }
                }
                v.F(iK07, parcel);
                return new h(dVar, strV8, strV9);
            case 9:
                int iK08 = v.k0(parcel);
                Integer numA02 = null;
                Double dV2 = null;
                Uri uri2 = null;
                byte[] bArrR3 = null;
                ArrayList arrayListZ5 = null;
                de.c cVar2 = null;
                String strV10 = null;
                while (parcel.dataPosition() < iK08) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            numA02 = v.a0(i17, parcel);
                            break;
                        case 3:
                            dV2 = v.V(i17, parcel);
                            break;
                        case 4:
                            uri2 = (Uri) v.u(parcel, i17, Uri.CREATOR);
                            break;
                        case 5:
                            bArrR3 = v.r(i17, parcel);
                            break;
                        case 6:
                            arrayListZ5 = v.z(parcel, i17, h.CREATOR);
                            break;
                        case 7:
                            cVar2 = (de.c) v.u(parcel, i17, de.c.CREATOR);
                            break;
                        case '\b':
                            strV10 = v.v(i17, parcel);
                            break;
                        default:
                            v.f0(i17, parcel);
                            break;
                    }
                }
                v.F(iK08, parcel);
                return new SignRequestParams(numA02, dV2, uri2, bArrR3, arrayListZ5, cVar2, strV10);
            case 10:
                int iK09 = v.k0(parcel);
                String strV11 = "";
                ArrayList arrayListZ6 = null;
                int iZ7 = 0;
                String strV12 = null;
                while (parcel.dataPosition() < iK09) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        arrayListZ6 = v.z(parcel, i18, zzbe.CREATOR);
                    } else if (c15 == 2) {
                        iZ7 = v.Z(i18, parcel);
                    } else if (c15 == 3) {
                        strV11 = v.v(i18, parcel);
                    } else if (c15 != 4) {
                        v.f0(i18, parcel);
                    } else {
                        strV12 = v.v(i18, parcel);
                    }
                }
                v.F(iK09, parcel);
                return new ee.e(arrayListZ6, iZ7, strV11, strV12);
            case 11:
                int iK010 = v.k0(parcel);
                int iZ8 = zzbch.zzq.zzf;
                long jB0 = 0;
                y[] yVarArr = null;
                int iZ9 = 1;
                int iZ10 = 1;
                while (parcel.dataPosition() < iK010) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iZ9 = v.Z(i19, parcel);
                    } else if (c16 == 2) {
                        iZ10 = v.Z(i19, parcel);
                    } else if (c16 == 3) {
                        jB0 = v.b0(i19, parcel);
                    } else if (c16 == 4) {
                        iZ8 = v.Z(i19, parcel);
                    } else if (c16 != 5) {
                        v.f0(i19, parcel);
                    } else {
                        yVarArr = (y[]) v.y(parcel, i19, y.CREATOR);
                    }
                }
                v.F(iK010, parcel);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f3743d = iZ8;
                locationAvailability.f3740a = iZ9;
                locationAvailability.f3741b = iZ10;
                locationAvailability.f3742c = jB0;
                locationAvailability.f3744e = yVarArr;
                return locationAvailability;
            case 12:
                int iK011 = v.k0(parcel);
                int iZ11 = 102;
                long jB02 = 3600000;
                long jB03 = 600000;
                boolean zU = false;
                long jB04 = 0;
                float fW = 0.0f;
                int iZ12 = Integer.MAX_VALUE;
                long jB05 = Long.MAX_VALUE;
                boolean zU2 = false;
                while (parcel.dataPosition() < iK011) {
                    int i20 = parcel.readInt();
                    boolean z2 = zU2;
                    switch ((char) i20) {
                        case 1:
                            iZ11 = v.Z(i20, parcel);
                            break;
                        case 2:
                            jB02 = v.b0(i20, parcel);
                            break;
                        case 3:
                            jB03 = v.b0(i20, parcel);
                            break;
                        case 4:
                            zU = v.U(i20, parcel);
                            break;
                        case 5:
                            jB05 = v.b0(i20, parcel);
                            break;
                        case 6:
                            iZ12 = v.Z(i20, parcel);
                            break;
                        case 7:
                            fW = v.W(i20, parcel);
                            break;
                        case '\b':
                            jB04 = v.b0(i20, parcel);
                            break;
                        case '\t':
                            zU2 = v.U(i20, parcel);
                            continue;
                        default:
                            v.f0(i20, parcel);
                            break;
                    }
                    zU2 = z2;
                }
                v.F(iK011, parcel);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f3745a = iZ11;
                locationRequest.f3746b = jB02;
                locationRequest.f3747c = jB03;
                locationRequest.f3748d = zU;
                locationRequest.f3749e = jB05;
                locationRequest.f3750f = iZ12;
                locationRequest.f3751z = fW;
                locationRequest.A = jB04;
                locationRequest.B = zU2;
                return locationRequest;
            case 13:
                int iK012 = v.k0(parcel);
                List listZ = LocationResult.f3752b;
                while (parcel.dataPosition() < iK012) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        v.f0(i21, parcel);
                    } else {
                        listZ = v.z(parcel, i21, Location.CREATOR);
                    }
                }
                v.F(iK012, parcel);
                return new LocationResult(listZ);
            case 14:
                int iK013 = v.k0(parcel);
                String strV13 = "";
                String strV14 = "";
                String strV15 = strV14;
                while (parcel.dataPosition() < iK013) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 1) {
                        strV14 = v.v(i22, parcel);
                    } else if (c17 == 2) {
                        strV15 = v.v(i22, parcel);
                    } else if (c17 != 5) {
                        v.f0(i22, parcel);
                    } else {
                        strV13 = v.v(i22, parcel);
                    }
                }
                v.F(iK013, parcel);
                return new x(strV13, strV14, strV15);
            case 15:
                int iK014 = v.k0(parcel);
                ArrayList arrayListZ7 = null;
                boolean zU3 = false;
                boolean zU4 = false;
                x xVar = null;
                while (parcel.dataPosition() < iK014) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        arrayListZ7 = v.z(parcel, i23, LocationRequest.CREATOR);
                    } else if (c18 == 2) {
                        zU3 = v.U(i23, parcel);
                    } else if (c18 == 3) {
                        zU4 = v.U(i23, parcel);
                    } else if (c18 != 5) {
                        v.f0(i23, parcel);
                    } else {
                        xVar = (x) v.u(parcel, i23, x.CREATOR);
                    }
                }
                v.F(iK014, parcel);
                return new i(arrayListZ7, zU3, zU4, xVar);
            case 16:
                int iK015 = v.k0(parcel);
                Status status = null;
                k kVar = null;
                while (parcel.dataPosition() < iK015) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        status = (Status) v.u(parcel, i24, Status.CREATOR);
                    } else if (c19 != 2) {
                        v.f0(i24, parcel);
                    } else {
                        kVar = (k) v.u(parcel, i24, k.CREATOR);
                    }
                }
                v.F(iK015, parcel);
                return new j(status, kVar);
            case 17:
                int iK016 = v.k0(parcel);
                boolean zU5 = false;
                boolean zU6 = false;
                boolean zU7 = false;
                boolean zU8 = false;
                boolean zU9 = false;
                boolean zU10 = false;
                while (parcel.dataPosition() < iK016) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            zU5 = v.U(i25, parcel);
                            break;
                        case 2:
                            zU6 = v.U(i25, parcel);
                            break;
                        case 3:
                            zU7 = v.U(i25, parcel);
                            break;
                        case 4:
                            zU8 = v.U(i25, parcel);
                            break;
                        case 5:
                            zU9 = v.U(i25, parcel);
                            break;
                        case 6:
                            zU10 = v.U(i25, parcel);
                            break;
                        default:
                            v.f0(i25, parcel);
                            break;
                    }
                }
                v.F(iK016, parcel);
                return new k(zU5, zU6, zU7, zU8, zU9, zU10);
            case 18:
                int iK017 = v.k0(parcel);
                int iZ13 = 1;
                int iZ14 = 1;
                long jB06 = -1;
                long jB07 = -1;
                while (parcel.dataPosition() < iK017) {
                    int i26 = parcel.readInt();
                    char c20 = (char) i26;
                    if (c20 == 1) {
                        iZ13 = v.Z(i26, parcel);
                    } else if (c20 == 2) {
                        iZ14 = v.Z(i26, parcel);
                    } else if (c20 == 3) {
                        jB06 = v.b0(i26, parcel);
                    } else if (c20 != 4) {
                        v.f0(i26, parcel);
                    } else {
                        jB07 = v.b0(i26, parcel);
                    }
                }
                v.F(iK017, parcel);
                return new y(jB06, iZ13, iZ14, jB07);
            case 19:
                int iK018 = v.k0(parcel);
                String strV16 = "";
                ArrayList arrayListX = null;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iK018) {
                    int i27 = parcel.readInt();
                    char c21 = (char) i27;
                    if (c21 == 1) {
                        arrayListX = v.x(i27, parcel);
                    } else if (c21 == 2) {
                        pendingIntent = (PendingIntent) v.u(parcel, i27, PendingIntent.CREATOR);
                    } else if (c21 != 3) {
                        v.f0(i27, parcel);
                    } else {
                        strV16 = v.v(i27, parcel);
                    }
                }
                v.F(iK018, parcel);
                return new z(arrayListX, pendingIntent, strV16);
            case 20:
                int iK019 = v.k0(parcel);
                ArrayList arrayListZ8 = null;
                int iZ15 = 0;
                while (parcel.dataPosition() < iK019) {
                    int i28 = parcel.readInt();
                    char c22 = (char) i28;
                    if (c22 == 1) {
                        arrayListZ8 = v.z(parcel, i28, a0.CREATOR);
                    } else if (c22 != 2) {
                        v.f0(i28, parcel);
                    } else {
                        iZ15 = v.Z(i28, parcel);
                    }
                }
                v.F(iK019, parcel);
                return new l(arrayListZ8, iZ15);
            case zzbch.zzt.zzm /* 21 */:
                int iK020 = v.k0(parcel);
                int iZ16 = 0;
                int iZ17 = 0;
                int iZ18 = 0;
                int iZ19 = 0;
                while (parcel.dataPosition() < iK020) {
                    int i29 = parcel.readInt();
                    char c23 = (char) i29;
                    if (c23 == 1) {
                        iZ16 = v.Z(i29, parcel);
                    } else if (c23 == 2) {
                        iZ17 = v.Z(i29, parcel);
                    } else if (c23 == 3) {
                        iZ18 = v.Z(i29, parcel);
                    } else if (c23 != 4) {
                        v.f0(i29, parcel);
                    } else {
                        iZ19 = v.Z(i29, parcel);
                    }
                }
                v.F(iK020, parcel);
                return new a0(iZ16, iZ17, iZ18, iZ19);
            case 22:
                int iK021 = v.k0(parcel);
                int iZ20 = 0;
                int iZ21 = 0;
                while (parcel.dataPosition() < iK021) {
                    int i30 = parcel.readInt();
                    char c24 = (char) i30;
                    if (c24 == 1) {
                        iZ20 = v.Z(i30, parcel);
                    } else if (c24 != 2) {
                        v.f0(i30, parcel);
                    } else {
                        iZ21 = v.Z(i30, parcel);
                    }
                }
                v.F(iK021, parcel);
                return new ee.b(iZ20, iZ21);
            case 23:
                int iK022 = v.k0(parcel);
                ArrayList arrayListZ9 = null;
                String strV17 = null;
                ArrayList arrayListZ10 = null;
                String strV18 = null;
                while (parcel.dataPosition() < iK022) {
                    int i31 = parcel.readInt();
                    char c25 = (char) i31;
                    if (c25 == 1) {
                        arrayListZ9 = v.z(parcel, i31, ee.b.CREATOR);
                    } else if (c25 == 2) {
                        strV17 = v.v(i31, parcel);
                    } else if (c25 == 3) {
                        arrayListZ10 = v.z(parcel, i31, com.google.android.gms.common.internal.g.CREATOR);
                    } else if (c25 != 4) {
                        v.f0(i31, parcel);
                    } else {
                        strV18 = v.v(i31, parcel);
                    }
                }
                v.F(iK022, parcel);
                return new ee.c(arrayListZ9, strV17, arrayListZ10, strV18);
            case 24:
                int iK023 = v.k0(parcel);
                boolean zU11 = true;
                long jB08 = 50;
                float fW2 = 0.0f;
                long jB09 = Long.MAX_VALUE;
                int iZ22 = Integer.MAX_VALUE;
                while (parcel.dataPosition() < iK023) {
                    int i32 = parcel.readInt();
                    char c26 = (char) i32;
                    if (c26 == 1) {
                        zU11 = v.U(i32, parcel);
                    } else if (c26 == 2) {
                        jB08 = v.b0(i32, parcel);
                    } else if (c26 == 3) {
                        fW2 = v.W(i32, parcel);
                    } else if (c26 == 4) {
                        jB09 = v.b0(i32, parcel);
                    } else if (c26 != 5) {
                        v.f0(i32, parcel);
                    } else {
                        iZ22 = v.Z(i32, parcel);
                    }
                }
                v.F(iK023, parcel);
                return new b0(zU11, jB08, fW2, jB09, iZ22);
            case 25:
                fj.l.f(parcel, "parcel");
                return new g.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 26:
                fj.l.f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                fj.l.c(parcelable);
                return new g.h((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 27:
                int iK024 = v.k0(parcel);
                HashSet hashSet = new HashSet();
                int iZ23 = 0;
                ArrayList arrayListZ11 = null;
                gd.d dVar2 = null;
                int iZ24 = 0;
                while (parcel.dataPosition() < iK024) {
                    int i33 = parcel.readInt();
                    char c27 = (char) i33;
                    if (c27 == 1) {
                        iZ23 = v.Z(i33, parcel);
                        hashSet.add(1);
                    } else if (c27 == 2) {
                        arrayListZ11 = v.z(parcel, i33, gd.e.CREATOR);
                        hashSet.add(2);
                    } else if (c27 == 3) {
                        iZ24 = v.Z(i33, parcel);
                        hashSet.add(3);
                    } else if (c27 != 4) {
                        v.f0(i33, parcel);
                    } else {
                        dVar2 = (gd.d) v.u(parcel, i33, gd.d.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == iK024) {
                    return new gd.b(hashSet, iZ23, arrayListZ11, iZ24, dVar2);
                }
                throw new b3.e(m6.a.d(iK024, "Overread allowed size end="), parcel);
            case 28:
                int iK025 = v.k0(parcel);
                ArrayList arrayListX2 = null;
                ArrayList arrayListX3 = null;
                ArrayList arrayListX4 = null;
                ArrayList arrayListX5 = null;
                ArrayList arrayListX6 = null;
                int iZ25 = 0;
                while (parcel.dataPosition() < iK025) {
                    int i34 = parcel.readInt();
                    switch ((char) i34) {
                        case 1:
                            iZ25 = v.Z(i34, parcel);
                            break;
                        case 2:
                            arrayListX2 = v.x(i34, parcel);
                            break;
                        case 3:
                            arrayListX3 = v.x(i34, parcel);
                            break;
                        case 4:
                            arrayListX4 = v.x(i34, parcel);
                            break;
                        case 5:
                            arrayListX5 = v.x(i34, parcel);
                            break;
                        case 6:
                            arrayListX6 = v.x(i34, parcel);
                            break;
                        default:
                            v.f0(i34, parcel);
                            break;
                    }
                }
                v.F(iK025, parcel);
                return new gd.d(iZ25, arrayListX2, arrayListX3, arrayListX4, arrayListX5, arrayListX6);
            default:
                int iK026 = v.k0(parcel);
                HashSet hashSet2 = new HashSet();
                int iZ26 = 0;
                gd.f fVar = null;
                String strV19 = null;
                String strV20 = null;
                String strV21 = null;
                while (parcel.dataPosition() < iK026) {
                    int i35 = parcel.readInt();
                    char c28 = (char) i35;
                    if (c28 == 1) {
                        iZ26 = v.Z(i35, parcel);
                        hashSet2.add(1);
                    } else if (c28 == 2) {
                        fVar = (gd.f) v.u(parcel, i35, gd.f.CREATOR);
                        hashSet2.add(2);
                    } else if (c28 == 3) {
                        strV19 = v.v(i35, parcel);
                        hashSet2.add(3);
                    } else if (c28 == 4) {
                        strV20 = v.v(i35, parcel);
                        hashSet2.add(4);
                    } else if (c28 != 5) {
                        v.f0(i35, parcel);
                    } else {
                        strV21 = v.v(i35, parcel);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == iK026) {
                    return new gd.e(hashSet2, iZ26, fVar, strV19, strV20, strV21);
                }
                throw new b3.e(m6.a.d(iK026, "Overread allowed size end="), parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f5086a) {
            case 0:
                return new b[i10];
            case 1:
                return new c[i10];
            case 2:
                return new de.a[i10];
            case 3:
                return new de.c[i10];
            case 4:
                return new de.d[i10];
            case 5:
                return new f[i10];
            case 6:
                return new g[i10];
            case 7:
                return new RegisterRequestParams[i10];
            case 8:
                return new h[i10];
            case 9:
                return new SignRequestParams[i10];
            case 10:
                return new ee.e[i10];
            case 11:
                return new LocationAvailability[i10];
            case 12:
                return new LocationRequest[i10];
            case 13:
                return new LocationResult[i10];
            case 14:
                return new x[i10];
            case 15:
                return new i[i10];
            case 16:
                return new j[i10];
            case 17:
                return new k[i10];
            case 18:
                return new y[i10];
            case 19:
                return new z[i10];
            case 20:
                return new l[i10];
            case zzbch.zzt.zzm /* 21 */:
                return new a0[i10];
            case 22:
                return new ee.b[i10];
            case 23:
                return new ee.c[i10];
            case 24:
                return new b0[i10];
            case 25:
                return new g.a[i10];
            case 26:
                return new g.h[i10];
            case 27:
                return new gd.b[i10];
            case 28:
                return new gd.d[i10];
            default:
                return new gd.e[i10];
        }
    }
}
