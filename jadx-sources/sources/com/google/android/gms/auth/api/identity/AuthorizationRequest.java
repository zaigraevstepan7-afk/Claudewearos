package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.e0;
import gd.g;
import java.util.Arrays;
import java.util.List;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new g(2);
    public final boolean A;
    public final Bundle B;

    /* renamed from: a, reason: collision with root package name */
    public final List f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3453b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3454c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3455d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f3456e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3457f;

    /* renamed from: z, reason: collision with root package name */
    public final String f3458z;

    public AuthorizationRequest(List list, String str, boolean z2, boolean z10, Account account, String str2, String str3, boolean z11, Bundle bundle) {
        boolean z12 = false;
        if (list != null && !list.isEmpty()) {
            z12 = true;
        }
        e0.a("requestedScopes cannot be null or empty", z12);
        this.f3452a = list;
        this.f3453b = str;
        this.f3454c = z2;
        this.f3455d = z10;
        this.f3456e = account;
        this.f3457f = str2;
        this.f3458z = str3;
        this.A = z11;
        this.B = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = authorizationRequest.f3452a;
        List list2 = this.f3452a;
        if (list2.size() == list.size() && list2.containsAll(list)) {
            Bundle bundle = authorizationRequest.B;
            Bundle bundle2 = this.B;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!e0.l(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f3454c == authorizationRequest.f3454c && this.A == authorizationRequest.A && this.f3455d == authorizationRequest.f3455d && e0.l(this.f3453b, authorizationRequest.f3453b) && e0.l(this.f3456e, authorizationRequest.f3456e) && e0.l(this.f3457f, authorizationRequest.f3457f) && e0.l(this.f3458z, authorizationRequest.f3458z)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3452a, this.f3453b, Boolean.valueOf(this.f3454c), Boolean.valueOf(this.A), Boolean.valueOf(this.f3455d), this.f3456e, this.f3457f, this.f3458z, this.B});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.g0(parcel, 1, this.f3452a, false);
        c.c0(parcel, 2, this.f3453b, false);
        c.k0(parcel, 3, 4);
        parcel.writeInt(this.f3454c ? 1 : 0);
        c.k0(parcel, 4, 4);
        parcel.writeInt(this.f3455d ? 1 : 0);
        c.b0(parcel, 5, this.f3456e, i10, false);
        c.c0(parcel, 6, this.f3457f, false);
        c.c0(parcel, 7, this.f3458z, false);
        c.k0(parcel, 8, 4);
        parcel.writeInt(this.A ? 1 : 0);
        c.U(parcel, 9, this.B, false);
        c.j0(iH0, parcel);
    }
}
