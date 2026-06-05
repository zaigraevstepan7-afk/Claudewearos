package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.e0;
import kd.d;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f3479a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f3480b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3481c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f3480b = googleSignInAccount;
        e0.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f3479a = str;
        e0.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f3481c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.c0(parcel, 4, this.f3479a, false);
        c.b0(parcel, 7, this.f3480b, i10, false);
        c.c0(parcel, 8, this.f3481c, false);
        c.j0(iH0, parcel);
    }
}
