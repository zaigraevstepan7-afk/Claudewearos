package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.e0;
import jg.v;
import od.a;
import org.json.JSONException;
import org.json.JSONObject;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzags extends a implements zzacr {
    public static final Parcelable.Creator<zzags> CREATOR = new zzagv();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzags() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.c0(parcel, 2, this.zza, false);
        c.c0(parcel, 3, this.zzb, false);
        c.c0(parcel, 4, this.zzc, false);
        c.c0(parcel, 5, this.zzd, false);
        c.c0(parcel, 6, this.zze, false);
        c.c0(parcel, 7, this.zzf, false);
        c.c0(parcel, 8, this.zzg, false);
        c.c0(parcel, 9, this.zzh, false);
        boolean z2 = this.zzi;
        c.k0(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.zzj;
        c.k0(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        c.c0(parcel, 12, this.zzk, false);
        c.c0(parcel, 13, this.zzl, false);
        c.c0(parcel, 14, this.zzm, false);
        c.c0(parcel, 15, this.zzn, false);
        boolean z11 = this.zzo;
        c.k0(parcel, 16, 4);
        parcel.writeInt(z11 ? 1 : 0);
        c.c0(parcel, 17, this.zzp, false);
        c.j0(iH0, parcel);
    }

    public final zzags zza(boolean z2) {
        this.zzj = false;
        return this;
    }

    public final zzags zzb(boolean z2) {
        this.zzo = true;
        return this;
    }

    public final zzags zzc(boolean z2) {
        this.zzi = true;
        return this;
    }

    public final zzags zza(String str) {
        e0.e(str);
        this.zzb = str;
        return this;
    }

    public final zzags zzb(String str) {
        this.zzn = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzags(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        e0.e(str3);
        this.zze = str3;
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb2.append("nonce=");
            sb2.append(str9);
            sb2.append("&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    public zzags(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z10, String str9, String str10, String str11, String str12, boolean z11, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z2;
        this.zzj = z10;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z11;
        this.zzp = str13;
    }

    public zzags(v vVar, String str) {
        e0.i(vVar);
        String str2 = vVar.f8909a;
        e0.e(str2);
        this.zzl = str2;
        e0.e(str);
        this.zzm = str;
        String str3 = vVar.f8911c;
        e0.e(str3);
        this.zze = str3;
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }
}
