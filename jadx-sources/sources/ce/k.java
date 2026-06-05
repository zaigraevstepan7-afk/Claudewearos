package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new x0(5);

    /* renamed from: a, reason: collision with root package name */
    public final u f3285a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3287c;

    public k(int i10, String str, int i11) {
        try {
            this.f3285a = u.a(i10);
            this.f3286b = str;
            this.f3287c = i11;
        } catch (t e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3285a, kVar.f3285a) && com.google.android.gms.common.internal.e0.l(this.f3286b, kVar.f3286b) && com.google.android.gms.common.internal.e0.l(Integer.valueOf(this.f3287c), Integer.valueOf(kVar.f3287c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3285a, this.f3286b, Integer.valueOf(this.f3287c)});
    }

    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zza("errorCode", this.f3285a.f3323a);
        String str = this.f3286b;
        if (str != null) {
            zzbiVarZza.zzb("errorMessage", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        int i11 = this.f3285a.f3323a;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(i11);
        uk.c.c0(parcel, 3, this.f3286b, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f3287c);
        uk.c.j0(iH0, parcel);
    }
}
