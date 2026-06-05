package ce;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.internal.fido.zzbl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends l {
    public static final Parcelable.Creator<y> CREATOR = new ae.b(11);
    public final Integer A;
    public final l0 B;
    public final e C;
    public final f D;
    public final String E;
    public final ResultReceiver F;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f3337a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f3338b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3339c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3340d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f3341e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3342f;

    /* renamed from: z, reason: collision with root package name */
    public final m f3343z;

    public y(c0 c0Var, f0 f0Var, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, m mVar, Integer num, l0 l0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.F = resultReceiver;
        if (str2 != null) {
            try {
                y yVarB = b(new JSONObject(str2));
                this.f3337a = yVarB.f3337a;
                this.f3338b = yVarB.f3338b;
                this.f3339c = yVarB.f3339c;
                this.f3340d = yVarB.f3340d;
                this.f3341e = yVarB.f3341e;
                this.f3342f = yVarB.f3342f;
                this.f3343z = yVarB.f3343z;
                this.A = yVarB.A;
                this.B = yVarB.B;
                this.C = yVarB.C;
                this.D = yVarB.D;
                this.E = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        com.google.android.gms.common.internal.e0.i(c0Var);
        this.f3337a = c0Var;
        com.google.android.gms.common.internal.e0.i(f0Var);
        this.f3338b = f0Var;
        com.google.android.gms.common.internal.e0.i(bArr);
        this.f3339c = bArr;
        com.google.android.gms.common.internal.e0.i(arrayList);
        this.f3340d = arrayList;
        this.f3341e = d10;
        this.f3342f = arrayList2;
        this.f3343z = mVar;
        this.A = num;
        this.B = l0Var;
        if (str != null) {
            try {
                this.C = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.C = null;
        }
        this.D = fVar;
        this.E = null;
    }

    public static y b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        m mVar;
        e eVarA;
        zzbl zzblVarZzc;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        c0 c0Var = new c0(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        f0 f0Var = new f0(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), ud.c.g(jSONObject3.getString("id")));
        byte[] bArrG = ud.c.g(jSONObject.getString("challenge"));
        com.google.android.gms.common.internal.e0.i(bArrG);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            try {
                zzblVarZzc = zzbl.zzd(new a0(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVarZzc = zzbl.zzc();
            }
            if (zzblVarZzc.zzb()) {
                arrayList2.add(zzblVarZzc.zza());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList3.add(z.b(jSONArray2.getJSONObject(i11)));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            mVar = new m(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        } else {
            mVar = null;
        }
        f fVarB = jSONObject.has("extensions") ? f.b(jSONObject.getJSONObject("extensions")) : null;
        if (jSONObject.has("attestation")) {
            try {
                eVarA = e.a(jSONObject.getString("attestation"));
            } catch (d e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                eVarA = e.NONE;
            }
        } else {
            eVarA = null;
        }
        return new y(c0Var, f0Var, bArrG, arrayList2, dValueOf, arrayList, mVar, null, null, eVarA != null ? eVarA.f3249a : null, fVarB, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        List list2 = yVar.f3340d;
        List list3 = yVar.f3342f;
        if (com.google.android.gms.common.internal.e0.l(this.f3337a, yVar.f3337a) && com.google.android.gms.common.internal.e0.l(this.f3338b, yVar.f3338b) && Arrays.equals(this.f3339c, yVar.f3339c) && com.google.android.gms.common.internal.e0.l(this.f3341e, yVar.f3341e)) {
            List list4 = this.f3340d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f3342f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && com.google.android.gms.common.internal.e0.l(this.f3343z, yVar.f3343z) && com.google.android.gms.common.internal.e0.l(this.A, yVar.A) && com.google.android.gms.common.internal.e0.l(this.B, yVar.B) && com.google.android.gms.common.internal.e0.l(this.C, yVar.C) && com.google.android.gms.common.internal.e0.l(this.D, yVar.D) && com.google.android.gms.common.internal.e0.l(this.E, yVar.E))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3337a, this.f3338b, Integer.valueOf(Arrays.hashCode(this.f3339c)), this.f3340d, this.f3341e, this.f3342f, this.f3343z, this.A, this.B, this.C, this.D, this.E});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3337a);
        String strValueOf2 = String.valueOf(this.f3338b);
        String strH = ud.c.h(this.f3339c);
        String strValueOf3 = String.valueOf(this.f3340d);
        String strValueOf4 = String.valueOf(this.f3342f);
        String strValueOf5 = String.valueOf(this.f3343z);
        String strValueOf6 = String.valueOf(this.B);
        String strValueOf7 = String.valueOf(this.C);
        String strValueOf8 = String.valueOf(this.D);
        StringBuilder sbM = m1.m("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        m1.s(sbM, strH, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbM.append(this.f3341e);
        sbM.append(", \n excludeList=");
        sbM.append(strValueOf4);
        sbM.append(", \n authenticatorSelection=");
        sbM.append(strValueOf5);
        sbM.append(", \n requestId=");
        sbM.append(this.A);
        sbM.append(", \n tokenBinding=");
        sbM.append(strValueOf6);
        sbM.append(", \n attestationConveyancePreference=");
        sbM.append(strValueOf7);
        sbM.append(", \n authenticationExtensions=");
        sbM.append(strValueOf8);
        sbM.append("}");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, this.f3337a, i10, false);
        uk.c.b0(parcel, 3, this.f3338b, i10, false);
        uk.c.V(parcel, 4, this.f3339c, false);
        uk.c.g0(parcel, 5, this.f3340d, false);
        uk.c.W(parcel, 6, this.f3341e);
        uk.c.g0(parcel, 7, this.f3342f, false);
        uk.c.b0(parcel, 8, this.f3343z, i10, false);
        uk.c.Z(parcel, 9, this.A);
        uk.c.b0(parcel, 10, this.B, i10, false);
        e eVar = this.C;
        uk.c.c0(parcel, 11, eVar == null ? null : eVar.f3249a, false);
        uk.c.b0(parcel, 12, this.D, i10, false);
        uk.c.c0(parcel, 13, this.E, false);
        uk.c.b0(parcel, 14, this.F, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
