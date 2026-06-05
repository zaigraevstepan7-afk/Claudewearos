package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 extends od.a {
    public static final Parcelable.Creator<o0> CREATOR = new ae.b(26);

    /* renamed from: a, reason: collision with root package name */
    public final List f3303a;

    public o0(ArrayList arrayList) {
        this.f3303a = arrayList;
    }

    public final JSONArray b() throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f3303a;
            if (list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    p0 p0Var = (p0) list.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) p0Var.f3306c);
                    jSONArray2.put((int) p0Var.f3305b);
                    jSONArray2.put((int) p0Var.f3306c);
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        List list = ((o0) obj).f3303a;
        List list2 = this.f3303a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f3303a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.g0(parcel, 1, this.f3303a, false);
        uk.c.j0(iH0, parcel);
    }
}
