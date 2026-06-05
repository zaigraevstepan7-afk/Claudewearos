package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;
import org.json.JSONArray;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeta implements zzetu {
    public static final /* synthetic */ int zzb = 0;
    private static final zzetb zzc = new zzetb(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgdm zzd;
    private final ScheduledExecutorService zze;
    private final zzejm zzf;
    private final Context zzg;
    private final zzfco zzh;
    private final zzeji zzi;
    private final zzdps zzj;
    private final zzdui zzk;
    private final int zzl;

    public zzeta(zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, String str, zzejm zzejmVar, Context context, zzfco zzfcoVar, zzeji zzejiVar, zzdps zzdpsVar, zzdui zzduiVar, int i10) {
        this.zzd = zzgdmVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzejmVar;
        this.zzg = context;
        this.zzh = zzfcoVar;
        this.zzi = zzejiVar;
        this.zzj = zzdpsVar;
        this.zzk = zzduiVar;
        this.zzl = i10;
    }

    public static mf.a zzc(zzeta zzetaVar) {
        zzeta zzetaVar2;
        zzbct zzbctVar = zzbdc.zzlg;
        t tVar = t.f12227d;
        String lowerCase = ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() ? zzetaVar.zzh.zzf.toLowerCase(Locale.ROOT) : zzetaVar.zzh.zzf;
        final Bundle bundleZzg = ((Boolean) tVar.f12230c.zzb(zzbdc.zzbN)).booleanValue() ? zzetaVar.zzk.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzbW)).booleanValue()) {
            zzetaVar2 = zzetaVar;
            zzetaVar2.zzi(arrayList, zzetaVar2.zzf.zza(zzetaVar2.zza, lowerCase));
        } else {
            zzejm zzejmVar = zzetaVar.zzf;
            for (Map.Entry entry : ((zzfyi) zzejmVar.zzb(zzetaVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                zzeta zzetaVar3 = zzetaVar;
                arrayList.add(zzetaVar3.zzg(str, (List) entry.getValue(), zzetaVar.zzf(str), true, true));
                zzetaVar = zzetaVar3;
            }
            zzetaVar2 = zzetaVar;
            zzetaVar2.zzi(arrayList, zzejmVar.zzc());
        }
        return zzgdb.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = zzeta.zzb;
                JSONArray jSONArray = new JSONArray();
                for (mf.a aVar : arrayList) {
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzetb(jSONArray.toString(), bundleZzg);
            }
        }, zzetaVar2.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static mf.a zzd(final com.google.android.gms.internal.ads.zzeta r7, java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) {
        /*
            com.google.android.gms.internal.ads.zzcai r3 = new com.google.android.gms.internal.ads.zzcai
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.internal.ads.zzbdc.zzbO
            nc.t r0 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r0 = r0.f12230c
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.zzeji r12 = r7.zzi
            r12.zzb(r8)
            com.google.android.gms.internal.ads.zzbrn r12 = r12.zza(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.zzdps r12 = r7.zzj     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.zzbrn r12 = r12.zzb(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            qc.l0.l(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.internal.ads.zzbdc.zzbE
            nc.t r9 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r9 = r9.f12230c
            java.lang.Object r7 = r9.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4d
            com.google.android.gms.internal.ads.zzejp.zzb(r8, r3)
            goto Lb6
        L4d:
            throw r1
        L4e:
            com.google.android.gms.internal.ads.zzejp r0 = new com.google.android.gms.internal.ads.zzejp
            mc.n r12 = mc.n.D
            ud.b r12 = r12.f11584k
            r12.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.internal.ads.zzbdc.zzbJ
            nc.t r12 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r1 = r12.f12230c
            com.google.android.gms.internal.ads.zzbda r12 = r12.f12230c
            java.lang.Object r8 = r1.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r8 = r7.zze
            com.google.android.gms.internal.ads.zzesz r1 = new com.google.android.gms.internal.ads.zzesz
            r1.<init>()
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.internal.ads.zzbdc.zzbC
            java.lang.Object r4 = r12.zzb(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r1, r4, r6)
        L8b:
            if (r11 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.internal.ads.zzbdc.zzbQ
            java.lang.Object r8 = r12.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lac
            com.google.android.gms.internal.ads.zzgdm r8 = r7.zzd
            r5 = r0
            com.google.android.gms.internal.ads.zzesw r0 = new com.google.android.gms.internal.ads.zzesw
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.zza(r0)
            goto Lb6
        Lac:
            r1 = r7
            r4 = r9
            r7 = r10
            r1.zzh(r2, r7, r4, r0)
            goto Lb6
        Lb3:
            r0.zzd()
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeta.zzd(com.google.android.gms.internal.ads.zzeta, java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):mf.a");
    }

    public static /* synthetic */ void zze(zzeta zzetaVar, zzbrn zzbrnVar, Bundle bundle, List list, zzejp zzejpVar, zzcai zzcaiVar) {
        try {
            zzetaVar.zzh(zzbrnVar, bundle, list, zzejpVar);
        } catch (RemoteException e10) {
            zzcaiVar.zzd(e10);
        }
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.F;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgcs zzg(final String str, final List list, final Bundle bundle, final boolean z2, final boolean z10) {
        zzgch zzgchVar = new zzgch() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // com.google.android.gms.internal.ads.zzgch
            public final mf.a zza() {
                return zzeta.zzd(this.zza, str, list, bundle, z2, z10);
            }
        };
        zzgdm zzgdmVar = this.zzd;
        zzgcs zzgcsVarZzw = zzgcs.zzw(zzgdb.zzk(zzgchVar, zzgdmVar));
        zzbct zzbctVar = zzbdc.zzbJ;
        t tVar = t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            zzgcsVarZzw = (zzgcs) zzgdb.zzo(zzgcsVarZzw, ((Long) tVar.f12230c.zzb(zzbdc.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgcs) zzgdb.zze(zzgcsVarZzw, Throwable.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                int i10 = zzeta.zzb;
                int i11 = l0.f13401b;
                String str2 = str;
                k.d("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznj)).booleanValue()) {
                    n.D.f11582h.zzv(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                n.D.f11582h.zzw(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgdmVar);
    }

    private final void zzh(zzbrn zzbrnVar, Bundle bundle, List list, zzejp zzejpVar) {
        zzbrnVar.zzh(new xd.b(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzejpVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzejq zzejqVar = (zzejq) ((Map.Entry) it.next()).getValue();
            String str = zzejqVar.zza;
            list.add(zzg(str, Collections.singletonList(zzejqVar.zze), zzf(str), zzejqVar.zzb, zzejqVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        if (this.zzl == 2) {
            return zzgdb.zzh(zzc);
        }
        zzfco zzfcoVar = this.zzh;
        if (zzfcoVar.zzr) {
            if (!Arrays.asList(((String) t.f12227d.f12230c.zzb(zzbdc.zzbP)).split(",")).contains(u3.c.v(u3.c.w(zzfcoVar.zzd)))) {
                return zzgdb.zzh(zzc);
            }
        }
        return zzgdb.zzk(new zzgch() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // com.google.android.gms.internal.ads.zzgch
            public final mf.a zza() {
                return zzeta.zzc(this.zza);
            }
        }, this.zzd);
    }
}
