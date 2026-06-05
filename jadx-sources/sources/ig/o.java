package ig;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o extends c {
    public static final Parcelable.Creator<o> CREATOR = new gd.g(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f8557a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8558b;

    public o(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f8557a = str;
        this.f8558b = str2;
    }

    @Override // ig.c
    public final String b() {
        return "google.com";
    }

    @Override // ig.c
    public final c c() {
        return new o(this.f8557a, this.f8558b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8557a, false);
        uk.c.c0(parcel, 2, this.f8558b, false);
        uk.c.j0(iH0, parcel);
    }
}
