package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 extends od.a {
    public static final Parcelable.Creator<t0> CREATOR = new ae.b(9);

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f3314b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f3315c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3316d;

    static {
        zzhp.zzg(1L);
        zzhp.zzg(2L);
        zzhp.zzg(3L);
        zzhp.zzg(4L);
    }

    public t0(zzgx zzgxVar, zzgx zzgxVar2, zzgx zzgxVar3, int i10) {
        this.f3313a = zzgxVar;
        this.f3314b = zzgxVar2;
        this.f3315c = zzgxVar3;
        this.f3316d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3313a, t0Var.f3313a) && com.google.android.gms.common.internal.e0.l(this.f3314b, t0Var.f3314b) && com.google.android.gms.common.internal.e0.l(this.f3315c, t0Var.f3315c) && this.f3316d == t0Var.f3316d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3313a, this.f3314b, this.f3315c, Integer.valueOf(this.f3316d)});
    }

    public final String toString() {
        zzgx zzgxVar = this.f3313a;
        String strH = ud.c.h(zzgxVar == null ? null : zzgxVar.zzm());
        zzgx zzgxVar2 = this.f3314b;
        String strH2 = ud.c.h(zzgxVar2 == null ? null : zzgxVar2.zzm());
        zzgx zzgxVar3 = this.f3315c;
        String strH3 = ud.c.h(zzgxVar3 != null ? zzgxVar3.zzm() : null);
        StringBuilder sbM = m1.m("HmacSecretExtension{coseKeyAgreement=", strH, ", saltEnc=", strH2, ", saltAuth=");
        sbM.append(strH3);
        sbM.append(", getPinUvAuthProtocol=");
        return m6.a.h(sbM, this.f3316d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        zzgx zzgxVar = this.f3313a;
        uk.c.V(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f3314b;
        uk.c.V(parcel, 2, zzgxVar2 == null ? null : zzgxVar2.zzm(), false);
        zzgx zzgxVar3 = this.f3315c;
        uk.c.V(parcel, 3, zzgxVar3 != null ? zzgxVar3.zzm() : null, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f3316d);
        uk.c.j0(iH0, parcel);
    }
}
