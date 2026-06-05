package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 extends od.a {
    public static final Parcelable.Creator<p0> CREATOR = new ae.b(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f3304a;

    /* renamed from: b, reason: collision with root package name */
    public final short f3305b;

    /* renamed from: c, reason: collision with root package name */
    public final short f3306c;

    public p0(int i10, short s10, short s11) {
        this.f3304a = i10;
        this.f3305b = s10;
        this.f3306c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f3304a == p0Var.f3304a && this.f3305b == p0Var.f3305b && this.f3306c == p0Var.f3306c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3304a), Short.valueOf(this.f3305b), Short.valueOf(this.f3306c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3304a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f3305b);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f3306c);
        uk.c.j0(iH0, parcel);
    }
}
