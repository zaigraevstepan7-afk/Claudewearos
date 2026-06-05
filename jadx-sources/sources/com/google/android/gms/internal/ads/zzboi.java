package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzboi implements zzbna, zzboh {
    private final zzboh zza;
    private final HashSet zzb = new HashSet();

    public zzboi(zzboh zzbohVar) {
        this.zza = zzbohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbna, com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbna, com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmz.zzc(this, str, str2);
    }

    public final void zzc() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            l0.k("Unregistering eventhandler: ".concat(String.valueOf(((zzbkd) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbkd) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmz.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbna, com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmz.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzbmz.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzq(String str, zzbkd zzbkdVar) {
        this.zza.zzq(str, zzbkdVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbkdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzr(String str, zzbkd zzbkdVar) {
        this.zza.zzr(str, zzbkdVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbkdVar));
    }
}
