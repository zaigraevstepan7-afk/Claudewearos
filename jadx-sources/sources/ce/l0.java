package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends od.a {
    public static final Parcelable.Creator<l0> CREATOR = new ae.b(22);

    /* renamed from: a, reason: collision with root package name */
    public final j0 f3288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3289b;

    static {
        new l0("supported", null);
        new l0("not-supported", null);
    }

    public l0(String str, String str2) {
        com.google.android.gms.common.internal.e0.i(str);
        try {
            this.f3288a = j0.a(str);
            this.f3289b = str2;
        } catch (k0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return zzbk.zza(this.f3288a, l0Var.f3288a) && zzbk.zza(this.f3289b, l0Var.f3289b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3288a, this.f3289b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, this.f3288a.f3284a, false);
        uk.c.c0(parcel, 3, this.f3289b, false);
        uk.c.j0(iH0, parcel);
    }
}
