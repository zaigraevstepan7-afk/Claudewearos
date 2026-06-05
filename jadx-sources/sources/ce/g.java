package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends od.a {
    public static final Parcelable.Creator<g> CREATOR = new ae.b(28);

    /* renamed from: a, reason: collision with root package name */
    public final o0 f3262a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f3263b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3264c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f3265d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3266e;

    public g(o0 o0Var, y0 y0Var, h hVar, z0 z0Var, String str) {
        this.f3262a = o0Var;
        this.f3263b = y0Var;
        this.f3264c = hVar;
        this.f3265d = z0Var;
        this.f3266e = str;
    }

    public final JSONObject b() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f3264c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f3270a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            o0 o0Var = this.f3262a;
            if (o0Var != null) {
                jSONObject.put("uvm", o0Var.b());
            }
            z0 z0Var = this.f3265d;
            if (z0Var != null) {
                jSONObject.put("prf", z0Var.b());
            }
            String str = this.f3266e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3262a, gVar.f3262a) && com.google.android.gms.common.internal.e0.l(this.f3263b, gVar.f3263b) && com.google.android.gms.common.internal.e0.l(this.f3264c, gVar.f3264c) && com.google.android.gms.common.internal.e0.l(this.f3265d, gVar.f3265d) && com.google.android.gms.common.internal.e0.l(this.f3266e, gVar.f3266e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3262a, this.f3263b, this.f3264c, this.f3265d, this.f3266e});
    }

    public final String toString() {
        return m1.j("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f3262a, i10, false);
        uk.c.b0(parcel, 2, this.f3263b, i10, false);
        uk.c.b0(parcel, 3, this.f3264c, i10, false);
        uk.c.b0(parcel, 4, this.f3265d, i10, false);
        uk.c.c0(parcel, 5, this.f3266e, false);
        uk.c.j0(iH0, parcel);
    }
}
