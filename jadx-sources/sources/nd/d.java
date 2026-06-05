package nd;

import android.os.Parcel;
import android.os.Parcelable;
import ig.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends od.a {
    public static final Parcelable.Creator<d> CREATOR = new e0(27);

    /* renamed from: a, reason: collision with root package name */
    public final String f12274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12275b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12276c;

    public d(int i10, long j, String str) {
        this.f12274a = str;
        this.f12275b = i10;
        this.f12276c = j;
    }

    public final long b() {
        long j = this.f12276c;
        return j == -1 ? this.f12275b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f12274a;
            String str2 = this.f12274a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == dVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12274a, Long.valueOf(b())});
    }

    public final String toString() {
        t0.j jVar = new t0.j(this);
        jVar.g(this.f12274a, "name");
        jVar.g(Long.valueOf(b()), "version");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f12274a, false);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f12275b);
        long jB = b();
        uk.c.k0(parcel, 3, 8);
        parcel.writeLong(jB);
        uk.c.j0(iH0, parcel);
    }

    public d(String str, long j) {
        this.f12274a = str;
        this.f12276c = j;
        this.f12275b = -1;
    }
}
