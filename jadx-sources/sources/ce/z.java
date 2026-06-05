package ce;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends od.a {
    public static final Parcelable.Creator<z> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f3346a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f3347b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3348c;

    static {
        zzcf.zzm(zzh.zza, zzh.zzb);
        CREATOR = new ae.b(13);
    }

    public z(String str, byte[] bArr, ArrayList arrayList) {
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.e0.i(str);
        try {
            this.f3346a = e0.a(str);
            com.google.android.gms.common.internal.e0.i(zzgxVarZzl);
            this.f3347b = zzgxVarZzl;
            this.f3348c = arrayList;
        } catch (d0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static z b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        String string = jSONObject.getString("type");
        byte[] bArrDecode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports") && (jSONArray = jSONObject.getJSONArray("transports")) != null) {
            HashSet hashSet = new HashSet(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string2 = jSONArray.getString(i10);
                if (string2 != null && !string2.isEmpty()) {
                    try {
                        hashSet.add(Transport.a(string2));
                    } catch (ae.a unused) {
                        Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                    }
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        return new z(string, bArrDecode, arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        List list = zVar.f3348c;
        if (!this.f3346a.equals(zVar.f3346a) || !com.google.android.gms.common.internal.e0.l(this.f3347b, zVar.f3347b)) {
            return false;
        }
        List list2 = this.f3348c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3346a, this.f3347b, this.f3348c});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3346a);
        String strH = ud.c.h(this.f3347b.zzm());
        return m6.a.j(m1.m("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strH, ", \n transports="), String.valueOf(this.f3348c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        this.f3346a.getClass();
        uk.c.c0(parcel, 2, "public-key", false);
        uk.c.V(parcel, 3, this.f3347b.zzm(), false);
        uk.c.g0(parcel, 4, this.f3348c, false);
        uk.c.j0(iH0, parcel);
    }
}
