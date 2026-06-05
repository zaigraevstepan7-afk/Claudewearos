package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f6150a;

    public j(int i10) {
        this.f6150a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f6150a == ((j) obj).f6150a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6150a);
    }

    public final String toString() {
        return m6.a.g(new StringBuilder("DefaultLazyKey(index="), this.f6150a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6150a);
    }
}
