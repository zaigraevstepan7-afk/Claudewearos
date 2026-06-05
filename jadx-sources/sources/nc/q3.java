package nc;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q3 extends od.a {
    public static final Parcelable.Creator<q3> CREATOR = new ig.e0(21);
    public final boolean A;
    public final String B;
    public final l3 C;
    public final Location D;
    public final String E;
    public final Bundle F;
    public final Bundle G;
    public final List H;
    public final String I;
    public final String J;
    public final boolean K;
    public final p0 L;
    public final int M;
    public final String N;
    public final List O;
    public final int P;
    public final String Q;
    public final int R;
    public final long S;

    /* renamed from: a, reason: collision with root package name */
    public final int f12190a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12191b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f12192c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12193d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12194e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12195f;

    /* renamed from: z, reason: collision with root package name */
    public final int f12196z;

    public q3(int i10, long j, Bundle bundle, int i11, List list, boolean z2, int i12, boolean z10, String str, l3 l3Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, p0 p0Var, int i13, String str5, List list3, int i14, String str6, int i15, long j4) {
        this.f12190a = i10;
        this.f12191b = j;
        this.f12192c = bundle == null ? new Bundle() : bundle;
        this.f12193d = i11;
        this.f12194e = list;
        this.f12195f = z2;
        this.f12196z = i12;
        this.A = z10;
        this.B = str;
        this.C = l3Var;
        this.D = location;
        this.E = str2;
        this.F = bundle2 == null ? new Bundle() : bundle2;
        this.G = bundle3;
        this.H = list2;
        this.I = str3;
        this.J = str4;
        this.K = z11;
        this.L = p0Var;
        this.M = i13;
        this.N = str5;
        this.O = list3 == null ? new ArrayList() : list3;
        this.P = i14;
        this.Q = str6;
        this.R = i15;
        this.S = j4;
    }

    public final boolean b(q3 q3Var) {
        return q3Var != null && this.f12190a == q3Var.f12190a && this.f12191b == q3Var.f12191b && yd.f.r0(this.f12192c, q3Var.f12192c) && this.f12193d == q3Var.f12193d && com.google.android.gms.common.internal.e0.l(this.f12194e, q3Var.f12194e) && this.f12195f == q3Var.f12195f && this.f12196z == q3Var.f12196z && this.A == q3Var.A && com.google.android.gms.common.internal.e0.l(this.B, q3Var.B) && com.google.android.gms.common.internal.e0.l(this.C, q3Var.C) && com.google.android.gms.common.internal.e0.l(this.D, q3Var.D) && com.google.android.gms.common.internal.e0.l(this.E, q3Var.E) && yd.f.r0(this.F, q3Var.F) && yd.f.r0(this.G, q3Var.G) && com.google.android.gms.common.internal.e0.l(this.H, q3Var.H) && com.google.android.gms.common.internal.e0.l(this.I, q3Var.I) && com.google.android.gms.common.internal.e0.l(this.J, q3Var.J) && this.K == q3Var.K && this.M == q3Var.M && com.google.android.gms.common.internal.e0.l(this.N, q3Var.N) && com.google.android.gms.common.internal.e0.l(this.O, q3Var.O) && this.P == q3Var.P && com.google.android.gms.common.internal.e0.l(this.Q, q3Var.Q) && this.R == q3Var.R;
    }

    public final boolean c() {
        Bundle bundle = this.f12192c;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return b(q3Var) && this.S == q3Var.S;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12190a), Long.valueOf(this.f12191b), this.f12192c, Integer.valueOf(this.f12193d), this.f12194e, Boolean.valueOf(this.f12195f), Integer.valueOf(this.f12196z), Boolean.valueOf(this.A), this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, Boolean.valueOf(this.K), Integer.valueOf(this.M), this.N, this.O, Integer.valueOf(this.P), this.Q, Integer.valueOf(this.R), Long.valueOf(this.S)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f12190a);
        uk.c.k0(parcel, 2, 8);
        parcel.writeLong(this.f12191b);
        uk.c.U(parcel, 3, this.f12192c, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f12193d);
        uk.c.e0(parcel, 5, this.f12194e);
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(this.f12195f ? 1 : 0);
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(this.f12196z);
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(this.A ? 1 : 0);
        uk.c.c0(parcel, 9, this.B, false);
        uk.c.b0(parcel, 10, this.C, i10, false);
        uk.c.b0(parcel, 11, this.D, i10, false);
        uk.c.c0(parcel, 12, this.E, false);
        uk.c.U(parcel, 13, this.F, false);
        uk.c.U(parcel, 14, this.G, false);
        uk.c.e0(parcel, 15, this.H);
        uk.c.c0(parcel, 16, this.I, false);
        uk.c.c0(parcel, 17, this.J, false);
        uk.c.k0(parcel, 18, 4);
        parcel.writeInt(this.K ? 1 : 0);
        uk.c.b0(parcel, 19, this.L, i10, false);
        uk.c.k0(parcel, 20, 4);
        parcel.writeInt(this.M);
        uk.c.c0(parcel, 21, this.N, false);
        uk.c.e0(parcel, 22, this.O);
        uk.c.k0(parcel, 23, 4);
        parcel.writeInt(this.P);
        uk.c.c0(parcel, 24, this.Q, false);
        uk.c.k0(parcel, 25, 4);
        parcel.writeInt(this.R);
        uk.c.k0(parcel, 26, 8);
        parcel.writeLong(this.S);
        uk.c.j0(iH0, parcel);
    }
}
