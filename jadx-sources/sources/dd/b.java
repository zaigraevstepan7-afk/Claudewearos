package dd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends od.a {
    public static final Parcelable.Creator<b> CREATOR = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f5080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5081b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5082c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f5083d;

    public b(int i10, int i11, String str, Account account) {
        this.f5080a = i10;
        this.f5081b = i11;
        this.f5082c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f5083d = account;
        } else {
            this.f5083d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5080a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5081b);
        uk.c.c0(parcel, 3, this.f5082c, false);
        uk.c.b0(parcel, 4, this.f5083d, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
