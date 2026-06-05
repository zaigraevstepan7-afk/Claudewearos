package jg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l extends od.a {
    public static final Parcelable.Creator<l> CREATOR = new c(3);

    /* renamed from: a, reason: collision with root package name */
    public final List f8894a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8895b;

    public l(ArrayList arrayList, ArrayList arrayList2) {
        this.f8894a = arrayList == null ? new ArrayList() : arrayList;
        this.f8895b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.g0(parcel, 1, this.f8894a, false);
        uk.c.g0(parcel, 2, this.f8895b, false);
        uk.c.j0(iH0, parcel);
    }
}
