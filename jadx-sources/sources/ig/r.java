package ig;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r extends c implements Cloneable {
    public static final Parcelable.Creator<r> CREATOR = new gd.g(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f8559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8560b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8561c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8562d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8563e;

    public r(String str, String str2, String str3, String str4, boolean z2) {
        com.google.android.gms.common.internal.e0.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f8559a = str;
        this.f8560b = str2;
        this.f8561c = str3;
        this.f8562d = z2;
        this.f8563e = str4;
    }

    @Override // ig.c
    public final String b() {
        return "phone";
    }

    @Override // ig.c
    public final c c() {
        return (r) clone();
    }

    public final Object clone() {
        boolean z2 = this.f8562d;
        return new r(this.f8559a, this.f8560b, this.f8561c, this.f8563e, z2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8559a, false);
        uk.c.c0(parcel, 2, this.f8560b, false);
        uk.c.c0(parcel, 4, this.f8561c, false);
        boolean z2 = this.f8562d;
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uk.c.c0(parcel, 6, this.f8563e, false);
        uk.c.j0(iH0, parcel);
    }
}
