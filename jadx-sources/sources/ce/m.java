package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends od.a {
    public static final Parcelable.Creator<m> CREATOR = new x0(6);

    /* renamed from: a, reason: collision with root package name */
    public final c f3290a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f3291b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f3292c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f3293d;

    public m(String str, Boolean bool, String str2, String str3) {
        c cVarA;
        i0 i0VarA = null;
        if (str == null) {
            cVarA = null;
        } else {
            try {
                cVarA = c.a(str);
            } catch (b | h0 | w0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f3290a = cVarA;
        this.f3291b = bool;
        this.f3292c = str2 == null ? null : n0.a(str2);
        if (str3 != null) {
            i0VarA = i0.a(str3);
        }
        this.f3293d = i0VarA;
    }

    public final i0 b() {
        i0 i0Var = this.f3293d;
        if (i0Var != null) {
            return i0Var;
        }
        Boolean bool = this.f3291b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return i0.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3290a, mVar.f3290a) && com.google.android.gms.common.internal.e0.l(this.f3291b, mVar.f3291b) && com.google.android.gms.common.internal.e0.l(this.f3292c, mVar.f3292c) && com.google.android.gms.common.internal.e0.l(b(), mVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3290a, this.f3291b, this.f3292c, b()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3290a);
        String strValueOf2 = String.valueOf(this.f3292c);
        String strValueOf3 = String.valueOf(this.f3293d);
        StringBuilder sbK = m6.a.k("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbK.append(this.f3291b);
        sbK.append(", \n requireUserVerification=");
        sbK.append(strValueOf2);
        sbK.append(", \n residentKeyRequirement=");
        return m6.a.j(sbK, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        c cVar = this.f3290a;
        uk.c.c0(parcel, 2, cVar == null ? null : cVar.f3242a, false);
        Boolean bool = this.f3291b;
        if (bool != null) {
            uk.c.k0(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        n0 n0Var = this.f3292c;
        uk.c.c0(parcel, 4, n0Var == null ? null : n0Var.f3299a, false);
        i0 i0VarB = b();
        uk.c.c0(parcel, 5, i0VarB != null ? i0VarB.f3278a : null, false);
        uk.c.j0(iH0, parcel);
    }
}
