package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 extends od.a {
    public static final Parcelable.Creator<a1> CREATOR = new x0(10);

    /* renamed from: a, reason: collision with root package name */
    public final long f3229a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f3230b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f3231c;

    /* renamed from: d, reason: collision with root package name */
    public final zzgx f3232d;

    public a1(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        com.google.android.gms.common.internal.e0.i(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.e0.i(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        com.google.android.gms.common.internal.e0.i(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        this.f3229a = j;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl);
        this.f3230b = zzgxVarZzl;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl2);
        this.f3231c = zzgxVarZzl2;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl3);
        this.f3232d = zzgxVarZzl3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f3229a == a1Var.f3229a && com.google.android.gms.common.internal.e0.l(this.f3230b, a1Var.f3230b) && com.google.android.gms.common.internal.e0.l(this.f3231c, a1Var.f3231c) && com.google.android.gms.common.internal.e0.l(this.f3232d, a1Var.f3232d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3229a), this.f3230b, this.f3231c, this.f3232d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 8);
        parcel.writeLong(this.f3229a);
        uk.c.V(parcel, 2, this.f3230b.zzm(), false);
        uk.c.V(parcel, 3, this.f3231c.zzm(), false);
        uk.c.V(parcel, 4, this.f3232d.zzm(), false);
        uk.c.j0(iH0, parcel);
    }
}
