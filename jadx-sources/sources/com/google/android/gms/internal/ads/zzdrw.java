package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mc.i;
import mc.n;
import nc.t;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdrw {
    private final ConcurrentHashMap zza;
    private final zzbzu zzb;
    private final zzfco zzc;
    private final String zzd;
    private final String zze;
    private final i zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdrw(Context context, zzdsh zzdshVar, zzbzu zzbzuVar, zzfco zzfcoVar, String str, String str2, i iVar) {
        ActivityManager activityManager;
        ConcurrentHashMap concurrentHashMapZzc = zzdshVar.zzc();
        this.zza = concurrentHashMapZzc;
        this.zzb = zzbzuVar;
        this.zzc = zzfcoVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = iVar;
        this.zzh = context;
        concurrentHashMapZzc.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzbct zzbctVar = zzbdc.zzjM;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        boolean zBooleanValue = ((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue();
        ActivityManager.MemoryInfo memoryInfo = null;
        if (zBooleanValue) {
            int i10 = iVar.H;
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            concurrentHashMapZzc.put("asv", i11 != 0 ? i11 != 1 ? "na" : "2" : "1");
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzco)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(n.D.f11582h.zzb()));
            if (((Boolean) zzbdaVar2.zzb(zzbdc.zzcw)).booleanValue()) {
                zzfrn zzfrnVar = rc.e.f14331b;
                if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    memoryInfo = new ActivityManager.MemoryInfo();
                    try {
                        activityManager.getMemoryInfo(memoryInfo);
                    } catch (NullPointerException unused) {
                        k.g("Error retrieving the memory information.");
                    }
                }
                if (memoryInfo != null) {
                    zzd("mem_avl", String.valueOf(memoryInfo.availMem));
                    zzd("mem_tt", String.valueOf(memoryInfo.totalMem));
                    zzd("low_m", true != memoryInfo.lowMemory ? "0" : "1");
                }
            }
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzhb)).booleanValue()) {
            int iY = u3.c.y(zzfcoVar) - 1;
            if (iY == 0) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            if (iY == 1) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("se", "query_g");
            } else if (iY == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (iY != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", "true");
            zzd("ragent", zzfcoVar.zzd.I);
            zzd("rtype", u3.c.v(u3.c.w(zzfcoVar.zzd)));
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznv)).booleanValue()) {
            zzd("brr", true != this.zzc.zzp ? "0" : "1");
        }
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zze(zzfcf zzfcfVar) {
        zzfce zzfceVar = zzfcfVar.zzb;
        List list = zzfceVar.zza;
        if (!list.isEmpty()) {
            int i10 = ((zzfbt) list.get(0)).zzb;
            zzd("ad_format", zzfbt.zza(i10));
            if (i10 == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
            }
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcq)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfceVar.zzb.zzb);
    }

    public final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
