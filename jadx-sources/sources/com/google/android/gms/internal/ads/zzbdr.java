package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbdr {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbdr(boolean z2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbdo zzf() {
        n.D.f11584k.getClass();
        return new zzbdo(SystemClock.elapsedRealtime(), null, null);
    }

    public final zzbdq zza() {
        zzbdq zzbdqVar;
        boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzca)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbdo> list = this.zza;
                for (zzbdo zzbdoVar : list) {
                    long jZza = zzbdoVar.zza();
                    String strZzc = zzbdoVar.zzc();
                    zzbdo zzbdoVarZzb = zzbdoVar.zzb();
                    if (zzbdoVarZzb != null && jZza > 0) {
                        long jZza2 = jZza - zzbdoVarZzb.zza();
                        sb2.append(strZzc);
                        sb2.append('.');
                        sb2.append(jZza2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbdoVarZzb.zza()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbdoVarZzb.zza()));
                                sb3.append('+');
                                sb3.append(strZzc);
                            } else {
                                map.put(Long.valueOf(zzbdoVarZzb.zza()), new StringBuilder(strZzc));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        n nVar = n.D;
                        nVar.f11584k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        nVar.f11584k.getClass();
                        sb4.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                zzbdqVar = new zzbdq(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbdqVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            n.D.f11582h.zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbdr zzbdrVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbdh zzbdhVarZzg;
        if (TextUtils.isEmpty(str2) || (zzbdhVarZzg = n.D.f11582h.zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbdn zzbdnVarZza = zzbdhVarZzg.zza(str);
            Map map = this.zzb;
            map.put(str, zzbdnVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbdo zzbdoVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbdo(j, strArr[0], zzbdoVar));
        }
        return true;
    }
}
