package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ig.e0;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new e0(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f3482a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f3483b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.e0.e(str);
        this.f3482a = str;
        this.f3483b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.f3483b;
        if (this.f3482a.equals(signInConfiguration.f3482a)) {
            GoogleSignInOptions googleSignInOptions2 = this.f3483b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1 * 31;
        String str = this.f3482a;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f3483b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.c0(parcel, 2, this.f3482a, false);
        c.b0(parcel, 5, this.f3483b, i10, false);
        c.j0(iH0, parcel);
    }
}
