package ce;

import android.os.Parcel;
import android.os.Parcelable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public enum i0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<i0> CREATOR = new ae.b(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f3278a;

    i0(String str) {
        this.f3278a = str;
    }

    public static i0 a(String str) throws h0 {
        for (i0 i0Var : values()) {
            if (str.equals(i0Var.f3278a)) {
                return i0Var;
            }
        }
        throw new h0(m1.j("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3278a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3278a);
    }
}
