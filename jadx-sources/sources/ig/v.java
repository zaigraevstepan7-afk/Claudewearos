package ig;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v extends q {
    public static final Parcelable.Creator<v> CREATOR = new gd.g(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f8564a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8565b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8566c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8567d;

    public v(String str, String str2, long j, String str3) {
        com.google.android.gms.common.internal.e0.e(str);
        this.f8564a = str;
        this.f8565b = str2;
        this.f8566c = j;
        com.google.android.gms.common.internal.e0.e(str3);
        this.f8567d = str3;
    }

    public static v d(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new v(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // ig.q
    public final String b() {
        return "phone";
    }

    @Override // ig.q
    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f8564a);
            jSONObject.putOpt("displayName", this.f8565b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f8566c));
            jSONObject.putOpt("phoneNumber", this.f8567d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxy(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8564a, false);
        uk.c.c0(parcel, 2, this.f8565b, false);
        uk.c.k0(parcel, 3, 8);
        parcel.writeLong(this.f8566c);
        uk.c.c0(parcel, 4, this.f8567d, false);
        uk.c.j0(iH0, parcel);
    }
}
