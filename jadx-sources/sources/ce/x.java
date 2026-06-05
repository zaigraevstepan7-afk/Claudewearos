package ce;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends od.a {
    public static final Parcelable.Creator<x> CREATOR = new ae.b(12);
    public final String A;
    public String B;

    /* renamed from: a, reason: collision with root package name */
    public final String f3329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3330b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f3331c;

    /* renamed from: d, reason: collision with root package name */
    public final j f3332d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3333e;

    /* renamed from: f, reason: collision with root package name */
    public final k f3334f;

    /* renamed from: z, reason: collision with root package name */
    public final g f3335z;

    public x(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        boolean z2 = false;
        zzgx zzgxVarZzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.e0.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && zzgxVarZzl != null)) {
            z2 = true;
        }
        com.google.android.gms.common.internal.e0.a("Must provide id and rawId if not an error response.", z2);
        this.f3329a = str;
        this.f3330b = str2;
        this.f3331c = zzgxVarZzl;
        this.f3332d = jVar;
        this.f3333e = iVar;
        this.f3334f = kVar;
        this.f3335z = gVar;
        this.A = str3;
        this.B = null;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.f3331c;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject.put("rawId", ud.c.h(zzgxVar.zzm()));
            }
            String str = this.A;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f3330b;
            k kVar = this.f3334f;
            if (str2 != null && kVar == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.f3329a;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            i iVar = this.f3333e;
            boolean z2 = true;
            if (iVar != null) {
                jSONObjectB = iVar.b();
            } else {
                j jVar = this.f3332d;
                if (jVar != null) {
                    jSONObjectB = jVar.b();
                } else {
                    z2 = false;
                    if (kVar != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", kVar.f3285a.f3323a);
                            String str5 = kVar.f3286b;
                            if (str5 != null) {
                                jSONObject2.put("message", str5);
                            }
                            jSONObjectB = jSONObject2;
                            str4 = "error";
                        } catch (JSONException e10) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                        }
                    } else {
                        jSONObjectB = null;
                    }
                }
            }
            if (jSONObjectB != null) {
                jSONObject.put(str4, jSONObjectB);
            }
            g gVar = this.f3335z;
            if (gVar != null) {
                jSONObject.put("clientExtensionResults", gVar.b());
                return jSONObject;
            }
            if (z2) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3329a, xVar.f3329a) && com.google.android.gms.common.internal.e0.l(this.f3330b, xVar.f3330b) && com.google.android.gms.common.internal.e0.l(this.f3331c, xVar.f3331c) && com.google.android.gms.common.internal.e0.l(this.f3332d, xVar.f3332d) && com.google.android.gms.common.internal.e0.l(this.f3333e, xVar.f3333e) && com.google.android.gms.common.internal.e0.l(this.f3334f, xVar.f3334f) && com.google.android.gms.common.internal.e0.l(this.f3335z, xVar.f3335z) && com.google.android.gms.common.internal.e0.l(this.A, xVar.A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3329a, this.f3330b, this.f3331c, this.f3333e, this.f3332d, this.f3334f, this.f3335z, this.A});
    }

    public final String toString() {
        zzgx zzgxVar = this.f3331c;
        String strH = ud.c.h(zzgxVar == null ? null : zzgxVar.zzm());
        String strValueOf = String.valueOf(this.f3332d);
        String strValueOf2 = String.valueOf(this.f3333e);
        String strValueOf3 = String.valueOf(this.f3334f);
        String strValueOf4 = String.valueOf(this.f3335z);
        StringBuilder sbM = m1.m("PublicKeyCredential{\n id='", this.f3329a, "', \n type='", this.f3330b, "', \n rawId=");
        m1.s(sbM, strH, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        m1.s(sbM, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        sbM.append(strValueOf4);
        sbM.append(", \n authenticatorAttachment='");
        sbM.append(this.A);
        sbM.append("'}");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (zzia.zzc()) {
            this.B = b().toString();
        }
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f3329a, false);
        uk.c.c0(parcel, 2, this.f3330b, false);
        zzgx zzgxVar = this.f3331c;
        uk.c.V(parcel, 3, zzgxVar == null ? null : zzgxVar.zzm(), false);
        uk.c.b0(parcel, 4, this.f3332d, i10, false);
        uk.c.b0(parcel, 5, this.f3333e, i10, false);
        uk.c.b0(parcel, 6, this.f3334f, i10, false);
        uk.c.b0(parcel, 7, this.f3335z, i10, false);
        uk.c.c0(parcel, 8, this.A, false);
        uk.c.c0(parcel, 9, this.B, false);
        uk.c.j0(iH0, parcel);
        this.B = null;
    }
}
