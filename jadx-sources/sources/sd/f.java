package sd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
import pc.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends od.a {
    public static final Parcelable.Creator<f> CREATOR = new j(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f14985a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14986b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14987c;

    public f(int i10, String str, ArrayList arrayList) {
        this.f14985a = i10;
        this.f14986b = str;
        this.f14987c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14985a);
        uk.c.c0(parcel, 2, this.f14986b, false);
        uk.c.g0(parcel, 3, this.f14987c, false);
        uk.c.j0(iH0, parcel);
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.f14985a = 1;
        this.f14986b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((a) map.get(str2), str2));
            }
        }
        this.f14987c = arrayList;
    }
}
