package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends od.a {
    public static final Parcelable.Creator<p> CREATOR = new gd.g(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f7884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7885b;

    public p(String str, String str2) {
        e0.j(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        e0.f(strTrim, "Account identifier cannot be empty");
        this.f7884a = strTrim;
        e0.e(str2);
        this.f7885b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return e0.l(this.f7884a, pVar.f7884a) && e0.l(this.f7885b, pVar.f7885b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7884a, this.f7885b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f7884a, false);
        uk.c.c0(parcel, 2, this.f7885b, false);
        uk.c.j0(iH0, parcel);
    }
}
