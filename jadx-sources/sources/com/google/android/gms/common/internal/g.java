package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends od.a {
    public static final Parcelable.Creator<g> CREATOR = new x0(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f3631a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3632b;

    public g(int i10, String str) {
        this.f3631a = i10;
        this.f3632b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f3631a == this.f3631a && e0.l(gVar.f3632b, this.f3632b);
    }

    public final int hashCode() {
        return this.f3631a;
    }

    public final String toString() {
        return this.f3631a + ":" + this.f3632b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3631a);
        uk.c.c0(parcel, 2, this.f3632b, false);
        uk.c.j0(iH0, parcel);
    }
}
