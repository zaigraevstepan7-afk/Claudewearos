package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.t;
import org.json.JSONObject;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbcu {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) t.f12227d.f12230c.zzb((zzbct) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbdd.zza());
        return arrayList;
    }

    public final List zzb() {
        List listZza = zza();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) t.f12227d.f12230c.zzb((zzbct) it.next());
            if (!TextUtils.isEmpty(str)) {
                listZza.add(str);
            }
        }
        listZza.addAll(zzbdd.zzb());
        return listZza;
    }

    public final void zzc(zzbct zzbctVar) {
        this.zzb.add(zzbctVar);
    }

    public final void zzd(zzbct zzbctVar) {
        this.zza.add(zzbctVar);
    }

    public final void zze(zzbct zzbctVar) {
        this.zzc.add(zzbctVar);
    }

    public final void zzf(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zzbct zzbctVar : this.zza) {
            if (zzbctVar.zze() == 1) {
                zzbctVar.zzd(editor, zzbctVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            k.d("Flag Json is null.");
        }
    }
}
