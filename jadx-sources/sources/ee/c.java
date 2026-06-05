package ee;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends od.a {
    public static final Parcelable.Creator<c> CREATOR = new dd.d(23);

    /* renamed from: e, reason: collision with root package name */
    public static final ea.e f5935e = new ea.e(1);

    /* renamed from: a, reason: collision with root package name */
    public final List f5936a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5937b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5938c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5939d;

    public c(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        e0.j(arrayList, "transitions can't be null");
        int i10 = 0;
        e0.a("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(f5935e);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar = (b) obj;
            e0.a("Found duplicated transition: " + bVar + ".", treeSet.add(bVar));
        }
        this.f5936a = Collections.unmodifiableList(arrayList);
        this.f5937b = str;
        this.f5938c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f5939d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (e0.l(this.f5936a, cVar.f5936a) && e0.l(this.f5937b, cVar.f5937b) && e0.l(this.f5939d, cVar.f5939d) && e0.l(this.f5938c, cVar.f5938c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f5936a.hashCode() * 31;
        String str = this.f5937b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f5938c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f5939d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5936a);
        String strValueOf2 = String.valueOf(this.f5938c);
        int length = strValueOf.length();
        String str = this.f5937b;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        String str2 = this.f5939d;
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        m1.s(sb2, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str);
        m1.s(sb2, "', mClients=", strValueOf2, ", mAttributionTag=", str2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.i(parcel);
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.g0(parcel, 1, this.f5936a, false);
        uk.c.c0(parcel, 2, this.f5937b, false);
        uk.c.g0(parcel, 3, this.f5938c, false);
        uk.c.c0(parcel, 4, this.f5939d, false);
        uk.c.j0(iH0, parcel);
    }
}
