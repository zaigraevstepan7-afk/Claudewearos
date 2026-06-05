package de;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends od.a {
    public static final Parcelable.Creator<d> CREATOR = new dd.d(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f5097a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5098b;

    /* renamed from: c, reason: collision with root package name */
    public final f f5099c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5100d;

    public d(int i10, byte[] bArr, String str, ArrayList arrayList) {
        this.f5097a = i10;
        this.f5098b = bArr;
        try {
            this.f5099c = f.a(str);
            this.f5100d = arrayList;
        } catch (e e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        List list = dVar.f5100d;
        if (!Arrays.equals(this.f5098b, dVar.f5098b) || !this.f5099c.equals(dVar.f5099c)) {
            return false;
        }
        List list2 = this.f5100d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f5098b)), this.f5099c, this.f5100d});
    }

    public final String toString() {
        List list = this.f5100d;
        String string = list == null ? "null" : list.toString();
        byte[] bArr = this.f5098b;
        String strEncodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb2 = new StringBuilder("{keyHandle: ");
        sb2.append(strEncodeToString);
        sb2.append(", version: ");
        sb2.append(this.f5099c);
        sb2.append(", transports: ");
        return m6.a.j(sb2, string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5097a);
        uk.c.V(parcel, 2, this.f5098b, false);
        uk.c.c0(parcel, 3, this.f5099c.f5103a, false);
        uk.c.g0(parcel, 4, this.f5100d, false);
        uk.c.j0(iH0, parcel);
    }
}
