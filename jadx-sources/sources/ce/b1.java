package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 extends od.a {
    public static final Parcelable.Creator<b1> CREATOR = new x0(11);

    /* renamed from: a, reason: collision with root package name */
    public final List f3240a;

    public b1(ArrayList arrayList) {
        com.google.android.gms.common.internal.e0.i(arrayList);
        this.f3240a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        List list = ((b1) obj).f3240a;
        List list2 = this.f3240a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f3240a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.g0(parcel, 1, this.f3240a, false);
        uk.c.j0(iH0, parcel);
    }
}
