package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import kd.c;
import kd.d;
import od.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends a implements e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions D;
    public static final Scope E;
    public static final Scope F;
    public static final Scope G;
    public static final c H;
    public final String A;
    public final ArrayList B;
    public final String C;

    /* renamed from: a, reason: collision with root package name */
    public final int f3472a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3473b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f3474c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3475d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3476e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3477f;

    /* renamed from: z, reason: collision with root package name */
    public final String f3478z;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        E = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        F = scope3;
        G = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(G)) {
            Scope scope4 = F;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        D = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(G)) {
            Scope scope5 = F;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new d(1);
        H = new c(1);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z2, boolean z10, boolean z11, String str, String str2, HashMap map, String str3) {
        this.f3472a = i10;
        this.f3473b = arrayList;
        this.f3474c = account;
        this.f3475d = z2;
        this.f3476e = z10;
        this.f3477f = z11;
        this.f3478z = str;
        this.A = str2;
        this.B = new ArrayList(map.values());
        this.C = str3;
    }

    public static GoogleSignInOptions b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ld.a aVar = (ld.a) obj;
                map.put(Integer.valueOf(aVar.f10899b), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f3478z;
        ArrayList arrayList = this.f3473b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f3473b;
            String str2 = googleSignInOptions.f3478z;
            Account account = googleSignInOptions.f3474c;
            if (this.B.isEmpty() && googleSignInOptions.B.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f3474c;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.f3477f == googleSignInOptions.f3477f && this.f3475d == googleSignInOptions.f3475d && this.f3476e == googleSignInOptions.f3476e) {
                    return TextUtils.equals(this.C, googleSignInOptions.C);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f3473b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f3487b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f3474c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f3478z;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f3477f ? 1 : 0)) * 31) + (this.f3475d ? 1 : 0)) * 31) + (this.f3476e ? 1 : 0)) * 31;
        String str2 = this.C;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3472a);
        uk.c.g0(parcel, 2, new ArrayList(this.f3473b), false);
        uk.c.b0(parcel, 3, this.f3474c, i10, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f3475d ? 1 : 0);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f3476e ? 1 : 0);
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(this.f3477f ? 1 : 0);
        uk.c.c0(parcel, 7, this.f3478z, false);
        uk.c.c0(parcel, 8, this.A, false);
        uk.c.g0(parcel, 9, this.B, false);
        uk.c.c0(parcel, 10, this.C, false);
        uk.c.j0(iH0, parcel);
    }
}
