package ee;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends od.a {
    public static final Parcelable.Creator<e> CREATOR = new dd.d(10);

    /* renamed from: a, reason: collision with root package name */
    public final List f5942a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5944c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5945d;

    public e(ArrayList arrayList, int i10, String str, String str2) {
        this.f5942a = arrayList;
        this.f5943b = i10;
        this.f5944c = str;
        this.f5945d = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeofencingRequest[geofences=");
        sb2.append(this.f5942a);
        sb2.append(", initialTrigger=");
        sb2.append(this.f5943b);
        sb2.append(", tag=");
        sb2.append(this.f5944c);
        sb2.append(", attributionTag=");
        return m6.a.j(sb2, this.f5945d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.g0(parcel, 1, this.f5942a, false);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5943b);
        uk.c.c0(parcel, 3, this.f5944c, false);
        uk.c.c0(parcel, 4, this.f5945d, false);
        uk.c.j0(iH0, parcel);
    }
}
