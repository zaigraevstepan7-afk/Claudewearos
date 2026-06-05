package kd;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9535a;

    public /* synthetic */ d(int i10) {
        this.f9535a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9535a) {
            case 0:
                int iK0 = v.k0(parcel);
                String strV = null;
                String strV2 = null;
                String strV3 = null;
                String strV4 = null;
                Uri uri = null;
                String strV5 = null;
                String strV6 = null;
                ArrayList arrayListZ = null;
                String strV7 = null;
                String strV8 = null;
                long jB0 = 0;
                int iZ = 0;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iZ = v.Z(i10, parcel);
                            break;
                        case 2:
                            strV = v.v(i10, parcel);
                            break;
                        case 3:
                            strV2 = v.v(i10, parcel);
                            break;
                        case 4:
                            strV3 = v.v(i10, parcel);
                            break;
                        case 5:
                            strV4 = v.v(i10, parcel);
                            break;
                        case 6:
                            uri = (Uri) v.u(parcel, i10, Uri.CREATOR);
                            break;
                        case 7:
                            strV5 = v.v(i10, parcel);
                            break;
                        case '\b':
                            jB0 = v.b0(i10, parcel);
                            break;
                        case '\t':
                            strV6 = v.v(i10, parcel);
                            break;
                        case '\n':
                            arrayListZ = v.z(parcel, i10, Scope.CREATOR);
                            break;
                        case 11:
                            strV7 = v.v(i10, parcel);
                            break;
                        case '\f':
                            strV8 = v.v(i10, parcel);
                            break;
                        default:
                            v.f0(i10, parcel);
                            break;
                    }
                }
                v.F(iK0, parcel);
                return new GoogleSignInAccount(iZ, strV, strV2, strV3, strV4, uri, strV5, jB0, strV6, arrayListZ, strV7, strV8);
            case 1:
                int iK02 = v.k0(parcel);
                ArrayList arrayListZ2 = null;
                ArrayList arrayListZ3 = null;
                Account account = null;
                String strV9 = null;
                String strV10 = null;
                String strV11 = null;
                int iZ2 = 0;
                boolean zU = false;
                boolean zU2 = false;
                boolean zU3 = false;
                while (parcel.dataPosition() < iK02) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iZ2 = v.Z(i11, parcel);
                            break;
                        case 2:
                            arrayListZ3 = v.z(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) v.u(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zU = v.U(i11, parcel);
                            break;
                        case 5:
                            zU2 = v.U(i11, parcel);
                            break;
                        case 6:
                            zU3 = v.U(i11, parcel);
                            break;
                        case 7:
                            strV9 = v.v(i11, parcel);
                            break;
                        case '\b':
                            strV10 = v.v(i11, parcel);
                            break;
                        case '\t':
                            arrayListZ2 = v.z(parcel, i11, ld.a.CREATOR);
                            break;
                        case '\n':
                            strV11 = v.v(i11, parcel);
                            break;
                        default:
                            v.f0(i11, parcel);
                            break;
                    }
                }
                v.F(iK02, parcel);
                return new GoogleSignInOptions(iZ2, arrayListZ3, account, zU, zU2, zU3, strV9, strV10, GoogleSignInOptions.c(arrayListZ2), strV11);
            default:
                int iK03 = v.k0(parcel);
                String strV12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strV13 = "";
                while (parcel.dataPosition() < iK03) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 4) {
                        strV12 = v.v(i12, parcel);
                    } else if (c6 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) v.u(parcel, i12, GoogleSignInAccount.CREATOR);
                    } else if (c6 != '\b') {
                        v.f0(i12, parcel);
                    } else {
                        strV13 = v.v(i12, parcel);
                    }
                }
                v.F(iK03, parcel);
                return new SignInAccount(strV12, googleSignInAccount, strV13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f9535a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
