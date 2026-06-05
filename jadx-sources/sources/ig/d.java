package ig;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new e0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f8529a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8530b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8531c;

    /* renamed from: d, reason: collision with root package name */
    public String f8532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8533e;

    public d(String str, String str2, String str3, String str4, boolean z2) {
        com.google.android.gms.common.internal.e0.e(str);
        this.f8529a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f8530b = str2;
        this.f8531c = str3;
        this.f8532d = str4;
        this.f8533e = z2;
    }

    @Override // ig.c
    public final String b() {
        return "password";
    }

    @Override // ig.c
    public final c c() {
        return new d(this.f8529a, this.f8530b, this.f8531c, this.f8532d, this.f8533e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8529a, false);
        uk.c.c0(parcel, 2, this.f8530b, false);
        uk.c.c0(parcel, 3, this.f8531c, false);
        uk.c.c0(parcel, 4, this.f8532d, false);
        boolean z2 = this.f8533e;
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
