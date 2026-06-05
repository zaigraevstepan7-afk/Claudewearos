package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import dd.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f3753a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f3752b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new d(13);

    public LocationResult(List list) {
        this.f3753a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).f3753a;
        int size = list.size();
        List list2 = this.f3753a;
        if (size != list2.size()) {
            return false;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f3753a.iterator();
        int i10 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i10 = (i10 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3753a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 27);
        sb2.append("LocationResult[locations: ");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.g0(parcel, 1, this.f3753a, false);
        c.j0(iH0, parcel);
    }
}
