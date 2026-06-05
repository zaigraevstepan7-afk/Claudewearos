package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfnp extends zzfnk {
    public zzfnp(zzfnd zzfndVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfndVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfnd zzfndVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfmv.zzg(jSONObject, zzfndVar.zza())) {
            return null;
        }
        zzfndVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnl, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzflz zzflzVarZza;
        if (!TextUtils.isEmpty(str) && (zzflzVarZza = zzflz.zza()) != null) {
            for (zzflh zzflhVar : zzflzVarZza.zzc()) {
                if (((zzfnk) this).zza.contains(zzflhVar.zzh())) {
                    zzflhVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
