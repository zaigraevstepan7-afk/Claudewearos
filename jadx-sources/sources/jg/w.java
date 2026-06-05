package jg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w implements od.b {
    public static final Parcelable.Creator<w> CREATOR = new c(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f8914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8915b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8916c;

    public w(boolean z2) {
        this.f8916c = z2;
        this.f8915b = null;
        this.f8914a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8914a, false);
        uk.c.c0(parcel, 2, this.f8915b, false);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f8916c ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }

    public w(String str, String str2, boolean z2) {
        e0.e(str);
        e0.e(str2);
        this.f8914a = str;
        this.f8915b = str2;
        j.d(str2);
        this.f8916c = z2;
    }
}
