package rd;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import pc.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new j(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f14361a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14362b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f14363c = new SparseArray();

    public a(ArrayList arrayList, int i10) {
        this.f14361a = i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            String str = cVar.f14367b;
            int i12 = cVar.f14368c;
            this.f14362b.put(str, Integer.valueOf(i12));
            this.f14363c.put(i12, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14361a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f14362b;
        for (String str : map.keySet()) {
            arrayList.add(new c(str, ((Integer) map.get(str)).intValue()));
        }
        uk.c.g0(parcel, 2, arrayList, false);
        uk.c.j0(iH0, parcel);
    }
}
