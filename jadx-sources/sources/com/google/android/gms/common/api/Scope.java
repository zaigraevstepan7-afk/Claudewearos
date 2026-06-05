package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class Scope extends od.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new x0(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f3486a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3487b;

    public Scope(int i10, String str) {
        e0.f(str, "scopeUri must not be null or empty");
        this.f3486a = i10;
        this.f3487b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3487b.equals(((Scope) obj).f3487b);
    }

    public final int hashCode() {
        return this.f3487b.hashCode();
    }

    public final String toString() {
        return this.f3487b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3486a);
        uk.c.c0(parcel, 2, this.f3487b, false);
        uk.c.j0(iH0, parcel);
    }
}
