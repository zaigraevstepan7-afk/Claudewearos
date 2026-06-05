package ig;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagq;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y extends q {
    public static final Parcelable.Creator<y> CREATOR = new gd.g(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f8569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8570b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8571c;

    /* renamed from: d, reason: collision with root package name */
    public final zzagq f8572d;

    public y(String str, String str2, long j, zzagq zzagqVar) {
        com.google.android.gms.common.internal.e0.e(str);
        this.f8569a = str;
        this.f8570b = str2;
        this.f8571c = j;
        com.google.android.gms.common.internal.e0.j(zzagqVar, "totpInfo cannot be null.");
        this.f8572d = zzagqVar;
    }

    public static y d(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new y(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzagq());
    }

    @Override // ig.q
    public final String b() {
        return "totp";
    }

    @Override // ig.q
    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f8569a);
            jSONObject.putOpt("displayName", this.f8570b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f8571c));
            jSONObject.putOpt("totpInfo", this.f8572d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxy(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8569a, false);
        uk.c.c0(parcel, 2, this.f8570b, false);
        uk.c.k0(parcel, 3, 8);
        parcel.writeLong(this.f8571c);
        uk.c.b0(parcel, 4, this.f8572d, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
