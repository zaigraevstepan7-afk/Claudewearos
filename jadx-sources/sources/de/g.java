package de;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends od.a {
    public static final Parcelable.Creator<g> CREATOR = new dd.d(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f5104a;

    /* renamed from: b, reason: collision with root package name */
    public final f f5105b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5106c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5107d;

    public g(String str, String str2, int i10, byte[] bArr) {
        this.f5104a = i10;
        try {
            this.f5105b = f.a(str);
            this.f5106c = bArr;
            this.f5107d = str2;
        } catch (e e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f5107d;
        if (!Arrays.equals(this.f5106c, gVar.f5106c) || this.f5105b != gVar.f5105b) {
            return false;
        }
        String str2 = this.f5107d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f5105b.hashCode() + ((Arrays.hashCode(this.f5106c) + 31) * 31);
        String str = this.f5107d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f5104a);
        uk.c.c0(parcel, 2, this.f5105b.f5103a, false);
        uk.c.V(parcel, 3, this.f5106c, false);
        uk.c.c0(parcel, 4, this.f5107d, false);
        uk.c.j0(iH0, parcel);
    }
}
