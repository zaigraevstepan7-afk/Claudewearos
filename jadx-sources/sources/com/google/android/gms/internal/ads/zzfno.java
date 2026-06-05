package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfno extends zzfnk {
    public zzfno(zzfnd zzfndVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfndVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzflz zzflzVarZza = zzflz.zza();
        if (zzflzVarZza != null) {
            for (zzflh zzflhVar : zzflzVarZza.zzc()) {
                if (((zzfnk) this).zza.contains(zzflhVar.zzh())) {
                    zzflhVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnl, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
