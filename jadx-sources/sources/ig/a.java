package ig;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new gd.g(28);
    public final String A;
    public int B;
    public final String C;

    /* renamed from: a, reason: collision with root package name */
    public final String f8509a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8510b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8511c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8512d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8513e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8514f;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f8515z;

    public a(String str, String str2, String str3, String str4, boolean z2, String str5, boolean z10, String str6, int i10, String str7) {
        this.f8509a = str;
        this.f8510b = str2;
        this.f8511c = str3;
        this.f8512d = str4;
        this.f8513e = z2;
        this.f8514f = str5;
        this.f8515z = z10;
        this.A = str6;
        this.B = i10;
        this.C = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8509a, false);
        uk.c.c0(parcel, 2, this.f8510b, false);
        uk.c.c0(parcel, 3, this.f8511c, false);
        uk.c.c0(parcel, 4, this.f8512d, false);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f8513e ? 1 : 0);
        uk.c.c0(parcel, 6, this.f8514f, false);
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(this.f8515z ? 1 : 0);
        uk.c.c0(parcel, 8, this.A, false);
        int i11 = this.B;
        uk.c.k0(parcel, 9, 4);
        parcel.writeInt(i11);
        uk.c.c0(parcel, 10, this.C, false);
        uk.c.j0(iH0, parcel);
    }
}
