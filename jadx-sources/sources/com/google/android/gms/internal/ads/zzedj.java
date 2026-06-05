package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mc.n;
import nc.h2;
import nc.t;
import nc.u3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzedj {
    private final String zzc;
    private zzfbw zzd = null;
    private zzfbt zze = null;
    private u3 zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzedj(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfbt zzfbtVar) {
        return ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdP)).booleanValue() ? zzfbtVar.zzap : zzfbtVar.zzw;
    }

    private final synchronized void zzk(zzfbt zzfbtVar, int i10) {
        Map map = this.zzb;
        String strZzj = zzj(zzfbtVar);
        if (map.containsKey(strZzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfbtVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        u3 u3Var = new u3(zzfbtVar.zzE, 0L, null, bundle, zzfbtVar.zzF, zzfbtVar.zzG, zzfbtVar.zzH, zzfbtVar.zzI);
        try {
            this.zza.add(i10, u3Var);
        } catch (IndexOutOfBoundsException e10) {
            n.D.f11582h.zzw(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzj, u3Var);
    }

    private final void zzl(zzfbt zzfbtVar, long j, h2 h2Var, boolean z2) {
        Map map = this.zzb;
        String strZzj = zzj(zzfbtVar);
        if (map.containsKey(strZzj)) {
            if (this.zze == null) {
                this.zze = zzfbtVar;
            }
            u3 u3Var = (u3) map.get(strZzj);
            u3Var.f12242b = j;
            u3Var.f12243c = h2Var;
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgS)).booleanValue() && z2) {
                this.zzf = u3Var;
            }
        }
    }

    public final u3 zza() {
        return this.zzf;
    }

    public final zzcvk zzb() {
        return new zzcvk(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbt zzfbtVar) {
        zzk(zzfbtVar, this.zza.size());
    }

    public final void zze(zzfbt zzfbtVar) {
        Map map = this.zzb;
        Object obj = map.get(zzj(zzfbtVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (u3) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            u3 u3Var = (u3) list.get(iIndexOf);
            u3Var.f12242b = 0L;
            u3Var.f12243c = null;
        }
    }

    public final void zzf(zzfbt zzfbtVar, long j, h2 h2Var) {
        zzl(zzfbtVar, j, h2Var, false);
    }

    public final void zzg(zzfbt zzfbtVar, long j, h2 h2Var) {
        zzl(zzfbtVar, j, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            u3 u3Var = (u3) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(u3Var);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                n.D.f11582h.zzw(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfbt) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzi(zzfbw zzfbwVar) {
        this.zzd = zzfbwVar;
    }
}
