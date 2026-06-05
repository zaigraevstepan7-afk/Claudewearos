package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 extends od.a {
    public static final Parcelable.Creator<v0> CREATOR = new ae.b(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f3327a;

    public v0(String str) {
        this.f3327a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            return com.google.android.gms.common.internal.e0.l(this.f3327a, ((v0) obj).f3327a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3327a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f3327a, false);
        uk.c.j0(iH0, parcel);
    }
}
