package ce;

import android.os.Parcel;
import android.os.Parcelable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<j0> CREATOR = new ae.b(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f3284a;

    j0(String str) {
        this.f3284a = str;
    }

    public static j0 a(String str) throws k0 {
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f3284a)) {
                return j0Var;
            }
        }
        throw new k0(m1.j("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3284a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3284a);
    }
}
