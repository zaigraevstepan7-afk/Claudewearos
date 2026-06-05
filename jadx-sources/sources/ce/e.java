package ce;

import android.os.Parcel;
import android.os.Parcelable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public enum e implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<e> CREATOR = new ae.b(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f3249a;

    e(String str) {
        this.f3249a = str;
    }

    public static e a(String str) {
        for (e eVar : values()) {
            if (str.equals(eVar.f3249a)) {
                return eVar;
            }
        }
        throw new d(m1.j("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3249a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3249a);
    }
}
