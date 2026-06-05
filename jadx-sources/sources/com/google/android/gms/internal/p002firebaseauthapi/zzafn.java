package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ud.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class zzafn implements zzacu<zzafn> {
    private static final String zza = "zzafn";
    private String zzb;
    private zzaq<zzafx> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacu
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzafn zza(String str) throws JSONException, zzaah {
        zzaq<zzafx> zzaqVarZza;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzaqVarZza = zzaq.zza(new ArrayList());
                } else {
                    zzap zzapVarZzg = zzaq.zzg();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        zzapVarZzg.zza(jSONObject2 == null ? zzafx.zza(null, null) : zzafx.zza(f.a(jSONObject2.optString("provider")), f.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzaqVarZza = zzapVarZzg.zza();
                }
                this.zzc = zzaqVarZza;
            }
            return this;
        } catch (NullPointerException e10) {
            e = e10;
            throw zzahe.zza(e, zza, str);
        } catch (JSONException e11) {
            e = e11;
            throw zzahe.zza(e, zza, str);
        }
    }

    public final boolean zzb(String str) {
        e0.e(str);
        zzaq<zzafx> zzaqVar = this.zzc;
        String strZza = null;
        if (zzaqVar != null && !zzaqVar.isEmpty()) {
            zzaq<zzafx> zzaqVar2 = this.zzc;
            int size = zzaqVar2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                zzafx zzafxVar = zzaqVar2.get(i10);
                i10++;
                zzafx zzafxVar2 = zzafxVar;
                String strZza2 = zzafxVar2.zza();
                String strZzb = zzafxVar2.zzb();
                if (strZza2 != null && strZzb != null && strZzb.equals(str)) {
                    strZza = zzafxVar2.zza();
                    break;
                }
            }
        }
        return strZza != null && (strZza.equals("ENFORCE") || strZza.equals("AUDIT"));
    }

    public final String zza() {
        return this.zzb;
    }
}
