package rc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new pc.j(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f14321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14322b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14323c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14324d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14325e;

    public a(String str, int i10, int i11, boolean z2, boolean z10) {
        this.f14321a = str;
        this.f14322b = i10;
        this.f14323c = i11;
        this.f14324d = z2;
        this.f14325e = z10;
    }

    public static a b() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, this.f14321a, false);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f14322b);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f14323c);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f14324d ? 1 : 0);
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(this.f14325e ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }

    public a(int i10, int i11, boolean z2) {
        this(i10, i11, 0, z2, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10, int i11, int i12, boolean z2, boolean z10) {
        String str;
        if (z2) {
            str = "0";
        } else {
            str = "1";
        }
        StringBuilder sbQ = gk.b.q("afma-sdk-a-v", i10, ".", i11, ".");
        sbQ.append(str);
        this(sbQ.toString(), i10, i11, z2, z10);
    }
}
