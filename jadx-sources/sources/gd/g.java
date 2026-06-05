package gd;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ce.x;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.p002firebaseauthapi.zzagq;
import hd.i;
import hd.j;
import hd.k;
import hd.l;
import hd.m;
import hd.o;
import hd.p;
import ig.b0;
import ig.n;
import ig.r;
import ig.s;
import ig.w;
import ig.y;
import ig.z;
import java.util.ArrayList;
import java.util.HashSet;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7394a;

    public /* synthetic */ g(int i10) {
        this.f7394a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7394a) {
            case 0:
                int iK0 = v.k0(parcel);
                HashSet hashSet = new HashSet();
                int iZ = 0;
                String strV = null;
                byte[] bArrR = null;
                PendingIntent pendingIntent = null;
                a aVar = null;
                int iZ2 = 0;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iZ = v.Z(i10, parcel);
                            hashSet.add(1);
                            break;
                        case 2:
                            strV = v.v(i10, parcel);
                            hashSet.add(2);
                            break;
                        case 3:
                            iZ2 = v.Z(i10, parcel);
                            hashSet.add(3);
                            break;
                        case 4:
                            bArrR = v.r(i10, parcel);
                            hashSet.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) v.u(parcel, i10, PendingIntent.CREATOR);
                            hashSet.add(5);
                            break;
                        case 6:
                            aVar = (a) v.u(parcel, i10, a.CREATOR);
                            hashSet.add(6);
                            break;
                        default:
                            v.f0(i10, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == iK0) {
                    return new f(hashSet, iZ, strV, iZ2, bArrR, pendingIntent, aVar);
                }
                throw new b3.e(m6.a.d(iK0, "Overread allowed size end="), parcel);
            case 1:
                int iK02 = v.k0(parcel);
                int iZ3 = 0;
                boolean zU = false;
                boolean zU2 = false;
                long jB0 = 0;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        iZ3 = v.Z(i11, parcel);
                    } else if (c6 == 2) {
                        zU = v.U(i11, parcel);
                    } else if (c6 == 3) {
                        jB0 = v.b0(i11, parcel);
                    } else if (c6 != 4) {
                        v.f0(i11, parcel);
                    } else {
                        zU2 = v.U(i11, parcel);
                    }
                }
                v.F(iK02, parcel);
                return new a(iZ3, zU, jB0, zU2);
            case 2:
                int iK03 = v.k0(parcel);
                ArrayList arrayListZ = null;
                String strV2 = null;
                Account account = null;
                String strV3 = null;
                String strV4 = null;
                Bundle bundleQ = null;
                boolean zU3 = false;
                boolean zU4 = false;
                boolean zU5 = false;
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            arrayListZ = v.z(parcel, i12, Scope.CREATOR);
                            break;
                        case 2:
                            strV2 = v.v(i12, parcel);
                            break;
                        case 3:
                            zU3 = v.U(i12, parcel);
                            break;
                        case 4:
                            zU4 = v.U(i12, parcel);
                            break;
                        case 5:
                            account = (Account) v.u(parcel, i12, Account.CREATOR);
                            break;
                        case 6:
                            strV3 = v.v(i12, parcel);
                            break;
                        case 7:
                            strV4 = v.v(i12, parcel);
                            break;
                        case '\b':
                            zU5 = v.U(i12, parcel);
                            break;
                        case '\t':
                            bundleQ = v.q(i12, parcel);
                            break;
                        default:
                            v.f0(i12, parcel);
                            break;
                    }
                }
                v.F(iK03, parcel);
                return new AuthorizationRequest(arrayListZ, strV2, zU3, zU4, account, strV3, strV4, zU5, bundleQ);
            case 3:
                int iK04 = v.k0(parcel);
                String strV5 = null;
                String strV6 = null;
                String strV7 = null;
                ArrayList arrayListX = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iK04) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strV5 = v.v(i13, parcel);
                            break;
                        case 2:
                            strV6 = v.v(i13, parcel);
                            break;
                        case 3:
                            strV7 = v.v(i13, parcel);
                            break;
                        case 4:
                            arrayListX = v.x(i13, parcel);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) v.u(parcel, i13, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) v.u(parcel, i13, PendingIntent.CREATOR);
                            break;
                        default:
                            v.f0(i13, parcel);
                            break;
                    }
                }
                v.F(iK04, parcel);
                return new hd.a(strV5, strV6, strV7, arrayListX, googleSignInAccount, pendingIntent2);
            case 4:
                int iK05 = v.k0(parcel);
                boolean zU6 = false;
                int iZ4 = 0;
                boolean zU7 = false;
                hd.e eVar = null;
                hd.b bVar = null;
                String strV8 = null;
                hd.d dVar = null;
                hd.c cVar = null;
                while (parcel.dataPosition() < iK05) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            eVar = (hd.e) v.u(parcel, i14, hd.e.CREATOR);
                            break;
                        case 2:
                            bVar = (hd.b) v.u(parcel, i14, hd.b.CREATOR);
                            break;
                        case 3:
                            strV8 = v.v(i14, parcel);
                            break;
                        case 4:
                            zU6 = v.U(i14, parcel);
                            break;
                        case 5:
                            iZ4 = v.Z(i14, parcel);
                            break;
                        case 6:
                            dVar = (hd.d) v.u(parcel, i14, hd.d.CREATOR);
                            break;
                        case 7:
                            cVar = (hd.c) v.u(parcel, i14, hd.c.CREATOR);
                            break;
                        case '\b':
                            zU7 = v.U(i14, parcel);
                            break;
                        default:
                            v.f0(i14, parcel);
                            break;
                    }
                }
                v.F(iK05, parcel);
                return new hd.f(eVar, bVar, strV8, zU6, iZ4, dVar, cVar, zU7);
            case 5:
                int iK06 = v.k0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iK06) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        v.f0(i15, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) v.u(parcel, i15, PendingIntent.CREATOR);
                    }
                }
                v.F(iK06, parcel);
                return new hd.g(pendingIntent3);
            case 6:
                int iK07 = v.k0(parcel);
                int iZ5 = 0;
                while (parcel.dataPosition() < iK07) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        v.f0(i16, parcel);
                    } else {
                        iZ5 = v.Z(i16, parcel);
                    }
                }
                v.F(iK07, parcel);
                return new i(iZ5);
            case 7:
                int iK08 = v.k0(parcel);
                boolean zU8 = false;
                int iZ6 = 0;
                String strV9 = null;
                String strV10 = null;
                String strV11 = null;
                String strV12 = null;
                while (parcel.dataPosition() < iK08) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            strV9 = v.v(i17, parcel);
                            break;
                        case 2:
                            strV10 = v.v(i17, parcel);
                            break;
                        case 3:
                            strV11 = v.v(i17, parcel);
                            break;
                        case 4:
                            strV12 = v.v(i17, parcel);
                            break;
                        case 5:
                            zU8 = v.U(i17, parcel);
                            break;
                        case 6:
                            iZ6 = v.Z(i17, parcel);
                            break;
                        default:
                            v.f0(i17, parcel);
                            break;
                    }
                }
                v.F(iK08, parcel);
                return new j(strV9, strV10, strV11, strV12, zU8, iZ6);
            case 8:
                int iK09 = v.k0(parcel);
                boolean zU9 = false;
                boolean zU10 = false;
                boolean zU11 = false;
                String strV13 = null;
                String strV14 = null;
                String strV15 = null;
                ArrayList arrayListX2 = null;
                while (parcel.dataPosition() < iK09) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            zU9 = v.U(i18, parcel);
                            break;
                        case 2:
                            strV13 = v.v(i18, parcel);
                            break;
                        case 3:
                            strV14 = v.v(i18, parcel);
                            break;
                        case 4:
                            zU10 = v.U(i18, parcel);
                            break;
                        case 5:
                            strV15 = v.v(i18, parcel);
                            break;
                        case 6:
                            arrayListX2 = v.x(i18, parcel);
                            break;
                        case 7:
                            zU11 = v.U(i18, parcel);
                            break;
                        default:
                            v.f0(i18, parcel);
                            break;
                    }
                }
                v.F(iK09, parcel);
                return new hd.b(zU9, strV13, strV14, zU10, strV15, arrayListX2, zU11);
            case 9:
                int iK010 = v.k0(parcel);
                String strV16 = null;
                boolean zU12 = false;
                while (parcel.dataPosition() < iK010) {
                    int i19 = parcel.readInt();
                    char c10 = (char) i19;
                    if (c10 == 1) {
                        zU12 = v.U(i19, parcel);
                    } else if (c10 != 2) {
                        v.f0(i19, parcel);
                    } else {
                        strV16 = v.v(i19, parcel);
                    }
                }
                v.F(iK010, parcel);
                return new hd.c(strV16, zU12);
            case 10:
                int iK011 = v.k0(parcel);
                byte[] bArrR2 = null;
                boolean zU13 = false;
                String strV17 = null;
                while (parcel.dataPosition() < iK011) {
                    int i20 = parcel.readInt();
                    char c11 = (char) i20;
                    if (c11 == 1) {
                        zU13 = v.U(i20, parcel);
                    } else if (c11 == 2) {
                        bArrR2 = v.r(i20, parcel);
                    } else if (c11 != 3) {
                        v.f0(i20, parcel);
                    } else {
                        strV17 = v.v(i20, parcel);
                    }
                }
                v.F(iK011, parcel);
                return new hd.d(bArrR2, strV17, zU13);
            case 11:
                int iK012 = v.k0(parcel);
                boolean zU14 = false;
                while (parcel.dataPosition() < iK012) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        v.f0(i21, parcel);
                    } else {
                        zU14 = v.U(i21, parcel);
                    }
                }
                v.F(iK012, parcel);
                return new hd.e(zU14);
            case 12:
                int iK013 = v.k0(parcel);
                int iZ7 = 0;
                PendingIntent pendingIntent4 = null;
                String strV18 = null;
                String strV19 = null;
                ArrayList arrayListX3 = null;
                String strV20 = null;
                while (parcel.dataPosition() < iK013) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            pendingIntent4 = (PendingIntent) v.u(parcel, i22, PendingIntent.CREATOR);
                            break;
                        case 2:
                            strV18 = v.v(i22, parcel);
                            break;
                        case 3:
                            strV19 = v.v(i22, parcel);
                            break;
                        case 4:
                            arrayListX3 = v.x(i22, parcel);
                            break;
                        case 5:
                            strV20 = v.v(i22, parcel);
                            break;
                        case 6:
                            iZ7 = v.Z(i22, parcel);
                            break;
                        default:
                            v.f0(i22, parcel);
                            break;
                    }
                }
                v.F(iK013, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent4, strV18, strV19, arrayListX3, strV20, iZ7);
            case 13:
                int iK014 = v.k0(parcel);
                PendingIntent pendingIntent5 = null;
                while (parcel.dataPosition() < iK014) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        v.f0(i23, parcel);
                    } else {
                        pendingIntent5 = (PendingIntent) v.u(parcel, i23, PendingIntent.CREATOR);
                    }
                }
                v.F(iK014, parcel);
                return new k(pendingIntent5);
            case 14:
                int iK015 = v.k0(parcel);
                int iZ8 = 0;
                p pVar = null;
                String strV21 = null;
                while (parcel.dataPosition() < iK015) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 1) {
                        pVar = (p) v.u(parcel, i24, p.CREATOR);
                    } else if (c12 == 2) {
                        strV21 = v.v(i24, parcel);
                    } else if (c12 != 3) {
                        v.f0(i24, parcel);
                    } else {
                        iZ8 = v.Z(i24, parcel);
                    }
                }
                v.F(iK015, parcel);
                return new l(pVar, strV21, iZ8);
            case 15:
                int iK016 = v.k0(parcel);
                PendingIntent pendingIntent6 = null;
                while (parcel.dataPosition() < iK016) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        v.f0(i25, parcel);
                    } else {
                        pendingIntent6 = (PendingIntent) v.u(parcel, i25, PendingIntent.CREATOR);
                    }
                }
                v.F(iK016, parcel);
                return new m(pendingIntent6);
            case 16:
                int iK017 = v.k0(parcel);
                String strV22 = null;
                String strV23 = null;
                String strV24 = null;
                String strV25 = null;
                Uri uri = null;
                String strV26 = null;
                String strV27 = null;
                String strV28 = null;
                x xVar = null;
                while (parcel.dataPosition() < iK017) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            strV22 = v.v(i26, parcel);
                            break;
                        case 2:
                            strV23 = v.v(i26, parcel);
                            break;
                        case 3:
                            strV24 = v.v(i26, parcel);
                            break;
                        case 4:
                            strV25 = v.v(i26, parcel);
                            break;
                        case 5:
                            uri = (Uri) v.u(parcel, i26, Uri.CREATOR);
                            break;
                        case 6:
                            strV26 = v.v(i26, parcel);
                            break;
                        case 7:
                            strV27 = v.v(i26, parcel);
                            break;
                        case '\b':
                            strV28 = v.v(i26, parcel);
                            break;
                        case '\t':
                            xVar = (x) v.u(parcel, i26, x.CREATOR);
                            break;
                        default:
                            v.f0(i26, parcel);
                            break;
                    }
                }
                v.F(iK017, parcel);
                return new o(strV22, strV23, strV24, strV25, uri, strV26, strV27, strV28, xVar);
            case 17:
                int iK018 = v.k0(parcel);
                String strV29 = null;
                String strV30 = null;
                while (parcel.dataPosition() < iK018) {
                    int i27 = parcel.readInt();
                    char c13 = (char) i27;
                    if (c13 == 1) {
                        strV29 = v.v(i27, parcel);
                    } else if (c13 != 2) {
                        v.f0(i27, parcel);
                    } else {
                        strV30 = v.v(i27, parcel);
                    }
                }
                v.F(iK018, parcel);
                return new p(strV29, strV30);
            case 18:
                int iK019 = v.k0(parcel);
                boolean zU15 = false;
                while (parcel.dataPosition() < iK019) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        v.f0(i28, parcel);
                    } else {
                        zU15 = v.U(i28, parcel);
                    }
                }
                v.F(iK019, parcel);
                return new ic.a(zU15);
            case 19:
                int iK020 = v.k0(parcel);
                IBinder iBinderX = null;
                boolean zU16 = false;
                IBinder iBinderX2 = null;
                while (parcel.dataPosition() < iK020) {
                    int i29 = parcel.readInt();
                    char c14 = (char) i29;
                    if (c14 == 1) {
                        zU16 = v.U(i29, parcel);
                    } else if (c14 == 2) {
                        iBinderX = v.X(i29, parcel);
                    } else if (c14 != 3) {
                        v.f0(i29, parcel);
                    } else {
                        iBinderX2 = v.X(i29, parcel);
                    }
                }
                v.F(iK020, parcel);
                return new ic.g(zU16, iBinderX, iBinderX2);
            case 20:
                int iK021 = v.k0(parcel);
                String strV31 = null;
                while (parcel.dataPosition() < iK021) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 1) {
                        v.f0(i30, parcel);
                    } else {
                        strV31 = v.v(i30, parcel);
                    }
                }
                v.F(iK021, parcel);
                return new n(strV31);
            case zzbch.zzt.zzm /* 21 */:
                int iK022 = v.k0(parcel);
                String strV32 = null;
                String strV33 = null;
                while (parcel.dataPosition() < iK022) {
                    int i31 = parcel.readInt();
                    char c15 = (char) i31;
                    if (c15 == 1) {
                        strV32 = v.v(i31, parcel);
                    } else if (c15 != 2) {
                        v.f0(i31, parcel);
                    } else {
                        strV33 = v.v(i31, parcel);
                    }
                }
                v.F(iK022, parcel);
                return new ig.o(strV32, strV33);
            case 22:
                int iK023 = v.k0(parcel);
                String strV34 = null;
                String strV35 = null;
                String strV36 = null;
                String strV37 = null;
                boolean zU17 = false;
                while (parcel.dataPosition() < iK023) {
                    int i32 = parcel.readInt();
                    char c16 = (char) i32;
                    if (c16 == 1) {
                        strV34 = v.v(i32, parcel);
                    } else if (c16 == 2) {
                        strV35 = v.v(i32, parcel);
                    } else if (c16 == 4) {
                        strV36 = v.v(i32, parcel);
                    } else if (c16 == 5) {
                        zU17 = v.U(i32, parcel);
                    } else if (c16 != 6) {
                        v.f0(i32, parcel);
                    } else {
                        strV37 = v.v(i32, parcel);
                    }
                }
                v.F(iK023, parcel);
                return new r(strV34, strV35, strV36, strV37, zU17);
            case 23:
                int iK024 = v.k0(parcel);
                String strV38 = null;
                String strV39 = null;
                String strV40 = null;
                long jB02 = 0;
                while (parcel.dataPosition() < iK024) {
                    int i33 = parcel.readInt();
                    char c17 = (char) i33;
                    if (c17 == 1) {
                        strV38 = v.v(i33, parcel);
                    } else if (c17 == 2) {
                        strV39 = v.v(i33, parcel);
                    } else if (c17 == 3) {
                        jB02 = v.b0(i33, parcel);
                    } else if (c17 != 4) {
                        v.f0(i33, parcel);
                    } else {
                        strV40 = v.v(i33, parcel);
                    }
                }
                v.F(iK024, parcel);
                return new ig.v(strV38, strV39, jB02, strV40);
            case 24:
                int iK025 = v.k0(parcel);
                String strV41 = null;
                while (parcel.dataPosition() < iK025) {
                    int i34 = parcel.readInt();
                    if (((char) i34) != 1) {
                        v.f0(i34, parcel);
                    } else {
                        strV41 = v.v(i34, parcel);
                    }
                }
                v.F(iK025, parcel);
                return new w(strV41);
            case 25:
                int iK026 = v.k0(parcel);
                String strV42 = null;
                String strV43 = null;
                zzagq zzagqVar = null;
                long jB03 = 0;
                while (parcel.dataPosition() < iK026) {
                    int i35 = parcel.readInt();
                    char c18 = (char) i35;
                    if (c18 == 1) {
                        strV42 = v.v(i35, parcel);
                    } else if (c18 == 2) {
                        strV43 = v.v(i35, parcel);
                    } else if (c18 == 3) {
                        jB03 = v.b0(i35, parcel);
                    } else if (c18 != 4) {
                        v.f0(i35, parcel);
                    } else {
                        zzagqVar = (zzagq) v.u(parcel, i35, zzagq.CREATOR);
                    }
                }
                v.F(iK026, parcel);
                return new y(strV42, strV43, jB03, zzagqVar);
            case 26:
                int iK027 = v.k0(parcel);
                String strV44 = null;
                String strV45 = null;
                while (parcel.dataPosition() < iK027) {
                    int i36 = parcel.readInt();
                    char c19 = (char) i36;
                    if (c19 == 1) {
                        strV44 = v.v(i36, parcel);
                    } else if (c19 != 2) {
                        v.f0(i36, parcel);
                    } else {
                        strV45 = v.v(i36, parcel);
                    }
                }
                v.F(iK027, parcel);
                return new z(strV44, strV45);
            case 27:
                int iK028 = v.k0(parcel);
                boolean zU18 = false;
                String strV46 = null;
                String strV47 = null;
                boolean zU19 = false;
                while (parcel.dataPosition() < iK028) {
                    int i37 = parcel.readInt();
                    char c20 = (char) i37;
                    if (c20 == 2) {
                        strV46 = v.v(i37, parcel);
                    } else if (c20 == 3) {
                        strV47 = v.v(i37, parcel);
                    } else if (c20 == 4) {
                        zU18 = v.U(i37, parcel);
                    } else if (c20 != 5) {
                        v.f0(i37, parcel);
                    } else {
                        zU19 = v.U(i37, parcel);
                    }
                }
                v.F(iK028, parcel);
                b0 b0Var = new b0();
                b0Var.f8519a = strV46;
                b0Var.f8520b = strV47;
                b0Var.f8521c = zU18;
                b0Var.f8522d = zU19;
                b0Var.f8523e = TextUtils.isEmpty(strV47) ? null : Uri.parse(strV47);
                return b0Var;
            case 28:
                int iK029 = v.k0(parcel);
                String strV48 = null;
                String strV49 = null;
                String strV50 = null;
                String strV51 = null;
                String strV52 = null;
                String strV53 = null;
                String strV54 = null;
                boolean zU20 = false;
                boolean zU21 = false;
                int iZ9 = 0;
                while (parcel.dataPosition() < iK029) {
                    int i38 = parcel.readInt();
                    switch ((char) i38) {
                        case 1:
                            strV48 = v.v(i38, parcel);
                            break;
                        case 2:
                            strV49 = v.v(i38, parcel);
                            break;
                        case 3:
                            strV50 = v.v(i38, parcel);
                            break;
                        case 4:
                            strV51 = v.v(i38, parcel);
                            break;
                        case 5:
                            zU20 = v.U(i38, parcel);
                            break;
                        case 6:
                            strV52 = v.v(i38, parcel);
                            break;
                        case 7:
                            zU21 = v.U(i38, parcel);
                            break;
                        case '\b':
                            strV53 = v.v(i38, parcel);
                            break;
                        case '\t':
                            iZ9 = v.Z(i38, parcel);
                            break;
                        case '\n':
                            strV54 = v.v(i38, parcel);
                            break;
                        default:
                            v.f0(i38, parcel);
                            break;
                    }
                }
                v.F(iK029, parcel);
                return new ig.a(strV48, strV49, strV50, strV51, zU20, strV52, zU21, strV53, iZ9, strV54);
            default:
                int iK030 = v.k0(parcel);
                while (parcel.dataPosition() < iK030) {
                    v.f0(parcel.readInt(), parcel);
                }
                v.F(iK030, parcel);
                return new s();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f7394a) {
            case 0:
                return new f[i10];
            case 1:
                return new a[i10];
            case 2:
                return new AuthorizationRequest[i10];
            case 3:
                return new hd.a[i10];
            case 4:
                return new hd.f[i10];
            case 5:
                return new hd.g[i10];
            case 6:
                return new i[i10];
            case 7:
                return new j[i10];
            case 8:
                return new hd.b[i10];
            case 9:
                return new hd.c[i10];
            case 10:
                return new hd.d[i10];
            case 11:
                return new hd.e[i10];
            case 12:
                return new SaveAccountLinkingTokenRequest[i10];
            case 13:
                return new k[i10];
            case 14:
                return new l[i10];
            case 15:
                return new m[i10];
            case 16:
                return new o[i10];
            case 17:
                return new p[i10];
            case 18:
                return new ic.a[i10];
            case 19:
                return new ic.g[i10];
            case 20:
                return new n[i10];
            case zzbch.zzt.zzm /* 21 */:
                return new ig.o[i10];
            case 22:
                return new r[i10];
            case 23:
                return new ig.v[i10];
            case 24:
                return new w[i10];
            case 25:
                return new y[i10];
            case 26:
                return new z[i10];
            case 27:
                return new b0[i10];
            case 28:
                return new ig.a[i10];
            default:
                return new s[i10];
        }
    }
}
