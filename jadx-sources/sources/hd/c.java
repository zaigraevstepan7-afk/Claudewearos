package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends od.a {
    public static final Parcelable.Creator<c> CREATOR = new gd.g(9);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7851a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7852b;

    public c(String str, boolean z2) {
        if (z2) {
            e0.i(str);
        }
        this.f7851a = z2;
        this.f7852b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7851a == cVar.f7851a && e0.l(this.f7852b, cVar.f7852b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f7851a), this.f7852b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f7851a ? 1 : 0);
        uk.c.c0(parcel, 2, this.f7852b, false);
        uk.c.j0(iH0, parcel);
    }
}
