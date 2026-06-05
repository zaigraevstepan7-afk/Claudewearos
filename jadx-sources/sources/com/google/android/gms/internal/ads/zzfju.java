package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import mc.n;
import nc.j3;
import nc.m0;
import nc.t;
import nc.u0;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfju {
    private final Map zza;
    private final zzfkw zzb;
    private final zzfkd zzc;
    private final ud.a zzd;

    public zzfju(zzfkw zzfkwVar, zzfkd zzfkdVar, Context context, ud.a aVar) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(fc.b.APP_OPEN_AD, new HashMap());
        map.put(fc.b.INTERSTITIAL, new HashMap());
        map.put(fc.b.REWARDED, new HashMap());
        this.zzb = zzfkwVar;
        this.zzc = zzfkdVar;
        this.zzd = aVar;
    }

    private final synchronized Object zzk(Class cls, fc.b bVar, String str) {
        zzfkd zzfkdVar = this.zzc;
        ((ud.b) this.zzd).getClass();
        zzfkdVar.zzg(System.currentTimeMillis(), "2");
        Map map = this.zza;
        if (!map.containsKey(bVar)) {
            return null;
        }
        zzfkv zzfkvVar = (zzfkv) ((Map) map.get(bVar)).get(str);
        if (zzfkvVar != null && bVar.equals(zzfkvVar.zze())) {
            zzfkj zzfkjVar = new zzfkj(zzfkvVar.zze.f12129a, zzfkvVar.zze());
            zzfkjVar.zzb(str);
            zzfkl zzfklVar = new zzfkl(zzfkjVar, null);
            zzfkdVar.zzl(System.currentTimeMillis(), zzfklVar, zzfkvVar.zze.f12132d, zzfkvVar.zzd(), "2");
            try {
                String strZzo = zzfkvVar.zzo();
                Object objZzk = zzfkvVar.zzk();
                Object objCast = objZzk == null ? null : cls.cast(objZzk);
                if (objCast != null) {
                    zzfkdVar.zzm(System.currentTimeMillis(), zzfkvVar.zze.f12132d, zzfkvVar.zzd(), strZzo, zzfklVar, "2");
                }
                return objCast;
            } catch (ClassCastException e10) {
                n.D.f11582h.zzw(e10, "PreloadAdManager.pollAd");
                l0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzl(fc.b bVar) {
        int size;
        int iOrdinal;
        try {
            Map map = this.zza;
            size = map.containsKey(bVar) ? ((Map) map.get(bVar)).size() : 0;
            iOrdinal = bVar.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzeJ)).intValue(), 1) : Math.max(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzeI)).intValue(), 1) : Math.max(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzeH)).intValue(), 1));
    }

    public final synchronized int zza(fc.b bVar, String str) {
        Map map = this.zza;
        if (!map.containsKey(bVar)) {
            return 0;
        }
        zzfkv zzfkvVar = (zzfkv) ((Map) map.get(bVar)).get(str);
        int iZzd = zzfkvVar != null ? zzfkvVar.zzd() : 0;
        zzfkd zzfkdVar = this.zzc;
        ((ud.b) this.zzd).getClass();
        zzfkdVar.zzf(iZzd, System.currentTimeMillis(), str, zzfkvVar == null ? null : zzfkvVar.zze.f12129a, bVar, zzfkvVar == null ? -1 : zzfkvVar.zze.f12132d);
        return iZzd;
    }

    public final synchronized zzbau zzb(String str) {
        return (zzbau) zzk(zzbau.class, fc.b.APP_OPEN_AD, str);
    }

    public final synchronized m0 zzc(String str) {
        return (m0) zzk(m0.class, fc.b.INTERSTITIAL, str);
    }

    public final synchronized j3 zzd(fc.b bVar, String str) {
        Map map = this.zza;
        if (map.containsKey(bVar)) {
            zzfkv zzfkvVar = (zzfkv) ((Map) map.get(bVar)).get(str);
            zzfkd zzfkdVar = this.zzc;
            ((ud.b) this.zzd).getClass();
            zzfkdVar.zzd(System.currentTimeMillis(), str, zzfkvVar == null ? null : zzfkvVar.zze.f12129a, bVar, zzfkvVar == null ? -1 : zzfkvVar.zze.f12132d, zzfkvVar != null ? zzfkvVar.zzd() : -1);
            if (zzfkvVar != null) {
                return zzfkvVar.zze;
            }
        }
        return null;
    }

    public final synchronized zzbwt zze(String str) {
        return (zzbwt) zzk(zzbwt.class, fc.b.REWARDED, str);
    }

    public final synchronized Map zzf(int i10) {
        try {
            HashMap map = new HashMap();
            fc.b bVarA = fc.b.a(i10);
            if (bVarA != null) {
                Map map2 = this.zza;
                if (map2.containsKey(bVarA)) {
                    for (zzfkv zzfkvVar : ((Map) map2.get(bVarA)).values()) {
                        map.put(zzfkvVar.zzn(), zzfkvVar.zze);
                    }
                    zzfkd zzfkdVar = this.zzc;
                    ((ud.b) this.zzd).getClass();
                    zzfkdVar.zze(bVarA, System.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        } finally {
        }
    }

    public final synchronized void zzg(int i10) {
        try {
            fc.b bVarA = fc.b.a(i10);
            if (bVarA != null) {
                Map map = this.zza;
                if (map.containsKey(bVarA)) {
                    Map map2 = (Map) map.get(bVarA);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzfkv zzfkvVar = (zzfkv) map2.get(str);
                        if (zzfkvVar != null) {
                            zzfkvVar.zzA();
                            zzfkvVar.zzv();
                            String strValueOf = String.valueOf(str);
                            int i11 = l0.f13401b;
                            k.f("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    map2.clear();
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(bVarA.toString());
                    int i12 = l0.f13401b;
                    k.f(strConcat);
                    zzfkd zzfkdVar = this.zzc;
                    ((ud.b) this.zzd).getClass();
                    zzfkdVar.zzc(System.currentTimeMillis(), bVarA, size);
                }
            }
        } finally {
        }
    }

    public final synchronized boolean zzh(fc.b bVar, String str) {
        zzfkv zzfkvVar;
        Map map = this.zza;
        if (map.containsKey(bVar) && (zzfkvVar = (zzfkv) ((Map) map.get(bVar)).get(str)) != null) {
            ((Map) map.get(bVar)).remove(str);
            zzfkvVar.zzA();
            zzfkvVar.zzv();
            zzfkd zzfkdVar = this.zzc;
            ((ud.b) this.zzd).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            j3 j3Var = zzfkvVar.zze;
            zzfkdVar.zzb(jCurrentTimeMillis, str, j3Var.f12129a, bVar, j3Var.f12132d, zzfkvVar.zzd());
            return true;
        }
        return false;
    }

    public final synchronized boolean zzi(fc.b bVar, String str) {
        zzfkl zzfklVar;
        try {
            ((ud.b) this.zzd).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map map = this.zza;
            if (!map.containsKey(bVar)) {
                return false;
            }
            zzfkv zzfkvVar = (zzfkv) ((Map) map.get(bVar)).get(str);
            String strZzo = zzfkvVar == null ? null : zzfkvVar.zzo();
            boolean z2 = strZzo != null && bVar.equals(zzfkvVar.zze());
            Long lValueOf = z2 ? Long.valueOf(System.currentTimeMillis()) : null;
            if (zzfkvVar == null) {
                zzfklVar = null;
            } else {
                zzfkj zzfkjVar = new zzfkj(zzfkvVar.zze.f12129a, bVar);
                zzfkjVar.zzb(str);
                zzfklVar = new zzfkl(zzfkjVar, null);
            }
            this.zzc.zzh(zzfkvVar == null ? 0 : zzfkvVar.zze.f12132d, zzfkvVar != null ? zzfkvVar.zzd() : 0, jCurrentTimeMillis, lValueOf, strZzo, zzfklVar, "2");
            return z2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzj(String str, j3 j3Var, u0 u0Var) {
        zzfkv zzfkvVarZzb;
        fc.b bVarA = fc.b.a(j3Var.f12130b);
        if (bVarA != null) {
            Map map = this.zza;
            if (map.containsKey(bVarA) && !((Map) map.get(bVarA)).containsKey(str) && zzl(bVarA) && (zzfkvVarZzb = this.zzb.zzb(str, j3Var, u0Var)) != null) {
                zzfkd zzfkdVar = this.zzc;
                zzfkvVarZzb.zzz(zzfkdVar);
                zzfkvVarZzb.zzh();
                ((Map) map.get(bVarA)).put(str, zzfkvVarZzb);
                zzfkj zzfkjVar = new zzfkj(j3Var.f12129a, bVarA);
                zzfkjVar.zzb(str);
                zzfkl zzfklVar = new zzfkl(zzfkjVar, null);
                int i10 = j3Var.f12132d;
                ((ud.b) this.zzd).getClass();
                zzfkdVar.zzp(i10, System.currentTimeMillis(), zzfklVar, "2");
                return true;
            }
        }
        return false;
    }
}
