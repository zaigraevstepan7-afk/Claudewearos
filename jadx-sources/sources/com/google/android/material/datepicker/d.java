package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new x0(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f3852a;

    public d(long j) {
        this.f3852a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f3852a == ((d) obj).f3852a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3852a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f3852a);
    }
}
