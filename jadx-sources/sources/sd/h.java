package sd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import pc.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends od.a {
    public static final Parcelable.Creator<h> CREATOR = new j(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f14991a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14992b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14993c;

    public h(int i10, String str, ArrayList arrayList) {
        this.f14991a = i10;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            String str2 = fVar.f14986b;
            ArrayList arrayList2 = fVar.f14987c;
            HashMap map2 = new HashMap();
            e0.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) arrayList2.get(i12);
                map2.put(gVar.f14989b, gVar.f14990c);
            }
            map.put(str2, map2);
        }
        this.f14992b = map;
        e0.i(str);
        this.f14993c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((a) map3.get((String) it2.next())).C = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap map = this.f14992b;
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map2.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14991a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f14992b;
        for (String str : map.keySet()) {
            arrayList.add(new f(str, (Map) map.get(str)));
        }
        uk.c.g0(parcel, 2, arrayList, false);
        uk.c.c0(parcel, 3, this.f14993c, false);
        uk.c.j0(iH0, parcel);
    }
}
