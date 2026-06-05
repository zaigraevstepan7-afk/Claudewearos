package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 extends od.a {
    public static final Parcelable.Creator<c0> CREATOR = new ae.b(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f3243a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3244b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3245c;

    public c0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.e0.i(str);
        this.f3243a = str;
        com.google.android.gms.common.internal.e0.i(str2);
        this.f3244b = str2;
        this.f3245c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3243a, c0Var.f3243a) && com.google.android.gms.common.internal.e0.l(this.f3244b, c0Var.f3244b) && com.google.android.gms.common.internal.e0.l(this.f3245c, c0Var.f3245c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3243a, this.f3244b, this.f3245c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f3243a);
        sb2.append("', \n name='");
        sb2.append(this.f3244b);
        sb2.append("', \n icon='");
        return m6.a.j(sb2, this.f3245c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, this.f3243a, false);
        uk.c.c0(parcel, 3, this.f3244b, false);
        uk.c.c0(parcel, 4, this.f3245c, false);
        uk.c.j0(iH0, parcel);
    }
}
