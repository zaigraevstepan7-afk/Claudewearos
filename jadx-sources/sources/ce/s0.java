package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 extends od.a {
    public static final Parcelable.Creator<s0> CREATOR = new ae.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f3312a;

    public s0(String str) {
        com.google.android.gms.common.internal.e0.i(str);
        this.f3312a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return this.f3312a.equals(((s0) obj).f3312a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3312a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f3312a, false);
        uk.c.j0(iH0, parcel);
    }
}
