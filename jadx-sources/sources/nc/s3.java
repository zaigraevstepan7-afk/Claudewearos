package nc;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s3 extends od.a {
    public static final Parcelable.Creator<s3> CREATOR = new ig.e0(22);
    public final boolean A;
    public final boolean B;
    public boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final String f12220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12222c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12223d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12224e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12225f;

    /* renamed from: z, reason: collision with root package name */
    public final s3[] f12226z;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s3(android.content.Context r17, fc.h[] r18) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.s3.<init>(android.content.Context, fc.h[]):void");
    }

    public static s3 b() {
        return new s3("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static s3 c() {
        return new s3("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, this.f12220a, false);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f12221b);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f12222c);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f12223d ? 1 : 0);
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(this.f12224e);
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(this.f12225f);
        uk.c.f0(parcel, 8, this.f12226z, i10);
        uk.c.k0(parcel, 9, 4);
        parcel.writeInt(this.A ? 1 : 0);
        uk.c.k0(parcel, 10, 4);
        parcel.writeInt(this.B ? 1 : 0);
        boolean z2 = this.C;
        uk.c.k0(parcel, 11, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uk.c.k0(parcel, 12, 4);
        parcel.writeInt(this.D ? 1 : 0);
        uk.c.k0(parcel, 13, 4);
        parcel.writeInt(this.E ? 1 : 0);
        uk.c.k0(parcel, 14, 4);
        parcel.writeInt(this.F ? 1 : 0);
        uk.c.k0(parcel, 15, 4);
        parcel.writeInt(this.G ? 1 : 0);
        uk.c.k0(parcel, 16, 4);
        parcel.writeInt(this.H ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }

    public s3(String str, int i10, int i11, boolean z2, int i12, int i13, s3[] s3VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f12220a = str;
        this.f12221b = i10;
        this.f12222c = i11;
        this.f12223d = z2;
        this.f12224e = i12;
        this.f12225f = i13;
        this.f12226z = s3VarArr;
        this.A = z10;
        this.B = z11;
        this.C = z12;
        this.D = z13;
        this.E = z14;
        this.F = z15;
        this.G = z16;
        this.H = z17;
    }

    public s3() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public s3(Context context, fc.h hVar) {
        this(context, new fc.h[]{hVar});
    }
}
