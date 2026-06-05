package ce;

import android.os.Parcel;
import android.os.Parcelable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public enum c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<c> CREATOR = new ae.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f3242a;

    c(String str) {
        this.f3242a = str;
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (str.equals(cVar.f3242a)) {
                return cVar;
            }
        }
        throw new b(m1.j("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3242a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3242a);
    }
}
