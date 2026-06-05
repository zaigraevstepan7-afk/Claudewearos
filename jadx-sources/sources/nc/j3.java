package nc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j3 extends od.a {
    public static final Parcelable.Creator<j3> CREATOR = new ig.e0(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f12129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12130b;

    /* renamed from: c, reason: collision with root package name */
    public final q3 f12131c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12132d;

    public j3(String str, int i10, q3 q3Var, int i11) {
        this.f12129a = str;
        this.f12130b = i10;
        this.f12131c = q3Var;
        this.f12132d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.f12129a.equals(j3Var.f12129a) && this.f12130b == j3Var.f12130b && this.f12131c.b(j3Var.f12131c);
    }

    public final int hashCode() {
        return Objects.hash(this.f12129a, Integer.valueOf(this.f12130b), this.f12131c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f12129a, false);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f12130b);
        uk.c.b0(parcel, 3, this.f12131c, i10, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f12132d);
        uk.c.j0(iH0, parcel);
    }
}
