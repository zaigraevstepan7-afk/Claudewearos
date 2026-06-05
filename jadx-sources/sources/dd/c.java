package dd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends od.a {
    public static final Parcelable.Creator<c> CREATOR = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f5084a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5085b;

    public c(ArrayList arrayList, int i10) {
        this.f5084a = i10;
        e0.i(arrayList);
        this.f5085b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5084a);
        uk.c.g0(parcel, 2, this.f5085b, false);
        uk.c.j0(iH0, parcel);
    }
}
