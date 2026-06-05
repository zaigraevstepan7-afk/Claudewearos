package ce;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends p {
    public static final Parcelable.Creator<o> CREATOR = new x0(8);

    /* renamed from: a, reason: collision with root package name */
    public final b0 f3300a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f3301b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3302c;

    public o(b0 b0Var, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.e0.i(b0Var);
        this.f3300a = b0Var;
        com.google.android.gms.common.internal.e0.i(uri);
        com.google.android.gms.common.internal.e0.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.e0.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f3301b = uri;
        com.google.android.gms.common.internal.e0.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f3302c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3300a, oVar.f3300a) && com.google.android.gms.common.internal.e0.l(this.f3301b, oVar.f3301b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3300a, this.f3301b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3300a);
        String strValueOf2 = String.valueOf(this.f3301b);
        return m6.a.j(m1.m("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", strValueOf, ", \n origin=", strValueOf2, ", \n clientDataHash="), ud.c.h(this.f3302c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, this.f3300a, i10, false);
        uk.c.b0(parcel, 3, this.f3301b, i10, false);
        uk.c.V(parcel, 4, this.f3302c, false);
        uk.c.j0(iH0, parcel);
    }
}
