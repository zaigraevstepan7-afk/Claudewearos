package ee;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x extends od.a {
    public static final Parcelable.Creator<x> CREATOR = new dd.d(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f5961a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5962b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5963c;

    public x(String str, String str2, String str3) {
        this.f5963c = str;
        this.f5961a = str2;
        this.f5962b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f5961a, false);
        uk.c.c0(parcel, 2, this.f5962b, false);
        uk.c.c0(parcel, 5, this.f5963c, false);
        uk.c.j0(iH0, parcel);
    }
}
