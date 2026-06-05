package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ud.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class zzagy implements zzacu<zzagy> {
    private static final String zza = "zzagy";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List<zzafq> zzi;
    private String zzj;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagy zza(String str) throws zzaah {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("localId", null));
            this.zzc = f.a(jSONObject.optString("email", null));
            this.zzd = f.a(jSONObject.optString("displayName", null));
            this.zze = f.a(jSONObject.optString("idToken", null));
            this.zzf = f.a(jSONObject.optString("photoUrl", null));
            this.zzg = f.a(jSONObject.optString("refreshToken", null));
            this.zzh = jSONObject.optLong("expiresIn", 0L);
            this.zzi = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List<zzafq> zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzj);
    }

    public final String zzb() {
        return this.zze;
    }
}
