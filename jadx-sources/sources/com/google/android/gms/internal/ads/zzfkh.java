package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import mc.n;
import nc.j3;
import nc.m0;
import nc.s0;
import nc.t;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfkh {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfkw zzc;
    private final zzfkd zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final ud.a zzg;
    private AtomicInteger zzh;

    public zzfkh(zzfkw zzfkwVar, zzfkd zzfkdVar, Context context, ud.a aVar) {
        this.zzc = zzfkwVar;
        this.zzd = zzfkdVar;
        this.zze = context;
        this.zzg = aVar;
    }

    public static String zzd(String str, fc.b bVar) {
        return m1.w(str, "#", bVar == null ? "NULL" : bVar.name());
    }

    private final synchronized zzfkv zzm(String str, fc.b bVar) {
        return (zzfkv) this.zza.get(zzd(str, bVar));
    }

    private final synchronized Object zzn(Class cls, String str, fc.b bVar) {
        zzfkl zzfklVar = new zzfkl(new zzfkj(str, bVar), null);
        zzfkd zzfkdVar = this.zzd;
        ((ud.b) this.zzg).getClass();
        zzfkdVar.zzl(System.currentTimeMillis(), zzfklVar, -1, -1, "1");
        zzfkv zzfkvVarZzm = zzm(str, bVar);
        if (zzfkvVarZzm == null) {
            return null;
        }
        try {
            String strZzo = zzfkvVarZzm.zzo();
            Object objZzk = zzfkvVarZzm.zzk();
            Object objCast = objZzk == null ? null : cls.cast(objZzk);
            if (objCast != null) {
                zzfkdVar.zzm(System.currentTimeMillis(), zzfkvVarZzm.zze.f12132d, zzfkvVarZzm.zzd(), strZzo, zzfklVar, "1");
            }
            return objCast;
        } catch (ClassCastException e10) {
            n.D.f11582h.zzw(e10, "PreloadAdManager.pollAd");
            l0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return null;
        }
    }

    private final synchronized List zzo(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j3 j3Var = (j3) it.next();
                String strZzd = zzd(j3Var.f12129a, fc.b.a(j3Var.f12130b));
                hashSet.add(strZzd);
                ConcurrentMap concurrentMap = this.zza;
                zzfkv zzfkvVar = (zzfkv) concurrentMap.get(strZzd);
                if (zzfkvVar == null) {
                    ConcurrentMap concurrentMap2 = this.zzb;
                    if (concurrentMap2.containsKey(strZzd)) {
                        zzfkv zzfkvVar2 = (zzfkv) concurrentMap2.get(strZzd);
                        if (zzfkvVar2.zze.equals(j3Var)) {
                            zzfkvVar2.zzB(j3Var.f12132d);
                            zzfkvVar2.zzy();
                            concurrentMap.put(strZzd, zzfkvVar2);
                            concurrentMap2.remove(strZzd);
                        }
                    } else {
                        arrayList.add(j3Var);
                    }
                } else if (zzfkvVar.zze.equals(j3Var)) {
                    zzfkvVar.zzB(j3Var.f12132d);
                } else {
                    this.zzb.put(strZzd, zzfkvVar);
                    concurrentMap.remove(strZzd);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfkv) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfkv zzfkvVar3 = (zzfkv) ((Map.Entry) it3.next()).getValue();
                zzfkvVar3.zzA();
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzx)).booleanValue()) {
                    zzfkvVar3.zzv();
                }
                if (!zzfkvVar3.zzC()) {
                    it3.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    private final synchronized void zzp(String str, zzfkv zzfkvVar) {
        zzfkvVar.zzh();
        this.zza.put(str, zzfkvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzq(boolean z2) {
        try {
            if (z2) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfkv) it.next()).zzy();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfkv) it2.next()).zzf.set(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzr(boolean z2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzv)).booleanValue()) {
            zzq(z2);
        }
    }

    private final synchronized boolean zzs(String str, fc.b bVar) {
        boolean z2;
        try {
            ((ud.b) this.zzg).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfkv zzfkvVarZzm = zzm(str, bVar);
            z2 = zzfkvVarZzm != null && zzfkvVarZzm.zzC();
            Long lValueOf = z2 ? Long.valueOf(System.currentTimeMillis()) : null;
            zzfkl zzfklVar = new zzfkl(new zzfkj(str, bVar), null);
            int iZzd = 0;
            zzfkd zzfkdVar = this.zzd;
            int i10 = zzfkvVarZzm == null ? 0 : zzfkvVarZzm.zze.f12132d;
            if (zzfkvVarZzm != null) {
                iZzd = zzfkvVarZzm.zzd();
            }
            zzfkdVar.zzh(i10, iZzd, jCurrentTimeMillis, lValueOf, zzfkvVarZzm != null ? zzfkvVarZzm.zzo() : null, zzfklVar, "1");
        } catch (Throwable th2) {
            throw th2;
        }
        return z2;
    }

    public final synchronized zzbau zza(String str) {
        return (zzbau) zzn(zzbau.class, str, fc.b.APP_OPEN_AD);
    }

    public final synchronized m0 zzb(String str) {
        return (m0) zzn(m0.class, str, fc.b.INTERSTITIAL);
    }

    public final synchronized zzbwt zzc(String str) {
        return (zzbwt) zzn(zzbwt.class, str, fc.b.REWARDED);
    }

    public final void zzg(zzbpo zzbpoVar) {
        this.zzc.zzc(zzbpoVar);
    }

    public final synchronized void zzh(List list, s0 s0Var) {
        try {
            List<j3> listZzo = zzo(list);
            EnumMap enumMap = new EnumMap(fc.b.class);
            for (j3 j3Var : listZzo) {
                String str = j3Var.f12129a;
                fc.b bVarA = fc.b.a(j3Var.f12130b);
                zzfkv zzfkvVarZza = this.zzc.zza(j3Var, s0Var);
                if (bVarA != null && zzfkvVarZza != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzfkvVarZza.zzx(atomicInteger.get());
                    }
                    zzfkd zzfkdVar = this.zzd;
                    zzfkvVarZza.zzz(zzfkdVar);
                    zzp(zzd(str, bVarA), zzfkvVarZza);
                    zzfrn zzfrnVar = rc.e.f14331b;
                    enumMap.put((EnumMap) bVarA, (fc.b) Integer.valueOf(((Integer) (enumMap.containsKey(bVarA) ? enumMap.get(bVarA) : 0)).intValue() + 1));
                    zzfkl zzfklVar = new zzfkl(new zzfkj(str, bVarA), null);
                    int i10 = j3Var.f12132d;
                    ((ud.b) this.zzg).getClass();
                    zzfkdVar.zzp(i10, System.currentTimeMillis(), zzfklVar, "1");
                }
            }
            zzfkd zzfkdVar2 = this.zzd;
            ((ud.b) this.zzg).getClass();
            zzfkdVar2.zzo(enumMap, System.currentTimeMillis(), "1");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void zzi() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e10) {
                        int i10 = l0.f13401b;
                        k.h("Failed to get connectivity manager", e10);
                    }
                }
            }
        }
        if (this.zzf == null) {
            this.zzh = new AtomicInteger(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzB)).intValue());
        } else {
            try {
                this.zzf.registerDefaultNetworkCallback(new zzfkg(this));
            } catch (RuntimeException e11) {
                int i11 = l0.f13401b;
                k.h("Failed to register network callback", e11);
                this.zzh = new AtomicInteger(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzB)).intValue());
            }
        }
        n.D.f11581g.zzc(new zzfkf(this));
    }

    public final synchronized boolean zzj(String str) {
        return zzs(str, fc.b.APP_OPEN_AD);
    }

    public final synchronized boolean zzk(String str) {
        return zzs(str, fc.b.INTERSTITIAL);
    }

    public final synchronized boolean zzl(String str) {
        return zzs(str, fc.b.REWARDED);
    }
}
