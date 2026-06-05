package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends od.a {
    public static final Parcelable.Creator<j> CREATOR = new gd.g(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f7866a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7867b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7868c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7869d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7870e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7871f;

    public j(String str, String str2, String str3, String str4, boolean z2, int i10) {
        e0.i(str);
        this.f7866a = str;
        this.f7867b = str2;
        this.f7868c = str3;
        this.f7869d = str4;
        this.f7870e = z2;
        this.f7871f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return e0.l(this.f7866a, jVar.f7866a) && e0.l(this.f7869d, jVar.f7869d) && e0.l(this.f7867b, jVar.f7867b) && e0.l(Boolean.valueOf(this.f7870e), Boolean.valueOf(jVar.f7870e)) && this.f7871f == jVar.f7871f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7866a, this.f7867b, this.f7869d, Boolean.valueOf(this.f7870e), Integer.valueOf(this.f7871f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f7866a, false);
        uk.c.c0(parcel, 2, this.f7867b, false);
        uk.c.c0(parcel, 3, this.f7868c, false);
        uk.c.c0(parcel, 4, this.f7869d, false);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f7870e ? 1 : 0);
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(this.f7871f);
        uk.c.j0(iH0, parcel);
    }
}
