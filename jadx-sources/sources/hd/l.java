package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends od.a {
    public static final Parcelable.Creator<l> CREATOR = new gd.g(14);

    /* renamed from: a, reason: collision with root package name */
    public final p f7873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7875c;

    public l(p pVar, String str, int i10) {
        e0.i(pVar);
        this.f7873a = pVar;
        this.f7874b = str;
        this.f7875c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return e0.l(this.f7873a, lVar.f7873a) && e0.l(this.f7874b, lVar.f7874b) && this.f7875c == lVar.f7875c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7873a, this.f7874b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f7873a, i10, false);
        uk.c.c0(parcel, 2, this.f7874b, false);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f7875c);
        uk.c.j0(iH0, parcel);
    }
}
