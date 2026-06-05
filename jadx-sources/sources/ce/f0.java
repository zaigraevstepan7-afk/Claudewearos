package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends od.a {
    public static final Parcelable.Creator<f0> CREATOR = new ae.b(18);

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f3258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3259b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3260c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3261d;

    public f0(String str, String str2, String str3, byte[] bArr) {
        com.google.android.gms.common.internal.e0.i(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl);
        this.f3258a = zzgxVarZzl;
        com.google.android.gms.common.internal.e0.i(str);
        this.f3259b = str;
        this.f3260c = str2;
        com.google.android.gms.common.internal.e0.i(str3);
        this.f3261d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3258a, f0Var.f3258a) && com.google.android.gms.common.internal.e0.l(this.f3259b, f0Var.f3259b) && com.google.android.gms.common.internal.e0.l(this.f3260c, f0Var.f3260c) && com.google.android.gms.common.internal.e0.l(this.f3261d, f0Var.f3261d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3258a, this.f3259b, this.f3260c, this.f3261d});
    }

    public final String toString() {
        StringBuilder sbK = m6.a.k("PublicKeyCredentialUserEntity{\n id=", ud.c.h(this.f3258a.zzm()), ", \n name='");
        sbK.append(this.f3259b);
        sbK.append("', \n icon='");
        sbK.append(this.f3260c);
        sbK.append("', \n displayName='");
        return m6.a.j(sbK, this.f3261d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.V(parcel, 2, this.f3258a.zzm(), false);
        uk.c.c0(parcel, 3, this.f3259b, false);
        uk.c.c0(parcel, 4, this.f3260c, false);
        uk.c.c0(parcel, 5, this.f3261d, false);
        uk.c.j0(iH0, parcel);
    }
}
