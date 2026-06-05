package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import od.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaft extends a {
    public static final Parcelable.Creator<zzaft> CREATOR = new zzafs();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaft(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzaq<zzaft> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaq.zza(new ArrayList());
        }
        zzap zzapVarZzg = zzaq.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzapVarZzg.zza(new zzaft(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzapVarZzg.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.c0(parcel, 1, this.zza, false);
        c.c0(parcel, 2, this.zzb, false);
        c.c0(parcel, 3, this.zzc, false);
        c.j0(iH0, parcel);
    }

    public static final zzaft zza(JSONObject jSONObject) {
        return new zzaft(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static final JSONObject zza(zzaft zzaftVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzaftVar.zza);
        jSONObject.put("name", zzaftVar.zzb);
        jSONObject.put("displayName", zzaftVar.zzc);
        return jSONObject;
    }
}
