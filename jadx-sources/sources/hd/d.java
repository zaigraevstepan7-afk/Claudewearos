package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends od.a {
    public static final Parcelable.Creator<d> CREATOR = new gd.g(10);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7853a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7855c;

    public d(byte[] bArr, String str, boolean z2) {
        if (z2) {
            e0.i(bArr);
            e0.i(str);
        }
        this.f7853a = z2;
        this.f7854b = bArr;
        this.f7855c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7853a == dVar.f7853a && Arrays.equals(this.f7854b, dVar.f7854b) && Objects.equals(this.f7855c, dVar.f7855c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7854b) + (Objects.hash(Boolean.valueOf(this.f7853a), this.f7855c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f7853a ? 1 : 0);
        uk.c.V(parcel, 2, this.f7854b, false);
        uk.c.c0(parcel, 3, this.f7855c, false);
        uk.c.j0(iH0, parcel);
    }
}
