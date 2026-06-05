package dd;

import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new x0(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f5074a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5076c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5077d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5078e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5079f;

    public a(int i10, long j, String str, int i11, int i12, String str2) {
        this.f5074a = i10;
        this.f5075b = j;
        e0.i(str);
        this.f5076c = str;
        this.f5077d = i11;
        this.f5078e = i12;
        this.f5079f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f5074a == aVar.f5074a && this.f5075b == aVar.f5075b && e0.l(this.f5076c, aVar.f5076c) && this.f5077d == aVar.f5077d && this.f5078e == aVar.f5078e && e0.l(this.f5079f, aVar.f5079f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5074a), Long.valueOf(this.f5075b), this.f5076c, Integer.valueOf(this.f5077d), Integer.valueOf(this.f5078e), this.f5079f});
    }

    public final String toString() {
        int i10 = this.f5077d;
        StringBuilder sbM = m1.m("AccountChangeEvent {accountName = ", this.f5076c, ", changeType = ", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED", ", changeData = ");
        sbM.append(this.f5079f);
        sbM.append(", eventIndex = ");
        sbM.append(this.f5078e);
        sbM.append("}");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5074a);
        uk.c.k0(parcel, 2, 8);
        parcel.writeLong(this.f5075b);
        uk.c.c0(parcel, 3, this.f5076c, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f5077d);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f5078e);
        uk.c.c0(parcel, 6, this.f5079f, false);
        uk.c.j0(iH0, parcel);
    }
}
