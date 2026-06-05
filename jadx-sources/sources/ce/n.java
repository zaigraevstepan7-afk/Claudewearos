package ce;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends p {
    public static final Parcelable.Creator<n> CREATOR = new x0(7);

    /* renamed from: a, reason: collision with root package name */
    public final y f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f3296b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3297c;

    public n(y yVar, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.e0.i(yVar);
        this.f3295a = yVar;
        com.google.android.gms.common.internal.e0.i(uri);
        com.google.android.gms.common.internal.e0.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.e0.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f3296b = uri;
        com.google.android.gms.common.internal.e0.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f3297c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3295a, nVar.f3295a) && com.google.android.gms.common.internal.e0.l(this.f3296b, nVar.f3296b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3295a, this.f3296b});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3295a);
        String strValueOf2 = String.valueOf(this.f3296b);
        return m6.a.j(m1.m("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", strValueOf, ", \n origin=", strValueOf2, ", \n clientDataHash="), ud.c.h(this.f3297c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, this.f3295a, i10, false);
        uk.c.b0(parcel, 3, this.f3296b, i10, false);
        uk.c.V(parcel, 4, this.f3297c, false);
        uk.c.j0(iH0, parcel);
    }
}
