package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends od.a {
    public static final Parcelable.Creator<z> CREATOR = new x0(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f3719a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f3720b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3721c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f3722d;

    public z(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f3719a = i10;
        this.f3720b = account;
        this.f3721c = i11;
        this.f3722d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3719a);
        uk.c.b0(parcel, 2, this.f3720b, i10, false);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f3721c);
        uk.c.b0(parcel, 4, this.f3722d, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
