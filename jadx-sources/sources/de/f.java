package de;

import android.os.Parcel;
import android.os.Parcelable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public enum f implements Parcelable {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");

    public static final Parcelable.Creator<f> CREATOR = new dd.d(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f5103a;

    f(String str) {
        this.f5103a = str;
    }

    public static f a(String str) throws e {
        if (str == null) {
            return UNKNOWN;
        }
        for (f fVar : values()) {
            if (str.equals(fVar.f5103a)) {
                return fVar;
            }
        }
        throw new e(m1.j("Protocol version ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5103a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5103a);
    }
}
