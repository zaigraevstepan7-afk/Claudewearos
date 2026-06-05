package hd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce.x;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends od.a {
    public static final Parcelable.Creator<o> CREATOR = new gd.g(16);
    public final String A;
    public final x B;

    /* renamed from: a, reason: collision with root package name */
    public final String f7877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7878b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7879c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7880d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f7881e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7882f;

    /* renamed from: z, reason: collision with root package name */
    public final String f7883z;

    public o(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, x xVar) {
        e0.i(str);
        this.f7877a = str;
        this.f7878b = str2;
        this.f7879c = str3;
        this.f7880d = str4;
        this.f7881e = uri;
        this.f7882f = str5;
        this.f7883z = str6;
        this.A = str7;
        this.B = xVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return e0.l(this.f7877a, oVar.f7877a) && e0.l(this.f7878b, oVar.f7878b) && e0.l(this.f7879c, oVar.f7879c) && e0.l(this.f7880d, oVar.f7880d) && e0.l(this.f7881e, oVar.f7881e) && e0.l(this.f7882f, oVar.f7882f) && e0.l(this.f7883z, oVar.f7883z) && e0.l(this.A, oVar.A) && e0.l(this.B, oVar.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7877a, this.f7878b, this.f7879c, this.f7880d, this.f7881e, this.f7882f, this.f7883z, this.A, this.B});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f7877a, false);
        uk.c.c0(parcel, 2, this.f7878b, false);
        uk.c.c0(parcel, 3, this.f7879c, false);
        uk.c.c0(parcel, 4, this.f7880d, false);
        uk.c.b0(parcel, 5, this.f7881e, i10, false);
        uk.c.c0(parcel, 6, this.f7882f, false);
        uk.c.c0(parcel, 7, this.f7883z, false);
        uk.c.c0(parcel, 8, this.A, false);
        uk.c.b0(parcel, 9, this.B, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
