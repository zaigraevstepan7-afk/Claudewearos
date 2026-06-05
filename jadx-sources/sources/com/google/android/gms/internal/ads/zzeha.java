package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeha implements zzgci {
    private final zzfgs zza;
    private final zzcvt zzb;
    private final zzfjm zzc;
    private final zzfjq zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcqy zzg;
    private final zzegt zzh;
    private final zzedj zzi;
    private final Context zzj;
    private final zzfhm zzk;
    private final zzegd zzl;
    private final zzdrw zzm;

    public zzeha(Context context, zzfgs zzfgsVar, zzegt zzegtVar, zzcvt zzcvtVar, zzfjm zzfjmVar, zzfjq zzfjqVar, zzcqy zzcqyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzedj zzedjVar, zzfhm zzfhmVar, zzegd zzegdVar, zzdrw zzdrwVar) {
        this.zzj = context;
        this.zza = zzfgsVar;
        this.zzh = zzegtVar;
        this.zzb = zzcvtVar;
        this.zzc = zzfjmVar;
        this.zzd = zzfjqVar;
        this.zzg = zzcqyVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedjVar;
        this.zzk = zzfhmVar;
        this.zzl = zzegdVar;
        this.zzm = zzdrwVar;
    }

    public static /* synthetic */ mf.a zzb(zzeha zzehaVar, zzfbt zzfbtVar, zzfcf zzfcfVar, zzede zzedeVar, Throwable th2) {
        zzfhb zzfhbVarZza = zzfha.zza(zzehaVar.zzj, 12);
        zzfhbVarZza.zzd(zzfbtVar.zzE);
        zzfhbVarZza.zzi();
        mf.a aVarZzo = zzgdb.zzo(zzedeVar.zza(zzfcfVar, zzfbtVar), zzfbtVar.zzR, TimeUnit.MILLISECONDS, zzehaVar.zzf);
        zzehaVar.zzh.zzf(zzfcfVar, zzfbtVar, aVarZzo, zzehaVar.zzc);
        zzfhl.zza(aVarZzo, zzehaVar.zzk, zzfhbVarZza);
        return aVarZzo;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzc(com.google.android.gms.internal.ads.zzfcf r6) {
        /*
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzfL
            nc.t r1 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r2 = r1.f12230c
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "No fill."
            r3 = 1
            if (r3 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r2
        L19:
            com.google.android.gms.internal.ads.zzfce r6 = r6.zzb
            com.google.android.gms.internal.ads.zzfbw r6 = r6.zzb
            int r3 = r6.zzf
            if (r3 == 0) goto L4a
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L3a
            if (r3 >= r5) goto L3a
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.internal.ads.zzbdc.zzfK
            com.google.android.gms.internal.ads.zzbda r1 = r1.f12230c
            java.lang.Object r1 = r1.zzb(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L4a
            goto L4b
        L3a:
            if (r3 < r5) goto L43
            r0 = 400(0x190, float:5.6E-43)
            if (r3 >= r0) goto L43
            java.lang.String r2 = "No location header to follow redirect or too many redirects."
            goto L4b
        L43:
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r2 = m6.a.d(r3, r0)
            goto L4b
        L4a:
            r2 = r0
        L4b:
            com.google.android.gms.internal.ads.zzfbv r6 = r6.zzj
            if (r6 == 0) goto L54
            java.lang.String r6 = r6.zza()
            return r6
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeha.zzc(com.google.android.gms.internal.ads.zzfcf):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final mf.a zza(Object obj) {
        int i10;
        Bundle bundle;
        final zzfcf zzfcfVar = (zzfcf) obj;
        zzbct zzbctVar = zzbdc.zzco;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue() && (bundle = zzfcfVar.zzb.zzd) != null) {
            this.zzm.zza().putAll(bundle);
        }
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzcp)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzm.zza(), zzdrk.RENDERING_START.zza());
        }
        String strZzc = zzc(zzfcfVar);
        zzedj zzedjVar = this.zzi;
        zzfce zzfceVar = zzfcfVar.zzb;
        zzfbw zzfbwVar = zzfceVar.zzb;
        zzedjVar.zzi(zzfbwVar);
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zziA)).booleanValue() && (i10 = zzfbwVar.zzf) != 0 && (i10 < 200 || i10 >= 300)) {
            return zzgdb.zzg(new zzegx(3, strZzc));
        }
        String str = zzfbwVar.zzq;
        if (!((Boolean) zzbdaVar2.zzb(zzbdc.zzdP)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfbt zzfbtVar : zzfceVar.zza) {
                zzedjVar.zzd(zzfbtVar);
                Iterator it = zzfbtVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzedjVar.zzf(zzfbtVar, 0L, zzfdp.zzd(1, null, null));
                        break;
                    }
                    zzede zzedeVarZza = this.zzg.zza(zzfbtVar.zzb, (String) it.next());
                    if (zzedeVarZza == null || !zzedeVarZza.zzb(zzfcfVar, zzfbtVar)) {
                    }
                }
            }
        } else {
            zzedjVar.zzh(str, zzfceVar.zza);
        }
        zzcvt zzcvtVar = this.zzb;
        zzcmp zzcmpVar = new zzcmp(zzfcfVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzcvtVar.zzo(zzcmpVar, executor);
        if (zzfbwVar.zzr > 1) {
            return this.zzl.zzb(zzfcfVar);
        }
        String strZzc2 = zzc(zzfcfVar);
        zzfgs zzfgsVar = this.zza;
        zzffy zzffyVarZza = zzfgc.zzc(zzgdb.zzg(new zzegx(3, strZzc2)), zzfgm.RENDER_CONFIG_INIT, zzfgsVar).zza();
        final zzegt zzegtVar = this.zzh;
        zzegtVar.zzl();
        int i11 = 0;
        for (final zzfbt zzfbtVar2 : zzfceVar.zza) {
            Iterator it2 = zzfbtVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzede zzedeVarZza2 = this.zzg.zza(zzfbtVar2.zzb, str2);
                if (zzedeVarZza2 != null && zzedeVarZza2.zzb(zzfcfVar, zzfbtVar2)) {
                    zzffyVarZza = zzfgsVar.zzb(zzfgm.RENDER_CONFIG_WATERFALL, zzffyVarZza).zzh("render-config-" + i11 + "-" + str2).zzc(Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzegy
                        @Override // com.google.android.gms.internal.ads.zzgci
                        public final mf.a zza(Object obj2) {
                            return zzeha.zzb(this.zza, zzfbtVar2, zzfcfVar, zzedeVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i11++;
        }
        zzffyVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegz
            @Override // java.lang.Runnable
            public final void run() {
                zzegtVar.zzj();
            }
        }, executor);
        return zzffyVarZza;
    }
}
