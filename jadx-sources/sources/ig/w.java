package ig;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w extends c {
    public static final Parcelable.Creator<w> CREATOR = new gd.g(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f8568a;

    public w(String str) {
        com.google.android.gms.common.internal.e0.e(str);
        this.f8568a = str;
    }

    @Override // ig.c
    public final String b() {
        return "playgames.google.com";
    }

    @Override // ig.c
    public final c c() {
        return new w(this.f8568a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8568a, false);
        uk.c.j0(iH0, parcel);
    }
}
