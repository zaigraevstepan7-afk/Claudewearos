package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 extends od.a {
    public static final Parcelable.Creator<a0> CREATOR = new ae.b(14);

    /* renamed from: a, reason: collision with root package name */
    public final e0 f3227a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3228b;

    public a0(String str, int i10) {
        com.google.android.gms.common.internal.e0.i(str);
        try {
            this.f3227a = e0.a(str);
            try {
                this.f3228b = r.a(i10);
            } catch (q e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (d0 e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f3227a.equals(a0Var.f3227a) && this.f3228b.equals(a0Var.f3228b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3227a, this.f3228b});
    }

    public final String toString() {
        return m1.k("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f3227a), ", \n algorithm=", String.valueOf(this.f3228b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ce.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        this.f3227a.getClass();
        uk.c.c0(parcel, 2, "public-key", false);
        uk.c.Z(parcel, 3, Integer.valueOf(this.f3228b.f3308a.a()));
        uk.c.j0(iH0, parcel);
    }
}
