package nc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u3 extends od.a {
    public static final Parcelable.Creator<u3> CREATOR = new ig.e0(24);
    public final String A;

    /* renamed from: a, reason: collision with root package name */
    public final String f12241a;

    /* renamed from: b, reason: collision with root package name */
    public long f12242b;

    /* renamed from: c, reason: collision with root package name */
    public h2 f12243c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f12244d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12245e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12246f;

    /* renamed from: z, reason: collision with root package name */
    public final String f12247z;

    public u3(String str, long j, h2 h2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f12241a = str;
        this.f12242b = j;
        this.f12243c = h2Var;
        this.f12244d = bundle;
        this.f12245e = str2;
        this.f12246f = str3;
        this.f12247z = str4;
        this.A = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f12241a, false);
        long j = this.f12242b;
        uk.c.k0(parcel, 2, 8);
        parcel.writeLong(j);
        uk.c.b0(parcel, 3, this.f12243c, i10, false);
        uk.c.U(parcel, 4, this.f12244d, false);
        uk.c.c0(parcel, 5, this.f12245e, false);
        uk.c.c0(parcel, 6, this.f12246f, false);
        uk.c.c0(parcel, 7, this.f12247z, false);
        uk.c.c0(parcel, 8, this.A, false);
        uk.c.j0(iH0, parcel);
    }
}
