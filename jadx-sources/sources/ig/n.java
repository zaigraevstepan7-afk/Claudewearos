package ig;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends c {
    public static final Parcelable.Creator<n> CREATOR = new gd.g(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f8556a;

    public n(String str) {
        com.google.android.gms.common.internal.e0.e(str);
        this.f8556a = str;
    }

    @Override // ig.c
    public final String b() {
        return "github.com";
    }

    @Override // ig.c
    public final c c() {
        return new n(this.f8556a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8556a, false);
        uk.c.j0(iH0, parcel);
    }
}
