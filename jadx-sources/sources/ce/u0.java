package ce;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 extends od.a {
    public static final Parcelable.Creator<u0> CREATOR = new ae.b(10);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3324b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f3325a;

    public u0(byte[][] bArr) {
        com.google.android.gms.common.internal.e0.b(bArr != null);
        com.google.android.gms.common.internal.e0.b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            com.google.android.gms.common.internal.e0.b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            com.google.android.gms.common.internal.e0.b(bArr[i11] != null);
            int length = bArr[i11].length;
            com.google.android.gms.common.internal.e0.b(length == 32 || length == 64);
            i10 += 2;
        }
        this.f3325a = bArr;
    }

    public static u0 b(JSONObject jSONObject, boolean z2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z2) {
                    arrayList.add(d(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(ud.c.g(next));
                    if (z2) {
                        arrayList.add(d(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new u0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject c(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] d(JSONObject jSONObject) throws JSONException {
        byte[] bArrG = ud.c.g(jSONObject.getString("first"));
        if (bArrG.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrG;
        }
        byte[] bArrG2 = ud.c.g(jSONObject.getString("second"));
        if (bArrG2.length == 32) {
            return zzgj.zza(bArrG, bArrG2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] bArrG = ud.c.g(jSONObject.getString("first"));
        zzfv zzfvVarZza = zzfx.zza().zza();
        byte[] bArr = f3324b;
        zzfvVarZza.zza(bArr);
        zzfvVarZza.zza(bArrG);
        byte[] bArrZzd = zzfvVarZza.zzc().zzd();
        if (!jSONObject.has("second")) {
            return bArrZzd;
        }
        byte[] bArrG2 = ud.c.g(jSONObject.getString("second"));
        zzfv zzfvVarZza2 = zzfx.zza().zza();
        zzfvVarZza2.zza(bArr);
        zzfvVarZza2.zza(bArrG2);
        return zzgj.zza(bArrZzd, zzfvVarZza2.zzc().zzd());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            return Arrays.deepEquals(this.f3325a, ((u0) obj).f3325a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f3325a) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() throws JSONException {
        byte[][] bArr = this.f3325a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", c(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(ud.c.h(bArr[i10]), c(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e10) {
            return m1.j("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        byte[][] bArr = this.f3325a;
        if (bArr != null) {
            int iH02 = uk.c.h0(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            uk.c.j0(iH02, parcel);
        }
        uk.c.j0(iH0, parcel);
    }
}
