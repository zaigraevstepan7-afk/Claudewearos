package ee;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i extends od.a {
    public static final Parcelable.Creator<i> CREATOR = new dd.d(15);

    /* renamed from: a, reason: collision with root package name */
    public final List f5947a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5948b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5949c;

    /* renamed from: d, reason: collision with root package name */
    public final x f5950d;

    public i(ArrayList arrayList, boolean z2, boolean z10, x xVar) {
        this.f5947a = arrayList;
        this.f5948b = z2;
        this.f5949c = z10;
        this.f5950d = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.g0(parcel, 1, Collections.unmodifiableList(this.f5947a), false);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f5948b ? 1 : 0);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f5949c ? 1 : 0);
        uk.c.b0(parcel, 5, this.f5950d, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
