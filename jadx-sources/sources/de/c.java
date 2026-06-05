package de;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends od.a {
    public static final Parcelable.Creator<c> CREATOR = new dd.d(3);

    /* renamed from: a, reason: collision with root package name */
    public final a f5094a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5095b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5096c;

    static {
        new c("unavailable");
        new c("unused");
    }

    public c(int i10, String str, String str2) {
        try {
            this.f5094a = b(i10);
            this.f5095b = str;
            this.f5096c = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static a b(int i10) throws b {
        for (a aVar : a.values()) {
            if (i10 == aVar.f5093a) {
                return aVar;
            }
        }
        throw new b(m6.a.e(i10, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        a aVar = cVar.f5094a;
        a aVar2 = this.f5094a;
        if (!aVar2.equals(aVar)) {
            return false;
        }
        int iOrdinal = aVar2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f5095b.equals(cVar.f5095b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f5096c.equals(cVar.f5096c);
    }

    public final int hashCode() {
        int i10;
        int iHashCode;
        a aVar = this.f5094a;
        int iHashCode2 = aVar.hashCode() + 31;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            i10 = iHashCode2 * 31;
            iHashCode = this.f5095b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i10 = iHashCode2 * 31;
            iHashCode = this.f5096c.hashCode();
        }
        return iHashCode + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        int i11 = this.f5094a.f5093a;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(i11);
        uk.c.c0(parcel, 3, this.f5095b, false);
        uk.c.c0(parcel, 4, this.f5096c, false);
        uk.c.j0(iH0, parcel);
    }

    public c(String str) {
        this.f5095b = str;
        this.f5094a = a.STRING;
        this.f5096c = null;
    }
}
