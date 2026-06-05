package ce;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 extends od.a {
    public static final Parcelable.Creator<z0> CREATOR = new x0(2);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3349a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f3350b;

    public z0(boolean z2, zzgx zzgxVar) {
        this.f3349a = z2;
        this.f3350b = zzgxVar;
    }

    public final JSONObject b() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f3349a) {
                jSONObject.put("enabled", true);
            }
            zzgx zzgxVar = this.f3350b;
            byte[] bArrZzm = zzgxVar == null ? null : zzgxVar.zzm();
            if (bArrZzm != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrZzm, 32), 11));
                if (bArrZzm.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrZzm, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f3349a == z0Var.f3349a && com.google.android.gms.common.internal.e0.l(this.f3350b, z0Var.f3350b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3349a), this.f3350b});
    }

    public final String toString() {
        return m1.j("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3349a ? 1 : 0);
        zzgx zzgxVar = this.f3350b;
        uk.c.V(parcel, 2, zzgxVar == null ? null : zzgxVar.zzm(), false);
        uk.c.j0(iH0, parcel);
    }
}
