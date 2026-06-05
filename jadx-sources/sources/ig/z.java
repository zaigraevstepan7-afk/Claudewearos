package ig;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z extends c {
    public static final Parcelable.Creator<z> CREATOR = new gd.g(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f8573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8574b;

    public z(String str, String str2) {
        com.google.android.gms.common.internal.e0.e(str);
        this.f8573a = str;
        com.google.android.gms.common.internal.e0.e(str2);
        this.f8574b = str2;
    }

    @Override // ig.c
    public final String b() {
        return "twitter.com";
    }

    @Override // ig.c
    public final c c() {
        return new z(this.f8573a, this.f8574b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8573a, false);
        uk.c.c0(parcel, 2, this.f8574b, false);
        uk.c.j0(iH0, parcel);
    }
}
