package jg;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import ig.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y extends od.a implements a0 {
    public static final Parcelable.Creator<y> CREATOR = new c(6);
    public String A;

    /* renamed from: a, reason: collision with root package name */
    public String f8920a;

    /* renamed from: b, reason: collision with root package name */
    public String f8921b;

    /* renamed from: c, reason: collision with root package name */
    public String f8922c;

    /* renamed from: d, reason: collision with root package name */
    public String f8923d;

    /* renamed from: e, reason: collision with root package name */
    public String f8924e;

    /* renamed from: f, reason: collision with root package name */
    public String f8925f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8926z;

    public y(String str, String str2, String str3, String str4, String str5, String str6, boolean z2, String str7) {
        this.f8920a = str;
        this.f8921b = str2;
        this.f8924e = str3;
        this.f8925f = str4;
        this.f8922c = str5;
        this.f8923d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.f8926z = z2;
        this.A = str7;
    }

    public static y b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new y(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxy(e10);
        }
    }

    @Override // ig.a0
    public final String a() {
        return this.f8921b;
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f8920a);
            jSONObject.putOpt("providerId", this.f8921b);
            jSONObject.putOpt("displayName", this.f8922c);
            jSONObject.putOpt("photoUrl", this.f8923d);
            jSONObject.putOpt("email", this.f8924e);
            jSONObject.putOpt("phoneNumber", this.f8925f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f8926z));
            jSONObject.putOpt("rawUserInfo", this.A);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxy(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8920a, false);
        uk.c.c0(parcel, 2, this.f8921b, false);
        uk.c.c0(parcel, 3, this.f8922c, false);
        uk.c.c0(parcel, 4, this.f8923d, false);
        uk.c.c0(parcel, 5, this.f8924e, false);
        uk.c.c0(parcel, 6, this.f8925f, false);
        boolean z2 = this.f8926z;
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        uk.c.c0(parcel, 8, this.A, false);
        uk.c.j0(iH0, parcel);
    }
}
