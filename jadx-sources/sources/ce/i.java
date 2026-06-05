package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new x0(3);

    /* renamed from: a, reason: collision with root package name */
    public final zzgx f3271a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f3272b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f3273c;

    /* renamed from: d, reason: collision with root package name */
    public final zzgx f3274d;

    /* renamed from: e, reason: collision with root package name */
    public final zzgx f3275e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.e0.i(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.e0.i(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        com.google.android.gms.common.internal.e0.i(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        com.google.android.gms.common.internal.e0.i(bArr4);
        zzgx zzgxVarZzl4 = zzgx.zzl(bArr4, 0, bArr4.length);
        zzgx zzgxVarZzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl);
        this.f3271a = zzgxVarZzl;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl2);
        this.f3272b = zzgxVarZzl2;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl3);
        this.f3273c = zzgxVarZzl3;
        com.google.android.gms.common.internal.e0.i(zzgxVarZzl4);
        this.f3274d = zzgxVarZzl4;
        this.f3275e = zzgxVarZzl5;
    }

    public final JSONObject b() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", ud.c.h(this.f3272b.zzm()));
            jSONObject.put("authenticatorData", ud.c.h(this.f3273c.zzm()));
            jSONObject.put("signature", ud.c.h(this.f3274d.zzm()));
            zzgx zzgxVar = this.f3275e;
            if (zzgxVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", ud.c.h(zzgxVar == null ? null : zzgxVar.zzm()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3271a, iVar.f3271a) && com.google.android.gms.common.internal.e0.l(this.f3272b, iVar.f3272b) && com.google.android.gms.common.internal.e0.l(this.f3273c, iVar.f3273c) && com.google.android.gms.common.internal.e0.l(this.f3274d, iVar.f3274d) && com.google.android.gms.common.internal.e0.l(this.f3275e, iVar.f3275e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f3271a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3272b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3273c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3274d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3275e}))});
    }

    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrZzm = this.f3271a.zzm();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrZzm, 0, bArrZzm.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrZzm2 = this.f3272b.zzm();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrZzm2, 0, bArrZzm2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrZzm3 = this.f3273c.zzm();
        zzbiVarZza.zzb("authenticatorData", zzgfVarZzf3.zzg(bArrZzm3, 0, bArrZzm3.length));
        zzgf zzgfVarZzf4 = zzgf.zzf();
        byte[] bArrZzm4 = this.f3274d.zzm();
        zzbiVarZza.zzb("signature", zzgfVarZzf4.zzg(bArrZzm4, 0, bArrZzm4.length));
        zzgx zzgxVar = this.f3275e;
        byte[] bArrZzm5 = zzgxVar == null ? null : zzgxVar.zzm();
        if (bArrZzm5 != null) {
            zzbiVarZza.zzb("userHandle", zzgf.zzf().zzg(bArrZzm5, 0, bArrZzm5.length));
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.V(parcel, 2, this.f3271a.zzm(), false);
        uk.c.V(parcel, 3, this.f3272b.zzm(), false);
        uk.c.V(parcel, 4, this.f3273c.zzm(), false);
        uk.c.V(parcel, 5, this.f3274d.zzm(), false);
        zzgx zzgxVar = this.f3275e;
        uk.c.V(parcel, 6, zzgxVar == null ? null : zzgxVar.zzm(), false);
        uk.c.j0(iH0, parcel);
    }
}
