package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbyr {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbyd zzd;

    public zzbyr(Context context, zzbyd zzbydVar) {
        this.zzc = context;
        this.zzd = zzbydVar;
    }

    public static /* synthetic */ void zzb(zzbyr zzbyrVar, Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            zzbyrVar.zzd.zzd();
        }
    }

    public final synchronized void zzc(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzbyq zzbyqVar = new zzbyq(this, str);
            map.put(str, zzbyqVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbyqVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd(zzbyp zzbypVar) {
        this.zzb.add(zzbypVar);
    }
}
