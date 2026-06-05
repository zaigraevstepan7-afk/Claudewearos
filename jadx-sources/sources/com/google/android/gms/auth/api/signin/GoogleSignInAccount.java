package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kd.d;
import od.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(0);
    public final long A;
    public final String B;
    public final List C;
    public final String D;
    public final String E;
    public final HashSet F = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final int f3465a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3466b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3467c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3468d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3469e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f3470f;

    /* renamed from: z, reason: collision with root package name */
    public String f3471z;

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f3465a = i10;
        this.f3466b = str;
        this.f3467c = str2;
        this.f3468d = str3;
        this.f3469e = str4;
        this.f3470f = uri;
        this.f3471z = str5;
        this.A = j;
        this.B = str6;
        this.C = arrayList;
        this.D = str7;
        this.E = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        e0.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f3471z = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.B.equals(this.B)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.C);
        hashSet.addAll(googleSignInAccount.F);
        HashSet hashSet2 = new HashSet(this.C);
        hashSet2.addAll(this.F);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() + 527;
        HashSet hashSet = new HashSet(this.C);
        hashSet.addAll(this.F);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3465a);
        c.c0(parcel, 2, this.f3466b, false);
        c.c0(parcel, 3, this.f3467c, false);
        c.c0(parcel, 4, this.f3468d, false);
        c.c0(parcel, 5, this.f3469e, false);
        c.b0(parcel, 6, this.f3470f, i10, false);
        c.c0(parcel, 7, this.f3471z, false);
        c.k0(parcel, 8, 8);
        parcel.writeLong(this.A);
        c.c0(parcel, 9, this.B, false);
        c.g0(parcel, 10, this.C, false);
        c.c0(parcel, 11, this.D, false);
        c.c0(parcel, 12, this.E, false);
        c.j0(iH0, parcel);
    }
}
